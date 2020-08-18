package com.example.madtute03;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class SecondActivity extends AppCompatActivity {
    TextView tv;
    TextView tv2;
    String st;
    String st2;
    EditText e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv=findViewById(R.id.textInputNumber1);
        tv2=findViewById(R.id.textInputNumber2);
        st=getIntent().getExtras().getString("Value");
        st2=getIntent().getExtras().getString("Value2");
        tv.setText(st);
        tv2.setText(st2);
    }

    public void changeFragment(View view){
        tv2=findViewById(R.id.textInputNumber2);
        tv=findViewById(R.id.textInputNumber1);
        Fragment fragment;
        if (view == findViewById(R.id.plusbutton)){
            fragment = new PlusFragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            Bundle b2= new Bundle();
            b2.putString("Number1",tv.getText().toString());
            b2.putString("Number2",tv2.getText().toString());
            fragment.setArguments(b2);
            ft.replace(R.id.fragment4,fragment);
            ft.commit();

        }
        if (view == findViewById(R.id.minusbutton)){
            fragment = new MinusFragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            Bundle b2= new Bundle();
            b2.putString("Number1",tv.getText().toString());
            b2.putString("Number2",tv2.getText().toString());
            fragment.setArguments(b2);
            ft.replace(R.id.fragment4,fragment);
            ft.commit();
        }
        if (view == findViewById(R.id.multiplybutton)){
            fragment = new MultiplyFragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            Bundle b2= new Bundle();
            b2.putString("Number1",tv.getText().toString());
            b2.putString("Number2",tv2.getText().toString());
            fragment.setArguments(b2);
            ft.replace(R.id.fragment4,fragment);
            ft.commit();
        }
        if (view == findViewById(R.id.diviosnbutton)){
            fragment = new DiviosnFragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            Bundle b2= new Bundle();
            b2.putString("Number1",tv.getText().toString());
            b2.putString("Number2",tv2.getText().toString());
            fragment.setArguments(b2);
            ft.replace(R.id.fragment4,fragment);
            ft.commit();
        }
    }

}