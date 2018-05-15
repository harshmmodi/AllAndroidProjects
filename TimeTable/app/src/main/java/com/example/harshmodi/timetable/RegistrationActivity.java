package com.example.harshmodi.timetable;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegistrationActivity extends AppCompatActivity {
    private Button b1;
    private EditText name, password;
    private TextView login;
    private ProgressDialog progressDialog;

    private FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        firebaseAuth = FirebaseAuth.getInstance();

        if(firebaseAuth.getCurrentUser()!= null){
            finish();
            startActivity(new Intent(this, ProfileActivity.class));
        }

        b1 = (Button)findViewById(R.id.buttonRegister);
        name = (EditText)findViewById(R.id.editTextEmail);
        password = (EditText)findViewById(R.id.editTextPassword);
        login = (TextView)findViewById(R.id.textViewSignIn);

        progressDialog = new ProgressDialog(this);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registerUser();
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                startActivity(new Intent(getApplicationContext(), LoginActivity.class));
            }
        });
    }

    private void registerUser(){
        String email = name.getText().toString().trim();
        String pwd = password.getText().toString().trim();
        boolean flag = false;
        if(TextUtils.isEmpty(email)){
            name.setError("Required!");
            flag = true;
            //Toast.makeText(getBaseContext(), "Please enter Email", Toast.LENGTH_SHORT).show();
          //  return;
        }
        if(TextUtils.isEmpty(pwd)){
            password.setError("Required!");
            flag = true;
            //Toast.makeText(getBaseContext(), "Please enter password", Toast.LENGTH_SHORT).show();
          //  return;
        }
        if(pwd.length() < 6 && pwd.length() > 0){
            password.setError("Password must have atleast 6 characters");
            flag = true;
            //Toast.makeText(getBaseContext(), "Password must have atleast 6 characters", Toast.LENGTH_SHORT).show();
           // return;
        }
        if(flag)return;
        // validations are ok
        progressDialog.setMessage("Registering User...");
        progressDialog.show();
        firebaseAuth.createUserWithEmailAndPassword(email, pwd)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        progressDialog.dismiss();
                        if(task.isSuccessful()){
                            finish();
                            startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
                        }
                        else {
                            Toast.makeText(getBaseContext(), "Could Not Register. Please Try Again\nLogin if you have already registered", Toast.LENGTH_LONG).show();
                        }

                    }
                });

    }
}
