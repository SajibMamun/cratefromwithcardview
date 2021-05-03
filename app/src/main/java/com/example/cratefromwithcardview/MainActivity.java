package com.example.cratefromwithcardview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username,userpass;
    String name,pass;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=findViewById(R.id.usernameid);
        userpass=findViewById(R.id.userpasswordid);
        login=findViewById(R.id.loginbuttonid);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name=username.getText().toString().trim();
                pass=userpass.getText().toString().trim();

                if(name.isEmpty())
                {
                    username.setError("Please enter your user name");
                }
                else if(pass.isEmpty())
                {
                    userpass.setError("enter your password");
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Login Sucessfully",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menucraete,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.helpnav_barid:
                Toast.makeText(MainActivity.this,"Go to help center",Toast.LENGTH_LONG).show();
                break;
            case R.id.suggestionnav_barid:
                Toast.makeText(MainActivity.this,"user name: text \n  password: 123445",Toast.LENGTH_LONG).show();
                break;
            case R.id.rateusnav_barid:
                Toast.makeText(MainActivity.this,"please rate this app",Toast.LENGTH_LONG).show();
                break;
            case R.id.messagernavid:
                Toast.makeText(MainActivity.this,"sharing with messenger",Toast.LENGTH_LONG).show();
                break;
            case R.id.whatsappnnav_barid:
                Toast.makeText(MainActivity.this,"sharing with whatsAPP",Toast.LENGTH_LONG).show();
                break;
            case R.id.shareitnav_barid:
                Toast.makeText(MainActivity.this,"sharing with Share it ",Toast.LENGTH_LONG).show();
                break;


        }
        return super.onOptionsItemSelected(item);

    }
}