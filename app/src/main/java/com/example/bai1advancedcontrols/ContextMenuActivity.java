package com.example.bai1advancedcontrols;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ContextMenuActivity extends Activity {
    Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_menu);
        btn1= (Button) findViewById(R.id.btnctmnul);
        btn2= (Button) findViewById(R.id.btnctmnu2);
        registerForContextMenu(btn1);
        registerForContextMenu (btn2);
    }
    public void onCreateContextMenu (ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo)
    {
        super.onCreateContextMenu(menu, v, menuInfo);
        if (v.getId() ==R.id.btnctmnul){
            getMenuInflater().inflate(R.menu.contextmenu1, menu);
        }
        else if (v.getId() ==R.id.btnctmnu2)
        {
            contextmenu2(menu);
        }
    }
    public void contextmenu2 (ContextMenu menu)
    {
        int groupId=1;
        menu.add(groupId, 113, 0, "Red");
        menu.add(groupId, 114, 1, "Green");
        menu.add(groupId, 115, 2, "Blue");
    }
    @Override
    public boolean onContextItemSelected (MenuItem item) {
        Typeface type = Typeface.createFromAsset(getAssets(), "arial.TTF");
            if(item.getItemId()==R.id.mnubold)
                btn1.setTypeface(type, Typeface.BOLD);
            else if(item.getItemId()==R.id.mnuitalic)
                btn1.setTypeface(type, Typeface.ITALIC);
            else if(item.getItemId()==R.id.mnuunderline)
            {   SpannableString content = new SpannableString(btn1.getText());
                content.setSpan(new UnderlineSpan(), 0, content.length(), 0);
                btn1.setText(content);
            }
            else if(item.getItemId()==113)
                btn2.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            else if(item.getItemId()==114)
                btn2.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            else if(item.getItemId()==115)
                btn2.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_dark));
        return super.onContextItemSelected(item);
    }

}