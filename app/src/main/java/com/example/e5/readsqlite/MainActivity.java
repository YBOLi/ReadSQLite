package com.example.e5.readsqlite;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                ContentResolver resolver =getContentResolver();
                Uri uri=Uri.parse("content://com.example.e5.sqlite.persondb/query");
                Cursor cursor=resolver.query(uri,null,null,null,null);
                while(cursor.moveToNext()){
                    int id=cursor.getInt(cursor.getColumnIndex("id"));
                    String name=cursor.getString(cursor.getColumnIndex("name"));
                    String number=cursor.getString(cursor.getColumnIndex("number"));
                    System.out.println("id"+id);
                    System.out.println("name"+name);
                    System.out.println("number"+number);


                }

                cursor.close();


    }
}
