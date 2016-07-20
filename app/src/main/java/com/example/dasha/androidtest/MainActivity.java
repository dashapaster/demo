package com.example.dasha.androidtest;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    SharedPreferences sPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString("user1", "123");
        ed.commit();

    }

    public void login(View view) {
        String password = ((EditText) findViewById(R.id.etPassword)).getText().toString();
        final String name = ((EditText) findViewById(R.id.etLogin)).getText().toString();

        if(sPref.getString(name, "").equals("")==false && sPref.getString(name, "").equals(password)){
            startActivity(new Intent(getApplicationContext(), WebListActivity.class));

        }else{
            Toast.makeText(getApplicationContext(),"Wrong Credentials",Toast.LENGTH_LONG).show();
        }

    }

}
