package com.example.mrbadend.test5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login extends AppCompatActivity {
    EditText pas,usr;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usr = (EditText) findViewById(R.id.username);
        pas =(EditText) findViewById(R.id.password);
        Button bt =  findViewById(R.id.Login);

    }

    public void loginbtn(View view) {
    String user =  usr.getText().toString();
    String pass = pas.getText().toString();
    backgournd bg = new backgournd(this);
    bg.execute(user,pass);

    }

}
