package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException
import main.java.com.example.Person;;

public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        // Liste déroulante de choix
        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        choiceBox.getItems().addAll("Option 1", "Option 2", "Option 3");
        choiceBox.setValue("Option 1"); // Option par défaut sélectionnée

        // Liste déroulante de couleurs
        ChoiceBox<String> colorBox = new ChoiceBox<>();
        colorBox.getItems().addAll("Red", "Green", "Blue");
        colorBox.setValue("Red"); // Couleur par défaut sélectionnée

        // Bouton OK
        Button okButton = new Button("OK");
        okButton.setOnAction(event -> {
            String selectedOption = choiceBox.getValue();
            String selectedColor = colorBox.getValue();
            System.out.println("Option selectionnee : " + selectedOption);
            System.out.println("Couleur selectionnee : " + selectedColor);
        });

        // Layout principal
        VBox layout = new VBox(10);
        layout.getChildren().addAll(choiceBox, colorBox, okButton);

        // Scene principale
        scene = new Scene(layout, 300, 200);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
