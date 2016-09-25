package com.philipandmegan.romeoandjuliet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class GenderAskActivity extends AppCompatActivity {

    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.user = (User) getIntent().getSerializableExtra("User");
        setContentView(R.layout.activity_gender_ask);
    }

    public void continueRegistration(View view) {
        Intent toRegistrationActivity = new Intent(this, RegistrationAskActivity.class);
        toRegistrationActivity.putExtra("User", user);
        startActivity(toRegistrationActivity);
    }

    public void iAmACheckbox(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.iAmAMan:
                if (checked) {
                    user.setIAmA(User.Gender.MAN);
                }
                break;
            case R.id.iAmAWoman:
                if (checked) {
                    user.setIAmA(User.Gender.WOMAN);
                }
                break;
        }
    }

    public void seekingACheckbox(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.seekingAMan:
                if (checked) {
                    user.setISeekA(User.Gender.MAN);
                }
                break;
            case R.id.seekingAWoman:
                if (checked) {
                    user.setISeekA(User.Gender.WOMAN);
                }
                break;
        }
    }
}
