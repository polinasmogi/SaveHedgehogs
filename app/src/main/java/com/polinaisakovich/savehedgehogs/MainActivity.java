package com.polinaisakovich.savehedgehogs;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements OnClickListener {

    Button btnSecondAct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSecondAct = (Button) findViewById(R.id.btnSecondAct);
        btnSecondAct.setOnClickListener(this);
    }

    //Кнопка, вызывающая второй экран
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnSecondAct:
                Intent intent = new Intent(this, SecondActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
