package org.example.ejerciciojavafx;

import javafx.application.Application;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    private ActionButtonAdd actionButtonAdd = new ActionButtonAdd();
    private ArrangeComponents arrangeComponents = new ArrangeComponents();
    private SetupWindow setupWindow = new SetupWindow();
    private Initialize initialize = new Initialize();

    private ListView<String> listaTareas = new ListView<>();
    private Label lblInfo = new Label();
    private Button btnGuardar = new Button();
    private BorderPane root = new BorderPane();
    private TextField nombreTarea = new TextField();

    private void clickOnButton() {
        actionButtonAdd.btnGuardar(nombreTarea, lblInfo, listaTareas);
    }

    @Override
    public void start(Stage stage) throws IOException {
        initialize.initialize(btnGuardar, nombreTarea, listaTareas, lblInfo);
        arrangeComponents.arrangeComponents(root, nombreTarea, btnGuardar, lblInfo, listaTareas);
        btnGuardar.setOnAction(e -> clickOnButton());
        System.out.println("Montando ventana...");
        setupWindow.setupWindow(stage, root);
    }
}