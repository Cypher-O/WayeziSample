package com.example.wayezisample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.appcompat.app.AppCompatActivity;

public class VerifyEmail extends AppCompatActivity {

    Animation leftAnimation;
    ImageView backBtn;
    ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_email);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        backBtn = findViewById(R.id.backBtnPrevForm);

        //Animations
        leftAnimation = AnimationUtils.loadAnimation(this, R.anim.left_animation);

        //Hooks
        scrollView = findViewById(R.id.loadVerifyEmail);

        //Setting Animations
        scrollView.setAnimation(leftAnimation);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ForgotPassword.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
