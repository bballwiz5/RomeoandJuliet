package com.philipandmegan.romeoandjuliet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RegistrationAskActivity extends AppCompatActivity {

    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.user = (User) getIntent().getSerializableExtra("User");
        setContentView(R.layout.activity_registration_ask);
    }

    public void continueExplanationSurvey(View view) {
        EditText zipCode = (EditText) findViewById(R.id.zipCode);
        user.setZipCode(zipCode.getText().toString());
        EditText birthday = (EditText) findViewById(R.id.birthday);
        user.setBirthday(birthday.getText().toString());
        EditText email = (EditText) findViewById(R.id.email);
        user.setEmail(email.getText().toString());
        EditText pw = (EditText) findViewById(R.id.password);
        user.setPassword(pw.getText().toString());

        Intent toExplanationSurvey = new Intent(this, SurveyExplanationActivity.class);
        toExplanationSurvey.putExtra("User", user);
        startActivity(toExplanationSurvey);
    }
}
