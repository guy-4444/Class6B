package com.example.class6b;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    private Button main_BTN_bottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_BTN_bottom = findViewById(R.id.main_BTN_bottom);
        main_BTN_bottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlertDialog();
            }
        });



        Car car = new Car();
        car.model = "Mitsubishi";
        car.km = 54000;
        car.hybrid = true;

        Gson gson = new Gson();
        String jsn = gson.toJson(car);

        Log.d("pttt", "Json=" + jsn);

    }

    private void openAlertDialog() {
        new AlertDialog.Builder(this)
                .setTitle("Delete entry")

                .setMessage("Are you sure you want to delete this entry?")

                .setPositiveButton(R.string.yes_man, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })

                .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })

                .setNeutralButton("NA", null)

                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }
}
