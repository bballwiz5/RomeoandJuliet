package com.philipandmegan.romeoandjuliet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Profile extends AppCompatActivity {

    User user = new User();

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

    public void continueSignUp(View view) {
        setContentView(R.layout.sign_up_register_page);
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

    public void continueSignUpThroughRegistration(View view) {
        EditText zipCode = (EditText) findViewById(R.id.zipCode);
        user.setZipCode(zipCode.getText().toString());
        EditText birthday = (EditText) findViewById(R.id.birthday);
        user.setBirthday(birthday.getText().toString());
        EditText email = (EditText) findViewById(R.id.email);
        user.setEmail(email.getText().toString());
        EditText pw = (EditText) findViewById(R.id.password);
        user.setPassword(pw.getText().toString());
        setContentView(R.layout.survey_intro);
    }

    public void continueSurveyIntro(View view) {
        setContentView(R.layout.height_ask);
        String displayString = user.getSeekingGender() == User.Gender.MAN ? "I want my Romeo to be" : "I want my Juliet to be";
        TextView g = (TextView) findViewById(R.id.genderedString);
        g.setText(displayString);
    }


}
