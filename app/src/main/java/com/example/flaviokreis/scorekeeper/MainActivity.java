package com.example.flaviokreis.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Team A
    private TextView teamAScoreTextView;
    private TextView teamAFoulsTextView;
    private TextView teamAPenaltiesTextView;

    private int teamAScore;
    private int teamAFouls;
    private int teamAPenalties;

    //Team A
    private TextView teamBScoreTextView;
    private TextView teamBFoulsTextView;
    private TextView teamBPenaltiesTextView;

    private int teamBScore;
    private int teamBFouls;
    private int teamBPenalties;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Team A
        teamAScoreTextView = (TextView)findViewById(R.id.team_a_score);
        teamAFoulsTextView = (TextView)findViewById(R.id.team_a_foul);
        teamAPenaltiesTextView = (TextView)findViewById(R.id.team_a_penalty);

        //Team B
        teamBScoreTextView = (TextView)findViewById(R.id.team_b_score);
        teamBFoulsTextView = (TextView)findViewById(R.id.team_b_foul);
        teamBPenaltiesTextView = (TextView)findViewById(R.id.team_b_penalty);

        initGame();
    }

    //Team A
    public void addGoalForTeamA(View view) {
        teamAScore = teamAScore + 1;
        updateTeamAScore();
    }

    public void addFoulForTeamA(View view) {
        teamAFouls = teamAFouls + 1;
        updateTeamAFouls();
    }

    public void addPenaltyForTeamA(View view) {
        teamAPenalties = teamAPenalties + 1;
        updateTeamAPenalties();
    }

    private void updateTeamAScore(){
        teamAScoreTextView.setText("" + teamAScore);
    }

    private void updateTeamAFouls(){
        teamAFoulsTextView.setText("Fouls: " + teamAFouls);
    }

    private void updateTeamAPenalties(){
        teamAPenaltiesTextView.setText("Penalties: " + teamAPenalties);
    }

    //Team B
    public void addGoalForTeamB(View view) {
        teamBScore = teamBScore + 1;
        updateTeamBScore();
    }

    public void addFoulForTeamB(View view) {
        teamBFouls = teamBFouls + 1;
        updateTeamBFouls();
    }

    public void addPenaltyForTeamB(View view) {
        teamBPenalties = teamBPenalties + 1;
        updateTeamBPenalties();
    }

    private void updateTeamBScore(){
        teamBScoreTextView.setText("" + teamBScore);
    }

    private void updateTeamBFouls(){
        teamBFoulsTextView.setText("Fouls: " + teamBFouls);
    }

    private void updateTeamBPenalties(){
        teamBPenaltiesTextView.setText("Penalties: " + teamBPenalties);
    }

    public void resetGame(View view) {
        initGame();
    }

    public void initGame(){
        teamAScore = 0;
        teamAFouls = 0;
        teamAPenalties = 0;

        updateTeamAScore();
        updateTeamAFouls();
        updateTeamAPenalties();

        teamBScore = 0;
        teamBFouls = 0;
        teamBPenalties = 0;

        updateTeamBScore();
        updateTeamBFouls();
        updateTeamBPenalties();
    }
}
