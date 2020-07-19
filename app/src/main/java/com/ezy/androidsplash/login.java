package com.ezy.androidsplash;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;

class Login extends AppCompatActivity {
    Button callSignUp, GO;
    ImageView image;
    TextView logoText, sloganText;
    TextInputLayout username, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //This Line will hide the status bar from the screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);
        //Hooks
        callSignUp = findViewById(R.id.login_signup_tran);
        image = findViewById(R.id.logo_image);
        logoText = findViewById(R.id.logo_name);
        sloganText = findViewById(R.id.slogan_name);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        GO = findViewById(R.id.login_btn);
        callSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Pair[] pairs = new Pair[7];
                pairs[0] = new Pair<View, String>(image, "logo_image");
                pairs[1] = new Pair<View, String>(logoText, "logo_name");
                pairs[2] = new Pair<View, String>(sloganText, "slogan_name");
                pairs[3] = new Pair<View, String>(username, "username");
                pairs[4] = new Pair<View, String>(password, "password");
                pairs[5] = new Pair<View, String>(GO, "login_btn");
                pairs[6] = new Pair<View, String>(callSignUp, "login_signup_tran");
            }
        });
    }
}