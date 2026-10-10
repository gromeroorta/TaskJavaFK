package org.example.ejerciciojavafx;

import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class ActionButtonAdd {
    public void btnGuardar(TextField text, Label label, ListView<String> lista) {

        if (text.getText().isEmpty()) {
            label.setText("Introduce una tarea");
            label.setStyle("-fx-text-fill: red;");
        }
        else if (text.getText().trim().length() < 3) {
            label.setText("Introduce una tarea con al menos 3 caracteres");
            label.setStyle("-fx-text-fill: red;");
        }
        else {
            label.setText("");
            lista.getItems().add(text.getText());
            text.setText("");
        }
    }
}

