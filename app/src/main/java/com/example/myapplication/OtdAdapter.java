package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class OtdAdapter extends BaseAdapter {
    private LayoutInflater LInflater;
    private ArrayList<DataOtd> list;


    public OtdAdapter(Context context, ArrayList<DataOtd> data){

        list = data;
        LInflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public DataOtd getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        OtdAdapter.ViewHolder holder;
        View v = convertView;


        if ( v == null){
            holder = new OtdAdapter.ViewHolder();
            v = LInflater.inflate(R.layout.listitem_otd, parent, false);
            holder.adress = (TextView) v.findViewById(R.id.adress);
            holder.sost = (TextView) v.findViewById(R.id.sost);
            holder.rasp = ((TextView) v.findViewById(R.id.rasp));
            v.setTag(holder);
        }



        holder = (OtdAdapter.ViewHolder) v.getTag();
        DataOtd dataOtds = getData(position);

        holder.adress.setText(v.getResources().getString(dataOtds.getAdresID()));
        holder.sost.setText(v.getResources().getString(dataOtds.getSostID()));
        holder.rasp.setText(v.getResources().getString(dataOtds.getRaspID()));

        return v;
    }


    DataOtd getData(int position){
        return (getItem(position));
    }


    private static class ViewHolder {
        private TextView adress;
        private TextView sost;
        private TextView rasp;
    }
}
