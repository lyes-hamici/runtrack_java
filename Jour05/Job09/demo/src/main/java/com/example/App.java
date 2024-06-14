package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane root = new StackPane();
        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("JavaFX Dialogues Example");

        // Intercepte l'événement de fermeture de la fenêtre principale (primaryStage)
        primaryStage.setOnCloseRequest(event -> {
            event.consume(); // Consomme l'événement pour éviter la fermeture immédiate

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confirmation");
            alert.setHeaderText("Confirmation de sortie");
            alert.setContentText("Êtes-vous sûr de vouloir quitter l'application?");

            // Options pour l'utilisateur : OK ou Annuler
            alert.showAndWait().ifPresent(response -> {
                if (response == ButtonType.OK) {
                    primaryStage.close(); // Ferme la fenêtre si l'utilisateur clique sur OK
                } else {
                    event.consume(); // Sinon, consomme à nouveau l'événement pour annuler la fermeture
                }
            });
        });

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
