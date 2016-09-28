package com.philipandmegan.romeoandjuliet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import android.content.Intent;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    /** Called when the user touches the button */
    public void signUp(View view) {
        Intent toGenderActivity = new Intent(this, GenderAskActivity.class);
        startActivity(toGenderActivity);
    }

    public void signIn(View view) {

        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    public void continueRace(View view) {
        setContentView(R.layout.race_ask);
    }



//    public void myRaceCheckbox(View view) {
//        // Is the view now checked?
//        boolean checked = ((CheckBox) view).isChecked();
//
//        // Check which checkbox was clicked
//        switch(view.getId()) {
//            case R.id.AI:
//                if (checked) {
//                    user.addRace(User.Race.AMERICAN_INDIAN);
//                }
//                break;
//            case R.id.AS:
//                if (checked) {
//                    user.addRace(User.Race.ASIAN);
//                }
//                break;
//            case R.id.BL:
//                if (checked) {
//                    user.addRace(User.Race.BLACK);
//                }
//                break;
//            case R.id.WH:
//                if (checked) {
//                    user.addRace(User.Race.WHITE);
//                }
//                break;
//            case R.id.LA:
//                if (checked) {
//                    user.addRace(User.Race.HISPANIC);
//                }
//                break;
//            case R.id.OT:
//                if (checked) {
//                    user.addRace(User.Race.OTHER);
//                }
//                break;
//        }
//    }
//
//    public String iWantMyGender() {
//        return user.getSeekingGender() == User.Gender.MAN ?  "I want my Romeo to be" : "I want my Juliet to be";
//    }
}
