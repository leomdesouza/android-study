package com.buzz.viewspart2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int clickCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = (TextView) findViewById(R.id.activity_main_textView);
        View button = findViewById(R.id.activity_main_button);
/* Terceira solução de implementação
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                clickCount++;
                textView.setText("Clicked " + clickCount + " time" + (clickCount != 1 ? "s" : ""));
            }
        });
*/
        View.OnClickListener listener = new View.OnClickListener(){
            @Override
            public void onClick(View view){
                clickCount++;
                textView.setText("Clicked " + clickCount + " time" + (clickCount != 1 ? "s" : ""));
            }
        };
        button.setOnClickListener(listener);
    }
/* Primeira solução de implementação
    public void onClick(View view){
        if (view.getId() == R.id.activity_main_button){
            clickCount++;
            textView.setText("Clicked " + clickCount + " time" + (clickCount != 1 ? "s" : ""));
        }
    }
*/
/* Segunda solução de implementação
    private class ButtonClickHandler implements View.OnClickListener {
        public void onClick(View view){
            clickCount++;
            textView.setText("Clicked " + clickCount + " time" + (clickCount != 1 ? "s" : ""));
        }
    }
*/
}


