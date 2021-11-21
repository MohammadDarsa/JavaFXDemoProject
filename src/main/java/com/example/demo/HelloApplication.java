package com.example.demo;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        /*
            A group extends Parent and Parent extends Node
            here we use this as the Scene graph and give it to construct a scene
         */
        Group group = new Group();
        /*
            A scene is needed for a stage to display the scene content
            and a scene need content, so we have that group
         */
        Scene scene = new Scene(group);
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