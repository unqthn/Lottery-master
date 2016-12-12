package com.example.lottery;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.lottery.adapter.PreviousLottery;
import com.example.lottery.db.DatabaseHelper;
import com.example.lottery.model.PreviosImage;

import java.util.ArrayList;

public class CheckPreviousActivity extends AppCompatActivity {

    private DatabaseHelper mHelper;
    private SQLiteDatabase mDb;

    private ArrayList<PreviosImage> mImageList = new ArrayList<>();
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_previous);



        mHelper = new DatabaseHelper(this);
        mDb = mHelper.getWritableDatabase();
        mListView = (ListView) findViewById(R.id.listView);
        /*mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                /*FoodMenu foodMenu = FoodMenu.getInstance(FoodListActivity.this);
                Food food = foodMenu.getFoodList().get(i);

                Intent intent = new Intent(CheckPreviousActivity.this, PictureActivity.class);
                intent.putExtra("picture", "010959.jpg");

                intent.putExtra("name", food.name);
                intent.putExtra("picture", food.pictureFilename);

                startActivity(intent);
            }
        });*/


        Cursor cursor = mDb.query(DatabaseHelper.TABLE_NAME_HISTORY, null, null, null, null, null, null);////ค่า null คือดึงทุกคอลัมล์ใน TABLE นั้นๆ
        mImageList.clear();
        while (cursor.moveToNext()) {
            String name = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COL_NAME));
            String reward1 = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COL_REWARD1));
            String f3 = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COL_F3));
            String b3 = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COL_B3));
            String b2 = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COL_B2));

            PreviosImage contact = new PreviosImage(name, reward1, f3, b3, b2);
            mImageList.add(contact);
        }

        PreviousLottery adapter = new PreviousLottery(
                this,
                R.layout.list_item,
                mImageList

        );

        mListView.setAdapter(adapter);
    }
}
