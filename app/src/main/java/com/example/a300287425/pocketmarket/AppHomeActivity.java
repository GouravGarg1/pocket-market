package com.example.a300287425.pocketmarket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AppHomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_home);

        Button signUpbtn = (Button)findViewById(R.id.btnSignUp);
        Button signInbtn = (Button)findViewById(R.id.btnLogIn);

        signUpbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AppHomeActivity.this,signUpActivity.class));
            }
        });
        signInbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AppHomeActivity.this,signInActivity.class));
            }
        });
    }
}
