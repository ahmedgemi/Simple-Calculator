package com.example.ahmed.session11;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView t1;

    EditText e1;
    EditText e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        t1 = (TextView) findViewById(R.id.textView);
        e1 = (EditText) findViewById(R.id.editText);
        e2 = (EditText) findViewById(R.id.editText3);


    }


    public void sum (View v){

        try{

        String x = e1.getText().toString();
        String y = e2.getText().toString();

        int num1 = Integer.parseInt(x);
        int num2 = Integer.parseInt(y);

        int sum = num1 +num2;

        }
        catch (Exception e){

            Log.d("test",e.toString());
        }



        //t1.setText( String.valueOf(sum) );
    }
}
