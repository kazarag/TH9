package com.example.bai1advancedcontrols;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListviewActivityWithArrayList extends Activity {
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.layout_test);
        final ArrayList<String>list=new ArrayList<String>();
        final ListView lv=(ListView)findViewById(R.id.lvperson);
        final EditText txtten=(EditText)findViewById(R.id.txtTen);
        final Button btn=(Button)findViewById(R.id.btnNhap);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,list);
        lv.setAdapter(adapter);
        final TextView txtchon=(TextView) findViewById(R.id.txtselection);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                list.add(txtten.getText()+"");
                adapter.notifyDataSetChanged();
            }
        });
        lv.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View arg1, int arg2, long arg3) {
                        txtchon.setText("position :"+arg2+" ; value ="+ list.get(arg2));
                    }
                }
        );


    }
}
