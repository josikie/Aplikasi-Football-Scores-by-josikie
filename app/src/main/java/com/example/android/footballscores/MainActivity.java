package com.example.android.footballscores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;
    int foulsA = 0;
    int foulsB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    /**
     * TextView For Score Team A
     */

    public void teamAScore(int i){
        TextView textView = findViewById(R.id.score_team_a);
        textView.setText(String.valueOf(i));
    }

    /**
     * TextView For Score Team B
     */
    public void teamBScore(int i){
        TextView textView = findViewById(R.id.score_team_b);
        textView.setText(String.valueOf(i));
    }
    /**
     * TextView For Fouls Team A
     */
    public void teamAFouls(int i){
        TextView textView = findViewById(R.id.fouls_team_a);
        textView.setText(String.valueOf(i));
    }

    /**
     * TextView For Fouls Team B
     */

    public void teamFoulsB(int i){
        TextView textView = findViewById(R.id.fouls_team_b);
        textView.setText(String.valueOf(i));
    }

    /**
     * Method For Score Team A
     */

    public void scoreTeamA(View view){
        scoreA++;
        teamAScore(scoreA);
    }

    /**
     * Method For Score Team B
     */

    public void scoreTeamB(View view){
        scoreB++;
        teamBScore(scoreB);
    }

    /**
     * Method For Fouls Team A
     */

    public void foulsTeamA(View view){
        foulsA++;
        teamAFouls(foulsA);
    }

    /**
     * Method For Fouls B
     */

    public void foulsTeamB(View view){
        foulsB++;
        teamFoulsB(foulsB);
    }

    /**
     * Method For Reset All
     */

    public void resetButtonAll(View view){
        scoreA = 0;
        scoreB = 0;
        foulsA = 0;
        foulsB = 0;
        teamAScore(scoreA);
        teamBScore(scoreB);
        teamAFouls(foulsA);
        teamFoulsB(foulsB);
    }
}
