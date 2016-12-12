package com.example.lottery.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "check_lotterry.db";
    private static final int DATABASE_VERSION = 1;

    public static final String TABLE_NAME_SEARCH = "lottery";
    public static final String COL_ID_SEARCH = "_id";
    public static final String COL_NUMBER = "number";
    public static final String COL_DETAIL = "detail";

    public static final String TABLE_NAME_HISTORY = "history";
    public static final String COL_ID_HISTORY = "_id";
    public static final String COL_NAME = "name";
    public static final String COL_REWARD1 = "reward1";
    public static final String COL_F3 = "first3";
    public static final String COL_B3 = "back3";
    public static final String COL_B2 = "back2";

    private static final String SQL_CRATE_TABLE_SEARCH =
            "CREATE TABLE " + TABLE_NAME_SEARCH + "("
                    + COL_ID_SEARCH + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + COL_NUMBER + " TEXT, "
                    + COL_DETAIL + " TEXT"
                    + ")";

    private static final String SQL_CRATE_TABLE_IMAGE =
            "CREATE TABLE " + TABLE_NAME_HISTORY + "("
                    + COL_ID_HISTORY + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + COL_NAME + " TEXT, "
                    + COL_REWARD1 + " TEXT, "
                    + COL_F3 + " TEXT,"
                    + COL_B3 + " TEXT,"
                    + COL_B2 + " TEXT"
                    + ")";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CRATE_TABLE_SEARCH);
        insertInitialData(db);

        db.execSQL(SQL_CRATE_TABLE_IMAGE);
        insertInitialData1(db);
    }

    private void insertInitialData1(SQLiteDatabase db) {
        ContentValues cv = new ContentValues();

        cv.put(COL_NAME, "งวดประจำวันที่ 16 พฤศจิกายน 2559");
        cv.put(COL_REWARD1, "858383");
        cv.put(COL_F3, "040 682");
        cv.put(COL_B3, "558 570");
        cv.put(COL_B2, "4 4");
        db.insert(TABLE_NAME_HISTORY, null, cv);

        cv.put(COL_NAME, "งวดประจำวันที่ 16 ตุลาคม 2559");
        cv.put(COL_REWARD1, "571947");
        cv.put(COL_F3, "692 885");
        cv.put(COL_B3, "032 587");
        cv.put(COL_B2, "9 8");
        db.insert(TABLE_NAME_HISTORY, null, cv);

        cv.put(COL_NAME, "งวดประจำวันที่ 16 กันยายน 2559");
        cv.put(COL_REWARD1, "240650");
        cv.put(COL_F3, "493 583");
        cv.put(COL_B3, "043 160");
        cv.put(COL_B2, "4 2");
        db.insert(TABLE_NAME_HISTORY, null, cv);

        cv.put(COL_NAME, "งวดประจำวันที่ 1 ธันวาคม 2559");
        cv.put(COL_REWARD1, "086069");
        cv.put(COL_F3, "513 873");
        cv.put(COL_B3, "148 450");
        cv.put(COL_B2, "7 7");
        db.insert(TABLE_NAME_HISTORY, null, cv);

        cv.put(COL_NAME, "งวดประจำวันที่ 1 พฤศจิกายน 2559");
        cv.put(COL_REWARD1, "785438");
        cv.put(COL_F3, "824 976");
        cv.put(COL_B3, "038 752");
        cv.put(COL_B2, "8 6");
        db.insert(TABLE_NAME_HISTORY, null, cv);

        cv.put(COL_NAME, "งวดประจำวันที่ 1 ตุลาคม 2559");
        cv.put(COL_REWARD1, "887102");
        cv.put(COL_F3, "194 280");
        cv.put(COL_B3, "017 458");
        cv.put(COL_B2, "3 3");
        db.insert(TABLE_NAME_HISTORY, null, cv);

        cv.put(COL_NAME, "งวดประจำวันที่ 1 กันยายน 2559");
        cv.put(COL_REWARD1, "638684");
        cv.put(COL_F3, "334 335");
        cv.put(COL_B3, "630 669");
        cv.put(COL_B2, "6 2");
        db.insert(TABLE_NAME_HISTORY, null, cv);







    }

    private void insertInitialData(SQLiteDatabase db) {
        ContentValues cv = new ContentValues();
        cv.put(COL_NUMBER, "086069");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 1");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "086068");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลข้างเคียงรางวัลที่ 1");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "086070");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลข้างเคียงรางวัลที่ 1");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "388271");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 2");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "527562");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 2");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "654690");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 2");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "926047");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 2");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "951015");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 2");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "102292");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 3");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "165201");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 3");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "306629");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 3");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "323395");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 3");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "367033");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 3");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "385644");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 3");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "509783");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 3");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "563907");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 3");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "788332");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 3");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "921065");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 3");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "004249");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "005922");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "040355");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "047865");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "050740");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "056581");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "094323");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "142773");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "159032");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "165297");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "176525");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "190659");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "205084");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "208885");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "209386");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "222495");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "276816");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "285184");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "290484");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "295729");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "297803");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "324210");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "330059");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "336389");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "391286");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "410942");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "416489");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "423597");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "472271");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "501971");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "548589");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "551747");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "556785");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "626805");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "637064");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "659264");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "660601");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "691436");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "741145");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "742479");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "776482");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "824558");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "838048");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "891086");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "909451");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "930445");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "935129");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "987480");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "991231");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "995441");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "004605");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "006909");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "009284");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "013121");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "020055");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "020482");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "025486");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "040083");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "049049");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "053212");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "057471");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "067848");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "087667");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "004605");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "087965");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "088888");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "110610");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "113935");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "115133");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "123788");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "136001");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "145772");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "153163");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "158875");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "158918");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "160854");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "192628");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "197772");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "204318");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "237885");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "245758");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "257909");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "263854");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "269748");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "287930");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "289803");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "291435");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "301452");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "308400");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "326214");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "370394");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "380336");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "387375");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "393186");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "397013");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "412740");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "413093");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "413544");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "420388");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "439183");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "451978");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "452725");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "456268");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "461315");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "466276");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "474169");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "488495");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "492346");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "494411");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "500021");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "510181");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "547045");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "549865");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "559232");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "566307");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "591314");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "621073");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "633000");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "643670");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "645352");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "650443");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "653863");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "658881");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "663207");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "669470");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "685205");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "686292");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "695573");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "699035");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "705001");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "728025");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "730290");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "797773");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "807276");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "809616");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "831464");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "840721");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "854898");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "862736");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "864538");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "866995");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "868936");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "872181");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "876556");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "877916");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "911946");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "948061");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "954743");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "958880");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "980746");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "997908");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
