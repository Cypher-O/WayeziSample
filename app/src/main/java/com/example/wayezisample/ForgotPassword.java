package com.example.wayezisample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.appcompat.app.AppCompatActivity;

public class ForgotPassword extends AppCompatActivity {

    Animation leftAnimation;
    Button resetPword;
    ImageView backBtn;
    ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        resetPword = findViewById(R.id.reset_pass);
        backBtn = findViewById(R.id.backBtnPrevForm);

        //Animations
        leftAnimation = AnimationUtils.loadAnimation(this, R.anim.left_animation);

        //Hooks
        scrollView = findViewById(R.id.loadForgotPass);

        //Setting Animations
        scrollView.setAnimation(leftAnimation);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Login.class);
                startActivity(intent);
                finish();
            }
        });

        resetPword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), VerifyEmail.class);
                startActivity(intent);
            }
        });

    }
}
