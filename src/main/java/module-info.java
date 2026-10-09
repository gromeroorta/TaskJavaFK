module org.example.ejerciciojavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.ejerciciojavafx to javafx.fxml;
    exports org.example.ejerciciojavafx;
}