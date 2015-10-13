package com.example.www.hardwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    int Counter = 0;
    Button addButton;
    Button subButton;
    TextView ashusText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addButton = (Button) findViewById(R.id.addButton);
        subButton = (Button) findViewById(R.id.subButton);
        ashusText = (TextView) findViewById(R.id.ashusText);

        addButton.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Counter = Counter + 1;
                ashusText.setText("Your Total is  " + Counter);

            }
        });


        subButton.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Counter = Counter - 1;
                ashusText.setText("Your Total is  " + Counter);

            }
        });


    }

   /* public void addButtonClicked(View view) {

        Counter = Counter + 1;
        ashusText.setText("" + Counter);
    }

    public void subButtonClicked(View view) {

        Counter = Counter - 1;
        ashusText.setText("" + Counter);

    }  */




}
