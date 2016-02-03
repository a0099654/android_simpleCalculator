package sample.jan27;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick_Button1(View view){
        Intent myIntent;
        myIntent = new Intent(this, Activity1.class);
        startActivity(myIntent);
    }
}
