package com.philipandmegan.romeoandjuliet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HeightAskActivity extends AppCompatActivity {
    
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.user = (User) getIntent().getSerializableExtra("User");
        setContentView(R.layout.activity_height_ask);
    }

    public void continueEducation(View view) {
        //TODO:collect height information
        Intent toEducationAsk = new Intent(this, EducationAskActivity.class);
        toEducationAsk.putExtra("User", user);
        startActivity(toEducationAsk);
    }
}
