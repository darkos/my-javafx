package com.wpl.jfx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SplitPaneTest extends Application {
	@Override public void start(Stage stage) {
        HBox hbox = new HBox(20);
        hbox.setTranslateX(20);
        hbox.setTranslateY(20);
 
        SplitPane splitPane1 = new SplitPane();
        splitPane1.setPrefSize(200, 200);
        final Button l = new Button("Left Button");
        final Button r = new Button("Right Button");
        splitPane1.getItems().addAll(l, r);
        hbox.getChildren().add(splitPane1);
 
        Scene scene = new Scene(new Group(hbox), 560, 240);
        scene.setFill(Color.GHOSTWHITE);
        stage.setScene(scene);
        stage.setTitle("SplitPane");
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}
