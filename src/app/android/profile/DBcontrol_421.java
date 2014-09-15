package app.android.profile;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBcontrol_421 extends SQLiteOpenHelper {
	
	String strName, strnickname, strAge,strHeigth,strBlood,strEmail,strBirthday,strMottoLifestyle;
	
	private static final String DATABASE_NAME = "mydata55410421";
	private static final String TABLE_MEMBER = "members";
	private static final int DATABASE_VERSION = 1;

	public DBcontrol_421(Context context) {
		super(context,TABLE_MEMBER, null,DATABASE_VERSION);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL("CREATE TABLE " + TABLE_MEMBER
				+ "(MemberID INTEGER PRIMARY KEY AUTOINCREMENT,"
				+ " Name TEXT(100)," 
				+ " nickname TEXT(100)," 
				+ " Age TEXT(100),"
				+ " Height TEXT(100)," 
				+ " Blood_Group TEXT(100),"
				+ " Email TEXT(100)," 
				+ " Birthday TEXT(100)," 
				+ " Mottos_Lifestyle TEXT(100));");
		Log.d("CREATE TABLE", "Create Table Successfully");		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_MEMBER);
		onCreate(db);
	}
	public long InsertData(String strName, String strnickname, String strAge,
			String strHeigth,String strBlood,String strEmail,
			String strBirthday,String strMottoLifestyle) {
		try {
			SQLiteDatabase db;
			db = this.getWritableDatabase();
			ContentValues values = new ContentValues();
			values.put("Name", strName);
			values.put("nickname", strnickname);
			values.put("Age",strAge);
			values.put("Height", strHeigth);
			values.put("Blood_Group",strBlood);
			values.put("Email", strEmail);
			values.put("Birthday", strBirthday);
			values.put("Mottos_Lifestyle", strMottoLifestyle);
			
			long l = db.insert(TABLE_MEMBER, null, values);
			db.close();
			return l;
		} catch (Exception e) {
			return -1;
		}
	}

}
