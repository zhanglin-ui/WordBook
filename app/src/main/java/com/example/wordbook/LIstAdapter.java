package com.example.wordbook;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import org.w3c.dom.Text;

import java.util.List;

public class LIstAdapter extends ArrayAdapter{
    private int resouceId;
    private List<Word> list;

    public LIstAdapter(@NonNull Context context, int resource,List<Word> list) {
        super(context, resource);
        resouceId=resource;
        this.list=list;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Word word=list.get(position);
//        View view= LayoutInflater.from(getContext()).inflate(resouceId,parent,false);
        View view = LayoutInflater.from(getContext()).inflate(resouceId,parent,false);
        TextView tv1=(TextView)view.findViewById(R.id.tv1);
        TextView tv2=(TextView)view.findViewById(R.id.tv2);
        TextView tv3=(TextView)view.findViewById(R.id.tv3);
        Log.d("list","add");
        tv1.setText("gan ni niang");
        tv2.setText(word.getShiyi());
        tv3.setText(word.getLiju());
        return view;
    }
}
