package org.example.ejerciciojavafx;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ArrangeComponents {

    void arrangeComponents(BorderPane root, TextField nombreTarea, Button btnGuardar, Label lblInfo, ListView<String> listaTareas) {

        HBox fila = new HBox(10);
        fila.setAlignment(Pos.CENTER);
        fila.getChildren().addAll(nombreTarea, btnGuardar);

        VBox vbox = new VBox(10);
        vbox.setAlignment(Pos.CENTER);
        vbox.getChildren().addAll(fila, lblInfo, listaTareas);

        root.setCenter(vbox);
    }
}
