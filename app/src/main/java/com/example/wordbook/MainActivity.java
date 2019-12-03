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
        List<Word> word= LitePal.findAll(Word.class);
        ListView lv=(ListView)findViewById(R.id.lv);
        LIstAdapter lIstAdapter=new LIstAdapter(MainActivity.this,R.layout.listview_main,word);
        lv.setAdapter( lIstAdapter);


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
                List<Word> word= LitePal.findAll(Word.class);
                LIstAdapter lIstAdapter=new LIstAdapter(MainActivity.this,R.layout.listview_main,word);
                ListView lv=(ListView)findViewById(R.id.lv);
                lv.setAdapter(lIstAdapter);
                break;
            case R.id.cz:
                BBDialog bb=new BBDialog(this);bb.show();
                List<Word> word1= LitePal.findAll(Word.class);
                LIstAdapter lIstAdapter1=new LIstAdapter(MainActivity.this,R.layout.listview_main,word1);
                ListView lv1=(ListView)findViewById(R.id.lv);
                lv1.setAdapter(lIstAdapter1);
                break;
            case R.id.delete:
                CCDialog cc=new CCDialog(this);cc.show();
                List<Word> word2= LitePal.findAll(Word.class);
                LIstAdapter lIstAdapter2=new LIstAdapter(MainActivity.this,R.layout.listview_main,word2);
                ListView lv2=(ListView)findViewById(R.id.lv);
                lv2.setAdapter(lIstAdapter2);
                break;
            default:break;
        }
        return true;
    }
}
