package com.example.wayezisample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    //Declaring variables
    Animation leftAnimation;
    LinearLayout linearLayout;
    TextView loadSignUpLayout, loadForgotPassword;
    Button signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);

        loadSignUpLayout = findViewById(R.id.loadSignUp);
        signin = findViewById(R.id.signin_btn);
        loadForgotPassword = findViewById(R.id.forgot_password);

        //Animations
        leftAnimation = AnimationUtils.loadAnimation(this, R.anim.left_animation);

        //Hooks
        linearLayout = findViewById(R.id.layout_animation);

        //Setting Animations
        linearLayout.setAnimation(leftAnimation);

        loadForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ForgotPassword.class);
                startActivity(intent);
            }
        });

        loadSignUpLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, Signup.class);
                startActivity(intent);
            }
        });

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Dashboard.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
