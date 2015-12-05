package org.rosedu.dandroid.messageme.views;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.rosedu.dandroid.messageme.R;

public class RegisterActivity extends AppCompatActivity {

    private EditText userNameEditText;
    private EditText emailEditText;
    private EditText passwordEditText;
    private EditText passwordAgainEditText;
    private Button registerButton;
    private Button cancelButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        userNameEditText = (EditText)findViewById(R.id.username_edit_text);
        emailEditText = (EditText)findViewById(R.id.email_edit_text);
        passwordEditText = (EditText)findViewById(R.id.password_edit_text);
        passwordAgainEditText = (EditText)findViewById(R.id.password_again_edit_text);
        registerButton = (Button)findViewById(R.id.register_button);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = userNameEditText.getText().toString();
                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();
                String passwordAgain = passwordAgainEditText.getText().toString();
                if (userName == null || userName.isEmpty() ||
                        email == null || email.isEmpty() ||
                        password == null || password.isEmpty() ||
                        passwordAgain == null || passwordAgain.isEmpty()) {
                    Snackbar.make(view, getResources().getString(R.string.all_fields_are_mandatory), Snackbar.LENGTH_LONG)
                            .show();
                    return;
                }
                if (!password.equals(passwordAgain)) {
                    Snackbar.make(view, getResources().getString(R.string.passwords_do_not_match), Snackbar.LENGTH_LONG)
                            .show();
                    return;
                }
                Snackbar.make(view, getResources().getString(R.string.thank_you_for_registering), Snackbar.LENGTH_LONG)
                        .show();
                setResult(RESULT_OK);
                finish();
            }
        });
        cancelButton = (Button)findViewById(R.id.cancel_button);
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(RESULT_CANCELED);
                finish();
            }
        });

    }

}
