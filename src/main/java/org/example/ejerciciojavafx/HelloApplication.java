package org.example.ejerciciojavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Task");
        stage.setHeight(300);
        stage.setWidth(400);
        stage.setResizable(true);
        stage.setMinHeight(200);
        stage.setMinWidth(200);

        var button = new Button("Agregar Tarea");
        var text = new TextField();
        text.setPromptText("...");

        var fila = new HBox(10);
        fila.setAlignment(Pos.CENTER);
        fila.getChildren().addAll(text, button);

        var vbox = new VBox(10);
        vbox.setAlignment(Pos.CENTER);

        var label = new Label("");
        var lista = new ListView<String>();

        var caja = new BorderPane();
        caja.setCenter(vbox);
        vbox.getChildren().add(fila);
        vbox.getChildren().add(label);
        vbox.getChildren().add(lista);

        button.setOnAction(event -> {
            if (text.getText().isEmpty()) {
                label.setText("Introduce una tarea");
                label.setStyle("-fx-text-fill: red;");
            }
            else {
                label.setText("");
                lista.getItems().add(text.getText());
                text.setText("");
            }
        });

        Scene scene = new Scene(caja, 300, 300);

        stage.setScene(scene);

        stage.show();
    }
}
