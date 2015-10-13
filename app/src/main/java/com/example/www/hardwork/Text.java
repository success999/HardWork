package com.example.www.hardwork;


import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.text.InputType;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;
import android.widget.RelativeLayout;
import android.widget.LinearLayout;

import java.util.Random;

public class Text extends Activity implements View.OnClickListener {
    EditText InputText;
    Button clickmeButton;
    ToggleButton toggleButton;
    TextView ashusText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text);

    /////Easy way to create Method and Maintained ./////ONLY THESE THREE METHOD AFTER CLEANING./////
        baconandeggs();

        toggleButton.setOnClickListener(this);

        clickmeButton.setOnClickListener(this) ;

    }

    private void baconandeggs() {

        InputText = (EditText) findViewById(R.id.InputText);
        clickmeButton = (Button) findViewById(R.id.clickmeButton);
        toggleButton = (ToggleButton) findViewById(R.id.toggleButton);
        ashusText = (TextView) findViewById(R.id.ashusText);
    }

    @Override
    public void onClick(View view) {
     switch (view.getId())  {

         case R.id.clickmeButton:
             String check = InputText.getText().toString();
             if(check.contentEquals("left")){
                 ashusText.setGravity(Gravity.LEFT);
                 ashusText.setText("left");

             }else if (check.contentEquals("center")){
                 ashusText.setGravity(Gravity.CENTER);
                 ashusText.setText("center");



             } else if (check.contentEquals("right")){
                 ashusText.setGravity(Gravity.RIGHT);
                 ashusText.setText("right");


             } else if (check.contentEquals("blue")){
                 ashusText.setBackgroundColor(Color.BLUE);
             } else if (check.contains("ASHU")){
                 Random crazy = new Random();
                 ashusText.setText("ASHU!!!!");
                 ashusText.setTextSize(crazy.nextInt(75)); ////75 Random chocies for Text.////
                 ashusText.setTextColor(Color.rgb(crazy.nextInt(265), crazy.nextInt(265), crazy.nextInt(265)));

                 switch (crazy.nextInt(3))      /////There 3 cases only////
                 {
                     case 0:
                         ashusText.setGravity(Gravity.LEFT);
                         break;
                     case 1:
                         ashusText.setGravity(Gravity.CENTER);

                         break;
                     case 2:
                         ashusText.setGravity(Gravity.RIGHT);

                         break;
                 }

             }  else {
                 ashusText.setText("Invalid");
                 ashusText.setGravity(Gravity.CENTER);
                 ashusText.setTextColor(Color.RED);
             }
             break;

         case R.id.toggleButton:
             if(toggleButton.isChecked()){
                 InputText.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD );


             }else {
                 InputText.setInputType(InputType.TYPE_CLASS_TEXT);
             }

             break;
     }

    }
}
