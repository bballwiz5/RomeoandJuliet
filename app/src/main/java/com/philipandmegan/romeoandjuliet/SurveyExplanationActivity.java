package com.philipandmegan.romeoandjuliet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SurveyExplanationActivity extends AppCompatActivity {

    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.user = (User) getIntent().getSerializableExtra("User");
        setContentView(R.layout.activity_survey_explanation);
    }

    public void continueHeightAsk(View view) {
        Intent toHeightAsk = new Intent(this, HeightAskActivity.class);
        toHeightAsk.putExtra("User", user);
        startActivity(toHeightAsk);
    }

}
