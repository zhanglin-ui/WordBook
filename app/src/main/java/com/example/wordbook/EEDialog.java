package com.example.wordbook;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EEDialog extends Dialog {
    Word word1=new Word();
    public EEDialog(Context context, Word word){
        super(context);
        this.word1=word;
    }
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        View view=View.inflate(getContext(),R.layout.update,null);
        setContentView(view);
        final EditText ed11=(EditText)findViewById(R.id.ed11);
        final EditText ed12=(EditText)findViewById(R.id.ed12);
        final EditText ed13=(EditText)findViewById(R.id.ed13);
        Button bt22=(Button)findViewById(R.id.bt22);
        Button bt21=(Button)findViewById(R.id.bt21);
        bt21.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                final String a= ed11.getText().toString();
                final String b= ed12.getText().toString();
                final String c= ed13.getText().toString();
                word1.setName(a);
                word1.setShiyi(b);
                word1.setLiju(c);
                word1.save();
                dismiss();
            }
        });
        bt22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });

    }
}
