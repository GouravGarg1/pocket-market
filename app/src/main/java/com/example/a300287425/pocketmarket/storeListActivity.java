package com.example.a300287425.pocketmarket;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class storeListActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] ListPCode1 = {"Walmart", "Real Canadian - Superstore", "Sabji Mandi"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,ListPCode1));

       /* String[] ListPCode2 = {"Fruiticana","Langley Farm Market","Kin's Farm Market"};
        setListAdapter(new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,ListPCode2));

        String[] ListPCode3 = {"Safeway","Nester's Farm Market","Save-On-Foods"};
        setListAdapter(new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,ListPCode3));
    */
    }

    protected void onListItemClick(ListView l, View view, int position, long id){
        //switch() for choosing among the given cases
        switch (position){
            case 0:
                // linking first InfoArshpreetSingh activity to first list item
                startActivity(new Intent(storeListActivity.this,storeActivity.class));
                break;
        }
    }
}
