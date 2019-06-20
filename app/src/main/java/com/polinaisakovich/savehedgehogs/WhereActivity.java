package com.polinaisakovich.savehedgehogs;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class WhereActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnOneMore;

    Button btnOnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_where);

        btnOneMore = (Button) findViewById(R.id.btnOneMore);
        btnOneMore.setOnClickListener(this);

        btnOnStart = (Button) findViewById(R.id.btnWhere);
        btnOnStart.setOnClickListener(this);
    }


    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnOneMore:
                Intent intent = new Intent(this, ThirdActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
        switch (v.getId()) {
            case R.id.btnWhere:
                Intent intent = new Intent(this, PreActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
