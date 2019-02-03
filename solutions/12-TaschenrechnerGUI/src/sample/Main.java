package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        GridPane gridPane = new GridPane();
        gridPane.setVgap(30);
        gridPane.setHgap(30);
        gridPane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(gridPane,500,750);
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        initializeView(gridPane);
        primaryStage.show();
    }

    private void initializeView(GridPane gridPane){
        String[] operations = {"+", "-", "/", "*"};
        TextField leftOperand = new TextField();
        leftOperand.setMaxSize(50, 50);
        gridPane.add(leftOperand, 0, 1);
        TextField rightOperand = new TextField();
        rightOperand.setMaxSize(50,50);
        gridPane.add(rightOperand, 1,1);
        Label result = new Label();
        gridPane.add(result, 2, 1);
        for (int i=0; i<4; i++){
            Button b = new Button(operations[i]);
            b.setMinSize(50,50);
            final int j = i;
            b.setOnAction(actionEvent -> {
                result.setText(buttonClicked(operations[j], leftOperand.getText(), rightOperand.getText()));
            });
            gridPane.add(b, i, 0);
        }
    }

    private String buttonClicked(String operation, String leftOperand, String rightOperand){
        if(!validateInput(leftOperand, rightOperand)){return "Wrong input";}
        int left = Integer.valueOf(leftOperand);
        int right = Integer.valueOf(rightOperand);
        switch (operation){
            case "+":
                return String.valueOf(left+right);
            case "-":
                return String.valueOf(left-right);
            case "/":
                return String.valueOf(left/right);
            case "*":
                return String.valueOf(left*right);
        }
        return "";
    }

    private boolean validateInput(String leftOperand, String rightOperand){
        int left, right;
        try{
            left = Integer.valueOf(leftOperand);
            right = Integer.valueOf(rightOperand);
        } catch (NumberFormatException n){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
