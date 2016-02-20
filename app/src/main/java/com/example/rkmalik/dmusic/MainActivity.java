package com.example.rkmalik.dmusic;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button)findViewById(R.id.dynamicOnClick1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), R.string.ToasterMessageGreet, Toast.LENGTH_SHORT).show();
            }
        });

        button2 = (Button) findViewById(R.id.dynamicOnClick2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), R.string.ToasterMesageReady, Toast.LENGTH_SHORT).show();
            }
        });



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

        /*
    * This method is not used as the same functionality is provided by the onClick method on button1.
    *
    * */

    public void onClickButton1Toaster (View v) {
        Toast.makeText(this, R.string.ToasterMessageGreet, Toast.LENGTH_SHORT).show();
    }

    /*
    * This method is not used as the same functionality is provided by the onClick method on button2.
    *
    * */

    public void onClickButton2Toaster (View v) {
        Toast.makeText(this, R.string.ToasterMesageReady, Toast.LENGTH_SHORT).show();
    }

    public void onClickButton3Toaster (View v) {
        Toast.makeText(this, R.string.ToasterMesageProcessed, Toast.LENGTH_SHORT).show();
    }


    public void onClickButton4Toaster (View v) {
        Toast.makeText(this, R.string.ToasterMesageCompleted, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("DMUSIC-onStart", "Activity Started");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("DMUSIC-onPause", "Activity Paused");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("DMUSIC-onResume", "Activity Resumed");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("DMUSIC-onRestart", "Activity Restarted");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d("DMUSIC-onStop", "Activity Stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("DMUSIC-onDestroy", "Activity Destroyed");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
