package com.philipandmegan.romeoandjuliet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    /** Called when the user touches the button */
    public void signUp(View view) {
        setContentView(R.layout.sign_up_screen);
    }

    public void signIn(View view) {
        setContentView(R.layout.sign_in_screen);
    }

}
