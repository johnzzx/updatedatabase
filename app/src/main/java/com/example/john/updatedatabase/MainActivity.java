package com.example.john.updatedatabase;

import android.app.Activity;
import android.os.Bundle;
import android.print.PrintAttributes;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements View.OnClickListener {
    /////////
    private Button buttonlogin;
    private Button buttonregister;
    private EditText textname;
    private EditText textpw;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /////////
        buttonlogin = (Button)findViewById(R.id.button_login);
        buttonregister = (Button)findViewById(R.id.button_resister);
        textname = (EditText) findViewById(R.id.editText_name);
        textpw = (EditText) findViewById(R.id.editText_password);
        buttonlogin.setOnClickListener(this);
        buttonregister.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

    }
}
