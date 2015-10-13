package com.example.www.hardwork;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.app.ListActivity;

public class Menu extends ListActivity {

   String classes[] = { "MainActivity", "Text", "Example 2", "Example 3", "Example 4", "Example 5",
           "Example 6" };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(Menu.this, android.R.layout.simple_list_item_1, classes));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        String cheese = classes[position];

    ////Create an Intent./////
        try {
       Class ourclass = Class.forName("com.example.www.hardwork." + cheese);

        Intent intent = new Intent(Menu.this, ourclass);
        startActivity(intent);} catch (ClassNotFoundException e){

            e.printStackTrace();

        }

    }
}
