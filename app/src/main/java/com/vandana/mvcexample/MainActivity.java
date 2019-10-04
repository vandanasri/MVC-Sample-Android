package com.vandana.mvcexample;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements LoginResultInterface {
    private EditText editUserName;
    private EditText editPassword;
    private Button   btnLogin;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginResult();
            }
        });


    }



    private void loginResult(){
        progressBar.setVisibility(View.VISIBLE);
        String userName = editUserName.getText().toString();
        String password = editPassword.getText().toString();
        LoginApi login = new LoginApi(userName,password, this);
        login.doLogin();
    }



    @Override
    public void onLoginResult(Boolean result, int code) {
            progressBar.setVisibility(View.INVISIBLE);
        if(result) {
            Toast.makeText(this,"Login Successful",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this,"Login Fail",Toast.LENGTH_SHORT).show();
        }
    }


    private void initUI(){
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        editUserName = (EditText) findViewById(R.id.et_name);
        editPassword = (EditText) findViewById(R.id.et_password);
        btnLogin = (Button) findViewById(R.id.bt_submit);
        progressBar = (ProgressBar) findViewById(R.id.progress_login);
        progressBar.setVisibility(View.INVISIBLE);
    }
}
