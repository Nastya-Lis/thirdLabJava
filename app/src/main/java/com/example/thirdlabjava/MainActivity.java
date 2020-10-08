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
    //Bundle bundleHui;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
       /* if(bundleHui!=null){
            savedInstanceState = bundleHui;
        }*/
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.nameId);
        surname = (EditText) findViewById(R.id.surnameId);
        age = (EditText) findViewById(R.id.ageId);
        curse = (EditText) findViewById(R.id.curseId);

    }

   /* @Override
    public void onSaveInstanceState(Bundle bundle) {

        EditText editText = (EditText) findViewById(R.id.nameId);
        str = editText.getText().toString();
        bundle.putString(STRINGVALUE,str);
        bundleHui = bundle;
        super.onSaveInstanceState(bundle);
    }

    @Override
    public void onRestoreInstanceState(Bundle bundle){
        super.onRestoreInstanceState(bundle);

        str = bundle.getString(STRINGVALUE);
        EditText editText = (EditText) findViewById(R.id.nameId);
        editText.setText(str);
    }
*/
   private  void setValuesForPerson(){

   }

    public void nextClick(View view) {
        EditText edit  = (EditText) findViewById(R.id.nameId);
       // str = edit.getText().toString();
        Intent intent = new Intent(MainActivity.this, ChooseActivity.class);
        intent.putExtra(NAMEVALUE,name.getText().toString());
        intent.putExtra(SURNAMEVALUE,surname.getText().toString());
        intent.putExtra(AGEVALUE,age.getText().toString());
        intent.putExtra(CURSEVALUE,curse.getText().toString());
      //  intent.putExtra("namee",str);
        startActivity(intent);
    }
}