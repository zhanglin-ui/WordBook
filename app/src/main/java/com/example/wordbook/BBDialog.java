package com.example.wordbook;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import org.litepal.LitePal;

import java.util.List;

public class BBDialog extends Dialog {
    public BBDialog(Context context) {
        super(context);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        View view =View.inflate(getContext(),R.layout.select_main,null);
        setContentView(view);
        Button select=(Button)findViewById(R.id.select);
        final EditText et4=(EditText)findViewById(R.id.et4);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String t=et4.getText().toString();
                List<Word> words1=LitePal.where("Name like?","%"+t+"%").find(Word.class);
                if(words1.size()==0) System.out.println(00000);
                else{
                    LIstAdapter lIstAdapter=new LIstAdapter(getContext(),R.layout.listview_main,words1);
                    ListView lv2=(ListView)findViewById(R.id.lv2);
                    lv2.setAdapter(lIstAdapter);
                }
            }
        });
    }

}
