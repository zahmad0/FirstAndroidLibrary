package com.zuhair.firsttestlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivityPBGragle extends AppCompatActivity {

    EditText username,password;
    Button login;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_pbgragle);

        username    = (EditText)findViewById(R.id.user_name);
        password    = (EditText)findViewById(R.id.password);

        login       = (Button)findViewById(R.id.login);

        initializeListener();


    }

    private void initializeListener() {

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(LoginActivityPBGragle.this,"Username = "+username.getText().toString()+" \nPassword = "+password.getText().toString(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
