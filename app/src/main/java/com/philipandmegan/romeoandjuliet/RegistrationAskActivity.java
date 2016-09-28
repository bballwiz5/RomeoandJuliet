package com.philipandmegan.romeoandjuliet;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegistrationAskActivity extends AppCompatActivity {

    private FirebaseAuth mFirebaseAuth;
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.user = (User) getIntent().getSerializableExtra("User");
        // Initialize FirebaseAuth
        mFirebaseAuth = FirebaseAuth.getInstance();
        setContentView(R.layout.activity_registration_ask);
    }

    public void continueExplanationSurvey(View view) {
        EditText zipCode = (EditText) findViewById(R.id.zipCode);
        user.setZipCode(zipCode.getText().toString());
        EditText birthday = (EditText) findViewById(R.id.birthday);
        user.setBirthday(birthday.getText().toString());
        EditText emailEditText = (EditText) findViewById(R.id.email);
        EditText passwordEditText = (EditText) findViewById(R.id.password);

        String password = passwordEditText.getText().toString();
        String email = emailEditText.getText().toString();

        password = password.trim();
        email = email.trim();

        if (password.isEmpty() || email.isEmpty())
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(RegistrationAskActivity.this);
            builder.setMessage(R.string.signup_error_message)
                    .setTitle(R.string.signup_error_title)
                    .setPositiveButton(android.R.string.ok, null);
            AlertDialog dialog = builder.create();
            dialog.show();
        } else {
            mFirebaseAuth.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener(RegistrationAskActivity.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                Intent intent = new Intent(RegistrationAskActivity.this, SurveyExplanationActivity.class);
                                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                                intent.putExtra("User", user);
                                startActivity(intent);
                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(RegistrationAskActivity.this);
                                builder.setMessage(task.getException().getMessage())
                                        .setTitle(R.string.login_error_title)
                                        .setPositiveButton(android.R.string.ok, null);
                                AlertDialog dialog = builder.create();
                                dialog.show();
                            }
                        }
                    });
        }
    }
}
