package com.example.yairandaviad.bookshop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout._002_activity_login);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        final Button buttonSignIn = (Button) findViewById(R.id.sign_in_button);
        buttonSignIn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast pass = Toast.makeText(Login.this, "bla bla bla", Toast.LENGTH_SHORT);
                pass.show();
                /*AutoCompleteTextView username = (AutoCompleteTextView)findViewById(R.id.username);
                EditText password = (EditText)findViewById(R.id.password);
                if (username.getText().toString().equals("") && password.getText().toString().equals(""))
                {
                    Intent nextScreen = new Intent(getApplicationContext(), newAccount_type.class);

                    startActivity(nextScreen);

                    this.finish();
                }*/
            }

            private void finish() {
                //TODO Auto-generated method stub
            }
        });

        final TextView buttonSignUp = (TextView) findViewById(R.id.text_new_member);
        buttonSignUp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent nextScreen = new Intent(getApplicationContext(), newAccount_type.class);
                startActivity(nextScreen);
                this.finish();
            }
            private void finish() {
                //TODO Auto-generated method stub
            }
        });

    }
}
