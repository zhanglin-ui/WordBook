package com.example.wordbook;

import android.app.Dialog;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class AADialog extends Dialog {
    public AADialog(Context context) {
        super(context);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        View view =View.inflate(getContext(),R.layout.add_main,null);
        setContentView(view);
        Button bt1=(Button)findViewById(R.id.bt1);
        final EditText et1=(EditText)findViewById(R.id.ed1);
        final EditText ed2=(EditText)findViewById(R.id.ed2);
        final EditText ed3=(EditText)findViewById(R.id.ed3);
        bt1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ListView lv=(ListView)findViewById(R.id.lv);
                String a=et1.getText().toString();
                String b=ed2.getText().toString();
                String c=ed3.getText().toString();
                Word word=new Word();
                word.setName(a);
                word.setShiyi(b);
                word.setLiju(c);
                word.save();
                AADialog.super.onBackPressed();
            }
        });
    }
}
