package com.example.myapplication;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListItemActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.val);

        ListView listView = (ListView) this.findViewById(R.id.listViewsVal);

        ArrayList<DataVal> list = new ArrayList<>();
        list.clear();

        list.add(new DataVal(R.drawable.rus, R.string.russian, R.string.russianRUB));
        list.add(new DataVal(R.drawable.africa, R.string.africa, R.string.africaZAR));
        list.add(new DataVal(R.drawable.flag_singapur, R.string.singapore, R.string.singaporeSGD));
        list.add(new DataVal(R.drawable.turk, R.string.turkish, R.string.turkishTRY));
        list.add(new DataVal(R.drawable.america, R.string.america, R.string.americanUSD));


        MyListAdapter myListAdaptery = new MyListAdapter(this, list);
        listView.setAdapter((ListAdapter) myListAdaptery);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        //if (id == R.id.action_settings) {
        //return true;
        //}

        return super.onOptionsItemSelected(item);
    }
}
