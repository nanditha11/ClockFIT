/**
 * Created by Nanditha on 4/2/2016.
 */
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.*;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;
import android.util.Log;


public class dbdata extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    //SQLiteDatabase db;
    public String CREATE_QUERY = "CREATE TABLE"+ datab.tabinfo.TABLE_NAME+"("+datab.tabinfo.PLACE_NAME+" TEXT,"
            +datab.tabinfo.MONDAY+" TEXT,"+datab.tabinfo.TUESDAY+" TEXT,"+datab.tabinfo.WEDNESDAY+" TEXT,"
            +datab.tabinfo.THURSDAY+" TEXT,"+datab.tabinfo.FRIDAY+" TEXT,"+datab.tabinfo.SATURDAY+" TEXT,"+datab.tabinfo.SUNDAY+" TEXT);";

    public dbdata(Context context, String DATABASE_NAME, SQLiteDatabase.CursorFactory cursor,int version ) {
        super(context, datab.tabinfo.DATABASE_NAME, null, DATABASE_VERSION);
        Log.d("Database ops","DB created");
    }
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_QUERY);
        Log.d("Database ops", "TB created");
    }
    public void putinfo(dbdata dbd,String place,String mon, String tues,String wed, String thur, String fri, String sat, String sun){
        SQLiteDatabase sdb = dbd.getWritableDatabase();
        ContentValues cvs = new ContentValues();
        cvs.put(datab.tabinfo.PLACE_NAME,"PANTHER DINING HALL");
        cvs.put(datab.tabinfo.MONDAY,"7:30 AM - 9:00 PM");
        cvs.put(datab.tabinfo.TUESDAY,"7:30 AM - 9:00 PM");
        cvs.put(datab.tabinfo.WEDNESDAY,"7:30 AM - 9:00 PM");
        cvs.put(datab.tabinfo.THURSDAY,"7:30 AM - 9:00 PM");
        cvs.put(datab.tabinfo.FRIDAY,"7:30 AM - 9:00 PM");
        cvs.put(datab.tabinfo.SATURDAY,"7:30 AM - 9:00 PM");
        cvs.put(datab.tabinfo.SUNDAY,"7:30 AM - 9:00 PM");
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
        //db.execSQL(SQL_DELETE_ENTRIES);
        db.execSQL("DROP TABLE IF EXISTS " + datab.tabinfo.TABLE_NAME );
        onCreate(db);
    }
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }

}
