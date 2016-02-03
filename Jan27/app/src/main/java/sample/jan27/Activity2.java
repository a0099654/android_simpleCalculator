package sample.jan27;


import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class Activity2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        //To receive the value and display on toast
        String team = getIntent().getStringExtra("team");
        int numberOfPlayers = getIntent().getIntExtra("number_of_players", 0);

        Toast.makeText(this, ("Received team name =" + team + "Received number of players =" + numberOfPlayers), Toast.LENGTH_LONG).show();
    }
}
