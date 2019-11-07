package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {


    @FXML
    private ColorPicker colorPicker = new ColorPicker();

    @FXML
    private TextField bSize = new TextField();

    boolean toolSelected = false;

    GraphicsContext brushTool;

    @FXML
    private Canvas canvas = new Canvas();




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        brushTool = canvas.getGraphicsContext2D();
        brushTool.setFill(Color.BLACK);
        canvas.setOnMouseDragged(e -> {
            double size = Double.parseDouble(bSize.getText());
            double x = e.getX() - size / 2;
            double y = e.getY() - size / 2;

            if(toolSelected && !bSize.getText() .isEmpty()) {
                brushTool.setFill(colorPicker.getValue());
                brushTool.fillRoundRect(x,y,size, size, size, size);
            }

        });
    }

    @FXML
    public void toolSelected(javafx.event.ActionEvent e){
        toolSelected = true;
    }



}