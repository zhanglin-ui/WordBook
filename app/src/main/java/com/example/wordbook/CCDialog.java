package com.example.wordbook;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.litepal.LitePal;

public class CCDialog extends Dialog {
    public CCDialog(Context context){
        super(context);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        View view= View.inflate(getContext(),R.layout.delete_dialog,null);
        setContentView(view);
        Button delete1=(Button)findViewById(R.id.delete1);
        Button delete2=(Button)findViewById(R.id.delete2);
        delete1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LitePal.deleteAll(Word.class);
                dismiss();
            }
        });
        delete2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                CCDialog.super.cancel();
            }
        });

    }
}
