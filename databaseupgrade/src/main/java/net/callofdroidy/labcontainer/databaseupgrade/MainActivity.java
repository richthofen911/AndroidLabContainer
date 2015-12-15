package net.callofdroidy.labcontainer.databaseupgrade;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MySQLiteHelper mySQLiteHelper = new MySQLiteHelper(this);

        SQLiteDatabase db = mySQLiteHelper.getWritableDatabase();


        ContentValues contentValues = new ContentValues();
        contentValues.put("title", "morning news");
        contentValues.put("content", "bad weather today");
        contentValues.put("time", "when I get up");

        db.insert("news", "morning news", contentValues);
    }
}
