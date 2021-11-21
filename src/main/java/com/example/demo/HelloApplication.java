package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.util.List;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        /*
            This time we are using scenebuilder, so we built our xml file and now we load it like this,
            notice it's a Parent object, this is important, we can't import our own objects manually this time,
            the rest is the same as before
         */
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        /*
            A scene is needed for a stage to display the scene content
            and a scene need content, so we have that group
         */
        Scene scene = new Scene(root);
        /*
            We can set different fields of the stage to values we want
            like adding an icon, changing the width and height, and so on...
            here an icon is an image, so we have to load it as an image, the starting directory of searching in jfx is resources folder
         */
        Image icon = new Image("icons/icon.png");
        //here we have to get the icons List and add our icon to it
        stage.getIcons().add(icon);
        stage.setTitle("I hate saber, rin best girl <3");
        /*
            here we assign the scene we created to the stage
            and make it visible via stage.show() method
         */
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}