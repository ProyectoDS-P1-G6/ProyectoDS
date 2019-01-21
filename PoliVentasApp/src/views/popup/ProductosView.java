package views.popup;

import java.util.Optional;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import views.items.*;

public class ProductosView extends Stage {
    protected final AnchorPane root;
    protected final VBox vBoxContainer;
    protected final Label title;
    protected  GridPane grid;
    protected  ColumnConstraints columnConstraints;
    protected  ColumnConstraints columnConstraints0;
    protected  RowConstraints rowConstraints;
    protected  RowConstraints rowConstraints0;
    protected  RowConstraints rowConstraints1;
    protected  RowConstraints rowConstraints2;
    protected  RowConstraints rowConstraints3;
    protected  Label pricelabel;
    protected  Label sellerLabel;
    protected  Label scoreLabel;
    protected  Label descriptionLabel;
    protected  Label categoryLabel;
    protected  TextField priceText;
    protected  TextField sellerText;
    protected  TextField descriptionText;
    protected  TextField categoryText;
    protected  HBox hBoxContainer;
    protected  Button eliminarButton;
    protected  Button modificarButton;
    protected  Button guardarButton;
    
    

    public ProductosView(ProductoItem item) {
        
        root= new AnchorPane();
        vBoxContainer = new VBox();
        title = new Label();
        
        hBoxContainer = new HBox();
        eliminarButton = new Button();
        modificarButton = new Button();
        guardarButton = new Button();
        

       
        root.setPrefHeight(300.0);
        root.setPrefWidth(300.0);

        vBoxContainer.setAlignment(javafx.geometry.Pos.TOP_CENTER);
        vBoxContainer.setPrefHeight(300.0);
        vBoxContainer.setPrefWidth(300.0);

        title.setAlignment(javafx.geometry.Pos.CENTER);
        title.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        title.setPrefHeight(64.0);
        title.setPrefWidth(400.0);
        title.getStyleClass().add("title");
        title.setText("Detalle producto");

        
        hBoxContainer.setAlignment(javafx.geometry.Pos.CENTER);
        hBoxContainer.setLayoutX(1.0);
        hBoxContainer.setLayoutY(404.0);
        hBoxContainer.setPrefHeight(82.0);
        hBoxContainer.setPrefWidth(250.0);
        hBoxContainer.setSpacing(30.0);

        eliminarButton.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        eliminarButton.setLayoutX(10.0);
        eliminarButton.setMnemonicParsing(false);
        eliminarButton.setOnAction(this::eliminarProducto);
        eliminarButton.setPrefHeight(30.0);
        eliminarButton.setPrefWidth(90.0);
        eliminarButton.getStyleClass().add("buttonstyle");
        eliminarButton.setText("Eliminar");
        eliminarButton.setPadding(new Insets(0.0, 5.0, 0.0, 0.0));

        modificarButton.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        modificarButton.setMnemonicParsing(false);
        modificarButton.setOnAction(this::modificarProducto);
        modificarButton.setPrefHeight(30.0);
        modificarButton.setPrefWidth(90.0);
        modificarButton.getStyleClass().add("buttonstyle");
        modificarButton.setText("Modificar");
        root.setPadding(new Insets(5,5,5,5));
        
        guardarButton.setContentDisplay(ContentDisplay.CENTER);
        guardarButton.setOnAction(this::modificarProducto);
        guardarButton.setPrefHeight(30.0);
        guardarButton.setPrefWidth(90.0);
        guardarButton.getStyleClass().add("buttonstyle");
        guardarButton.setText("Guardar");
        guardarButton.setDisable(true);
        vBoxContainer.setSpacing(10);
        vBoxContainer.getChildren().add(title);
        vBoxContainer.getChildren().add(item);
        
        vBoxContainer.getChildren().add(eliminarButton);
        vBoxContainer.getChildren().add(modificarButton);
        vBoxContainer.getChildren().add(guardarButton);
        //root.getChildren().add(hBoxContainer);
        root.getChildren().add(vBoxContainer);

        setScene(new Scene(root));
        root.getStylesheets().add("assets/ProductosView.css");
    }
    
     void eliminarProducto(ActionEvent actionEvent){
     String answer = "";
        ButtonType buttonYes = new ButtonType("Si", ButtonBar.ButtonData.YES);
        ButtonType buttonNO = new ButtonType("No", ButtonBar.ButtonData.NO);

        Alert alert = new Alert(Alert.AlertType.WARNING,
                 "¿Esta seguro que desea eliminar este producto?",
                buttonYes,
                buttonNO);

        alert.setTitle("Confirmar eliminación de producto");
        Optional<ButtonType> result = alert.showAndWait();

        if (result.orElse(buttonYes).equals("Si")) {
            answer = "Y";
        } else if (result.orElse(buttonNO).equals("No")) {
            answer = "N";
        }
     }

