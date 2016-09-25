package com.philipandmegan.romeoandjuliet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class EducationAskActivity extends AppCompatActivity {

    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.user = (User) getIntent().getSerializableExtra("User");
        String displayString = user.getSeekingGender() == User.Gender.MAN ? "I want my Romeo to be" : "I want my Juliet to be";
        setContentView(R.layout.activity_education_ask);
        TextView g = (TextView) findViewById(R.id.iWantEdu);
        g.setText(displayString);
    }

    public void continueRace(View view) {

    }

    public void myEducationCheckbox(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.myHS:
                if (checked) {
                    user.setMyEdu(User.Education.HS);
                }
                break;
            case R.id.myBA:
                if (checked) {
                    user.setMyEdu(User.Education.BA);
                }
                break;
            case R.id.myMA:
                if (checked) {
                    user.setMyEdu(User.Education.MA);
                }
                break;
            case R.id.myPHD:
                if (checked) {
                    user.setMyEdu(User.Education.PHD);
                }
                //Maybe this one will be the case when nothing is checked?
                user.setMyEdu(User.Education.LESSTHANHS);
                break;
        }

    }

    public void theirEducationCheckbox(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.theirHS:
                if (checked) {
                    user.setTheirEdu(User.Education.HS);
                }
                break;
            case R.id.theirBA:
                if (checked) {
                    user.setTheirEdu(User.Education.BA);
                }
                break;
            case R.id.theirMA:
                if (checked) {
                    user.setTheirEdu(User.Education.MA);
                }
                break;
            case R.id.theirPHD:
                if (checked) {
                    user.setTheirEdu(User.Education.PHD);
                }
                //Maybe this one will be the case when nothing is checked?
                user.setTheirEdu(User.Education.LESSTHANHS);
                break;
        }
    }
}
