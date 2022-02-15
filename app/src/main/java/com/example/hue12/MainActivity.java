package com.example.hue12;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button1(View view) {
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(tv.getText() +"1");
    }

    public void button2(View view) {
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(tv.getText() +"2");
    }

    public void button3(View view) {
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(tv.getText() +"3");
    }

    public void buttonPlus(View view) {
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(tv.getText() +"+");
    }

    public void button4(View view) {
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(tv.getText() +"4");
    }

    public void button5(View view) {
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(tv.getText() +"5");
    }

    public void button6(View view) {
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(tv.getText() +"6");
    }

    public void buttonMinus(View view) {
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(tv.getText() +"-");
    }

    public void button7(View view) {
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(tv.getText() +"7");
    }

    public void button8(View view) {
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(tv.getText() +"8");
    }

    public void button9(View view) {
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(tv.getText() +"9");
    }

    public void buttonMultiply(View view) {
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(tv.getText() +"*");
    }

    public void buttonOpenBracket(View view) {
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(tv.getText() +"(");
    }

    public void button0(View view) {
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(tv.getText() +"0");
    }

    public void buttonCloseBracket(View view) {
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(tv.getText() +")");
    }

    public void buttonDivide(View view) {
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(tv.getText() +"/");
    }

    public void buttonDecimal(View view) {
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(tv.getText() +".");
    }

    public void buttonClear(View view) {
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText("");
    }

    public void buttonEquals(View view) {

    }
}