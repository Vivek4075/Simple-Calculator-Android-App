package com.example.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick1(View v)
    {
        EditText e1 = (EditText)findViewById(R.id.editText6);
        EditText e2 = (EditText)findViewById(R.id.editText7);
        TextView t1 = (TextView)findViewById(R.id.textView3);
        int num1 = Integer.parseInt(e1.getText().toString());
        int num2 = Integer.parseInt(e2.getText().toString());
        int sum = num1 + num2 ;
       /* int min = num1 - num2;
        int mux = num1 * num2;
        int div = num1 / num2;

*/
        t1.setText(Integer.toString(sum));
  /*      t1.setText(Integer.toString(min));
        t1.setText(Integer.toString(mux));
        t1.setText(Integer.toString(div));*/
    }
    public void onButtonClick2(View v)
    {
        EditText e1 = (EditText)findViewById(R.id.editText6);
        EditText e2 = (EditText)findViewById(R.id.editText7);
        TextView t1 = (TextView)findViewById(R.id.textView3);
        int num1 = Integer.parseInt(e1.getText().toString());
        int num2 = Integer.parseInt(e2.getText().toString());
        //int sum = num1 + num2 ;
        int min = num1 - num2;
        //int mux = num1 * num2;
        //int div = num1 / num2;


        //t1.setText(Integer.toString(sum));
        t1.setText(Integer.toString(min));
        //t1.setText(Integer.toString(mux));
        //t1.setText(Integer.toString(div));
    }
    public void onButtonClick3(View v)
    {
        EditText e1 = (EditText)findViewById(R.id.editText6);
        EditText e2 = (EditText)findViewById(R.id.editText7);
        TextView t1 = (TextView)findViewById(R.id.textView3);
        int num1 = Integer.parseInt(e1.getText().toString());
        int num2 = Integer.parseInt(e2.getText().toString());
        //int sum = num1 + num2 ;
        //int min = num1 - num2;
        int mux = num1 * num2;
        //int div = num1 / num2;


        //t1.setText(Integer.toString(sum));
        //t1.setText(Integer.toString(min));
        t1.setText(Integer.toString(mux));
        //t1.setText(Integer.toString(div));
    }
    public void onButtonClick4(View v)
    {
        EditText e1 = (EditText)findViewById(R.id.editText6);
        EditText e2 = (EditText)findViewById(R.id.editText7);
        TextView t1 = (TextView)findViewById(R.id.textView3);
        int num1 = Integer.parseInt(e1.getText().toString());
        int num2 = Integer.parseInt(e2.getText().toString());
        /*int sum = num1 + num2 ;
        int min = num1 - num2;
        int mux = num1 * num2;*/
        int div = num1 / num2;


        /*t1.setText(Integer.toString(sum));
        t1.setText(Integer.toString(min));
        t1.setText(Integer.toString(mux));*/
        t1.setText(Integer.toString(div));
    }
}
