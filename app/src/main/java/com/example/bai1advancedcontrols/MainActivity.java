package com.example.bai1advancedcontrols;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openLayout(View view) {
        int id = view.getId();
        Intent intent;
        if (id == R.id.button1) {
            intent = new Intent(this, ListViewActivity.class);
            startActivity(intent);

        } else if (id == R.id.button2) {
            intent = new Intent(this, ListviewActivityWithArrayList.class);
            startActivity(intent);
        } else if (id == R.id.button3) {
            intent = new Intent(this, ArrayAdapterDemo.class);
            startActivity(intent);
        } else if (id == R.id.button4) {
            intent = new Intent(this, SpinnerActivity.class);
            startActivity(intent);
        } else if (id == R.id.button5) {
            intent = new Intent(this, GridviewActivity.class);
            startActivity(intent);
        } else if (id == R.id.button6) {
            intent = new Intent(this, TabSelectorActivity.class);
            startActivity(intent);
        } else if (id == R.id.button7) {
            intent = new Intent(this, ContextMenuActivity.class);
            startActivity(intent);
        }else if (id == R.id.button8) {
            intent = new Intent(this, TimeSelection.class);
            startActivity(intent);
        }else if (id == R.id.button9) {
            intent = new Intent(this, AutocompleteTextView.class);
            startActivity(intent);
        }


    }
}