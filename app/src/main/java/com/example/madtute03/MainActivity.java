package com.example.madtute03;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button button;
    EditText et;
    EditText et2;
    String st;
    String st2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=findViewById(R.id.textInputNumber1);
        et2=findViewById(R.id.textInputNumber2);
        button = (Button) findViewById(R.id.btn_Ok);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater li = getLayoutInflater();
                View layout = li.inflate(R.layout.customtoast, (ViewGroup)
                        findViewById(R.id.custom_toast_layout));
                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.setView(layout);
                toast.show();

                openActivity2();
            }
        });
    }

    public void openActivity2(){
        Intent intent = new Intent(this,SecondActivity.class);
        st=et.getText().toString();
        st2=et2.getText().toString();
        intent.putExtra("Value",st);
        intent.putExtra("Value2",st2);
        startActivity(intent);
    }
}