package com.example.app1;

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
    public void onRegisterBtnClick(View view) {

        TextView textView1 = findViewById(R.id.textView1);
        TextView textView2 = findViewById(R.id.textView2);
        TextView textView3 = findViewById(R.id.textView3);

        EditText editTextFirst = findViewById(R.id.editTextFirst);
        EditText editTextLast = findViewById(R.id.editTextLast);
        EditText editTextEmail = findViewById(R.id.editTextEmail);

        textView1.setText("First Name: " + editTextFirst.getText().toString());
        textView2.setText("Last Name: " + editTextLast.getText().toString());
        textView3.setText("Email: " + editTextEmail.getText().toString());
    }
}