package com.example.demo;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.util.List;

public class HelloApplication extends Application {

    /*
        Here we're adding an image manually to our scene using this function,
        this function creates an image, and an image view of that image, then adds it to root of the scene graph, so it gets displayed
     */

    public void addImage(Group root, double x, double y, String path) {
        Image image = new Image(path);
        ImageView imageView = new ImageView(image);
        imageView.setX(x);
        imageView.setY(y);
        root.getChildren().add(imageView);
    }

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
            Here we'll add an image of rin just for demonstration purposes
         */
        addImage(group, 0, 0, "images/rin.png");

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