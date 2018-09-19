package com.example.student.datepicker;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    DatePicker datePicker;
    private int year;
    private int month;
    private int day;

//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        initView();
//    }


    public void Click(View view) {

        if(view.getId() == R.id.getDateId){
            int year = datePicker.getYear();
            int month= datePicker.getMonth() + 1;
            int day = datePicker.getDayOfMonth();
            textView.setText("" + year + " / "+ month + "/ " + day);
        }

        if(view.getId() == R.id.showDatePicjerDialogue){
         showDialogue();
        }



    }

    private void showDialogue() {

        DatePicker datePicker = new DatePicker(this);
        year = datePicker.getYear();
         month= datePicker.getMonth() + 1;
         day = datePicker.getDayOfMonth();

        DatePickerDialog datePickerDialog= new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                //cntr+space

                textView.setText("year :" + i+ " month :" +(i1+1)+ day + i2);
            }
        }, year, month, day);
        datePickerDialog.show();
    }

    @SuppressLint("NewApi")
    private void initView() {
        textView = findViewById(R.id.tvResultId);
        datePicker = findViewById(R.id.datePickerId);



//        datePicker.setOnDateChangedListener(new DatePicker.OnDateChangedListener() {
//            @Override
//            public void onDateChanged(DatePicker datePicker, int i, int i1, int i2) {
//
//            }
//        });

    }
}
