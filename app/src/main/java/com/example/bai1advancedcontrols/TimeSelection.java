package com.example.bai1advancedcontrols;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TimePicker;

public class TimeSelection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_selection);
        dowork();
    }
    public void dowork(){
        Button b1,b2,b3,b4;
        b1=findViewById(R.id.btnAnalogClock);
        b2=findViewById(R.id.btnChronomete);
        b3=findViewById(R.id.btnTimePicker);
        b4=findViewById(R.id.btnDatePickerDialog);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AnalogClock analog=new AnalogClock(TimeSelection.this);
                ((LinearLayout)findViewById(R.id.mylayout)).addView(analog);
            }
            });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Chronometer chro =new Chronometer(TimeSelection.this);
                ((LinearLayout)findViewById(R.id.mylayout)).addView(chro);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TimePickerDialog.OnTimeSetListener callback=new TimePickerDialog.OnTimeSetListener() {
                    public void onTimeSet (TimePicker view, int hourOfDay, int minute) {
                        ((TextView) findViewById(R.id. txtdate))
                                .setText (hourOfDay +"-"+ minute +"@@@"+ view.getCurrentHour() +"-"+view.getCurrentMinute());
                    }
                };
                TimePickerDialog time=new TimePickerDialog( TimeSelection.this, callback, 11, 30, true);
                time.show();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerDialog.OnDateSetListener callback=new DatePickerDialog.OnDateSetListener() {
                    public void onDateSet (DatePicker view, int year, int monthofYear, int dayOfMonth)
                    { ((TextView) findViewById(R.id. txtdate)) .setText((dayOfMonth+1) +"/"+ (monthofYear+1)+"/"+year);}
                };
                    DatePickerDialog pic=new DatePickerDialog( TimeSelection.this, callback, 2012, 11, 30);
                    pic.setTitle("My Datetime picker");
                    pic.show();
            }
        });

    }
}