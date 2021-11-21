package com.example.demo;

import javafx.fxml.FXML;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class HelloController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button leftButton;

    @FXML
    private Button upButton;

    @FXML
    private Button rightButton;

    @FXML
    private Button downButton;

    @FXML
    private ImageView image;

    @FXML
    void downButtonPressed(ActionEvent event) {
        image.setY(image.getY()+10);
    }

    @FXML
    void leftButtonPressed(ActionEvent event) {
        image.setX(image.getX()-10);
    }

    @FXML
    void rightButtonPressed(ActionEvent event) {
        image.setX(image.getX()+10);
    }

    @FXML
    void upButtonPressed(ActionEvent event) {
        image.setY(image.getY()-10);
    }
}