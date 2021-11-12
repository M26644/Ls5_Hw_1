package com.example.ls5_hw_1;



import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BookDB extends SQLiteOpenHelper {

    public static String TB_SACH = "TENSACH";


    public static String TB_SACH_MASACH = "MASACH";



    public BookDB(Context context) {
        super(context, "Book", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String tbSACH = "CREATE TABLE " + TB_SACH + " ( " + TB_SACH_MASACH + " INTEGER PRIMARY KEY AUTOINCREMENT )";


        db.execSQL(tbSACH);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public SQLiteDatabase open(){
        return this.getWritableDatabase();
    }
}
