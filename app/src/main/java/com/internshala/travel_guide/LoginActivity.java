package com.internshala.travel_guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button logform =(Button)findViewById(R.id.btnloginform);
        logform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this,SelectingCity.class));
            }
        });

        TextView sign=(TextView) findViewById(R.id.txtsignintologinform);
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this,RegisterActivity.class));

                Toast.makeText(LoginActivity.this,"Clicked on SigUp page..",Toast.LENGTH_LONG);
            }
        });

        }

    @Override
    public void onClick(View v) {

    }
}
