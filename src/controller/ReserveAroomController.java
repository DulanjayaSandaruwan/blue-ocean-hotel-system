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
public class ReserveAroomController {
    public AnchorPane root;
    public TableView <Customer> tblCustomer;
    public TableColumn colName;
    public TableColumn colIDNumber;
    public TableColumn colContactNumber;
    public TableColumn colEmail;
    public TableColumn colAddres;


    ArrayList<Customer> customerArrayList = new ArrayList();

    {
        customerArrayList.add(new Customer("Dulanjaya Sandaruwan","0769654764","981150783v","dulan@gmail.com","Ayagama"));
        customerArrayList.add(new Customer("Sonali Bhagya","2001123456","0784956149","sonali@gmail.com","Kalawana"));

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
        colName.setCellValueFactory(new PropertyValueFactory("name"));
        colIDNumber.setCellValueFactory(new PropertyValueFactory("idNumber"));
        colContactNumber.setCellValueFactory(new PropertyValueFactory("eMail"));
        colEmail.setCellValueFactory(new PropertyValueFactory("contactNumber"));
        colAddres.setCellValueFactory(new PropertyValueFactory("address"));

        tblCustomer.setItems(FXCollections.observableArrayList(customerArrayList));
    }

}
