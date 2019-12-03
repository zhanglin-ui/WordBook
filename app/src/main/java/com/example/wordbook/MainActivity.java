package com.example.wordbook;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import org.litepal.LitePal;
import org.litepal.crud.LitePalSupport;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity);
        LitePal.getDatabase();
        final List<Word> word= LitePal.findAll(Word.class);
        Log.d("this",String.valueOf(word.size()));
        ListView lv=(ListView)findViewById(R.id.lv);
        ListAdapter1 lIstAdapter=new ListAdapter1(MainActivity.this,R.layout.listview_main,word);
        lv.setAdapter(lIstAdapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.add,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.tj:
                AADialog aa=new AADialog(this); aa.show();
                LitePal.initialize(this);
                break;
            case R.id.cz:
                BBDialog bb=new BBDialog(this);bb.show();
                break;
                default:break;
        }
        return true;
    }
}
