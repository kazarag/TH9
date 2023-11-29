package com.example.bai1advancedcontrols;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.core.content.pm.PermissionInfoCompat;

public class ListViewActivity extends Activity {
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.layout_listviewactivity);
        final String arr[]={"khang","Tèo","Vũ","Toàn"};
        ListView lv=(ListView)findViewById(R.id.lvperson);
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,arr);
        lv.setAdapter(adapter);
        final TextView txt=(TextView) findViewById(R.id.txtselection);
        lv.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View arg1, int arg2, long arg3) {
                        txt.setText("position :"+arg2+" ; value ="+arr[arg2]);
                    }
                }
        );


    }
}
