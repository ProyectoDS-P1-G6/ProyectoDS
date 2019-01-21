package views.popup;

import java.util.Optional;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import utils.StageDecoratorX;

public class VentaDetalles extends Stage {

    protected final AnchorPane root;
    protected final VBox vboxcontainer;
    protected final Label title;
    protected final GridPane grid;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final RowConstraints rowConstraints2;
    protected final RowConstraints rowConstraints3;
    protected final Label NoVenta;
    protected final Label BuyerName;
    protected final Label Status;
    protected final Label price;
    protected final Label productName;
    protected final Label numberLabel;
    protected final Label buyerLabel;
    protected final Label statusLabel;
    protected final Label priceLabel;
    protected final Label productName0;
    protected final HBox hBoxContainer;
    protected final Button anular;
    protected final Button verMapa;

    public VentaDetalles() {

        root = new AnchorPane();
        vboxcontainer = new VBox();
        title = new Label();
        grid = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        rowConstraints2 = new RowConstraints();
        rowConstraints3 = new RowConstraints();
        NoVenta = new Label();
        BuyerName = new Label();
        Status = new Label();
        price = new Label();
        productName = new Label();
        numberLabel = new Label();
        buyerLabel = new Label();
        statusLabel = new Label();
        priceLabel = new Label();
        productName0 = new Label();
        hBoxContainer = new HBox();
        anular = new Button();
        verMapa = new Button();

        root.setPrefHeight(495.0);
        root.setPrefWidth(434.0);

        vboxcontainer.setPrefHeight(491.0);
        vboxcontainer.setPrefWidth(458.0);

        title.setAlignment(javafx.geometry.Pos.CENTER);
        title.setPrefHeight(51.0);
        title.setPrefWidth(466.0);
        title.getStyleClass().add("title");
        title.setText("Detalles de la Venta");

        grid.setAlignment(javafx.geometry.Pos.CENTER);
        grid.setPrefHeight(314.0);
        grid.setPrefWidth(466.0);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMaxWidth(256.0);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(256.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMaxWidth(264.0);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(192.0);

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

        NoVenta.setAlignment(javafx.geometry.Pos.CENTER);
        NoVenta.setPrefWidth(230.0);
        NoVenta.getStyleClass().add("textstyle");
        NoVenta.setText("No. Venta:");

        GridPane.setRowIndex(BuyerName, 1);
        BuyerName.setAlignment(javafx.geometry.Pos.CENTER);
        BuyerName.setPrefWidth(230.0);
        BuyerName.getStyleClass().add("textstyle");
        BuyerName.setText("Nombre de comprador: ");

        GridPane.setRowIndex(Status, 2);
        Status.setAlignment(javafx.geometry.Pos.CENTER);
        Status.setPrefWidth(230.0);
        Status.getStyleClass().add("textstyle");
        Status.setText("Estado:");

        GridPane.setRowIndex(price, 3);
        price.setAlignment(javafx.geometry.Pos.CENTER);
        price.setPrefWidth(230.0);
        price.getStyleClass().add("textstyle");
        price.setText("Precio:");

        GridPane.setRowIndex(productName, 4);
        productName.setAlignment(javafx.geometry.Pos.CENTER);
        productName.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        productName.setPrefWidth(230.0);
        productName.getStyleClass().add("textstyle");
        productName.setText("Nombre Producto:");

        GridPane.setColumnIndex(numberLabel, 1);
        numberLabel.setPrefHeight(17.0);
        numberLabel.setPrefWidth(230.0);
        numberLabel.setText("Label");

        GridPane.setColumnIndex(buyerLabel, 1);
        GridPane.setRowIndex(buyerLabel, 1);
        buyerLabel.setPrefHeight(17.0);
        buyerLabel.setPrefWidth(240.0);
        buyerLabel.setText("Label");

        GridPane.setColumnIndex(statusLabel, 1);
        GridPane.setRowIndex(statusLabel, 2);
        statusLabel.setText("Label");

        GridPane.setColumnIndex(priceLabel, 1);
        GridPane.setRowIndex(priceLabel, 3);
        priceLabel.setText("Label");

        GridPane.setColumnIndex(productName0, 1);
        GridPane.setRowIndex(productName0, 4);
        productName0.setText("Label");
        VBox.setMargin(grid, new Insets(5.0));

        hBoxContainer.setAlignment(javafx.geometry.Pos.CENTER);
        hBoxContainer.setPrefHeight(100.0);
        hBoxContainer.setPrefWidth(200.0);
        hBoxContainer.setSpacing(55.0);

        anular.setMnemonicParsing(false);
        anular.setOnAction(this::AnularVentaAction);
        anular.setPrefHeight(40.0);
        anular.setPrefWidth(150.0);
        anular.getStyleClass().add("buttonstyle");
        anular.setText("Anular venta");

        verMapa.setAlignment(javafx.geometry.Pos.CENTER);
        verMapa.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        verMapa.setMnemonicParsing(false);
        verMapa.setOnAction(this::verMapaAction);
        verMapa.setPrefHeight(40.0);
        verMapa.setPrefWidth(150.0);
        verMapa.getStyleClass().add("buttonstyle");
        verMapa.setText("Ver Mapa");
        root.setPadding(new Insets(5.0));

        vboxcontainer.getChildren().add(title);
        grid.getColumnConstraints().add(columnConstraints);
        grid.getColumnConstraints().add(columnConstraints0);
        grid.getRowConstraints().add(rowConstraints);
        grid.getRowConstraints().add(rowConstraints0);
        grid.getRowConstraints().add(rowConstraints1);
        grid.getRowConstraints().add(rowConstraints2);
        grid.getRowConstraints().add(rowConstraints3);
        grid.getChildren().add(NoVenta);
        grid.getChildren().add(BuyerName);
        grid.getChildren().add(Status);
        grid.getChildren().add(price);
        grid.getChildren().add(productName);
        grid.getChildren().add(numberLabel);
        grid.getChildren().add(buyerLabel);
        grid.getChildren().add(statusLabel);
        grid.getChildren().add(priceLabel);
        grid.getChildren().add(productName0);
        vboxcontainer.getChildren().add(grid);
        hBoxContainer.getChildren().add(anular);
        hBoxContainer.getChildren().add(verMapa);
        vboxcontainer.getChildren().add(hBoxContainer);
        root.getChildren().add(vboxcontainer);

        setScene(new Scene(root));
        root.getStylesheets().add("assets/Venta_Details.css");

    }

    void AnularVentaAction(ActionEvent actionEvent) {
        String answer = "";
        ButtonType buttonYes = new ButtonType("Si", ButtonBar.ButtonData.YES);
        ButtonType buttonNO = new ButtonType("No", ButtonBar.ButtonData.NO);

        Alert alert = new Alert(Alert.AlertType.WARNING,
                 "¿Esta seguro que desea anular la venta?",
                buttonYes,
                buttonNO);

        alert.setTitle("Confirmar anulación de venta");
        Optional<ButtonType> result = alert.showAndWait();

        if (result.orElse(buttonYes).equals("Si")) {
            answer = "Y";
        } else if (result.orElse(buttonNO).equals("No")) {
            answer = "N";
        }

    }

    void verMapaAction(ActionEvent actionEvent) {
        VerMapa vm = new VerMapa();
        new StageDecoratorX(vm);
        vm.show();
    }
}
