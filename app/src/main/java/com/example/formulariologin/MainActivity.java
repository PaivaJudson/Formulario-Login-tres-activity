package com.example.formulariologin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edt_userName;
    EditText edt_password;
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_userName = findViewById(R.id.edt_username);
        edt_password = findViewById(R.id.edt_password);
        btn_login = findViewById(R.id.btn_login);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = edt_userName.getText().toString();
                String password = edt_password.getText().toString();

                if (user.equals("user") && password.equals("12345")){
                    Intent intent = new Intent(MainActivity.this, LoginOkActivity.class);
                    startActivity(intent);

                }else if(user.isEmpty() || password.isEmpty()){
                    Toast.makeText(MainActivity.this, "Campos Vazios", Toast.LENGTH_SHORT).show();

                }else if (!user.equals("user") || !password.equals("12345")){
                    Intent intent = new Intent(MainActivity.this, LoginErradoActivity.class);
                    startActivity(intent);
                }

            }
        });

    }
}