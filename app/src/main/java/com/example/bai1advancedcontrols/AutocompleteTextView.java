package com.example.bai1advancedcontrols;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;

public class AutocompleteTextView extends AppCompatActivity implements TextWatcher {

    TextView selection;
    AutoCompleteTextView viewcomplete;
    String arr[]={"hà nội","Huế","Sài gòn", "hà giang","Hội an","Kiên giang", "Lâm đồng","Long khánh"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autocomplete_text_view);
        selection = (TextView) findViewById(R.id. selection);
        viewcomplete= (AutoCompleteTextView) findViewById(R.id.editauto);
        viewcomplete.addTextChangedListener(this);
        viewcomplete.setAdapter (new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr));
        MultiAutoCompleteTextView mul= (MultiAutoCompleteTextView) findViewById(R.id.multiAutoCompleteTextView1);
        mul.setAdapter (new ArrayAdapter<String> (this, android. R.layout.simple_list_item_1, arr));
        mul.setTokenizer (new MultiAutoCompleteTextView.CommaTokenizer());
    }
    public void onTextChanged (CharSequence arg0, int arg1, int arg2, int arg3)
    { selection.setText (viewcomplete.getText());}
    public void afterTextChanged (Editable arg0) {}
    public void beforeTextChanged (CharSequence arg0, int arg1, int arg2, int arg3){

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}