     void modificarProducto(ActionEvent actionEvent){
     guardarButton.setDisable(false);
     
        grid = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        rowConstraints2 = new RowConstraints();
        rowConstraints3 = new RowConstraints();
        pricelabel = new Label();
        sellerLabel = new Label();
        scoreLabel = new Label();
        descriptionLabel = new Label();
        categoryLabel = new Label();
        priceText = new TextField();
        sellerText = new TextField();
        descriptionText = new TextField();
        categoryText = new TextField();
     
        grid.setAlignment(javafx.geometry.Pos.CENTER);
        grid.setLayoutX(2.0);
        grid.setLayoutY(205.0);
        grid.setPrefHeight(200.0);
        grid.setPrefWidth(480.0);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMaxWidth(213.0);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(211.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMaxWidth(243.0);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(210.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(30.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(30.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints2.setMinHeight(10.0);
        rowConstraints2.setPrefHeight(30.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints3.setMinHeight(10.0);
        rowConstraints3.setPrefHeight(30.0);
        rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        pricelabel.setAlignment(javafx.geometry.Pos.CENTER);
        pricelabel.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        pricelabel.setPrefHeight(34.0);
        pricelabel.setPrefWidth(241.0);
        pricelabel.getStyleClass().add("textstyle");
        pricelabel.setText("Precio:");

        GridPane.setRowIndex(sellerLabel, 1);
        sellerLabel.setAlignment(javafx.geometry.Pos.CENTER);
        sellerLabel.setPrefHeight(30.0);
        sellerLabel.setPrefWidth(230.0);
        sellerLabel.getStyleClass().add("textstyle");
        sellerLabel.setText("Vendedor:");

        GridPane.setRowIndex(scoreLabel, 2);
        scoreLabel.setAlignment(javafx.geometry.Pos.CENTER);
        scoreLabel.setPrefHeight(30.0);
        scoreLabel.setPrefWidth(230.0);
        scoreLabel.getStyleClass().add("textstyle");
        scoreLabel.setText("Calificación:");

        GridPane.setRowIndex(descriptionLabel, 3);
        descriptionLabel.setAlignment(javafx.geometry.Pos.CENTER);
        descriptionLabel.setPrefHeight(30.0);
        descriptionLabel.setPrefWidth(230.0);
        descriptionLabel.getStyleClass().add("textstyle");
        descriptionLabel.setText("Descripción:");

        GridPane.setRowIndex(categoryLabel, 4);
        categoryLabel.setAlignment(javafx.geometry.Pos.CENTER);
        categoryLabel.setPrefHeight(30.0);
        categoryLabel.setPrefWidth(230.0);
        categoryLabel.getStyleClass().add("textstyle");
        categoryLabel.setText("Categoría:");

        GridPane.setColumnIndex(priceText, 1);
        priceText.setEditable(false);
        priceText.setPromptText("333");

        GridPane.setColumnIndex(sellerText, 1);
        GridPane.setRowIndex(sellerText, 1);
        sellerText.setEditable(false);
        sellerText.setPromptText("Nombre Apellido");

        GridPane.setColumnIndex(descriptionText, 1);
        GridPane.setRowIndex(descriptionText, 3);
        descriptionText.setEditable(false);
        descriptionText.setPromptText("Producto Descripcion");

        GridPane.setColumnIndex(categoryText, 1);
        GridPane.setRowIndex(categoryText, 4);
        categoryText.setEditable(false);
        categoryText.setPromptText("Categoria");
        grid.setPadding(new Insets(5.0));
        
        grid.getColumnConstraints().add(columnConstraints);
        grid.getColumnConstraints().add(columnConstraints0);
        grid.getRowConstraints().add(rowConstraints);
        grid.getRowConstraints().add(rowConstraints0);
        grid.getRowConstraints().add(rowConstraints1);
        grid.getRowConstraints().add(rowConstraints2);
        grid.getRowConstraints().add(rowConstraints3);
        grid.getChildren().add(pricelabel);
        grid.getChildren().add(sellerLabel);
        grid.getChildren().add(scoreLabel);
        grid.getChildren().add(descriptionLabel);
        grid.getChildren().add(categoryLabel);
        grid.getChildren().add(priceText);
        grid.getChildren().add(sellerText);
        grid.getChildren().add(descriptionText);
        grid.getChildren().add(categoryText);
        //root.getChildren().add(grid);
     }
}
