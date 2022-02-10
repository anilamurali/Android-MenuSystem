package com.androapp.menusystem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    AppCompatButton b1;
    String getUname,getPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText) findViewById(R.id.uname);
        e2=(EditText) findViewById(R.id.pass);
        b1=(AppCompatButton) findViewById(R.id.login);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getUname = e1.getText().toString();
                getPass = e2.getText().toString();
                if (getUname.equals("admin") && (getPass.equals("123"))) {
                    Toast.makeText(getApplicationContext(), "Authentication Success", Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(getApplicationContext(),MenuActivity.class);
                    startActivity(i);

                }

                else
                {
                    Toast.makeText(getApplicationContext(), "Authentication Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
        }
}