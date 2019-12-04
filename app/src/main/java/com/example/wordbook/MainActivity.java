package com.example.wordbook;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
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
        init();
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
                aa.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public void onDismiss(DialogInterface dialog) {
                       init();
                    }
                });
                break;
            case R.id.cz:
                BBDialog bb=new BBDialog(this);bb.show();
                init();
                break;
            case R.id.delete:
                CCDialog cc=new CCDialog(this);cc.show();
                break;
            case R.id.refresh:
                init();
                break;
            case R.id.bz:
                new AlertDialog.Builder(MainActivity.this).setTitle("帮助").setMessage("这里是帮助").show();
                break;
        }
        return true;
    }

    private  void init(){
        final List<Word> word= LitePal.findAll(Word.class);
        final LIstAdapter lIstAdapter=new LIstAdapter(MainActivity.this,R.layout.listview_main,word);
        final ListView lv=(ListView)findViewById(R.id.lv);
        lv.setAdapter(lIstAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                DDDialog dd=new DDDialog(MainActivity.this,(Word) parent.getItemAtPosition(position));
                dd.show();
            }
        });
    }
}
