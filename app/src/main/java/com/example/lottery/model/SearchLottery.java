package com.example.lottery.model;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.lottery.db.DatabaseHelper;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by User on 03/12/59.
 */

public class SearchLottery {
    private static SearchLottery mInstance;
    private Context mContext;

    private DatabaseHelper mHelper;
    private SQLiteDatabase mDb;

    private ArrayList<Lottery> mLottery = new ArrayList<>();
    private Random mRandom = new Random();

    public static SearchLottery getInstance(Context context) {
        if (mInstance == null) {
            mInstance = new SearchLottery(context);
        }
        return mInstance;
    }

    private SearchLottery(Context context) {
        this.mContext = context;
    }

    public void loadFromDatabase() {
        mLottery.clear();

        mHelper = new DatabaseHelper(mContext);
        mDb = mHelper.getWritableDatabase();

        Cursor cursor = mDb.query(DatabaseHelper.TABLE_NAME_SEARCH, null, null, null, null, null, null);

        while (cursor.moveToNext()) {
            String number = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COL_NUMBER));
            String detail = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COL_DETAIL));

            Lottery lottery = new Lottery(number, detail);
            mLottery.add(lottery);
        }
        cursor.close();
        //mDb.close();
        //mHelper.close();
    }

    public ArrayList<Lottery> getFoodList() {
        return  mLottery;
    }

    public Lottery getSearchLottery(String num) {
        for(int i=0 ; i<mLottery.size() ; i++){
            if(num.equals(mLottery.get(i).number)){
                return mLottery.get(i);
            }
        }

       /* int randomIndex = mRandom.nextInt( mLottery.size());
        Lottery food =  mLottery.get(randomIndex);
*/
        //Log.i(TAG, food.name + ", " + food.pictureFilename);
        return null;
    }


}
