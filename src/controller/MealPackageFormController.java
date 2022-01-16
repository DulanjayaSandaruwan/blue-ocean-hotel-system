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
public class MealPackageFormController {

    public AnchorPane root;
    public TableView <MealPackage> tblMealPackages;
    public TableColumn colNewMealPackage;
    public TableColumn colModifyingMealPackages;

    ArrayList<MealPackage> mealPackagesArrayList = new ArrayList();

    {
        mealPackagesArrayList.add(new MealPackage("M001","M005"));
        mealPackagesArrayList.add(new MealPackage("R002","M008"));
        mealPackagesArrayList.add(new MealPackage("R003","M009"));
        mealPackagesArrayList.add(new MealPackage("R004","M010"));
        mealPackagesArrayList.add(new MealPackage("R005","M012"));
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
        colNewMealPackage.setCellValueFactory(new PropertyValueFactory("newMealPackage"));
        colModifyingMealPackages.setCellValueFactory(new PropertyValueFactory("modifyMealPackage"));

        tblMealPackages.setItems(FXCollections.observableArrayList(mealPackagesArrayList));
    }
}
