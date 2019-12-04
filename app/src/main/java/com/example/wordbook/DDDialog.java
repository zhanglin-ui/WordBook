package com.example.wordbook;

import android.app.Dialog;
import android.content.Context;
import android.icu.text.Transliterator;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TextView;

import org.litepal.LitePal;
import org.litepal.crud.LitePalSupport;
import org.w3c.dom.Text;

import java.util.List;

public class DDDialog extends Dialog{
    Word word=null;
    public DDDialog(Context context,Word word1){
        super(context);
        word=word1;
    }
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        View view= View.inflate(getContext(),R.layout.list_click,null);
        setContentView(view);
        TextView tv11=(TextView)findViewById(R.id.tv11);
        TextView tv12=(TextView)findViewById(R.id.tv12);
        TextView tv13=(TextView)findViewById(R.id.tv13);
        tv11.setText(word.getName());
        tv12.setText(word.getShiyi());
        tv13.setText(word.getLiju());
        Button bt11=(Button)findViewById(R.id.bu11);
        Button bt12=(Button)findViewById(R.id.bt12);
        bt11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                EEDialog ee=new EEDialog(getContext(),word);
                ee.show();
                dismiss();
            }
        });
        bt12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                LitePal.delete(Word.class,word.delete());
                dismiss();
            }
        });
    }
}
