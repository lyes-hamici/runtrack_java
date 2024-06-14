package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class SimpleBorderPaneApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Création du FlowPane
        FlowPane flowPane = new FlowPane();
        flowPane.setStyle("-fx-background-color: grey;");
        // Création de l'étiquette "Nom :"
        Label nameLabel = new Label("Nom :");

        // Création du champ de texte pour entrer un nom
        TextField nameField = new TextField();
        nameField.setPrefColumnCount(15);
        nameField.setStyle("-fx-background-color: purple;");

        // Création du bouton "Envoyer"
        Button sendButton = new Button("Envoyer");

        // Ajout des composants au FlowPane
        flowPane.getChildren().addAll(nameLabel, nameField, sendButton);

        // Création de la scène avec le FlowPane
        Scene scene = new Scene(flowPane, 300, 200);
        

        // Configuration et affichage de la fenêtre
        primaryStage.setTitle("FlowPane Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
