package com.example.khairulamin.prjquis1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Home extends AppCompatActivity {
    TextView Username;
    TextView Password;

    Button kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Username = (TextView) findViewById(R.id.dataUsername);
        Password = (TextView) findViewById(R.id.dataPassword);


        String User = getIntent().getStringExtra(MainActivity.KEY_Username);
        String Pass = getIntent().getStringExtra(MainActivity.KEY_Password);

        Username .setText(User);
        Password.setText(Pass);

        kembali = (Button) findViewById(R.id.btnLogOut);

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembali = new Intent(Home.this, MainActivity.class);
                startActivity(kembali);
                finish();

            }
        });


    }
}
