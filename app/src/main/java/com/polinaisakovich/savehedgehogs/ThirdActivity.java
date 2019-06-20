package com.polinaisakovich.savehedgehogs;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnFourthAct;

    public static EditText Batteries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Batteries = findViewById(R.id.editTxtUsersBatteries);

    }

    //Кнопка, вызывающая четвёртый экран
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnFourthAct:
                Intent intent = new Intent(this, FourthActivity.class);
                String numberOfBatteries;
                numberOfBatteries = Batteries.getText().toString();
                intent.putExtra("users_batteries", numberOfBatteries);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
