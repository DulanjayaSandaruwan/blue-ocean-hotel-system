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
public class MarkRoomsInMaintainFormController {

    public AnchorPane root;
    public TableView tblMaintainRooms;
    public TableColumn colRoomID;

    ArrayList<MaintainRooms> maintainRoomsArrayList = new ArrayList();

    {
        maintainRoomsArrayList.add(new MaintainRooms("R002"));
        maintainRoomsArrayList.add(new MaintainRooms("R004"));
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
        colRoomID.setCellValueFactory(new PropertyValueFactory("maintainingRoom"));

        tblMaintainRooms.setItems(FXCollections.observableArrayList(maintainRoomsArrayList));
    }
}
