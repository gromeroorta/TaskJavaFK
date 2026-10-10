package org.example.ejerciciojavafx;

import javafx.scene.control.*;
import java.util.logging.Logger;

public class Initialize {

    private static final Logger logger = AppLogger.getLogger();

    void initialize(Button btnGuardar, TextField nombreTarea, ListView<String> listaTareas, Label lblInfo) {

        logger.info("Iniciando los componentes de la app");
        btnGuardar.setText("Agregar Tarea");
        nombreTarea.setPromptText("...");
        nombreTarea.setMaxWidth(300);
        listaTareas.setMaxWidth(500);
        lblInfo.setText("");
    }
}
