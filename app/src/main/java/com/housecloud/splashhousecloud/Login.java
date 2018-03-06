package com.housecloud.splashhousecloud;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by 21642432 on 02/03/2018.
 */

public class Login extends AppCompatActivity {

    private EditText etNombre;
    private EditText etApellido;
    private EditText etEmail;
    private EditText etPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etNombre = (EditText) findViewById(R.id.etNombre);
        etApellido = (EditText) findViewById(R.id.etApellido);
        etEmail = (EditText) findViewById(R.id.etEmailC);
        etPhone = (EditText) findViewById(R.id.etPhone);

    }


    public void login (View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
