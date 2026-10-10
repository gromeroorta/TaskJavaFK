module org.example.ejerciciojavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;


    opens org.example.ejerciciojavafx to javafx.fxml;
    exports org.example.ejerciciojavafx;
}