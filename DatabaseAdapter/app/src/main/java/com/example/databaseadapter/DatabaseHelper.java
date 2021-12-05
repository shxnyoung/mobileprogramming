package com.example.databaseadapter;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "my.db";
    private static final int DATABASE_VERSION = 2;

    public DatabaseHelper (Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE contacts (_id INTEGER PRIMARY KEY" +
                " Autoincrement, name TEXT, tel TEXT);");

        for (int i=0; i<10; i++) {
            db.execSQL("INSERT INTO contacts VALUES (null, " + "'김철수 " + i +
                    "'" + ", '010-1234-100" + i + "');");
        }
    }

    public void onUpgrade(SQLiteDatabase db, int ondVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS contacts");
        onCreate(db);
    }
}