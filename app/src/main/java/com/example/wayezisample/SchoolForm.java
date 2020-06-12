package com.example.wayezisample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class SchoolForm extends AppCompatActivity {

    Animation leftAnimation, righAnimation;
    ImageView prevBtn;
    TextView btnLogin;
    AutoCompleteTextView autoCompleteTextView;
    ScrollView scrollView;

//    private static final String[] SCHOOLS = new String[]{
//      "The Shri Ram", "The Sanskaar Valley", "Maharaja Sawai Bhawani Singh", "Little Angels High",
//      "Hyderabad Public School", "GEAR Innovative", "Cygnus World", "Yadavindra Public School",
//            "Rajkumar College", "The Future Foundation"
//    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_form);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        prevBtn = findViewById(R.id.backBtnPrevForm);
        btnLogin = findViewById(R.id.backToLogin);
        autoCompleteTextView = findViewById(R.id.select_sch);

        String[] schools = getResources().getStringArray(R.array.schools);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, schools);
        autoCompleteTextView.setAdapter(arrayAdapter);

        //Animations
        leftAnimation = AnimationUtils.loadAnimation(this, R.anim.left_animation);
        righAnimation = AnimationUtils.loadAnimation(this, R.anim.right_animation);

        //Hooks
        scrollView = findViewById(R.id.scroll_view);

        //Setting Animations
        scrollView.setAnimation(leftAnimation);


        prevBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Signup.class);
                startActivity(intent);
                scrollView.setAnimation(righAnimation);
                finish();
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Login.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
