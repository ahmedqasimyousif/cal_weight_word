package com.example.cal_weight_word;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class otherw extends AppCompatActivity {
    private EditText height,weight;
    private TextView result,textView5;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otherw);
        weight = (EditText) findViewById(R.id.weight);
        result = (TextView) findViewById(R.id.result);
        textView5=(TextView)findViewById(R.id.textView5);
    }

       public void  weighw(View v) {
           String weightStr = weight.getText().toString();
           float weightValue = Float.parseFloat(weightStr);

           float mercury = (weightValue * 3.7f) / 9.81f;

           result.setText( String.valueOf(mercury));


          float neptune=(weightValue*11.15f)/9.81f;
            textView5.setText(String.valueOf(neptune));
    }
    public void inn2(View v){

        Intent intent=new Intent(otherw.this,MainActivity.class);
        startActivity(intent);

    }
}
