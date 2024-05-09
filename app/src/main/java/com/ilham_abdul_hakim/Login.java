package com.ilham_abdul_hakim;

import android.app.AlertDialog;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText username, password;
    Button btnlogin;
    String keynama, keypass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnlogin = findViewById(R.id.tombollogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username = findViewById(R.id.editekuser);
                password = findViewById(R.id.editekpassword);
                btnlogin = findViewById(R.id.tombollogin);

                keynama = username.getText().toString();
                keypass = password.getText().toString();

                //username diisi dengan admin dan password dengan admin
                if (keynama.equals("ilham") && keypass.equals("ilham123")) {
                    //jika login berhasil
                    Toast.makeText(getApplicationContext(),
                            "LOGIN BERHASIL", Toast.LENGTH_LONG).show();

                    Intent intent = new Intent(Login.this, Home.class);
                    intent.putExtra("username", keynama);
                    Login.this.startActivity(intent);
                    finish();
                }
                else {
                    //jika login gagal
                    AlertDialog.Builder builder = new AlertDialog.Builder(Login.this);
                    builder.setMessage
                            ("Username atau password salah").setNegativeButton
                            ("ulangi", null).create().show();

                    username.setText("");
                    password.setText("");
                }

            }
        });
    }
}