package com.vandana.mvcexample;

import android.os.Handler;

public class LoginApi {

    Handler handler;
    UserModel userModel;
    private String name;
    private String password;
    LoginResultInterface mLoginResultInterface;

    LoginApi(String userName, String password, LoginResultInterface loginResultInterface){
        userModel = new UserModel(userName, password);

        handler= new Handler();
        this.name = userName;
        this.password = password;
        this.mLoginResultInterface = loginResultInterface;
    }


    public void doLogin() {
        Boolean isLoginSuccess = true;
        final int code = userModel.checkUserValidity(name,password);
        System.out.println("@Code "+code);
        if (code!=0)
            isLoginSuccess = false;

        final Boolean result = isLoginSuccess;

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mLoginResultInterface.onLoginResult(result, code);
            }
        }, 5000);

    }



}
