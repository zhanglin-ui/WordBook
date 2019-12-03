package com.example.wordbook;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import org.litepal.crud.LitePalSupport;

public class Word  extends LitePalSupport{
    private String Name;
    private String Shiyi;
    private String Liju;
    public Word(){}

    public Word(String toString, CharSequence text, CharSequence text1) {
        this.Name=toString;
        this.Shiyi=toString;
        this.Liju=toString;
    }

    public String getName(){
        return Name;
    }
    public String getShiyi(){
        return Shiyi;
    }
    public String getLiju(){
        return Liju;
    }
    public void setName(String Name1){
        this.Name=Name1;
    }
    public void setShiyi(String Shiyi1){
        this.Shiyi=Shiyi1;
    }
    public void setLiju(String Luju1){
        this.Liju=Luju1;
    }
}
