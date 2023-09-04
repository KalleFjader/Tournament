package com.example.tournament;

import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.Arrays;

public class Controller {
    public TextField team2;
    public TextField team1;
    public TextField team3;
    public TextField team4;
    public TextField team5;
    public TextField team6;
    public TextField team7;
    public TextField team8;
    public Label game1;
    public Label game2;
    public Label game3;
    public Label game4;
    public Label game5;
    public Label game6;
    public Label semi3;
    public Label semi2;
    public Label semi1;
    public Label game7;
    public Label game8;
    public Label semi4;
    public Label final1;
    public Label final2;
    public Label winner;
    public Button check1;
    public Button check2;
    public Button check3;
    public Button check4;
    public Button check5;
    public Button check6;
    public Button check7;
    public Button check8;
    public Button check9;
    public Button check10;
    public Button check11;
    public Button check12;
    public Button check13;
    public Button check14;
    ArrayList<Match> scoreboard = new ArrayList();

    public void updateScoreboard(){

    }
    @FXML
    private TextField title;

    @FXML
    protected void onHelloButtonClick() {
        title.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private void teamsEntered(ActionEvent event){
        String[] teamlist = new String[8];
        String lag1 = team1.getText();
        teamlist[0] = lag1;
        game1.setText(lag1);
        String lag2 = team2.getText();
        teamlist[1] = lag2;
        game2.setText(lag2);
        String lag3 = team3.getText();
        teamlist[2] = lag3;
        game3.setText(lag3);
        String lag4 = team4.getText();
        teamlist[3] = lag4;
        game4.setText(lag4);
        String lag5 = team5.getText();
        teamlist[4] = lag5;
        game5.setText(lag5);
        String lag6 = team6.getText();
        teamlist[5] = lag6;
        game6.setText(lag6);
        String lag7 = team7.getText();
        teamlist[6] = lag7;
        game7.setText(lag7);
        String lag8 = team8.getText();
        teamlist[7] = lag8;
        game8.setText(lag8);
        System.out.println(Arrays.toString(teamlist));

    }

    @FXML
    private void resultsEntered1(ActionEvent event){
        semi1.setText(team1.getText());
    }
    @FXML
    private void resultsEntered2(ActionEvent event){
        semi1.setText(team2.getText());
    }
    @FXML
    private void resultsEntered3(ActionEvent event){
        semi2.setText(team3.getText());
    }
    @FXML
    private void resultsEntered4(ActionEvent event){
        semi2.setText(team4.getText());
    }
    @FXML
    private void resultsEntered5(ActionEvent event){
        semi3.setText(team5.getText());
    }
    @FXML
    private void resultsEntered6(ActionEvent event){
        semi3.setText(team6.getText());
    }
    @FXML
    private void resultsEntered7(ActionEvent event){
        semi4.setText(team7.getText());
    }
    @FXML
    private void resultsEntered8(ActionEvent event){
        semi4.setText(team8.getText());
    }
    @FXML
    private void resultsEntered9(ActionEvent event){
        final1.setText(semi1.getText());
    }
    @FXML
    private void resultsEntered10(ActionEvent event){
        final1.setText(semi2.getText());
    }
    @FXML
    private void resultsEntered11(ActionEvent event){
        final2.setText(semi3.getText());
    }
    @FXML
    private void resultsEntered12(ActionEvent event){
        final2.setText(semi4.getText());
    }
    @FXML
    private void resultsEntered13(ActionEvent event){
        winner.setText(final1.getText());
    }
    @FXML
    private void resultsEntered14(ActionEvent event){
        winner.setText(final2.getText());
    }
}