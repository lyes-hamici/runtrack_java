package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class SimpleBorderPaneApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Création du BorderPane
        BorderPane borderPane = new BorderPane();

        // Création du bouton "Quitter"
        Button quitButton = new Button("Quitter");

        // Ajout de l'action pour fermer l'application lorsque le bouton est cliqué
        quitButton.setOnAction(event -> {
            // Fermer l'application
            primaryStage.close();
        });

        // Ajout du bouton "Quitter" en bas de la fenêtre (dans la zone South)
        borderPane.setBottom(quitButton);

        // Création de la scène avec le BorderPane
        Scene scene = new Scene(borderPane, 300, 200);

        // Configuration et affichage de la fenêtre
        primaryStage.setTitle("Simple BorderPane Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
