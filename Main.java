package com.company;
import javafx.application.Application;

import javafx.scene.Group;

import javafx.scene.Scene;

import javafx.scene.paint.Color;

import javafx.scene.shape.Rectangle;

import javafx.stage.Stage;

import javafx.scene.shape.Polyline;
public class Main extends Application {



    @Override

    public void start(Stage primaryStage) {

        primaryStage.setTitle("Central African Republic");

        Group group = new Group();

        Rectangle rect1=new Rectangle();

        rect1.setX(20);

        rect1.setY(20);

        rect1.setWidth(300);

        rect1.setHeight(50);

        rect1.setFill(Color.NAVY);

        Rectangle rect2=new Rectangle();

        rect2.setX(20);

        rect2.setY(70);

        rect2.setWidth(300);

        rect2.setHeight(50);

        rect2.setFill(Color.WHITE);

        Rectangle rect3=new Rectangle();

        rect3.setX(20);

        rect3.setY(120);

        rect3.setWidth(300);

        rect3.setHeight(50);

        rect3.setFill(Color.GREEN);

        Rectangle rect4=new Rectangle();

        rect4.setX(20);

        rect4.setY(170);

        rect4.setWidth(300);

        rect4.setHeight(50);

        rect4.setFill(Color.YELLOW);



        Rectangle rect5=new Rectangle();

        rect5.setX(143);

        rect5.setY(20);

        rect5.setWidth(50);

        rect5.setHeight(200);

        rect5.setFill(Color.RED);

        Polyline polyline=new Polyline();

        polyline.getPoints().addAll(new Double[]{

                65.0,23.0,

                73.0,35.0,

                88.0,35.0,

                78.0,43.0,

                86.0,55.0,

                65.0,50.0,

                50.0,57.0,

                55.0,43.0,

                43.0,35.0,

                58.0,35.0,

                65.0,23.0,

        });

        polyline.setFill(Color.YELLOW);

        polyline.setStroke(Color.YELLOW);

        group.getChildren().addAll(rect1,rect2,rect3,rect4,rect5,polyline);

        Scene scene = new Scene(group,500,400,Color.WHITE);

        primaryStage.setScene(scene);

        primaryStage.show();

    }

    public static void main(String[] args) {

        launch(args);

    }



}

