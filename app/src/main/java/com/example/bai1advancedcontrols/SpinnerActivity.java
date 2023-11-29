package com.example.bai1advancedcontrols;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class SpinnerActivity extends AppCompatActivity {
    String arr[]={"Hàng Điện Tử","Hàng Hóa Chất","Hàng Gia Dụng"};
    TextView selection;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
//        selection=(TextView) findViewById(R.id.selection);
        Spinner spin=(Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,arr);
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        spin.setAdapter(adapter);
        spin.setOnItemSelectedListener(new MyProcessEvent());
    }
    private class MyProcessEvent implements AdapterView.OnItemSelectedListener {
        public void onItemSelected(AdapterView<?>arg0, View arg1, int arg2,long arg3){
//            selection.setText(arr[arg2]);
        }
        public void onNothingSelected(AdapterView<?>arg0){
//            selection.setText("");
        }
    }
}

