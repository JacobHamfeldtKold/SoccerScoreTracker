package com.example.android.soccerscoretracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int Red_Cards_TeamA = 0;
    int Yellow_Cards_TeamA = 0;
    int Cornerkicks_TeamA = 0;

    int scoreTeamB = 0;
    int Red_Cards_TeamB = 0;
    int Yellow_Cards_TeamB = 0;
    int Cornerkicks_TeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayYellowCardForTeamA(0);
        displayYellowCardForTeamB(0);
        displayGoalsForTeamA(0);
        displayGoalsForTeamB(0);
        displayRedCardForTeamA(0);
        displayRedCardForTeamB(0);
        displayCornerKicksForTeamA(0);
        displayCornerKicksForTeamB(0);


    }

    public void Reset(View view){

        scoreTeamA = 0;
        Red_Cards_TeamA = 0;
        Yellow_Cards_TeamA = 0;
        Cornerkicks_TeamA = 0;

        scoreTeamB = 0;
        Red_Cards_TeamB = 0;
        Yellow_Cards_TeamB = 0;
        Cornerkicks_TeamB = 0;

        displayYellowCardForTeamA(Yellow_Cards_TeamA);
        displayYellowCardForTeamB(Yellow_Cards_TeamB);
        displayGoalsForTeamA(scoreTeamA);
        displayGoalsForTeamB(scoreTeamB);
        displayRedCardForTeamA(Red_Cards_TeamA);
        displayRedCardForTeamB(Red_Cards_TeamB);
        displayCornerKicksForTeamA(Cornerkicks_TeamA);
        displayCornerKicksForTeamB(Cornerkicks_TeamB);
    }


    public void addGoalForTeamA(View view){
        scoreTeamA = scoreTeamA + 1;
        displayGoalsForTeamA (scoreTeamA);
    }

    public void addCornerKickForTeamA(View view){
        Cornerkicks_TeamA = Cornerkicks_TeamA + 1;
        displayCornerKicksForTeamA (Cornerkicks_TeamA);
    }

    public void addRedCardForTeamA(View view){
        Red_Cards_TeamA = Red_Cards_TeamA + 1;
        displayRedCardForTeamA (Red_Cards_TeamA);
    }

    public void addYellowCardForTeamA(View view){
        Yellow_Cards_TeamA = Yellow_Cards_TeamA + 1;
        displayYellowCardForTeamA (Yellow_Cards_TeamA);
    }


    public void displayGoalsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText("Goals: " + String.valueOf(score));
    }

    public void displayRedCardForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_red_card);
        scoreView.setText("Red Cards: " + String.valueOf(score));
    }

    public void displayCornerKicksForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_corner_kicks);
        scoreView.setText( "Corners: " + String.valueOf(score));
    }

    public void displayYellowCardForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_yellow_card);
        scoreView.setText( "Yellow Cards: " + String.valueOf(score));
    }



    public void addGoalForTeamB(View view){
        scoreTeamB = scoreTeamB + 1;
        displayGoalsForTeamB (scoreTeamB);
    }

    public void displayGoalsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText("Goals: " + String.valueOf(score));
    }

    public void addRedCardForTeamB(View view){
        Red_Cards_TeamB = Red_Cards_TeamB + 1;
        displayRedCardForTeamB (Red_Cards_TeamB);
    }

    public void displayRedCardForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_red_card);
        scoreView.setText("Red Cards: " + String.valueOf(score));
    }

    public void addCornerKickForTeamB(View view) {
        Cornerkicks_TeamB = Cornerkicks_TeamB + 1;
        displayCornerKicksForTeamB(Cornerkicks_TeamB);
    }

    public void displayCornerKicksForTeamB(int score) {
            TextView scoreView = (TextView) findViewById(R.id.team_b_corner_kicks);
            scoreView.setText( "Corners: " + String.valueOf(score));
    }

    public void addYellowCardForTeamB(View view){
        Yellow_Cards_TeamB = Yellow_Cards_TeamB + 1;
        displayYellowCardForTeamB (Yellow_Cards_TeamB);
    }

    public void displayYellowCardForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_yellow_card);
        scoreView.setText( "Yellow Cards: " + String.valueOf(score));
    }
}

