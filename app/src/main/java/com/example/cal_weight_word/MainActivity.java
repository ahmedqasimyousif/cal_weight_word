package com.example.cal_weight_word;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText height,weight;
    private TextView result;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        height = (EditText) findViewById(R.id.height);
        weight = (EditText) findViewById(R.id.weight);
        result = (TextView) findViewById(R.id.result);
        button=(Button)findViewById(R.id.btncal);
    }
    public void calcul(View v) {
        String heightStr = height.getText().toString();
        String weightStr = weight.getText().toString();

        //if (heightStr != null && !"".equals(heightStr)
         //       && weightStr != null  &&  !"".equals(weightStr)) {
            float heightValue = Float.parseFloat(heightStr);
            float weightValue = Float.parseFloat(weightStr);

        float bmi = (weightValue / (heightValue * heightValue))*100;


        // result.setText((int) bmi);
        result.setText( String.valueOf(bmi));



        }
        public  void inn(View v){

            Intent intent=new Intent(MainActivity.this,otherw.class);
            startActivity(intent);
        }
    }
//}
