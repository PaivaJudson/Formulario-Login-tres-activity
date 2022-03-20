package com.example.formulariologin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoginErradoActivity extends AppCompatActivity {

    Button btn_regressar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_errado);

        Toast.makeText(this, "Login Errado", Toast.LENGTH_SHORT).show();

        btn_regressar = findViewById(R.id.btn_regressar);
        btn_regressar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}