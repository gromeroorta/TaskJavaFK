package org.example.ejerciciojavafx;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class SetupWindow {

    void setupWindow(Stage stage, BorderPane root) {
        stage.setTitle("Task");
        stage.setWidth(400);
        stage.setHeight(300);
        stage.setResizable(true);
        stage.setMinHeight(200);
        stage.setMinWidth(200);
        Scene scene = new Scene(root, 400, 300);
        stage.setScene(scene);
        stage.show();
    }
}
