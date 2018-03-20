package com.example.android.rugbyscorekeeperapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Tracks the score for Teams A and B
    int scoreTeamKE , scoreTeamNZ = 0; // declaration

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Kenya by 2 points.
     */
    public void addTwoForKE(View v){
        scoreTeamKE = scoreTeamKE + 2;
        displayForTeamKE(scoreTeamKE);
    }
    /**
     * Increase the score for Kenya by 3 points.
     */
    public void addThreeForKE2(View v){
        scoreTeamKE = scoreTeamKE + 3;
        displayForTeamKE(scoreTeamKE);
    }
    /**
     * Increase the score for Kenya by 3 points.
     */
    public void addThreeForKE(View v){
        scoreTeamKE = scoreTeamKE + 3;
        displayForTeamKE(scoreTeamKE);
    }
    /**
     * Increase the score for Kenya by 5 points.
     */
    public void addFiveForKE2(View v){
        scoreTeamKE = scoreTeamKE + 5;
        displayForTeamKE(scoreTeamKE);
    }
    /**
     * Increase the score for Kenya by 5 points.
     */
    public void addFiveForKE(View v){
        scoreTeamKE = scoreTeamKE + 5;
        displayForTeamKE(scoreTeamKE);
    }
    /**
     * Displays the given score for Kenya.
     */
    private void displayForTeamKE(int score) {
        TextView scoreView = (TextView)findViewById(R.id.team_ke);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Increase the score for New Zealand by 2 points.
     */
    public void addTwoForNZ(View v){
        scoreTeamNZ = scoreTeamNZ + 2;
        displayForTeamNZ(scoreTeamNZ);
    }
    /**
     * Increase the score for New Zealand by 3 points.
     */
    public void addThreeForNZ2(View v){
        scoreTeamNZ = scoreTeamNZ + 3;
        displayForTeamNZ(scoreTeamNZ);
    }
    /**
     * Increase the score for New Zealand by 3 points.
     */
    public void addThreeForNZ(View v){
        scoreTeamNZ = scoreTeamNZ + 3;
        displayForTeamNZ(scoreTeamNZ);
    }
    /**
     * Increase the score for New Zealand by 5 points.
     */
    public void addFiveForNZ2(View v){
        scoreTeamNZ = scoreTeamNZ + 5;
        displayForTeamNZ(scoreTeamNZ);
    }
    /**
     * Increase the score for New Zealand by 5 points.
     */
    public void addFiveForNZ(View v){
        scoreTeamNZ = scoreTeamNZ + 5;
        displayForTeamNZ(scoreTeamNZ);
    }
    /**
     * Displays the given score for New Zealand.
     */
    private void displayForTeamNZ(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_n_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View v){
        scoreTeamKE = 0;
        scoreTeamNZ = 0;
        displayForTeamKE(scoreTeamKE);
        displayForTeamNZ(scoreTeamNZ);
    }
}
