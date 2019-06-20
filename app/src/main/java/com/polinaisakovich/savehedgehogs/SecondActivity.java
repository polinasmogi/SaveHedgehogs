package com.polinaisakovich.savehedgehogs;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity implements OnClickListener {

    Button btnThirdAct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnThirdAct = (Button) findViewById(R.id.btnThirdAct);
        btnThirdAct.setOnClickListener(this);
    }

    //Кнопка, вызывающая третий экран
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnThirdAct:
                Intent intent = new Intent(this, ThirdActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
