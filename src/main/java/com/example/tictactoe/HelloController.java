package com.example.tictactoe;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

import javax.swing.*;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    private char gameField[][] = new char[3][3];

    private boolean isGame = true;

    private char nowSym = 'x';

    @FXML
    public void btnclick(ActionEvent event) {

        Button btn = (Button)event.getSource();

        if(!isGame || btn.getText() != "") return;


        int rowIndex = GridPane.getRowIndex(btn) == null ? 0 : GridPane.getRowIndex(btn);
        int columnIndex = GridPane.getColumnIndex(btn) == null ? 0 : GridPane.getColumnIndex(btn);

        gameField[rowIndex][columnIndex] = nowSym;

        btn.setText(String.valueOf(nowSym));

        if(gameField[0][0] == gameField[0][1] && gameField[0][0] == gameField[0][2] && (gameField[0][0] == 'x' || gameField[0][0] == 'o')){
            isGame = false;
            JOptionPane.showMessageDialog(null, "Победитель: " + nowSym);
        }
        else if(gameField[1][0] == gameField[1][1] && gameField[1][0] == gameField[1][2] && (gameField[1][0] == 'x' || gameField[1][0] == 'o')){
            isGame = false;
            JOptionPane.showMessageDialog(null, "Победитель: " + nowSym);
        }
        else if(gameField[2][0] == gameField[2][1] && gameField[2][0] == gameField[2][2] && (gameField[2][0] == 'x' || gameField[2][0] == 'o')){
            isGame = false;
            JOptionPane.showMessageDialog(null, "Победитель: " + nowSym);
        }
        else if(gameField[0][0] == gameField[1][0] && gameField[0][0] == gameField[2][0] && (gameField[0][0] == 'x' || gameField[0][0] == 'o')){
            isGame = false;
            JOptionPane.showMessageDialog(null, "Победитель: " + nowSym);
        }
        else if(gameField[0][1] == gameField[1][1] && gameField[0][1] == gameField[1][2] && (gameField[0][1] == 'x' || gameField[0][1] == 'o')){
            isGame = false;
            JOptionPane.showMessageDialog(null, "Победитель: " + nowSym);
        }
        else if(gameField[0][2] == gameField[1][2] && gameField[0][2] == gameField[2][2] && (gameField[0][2] == 'x' || gameField[0][2] == 'o')){
            isGame = false;
            JOptionPane.showMessageDialog(null, "Победитель: " + nowSym);
        }
        else if(gameField[0][0] == gameField[1][1] && gameField[0][0] == gameField[2][2] && (gameField[0][0] == 'x' || gameField[0][0] == 'o')){
            isGame = false;
            JOptionPane.showMessageDialog(null, "Победитель: " + nowSym);
        }
        else if(gameField[2][0] == gameField[1][1] && gameField[2][0] == gameField[0][2] && (gameField[2][0] == 'x' || gameField[2][0] == 'o')){
            isGame = false;
            JOptionPane.showMessageDialog(null, "Победитель: " + nowSym);
        }

        nowSym = nowSym == 'x' ? 'o' : 'x';
    }

    @FXML
    void initialize() {

    }

}
