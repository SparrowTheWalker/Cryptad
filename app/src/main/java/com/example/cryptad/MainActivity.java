package com.example.cryptad;

import androidx.appcompat.app.AppCompatActivity;

//import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {

    TextView textView;
    EditText message;
    EditText recipientEmail;
    EditText recipientPhoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        message = findViewById(R.id.InputMessage);
        recipientEmail = findViewById(R.id.InputEmail);
        recipientPhoneNumber = findViewById(R.id.InputPhoneNumber);

        textView = findViewById(R.id.decrypt_text);
//        textView.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, decrypt.class);
//                startActivity(intent);
//            }
//        });
    }
}
