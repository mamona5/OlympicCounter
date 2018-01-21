package com.example.android.olympic2018medalcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int canadaGoldCount = 0;
    int canadaSilverCount = 0;
    int canadaBronzeCount = 0;
    String canadaTotalText ;
    int usaGoldCount = 0;
    int usaSilverCount = 0;
    int usaBronzeCount = 0;
    String usaTotalText ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayGoldForCanada(canadaGoldCount);
        displaySilverForCanada(canadaSilverCount);
        displayBronzeForCanada(canadaBronzeCount);
        canadaTotalText = "Canada Total: " + (canadaGoldCount + canadaSilverCount + canadaBronzeCount) ;
        displayCanadaMessage(canadaTotalText) ;

        displayGoldForUsa(usaGoldCount);
        displaySilverForUsa(usaSilverCount);
        displayBronzeForUsa(usaBronzeCount);
        usaTotalText = "USA Total: " + (usaGoldCount + usaSilverCount + usaBronzeCount) ;
        displayUsaMessage(usaTotalText) ;
    }
    /**
     * Displays the Gold Medal Count for Canada.
     */
    public void displayGoldForCanada(int score) {
        TextView scoreView = (TextView) findViewById(R.id.canada_gold_total);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the Silver Medal Count for Canada.
     */
    public void displaySilverForCanada(int score) {
        TextView scoreView = (TextView) findViewById(R.id.canada_silver_total);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the Bronze Medal Count for Canada.
     */
    public void displayBronzeForCanada(int score) {
        TextView scoreView = (TextView) findViewById(R.id.canada_bronze_total);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method displays the intro text to the total canada medal count.
     */
    private void displayCanadaMessage(String message) {
        TextView medalTextView = (TextView) findViewById(R.id.total_canada_medal_text ) ;
        medalTextView.setText(message);
    }

        /**
         * This method is called when plus sign for Gold for canada is clicked.
         */
    public void canadaScoredGold(View view) {
        canadaGoldCount= canadaGoldCount+ 1 ;
        displayGoldForCanada (canadaGoldCount) ;
        canadaTotalText = "Canada Total: " + (canadaGoldCount + canadaSilverCount + canadaBronzeCount) ;
        displayCanadaMessage(canadaTotalText) ;
    }
    /**
     * This method is called when minus sign for gold for canada is clicked.
     */
    public void canadaLostGold(View view) {
        canadaGoldCount= canadaGoldCount- 1 ;
        if (canadaGoldCount<1){canadaGoldCount = 0;} ;
        displayGoldForCanada (canadaGoldCount) ;
        canadaTotalText = "Canada Total: " + (canadaGoldCount + canadaSilverCount + canadaBronzeCount) ;
        displayCanadaMessage(canadaTotalText) ;
    }

    /**
     * This method is called when plus sign for Silver for canada is clicked.
     */
    public void canadaScoredSilver(View view) {
        canadaSilverCount= canadaSilverCount+ 1 ;
        displaySilverForCanada (canadaSilverCount) ;
        canadaTotalText = "Canada Total: " + (canadaGoldCount + canadaSilverCount + canadaBronzeCount) ;
        displayCanadaMessage(canadaTotalText) ;
    }
    /**
     * This method is called when minus sign for Silver for canada is clicked.
     */
    public void canadaLostSilver(View view) {
        canadaSilverCount= canadaSilverCount- 1 ;
        if (canadaSilverCount<1){canadaSilverCount = 0;} ;
        displaySilverForCanada (canadaSilverCount) ;
        canadaTotalText = "Canada Total: " + (canadaGoldCount + canadaSilverCount + canadaBronzeCount) ;
        displayCanadaMessage(canadaTotalText) ;
    }
    /**
     * This method is called when plus sign for Bronze for canada is clicked.
     */
    public void canadaScoredBronze(View view) {
        canadaBronzeCount= canadaBronzeCount+ 1 ;
        displayBronzeForCanada (canadaBronzeCount) ;
        canadaTotalText = "Canada Total: " + (canadaGoldCount + canadaSilverCount + canadaBronzeCount) ;
        displayCanadaMessage(canadaTotalText) ;
    }
    /**
     * This method is called when minus sign for Bronze for canada is clicked.
     */
    public void canadaLostBronze(View view) {
        canadaBronzeCount= canadaBronzeCount- 1 ;
        if (canadaBronzeCount<1){canadaBronzeCount = 0;} ;
        displayBronzeForCanada (canadaBronzeCount) ;
        canadaTotalText = "Canada Total: " + (canadaGoldCount + canadaSilverCount + canadaBronzeCount) ;
        displayCanadaMessage(canadaTotalText) ;
    }


    /**
     * Displays the Gold Medal Count for USA.
     */
    public void displayGoldForUsa(int score) {
        TextView scoreView = (TextView) findViewById(R.id.usa_gold_total);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the Silver Medal Count for USA.
     */
    public void displaySilverForUsa(int score) {
        TextView scoreView = (TextView) findViewById(R.id.usa_silver_total);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the Bronze Medal Count for USA.
     */
    public void displayBronzeForUsa(int score) {
        TextView scoreView = (TextView) findViewById(R.id.usa_bronze_total);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method displays the intro text to the total canada medal count.
     */
    private void displayUsaMessage(String message) {
        TextView medalTextView = (TextView) findViewById(R.id.total_usa_medal_text ) ;
        medalTextView.setText(message);
    }

    /**
     * This method is called when plus sign for Gold for USA is clicked.
     */
    public void usaScoredGold(View view) {
        usaGoldCount= usaGoldCount+ 1 ;
        displayGoldForUsa (usaGoldCount) ;
        usaTotalText = "USA Total: " + (usaGoldCount + usaSilverCount + usaBronzeCount) ;
        displayUsaMessage(usaTotalText) ;
    }
    /**
     * This method is called when minus sign for gold for canada is clicked.
     */
    public void usaLostGold(View view) {
        usaGoldCount= usaGoldCount- 1 ;
        if (usaGoldCount<1){usaGoldCount = 0;} ;
        displayGoldForUsa (usaGoldCount) ;
        usaTotalText = "USA Total: " + (usaGoldCount + usaSilverCount + usaBronzeCount) ;
        displayUsaMessage(usaTotalText) ;
    }

    /**
     * This method is called when plus sign for Silver for usa is clicked.
     */
    public void usaScoredSilver(View view) {
        usaSilverCount= usaSilverCount+ 1 ;
        displaySilverForUsa (usaSilverCount) ;
        usaTotalText = "USA Total: " + (usaGoldCount + usaSilverCount + usaBronzeCount) ;
        displayUsaMessage(usaTotalText) ;
    }
    /**
     * This method is called when minus sign for Silver for canada is clicked.
     */
    public void usaLostSilver(View view) {
        usaSilverCount= usaSilverCount- 1 ;
        if (usaSilverCount<1){usaSilverCount = 0;} ;
        displaySilverForUsa (usaSilverCount) ;
        usaTotalText = "USA Total: " + (usaGoldCount + usaSilverCount + usaBronzeCount) ;
        displayUsaMessage(usaTotalText) ;
    }
    /**
     * This method is called when plus sign for Bronze for canada is clicked.
     */
    public void usaScoredBronze(View view) {
        usaBronzeCount= usaBronzeCount+ 1 ;
        displayBronzeForUsa (usaBronzeCount) ;
        usaTotalText = "USA Total: " + (usaGoldCount + usaSilverCount + usaBronzeCount) ;
        displayUsaMessage(usaTotalText) ;
    }
    /**
     * This method is called when minus sign for Bronze for canada is clicked.
     */
    public void usaLostBronze(View view) {
        usaBronzeCount= usaBronzeCount- 1 ;
        if (usaBronzeCount<1){usaBronzeCount = 0;} ;
        displayBronzeForUsa (usaBronzeCount) ;
        usaTotalText = "USA Total: " + (usaGoldCount + usaSilverCount + usaBronzeCount) ;
        displayUsaMessage(usaTotalText) ;
    }
    }

