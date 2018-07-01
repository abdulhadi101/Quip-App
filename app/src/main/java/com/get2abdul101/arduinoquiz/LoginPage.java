package com.get2abdul101.arduinoquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {


    EditText editName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
    }

    public void beginQuiz(View view) {
        editName = (EditText) findViewById(R.id.editName);
        if (editName.getText().toString().equals("")) {
            Toast.makeText(this, "please enter your name", Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("username", editName.getText().toString());
            startActivity(intent);

        }


    }


}
