package com.example.wordbook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.List;

public class ListAdapter1 extends BaseAdapter<Word> {
    List<Word> list;
    int id ;

    public ListAdapter1(@NonNull Context context, int resource,List<Word> list) {
        super(context, resource);
        this.list=list;
        this.id=resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view= LayoutInflater.from(getContext()).inflate(id,parent,false);
        Word word = list.get(position);
        TextView tv1=(TextView) view.findViewById(R.id.tv1);
        TextView tv2=(TextView) view.findViewById(R.id.tv2);
        TextView tv3=(TextView) view.findViewById(R.id.tv3);
        tv1.setText(word.getName());
        tv2.setText(word.getShiyi());
        tv3.setText(word.getLiju());
        Toast.makeText(getContext(),"ganniniang",Toast.LENGTH_SHORT).show();
        return view;
    }
}
