package com.example.wordbook;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;

public class BBDialog extends Dialog {
    public BBDialog(Context context) {
        super(context);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        View view =View.inflate(getContext(),R.layout.select_main,null);
        setContentView(view);
    }

}
