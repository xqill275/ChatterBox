package com.example.chatterbox;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button joinButton;
    EditText userNameBox;
    EditText IDbox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        joinButton = findViewById(R.id.JoinButton);
    }

    public void attemptJoin(View view){
        userNameBox = findViewById(R.id.UserNameEnterID);
        IDbox = findViewById(R.id.IDEnterID);

        if (userNameBox.getText().toString().isEmpty() || IDbox.getText().toString().isEmpty()) {
            Toast.makeText(this, "ONE OR BOTH BOXES ARE EMPTY, PLEASE FILL IN BOTH BOXES", Toast.LENGTH_LONG).show();

        }
    }
}