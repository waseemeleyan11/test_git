package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private TextView textView;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Ensure the XML file name matches

        editText = findViewById(R.id.text_e);
        textView = findViewById(R.id.textview_t);
        password = findViewById(R.id.password);
    }

    public void onclick(View view) {
        String name = editText.getText().toString();
        String passwordText = password.getText().toString(); // Retrieve password value

        textView.setText(name+""+passwordText); // Update TextView
        Toast.makeText(this, name + " " + passwordText, Toast.LENGTH_LONG).show(); // Display Toast
    }
}
