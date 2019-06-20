package com.polinaisakovich.savehedgehogs;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FourthActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnOneMore;

    Button btnOnStart;

    Button btnWhere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        Intent intent = getIntent();

        String numberOfBatteries;
        numberOfBatteries = intent.getStringExtra("users_batteries");
        int count = Integer.parseInt(numberOfBatteries);

        TextView txtFourthActivity = findViewById(R.id.txtFourthActivity);
        txtFourthActivity.setText("Сколько батареек\nвы сдадите\nв утилизацию: " + (count));


        TextView txtFourthActivity_2 = findViewById(R.id.txtFourthActivity_2);
        txtFourthActivity_2.setText("Вы спасёте\nдеревьев: " + (count * 10 ) + "\nбелок: " + (count * 8 ) + "\nкротов: " + (count * 2 ) + "\nёжиков: " + (count));

        btnOneMore = (Button) findViewById(R.id.btnOneMore);
        btnOneMore.setOnClickListener(this);

        /*
        btnWhere = (Button) findViewById(R.id.btnWhere);
        btnWhere.setOnClickListener(this);
        */
    }


    public void onClick(View v) {

        //Кнопка, вызывающая третий экран (ещё раз)
        switch (v.getId()) {
            case R.id.btnOneMore:
                Intent intent = new Intent(this, ThirdActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
        /*
        switch (v.getId()) {
            case R.id.btnOnStart:
                Intent intent = new Intent(this, PreActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
        */
        switch (v.getId()) {
            case R.id.btnWhere:
                Intent intent = new Intent(this, WhereActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
