package com.example;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        // Création des données pour le tableau
        ObservableList<Person> data = FXCollections.observableArrayList(
                new Person("John Doe", 30, "john.doe@example.com"),
                new Person("Jane Smith", 25, "jane.smith@example.com"),
                new Person("Tom Brown", 40, "tom.brown@example.com")
        );

        // Création du TableView avec les colonnes
        TableView<Person> tableView = new TableView<>();
        tableView.setItems(data);

        TableColumn<Person, String> nameColumn = new TableColumn<>("Nom");
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn<Person, Integer> ageColumn = new TableColumn<>("Âge");
        ageColumn.setCellValueFactory(new PropertyValueFactory<>("age"));

        TableColumn<Person, String> emailColumn = new TableColumn<>("Email");
        emailColumn.setCellValueFactory(new PropertyValueFactory<>("email"));

        tableView.getColumns().addAll(nameColumn, ageColumn, emailColumn);

        // Bouton Exporter
        Button exportButton = new Button("Exporter");
        exportButton.setOnAction(event -> {
            try {
                exportToCSV(data);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        // Layout principal
        VBox layout = new VBox(10);
        layout.getChildren().addAll(tableView, exportButton);

        // Scene principale
        scene = new Scene(layout, 600, 400);
        stage.setScene(scene);
        stage.show();
    }

    private void exportToCSV(ObservableList<Person> data) throws IOException {
        String fileName = "src/main/resources/exported_data.csv";
    
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(fileName)))) {
            // CSV header
            writer.println("Nom,Âge,Email");
    
            // Write data rows
            for (Person person : data) {
                writer.println(person.getName() + "," + person.getAge() + "," + person.getEmail());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    
        System.out.println("Data exported to " + fileName);
    }
    

    public static void main(String[] args) {
        launch();
    }
}
