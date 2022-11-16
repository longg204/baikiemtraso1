package com.example.bikimtra1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class Login extends AppCompatActivity {

    TextInputEditText email, pass;
    CheckBox check;
    Button lognin;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        email = (TextInputEditText) findViewById(R.id.email_login);
        pass = (TextInputEditText) findViewById(R.id.password_login);
        check = (CheckBox) findViewById(R.id.checkbox_login);
        lognin = (Button) findViewById(R.id.btn_login);

        sharedPreferences = getSharedPreferences("datalogin",MODE_PRIVATE);
        email.setText(sharedPreferences.getString("taikhoan",""));
        pass.setText(sharedPreferences.getString("matkhau",""));
        check.setChecked(sharedPreferences.getBoolean("checked", false));

        lognin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = email.getText().toString().trim();
                String password = pass.getText().toString().trim();

                if(username.equals("long@gmail.com") && password.equals("123456")){
                    Toast.makeText(Login.this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show();
                    if(check.isChecked()){
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putString("taikhoan", username);
                        editor.putString("matkhau", password);
                        editor.putBoolean("checked", true);
                        editor.commit();
                    }else{
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.remove("taikhoan");
                        editor.remove("matkhau");
                        editor.remove("checked");
                        editor.commit();
                    }
                    startActivity(new Intent(Login.this, listview.class));
                }else{
                    Toast.makeText(Login.this, "Đăng nhập thất bại", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}