package com.example.myapplication;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class OtdItemActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.otd);

    ListView listView = (ListView) this.findViewById(R.id.listViewsOtd);

    ArrayList<DataOtd> list2 = new ArrayList<>();
    list2.clear();

    list2.add(new DataOtd(R.string.adress, R.string.sost, R.string.rasp1));
    list2.add(new DataOtd(R.string.adress, R.string.sost, R.string.rasp2));
    list2.add(new DataOtd(R.string.adress, R.string.sost, R.string.rasp1));
    list2.add(new DataOtd(R.string.adress, R.string.sost, R.string.rasp2));
    list2.add(new DataOtd(R.string.adress, R.string.sost, R.string.rasp1));
    list2.add(new DataOtd(R.string.adress, R.string.sost, R.string.rasp2));
    list2.add(new DataOtd(R.string.adress, R.string.sost, R.string.rasp1));



    OtdAdapter banksAdapter = new OtdAdapter(this, list2);
    listView.setAdapter((ListAdapter) banksAdapter);

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
