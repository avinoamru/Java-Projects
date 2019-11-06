package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.ColorPicker;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {


    @FXML
    private ColorPicker colorPicker;

    @FXML
    private TextField bSize;

    boolean toolSelected = false;

    GraphicsContext brushTool;

    @FXML
    private Canvas canvas;

    public Controller() {
    }

    @FXML
    private void handleButtonAction(ActionEvent event){

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        brushTool = canvas.getGraphicsContext2D();
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
    public void toolSelected(ActionEvent e){
        toolSelected = true;
    }

}
