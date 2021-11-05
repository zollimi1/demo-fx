package com.example.demofx.LE03;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloWorld extends Application {
    public void start(Stage primaryStage) {
        Label l1 = new Label("Hallo");
        Label l2 = new Label("Welt");
        VBox root = new VBox();

        //root.getChildren().add(l1);
        //root.getChildren().add(l2);
        root.getChildren().add(createButton());

        Scene scene = new Scene(root, 240, 180);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello World");
        primaryStage.show();
    }

    Pane createButton() {
        final Button btn = new Button();
        btn.setText("Add 'Hello World' Label");
        final FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(7, 7, 7, 7));
        pane.getChildren().add(btn);

        /** ActionHandler registrieren ausgeschrieben
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                pane.getChildren().add(
                        new Label("- Hello World! -"));
            }
        });
        return pane;
         **/

        // ActionHandler registrieren mit Lambda
        btn.setOnAction(event -> pane.getChildren().add(
                new Label("- Hello World! -")));
        return pane;
    }
}


