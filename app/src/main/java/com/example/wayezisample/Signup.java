package com.example.wayezisample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class Signup extends AppCompatActivity {

    //Declaring variables
    Animation leftAnimation;
    LinearLayout linearLayout;
    ImageView backBtn;
    Button nextBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //Animations
        leftAnimation = AnimationUtils.loadAnimation(this, R.anim.left_animation);

        //Hooks
        linearLayout = findViewById(R.id.signup_animation);

        //Setting Animations
        linearLayout.setAnimation(leftAnimation);

        backBtn = findViewById(R.id.signup_back_btn);
        nextBtn = findViewById(R.id.nextForm);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Login.class);
                startActivity(intent);
                finish();
            }
        });

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SchoolForm.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
