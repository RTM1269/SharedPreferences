package com.rtm.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.tv1);
        SharedPreferences prefe = getSharedPreferences("datos", Context.MODE_PRIVATE);
        et1.setText(prefe.getString("mail",""));
    }
    /*@Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.activity_main,menu);
        return true;
    }*/
    public void ejecutar(View view){
        SharedPreferences preferences = getSharedPreferences("datos",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("mail",et1.getText().toString());
        editor.commit();//los cargo
        finish();
    }

    public void clickBtn(View view) {
        ejecutar(view);
    }
}