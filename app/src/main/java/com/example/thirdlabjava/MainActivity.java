package com.example.thirdlabjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.thirdlabjava.units.Person;

public class MainActivity extends AppCompatActivity {

    final String NAMEVALUE = "namePerson";
    final  String SURNAMEVALUE = "surnamePerson";
    final String AGEVALUE = "agePerson";
    final String CURSEVALUE = "cursePerson";

    EditText name,surname,age,curse;
    String str;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.nameId);
        surname = (EditText) findViewById(R.id.surnameId);
        age = (EditText) findViewById(R.id.ageId);
        curse = (EditText) findViewById(R.id.curseId);

    }

    public void nextClick(View view) {
        EditText edit  = (EditText) findViewById(R.id.nameId);
        Intent intent = new Intent(MainActivity.this, ChooseActivity.class);
        intent.putExtra(NAMEVALUE,name.getText().toString());
        intent.putExtra(SURNAMEVALUE,surname.getText().toString());
        intent.putExtra(AGEVALUE,age.getText().toString());
        intent.putExtra(CURSEVALUE,curse.getText().toString());
        startActivity(intent);
    }
}