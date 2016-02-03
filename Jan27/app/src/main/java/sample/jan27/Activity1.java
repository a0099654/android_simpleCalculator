package sample.jan27;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
    }

    public void gotoActivity2(View view){
        Intent myIntent;
        myIntent = new Intent(this, Activity2.class);

        //Making a toast
        myIntent.putExtra("team", "Liverpool");
        myIntent.putExtra("number_of_players", 11);

        startActivity(myIntent);
    }

    public void backHome(View view){
        finish();
    }
}
