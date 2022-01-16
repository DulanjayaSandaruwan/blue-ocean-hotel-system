package controller;

import javafx.collections.ArrayChangeListener;
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
 * @Since : 05/07/2021
 **/
public class RoomsController {
    public AnchorPane root;
    public TableView <Room> tblRooms;
    public TableColumn colNewRoomID;
    public TableColumn colModifyingRoomID;


    ArrayList<Room> roomArrayList = new ArrayList();

    {
        roomArrayList.add(new Room("R001","R008"));
        roomArrayList.add(new Room("R002","R010"));
        roomArrayList.add(new Room("R003","R011"));
        roomArrayList.add(new Room("R004","R012"));
        roomArrayList.add(new Room("R005","R013"));
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
        colNewRoomID.setCellValueFactory(new PropertyValueFactory("newRoomId"));
        colModifyingRoomID.setCellValueFactory(new PropertyValueFactory("modifyingRoomID"));

        tblRooms.setItems(FXCollections.observableArrayList(roomArrayList));
    }
}
