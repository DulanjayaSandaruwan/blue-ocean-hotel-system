package controller;

import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

/**
 * @author : D.D.Sandaruwan <dulanjayasandaruwan1998@gmail.com>
 * @Since : 06/07/2021
 **/
public class IncomeReportsFormController {
    public AnchorPane root;
    public TableView <IncomeReoprts> tblIncomeReports;
    public TableColumn colMonthlyIncome;
    public TableColumn colAnnualyIncome;


    ArrayList<IncomeReoprts> incomeReportsArrayList = new ArrayList();

    {
        incomeReportsArrayList.add(new IncomeReoprts("2021 January - $600","2016 - $72000"));
        incomeReportsArrayList.add(new IncomeReoprts("2021 February - $610","2017 - $72000"));
        incomeReportsArrayList.add(new IncomeReoprts("2021 March - $700","2018 - $74000"));
        incomeReportsArrayList.add(new IncomeReoprts("2021 April - $800","2019 - $8400"));
        incomeReportsArrayList.add(new IncomeReoprts("2021 May - $600","2020 - $7600"));
    }

    public void lblBackOnMouseClicked(MouseEvent mouseEvent) throws IOException {
        Parent parent = FXMLLoader.load(this.getClass().getResource("../view/HomePageForm.fxml"));
        Scene scene = new Scene(parent);
        Stage primaryStage = (Stage) this.root.getScene().getWindow();
        primaryStage.setScene(scene);
        primaryStage.setTitle("Home Page");
        primaryStage.centerOnScreen();
    }

    public void initialize(){
        colMonthlyIncome.setCellValueFactory(new PropertyValueFactory("monthlyIncome"));
        colAnnualyIncome.setCellValueFactory(new PropertyValueFactory("annualyIncome"));

        tblIncomeReports.setItems(FXCollections.observableArrayList(incomeReportsArrayList));
    }


}
