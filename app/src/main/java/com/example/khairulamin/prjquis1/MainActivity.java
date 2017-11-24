package com.example.khairulamin.prjquis1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public static String KEY_Username = "Username";
    public static String KEY_Password = "Password";

    EditText Username;
    EditText Password;

    Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Username = (EditText) findViewById(R.id.txtUsername);
        Password = (EditText) findViewById(R.id.txtPassword);

        Login = (Button) findViewById(R.id.btnLogin);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String strUsername = Username.getText().toString();
                String strPassword = Password.getText().toString();

                if (Username.getText().toString().equals("admin") && Password.getText().toString().equals("admin123")) {

                    //kondisi jika login benar
                    Toast.makeText(getApplicationContext(), "Login Sukses", Toast.LENGTH_SHORT).show();

                    Intent home = new Intent(MainActivity.this, Home.class);
                    home.putExtra(KEY_Username, strUsername);
                    home.putExtra(KEY_Password, strPassword);
                    startActivity(home);

                }else{
                    //jika login gagal
                    Toast.makeText(getApplicationContext(), "Username atau Password Anda Salah",

                            Toast.LENGTH_SHORT).show();

//                    if (strUsername.isEmpty() || strPassword.isEmpty()){
//                       Toast.makeText(MainActivity.this, "Data Masih Ada yang Kosong, Cobalah Di Periksa Kembali", Toast.LENGTH_SHORT).show();
//                } else {
                    finish();

                }

            }
        });
    }

}
