package com.tanmay.practiceone;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnClick(View view){
        TextView textStyle = (TextView) findViewById(R.id.textView);
        EditText edtTxtName = (EditText) findViewById(R.id.editTextTextPersonName);
        textStyle.setText("Hello " + edtTxtName.getText().toString());
    }
}