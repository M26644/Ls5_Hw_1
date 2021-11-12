package com.example.ls5_hw_1;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class BookDAO {
    SQLiteDatabase database;

    public BookDAO(Context context){
        BookDB createDatabase = new BookDB(context);
        database = createDatabase.open();
    }

    public boolean ThemSach(String tenban){
        ContentValues contentValues = new ContentValues();
        contentValues.put(BookDB.TB_SACH,tenban);


        long kiemtra = database.insert(BookDB.TB_SACH,null,contentValues);
        if(kiemtra != 0){
            return true;
        }else{
            return false;
        }
    }
}
