module com.example.primitivedatatypes {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.primitivedatatypes to javafx.fxml;
    exports com.example.primitivedatatypes;
}