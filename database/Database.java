package nl.topicus;


import java.io.File;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Database {
	
	private SQLiteDatabase db;
    private DatabaseHelper dbHelper;
    
    private final Context mCtx;
    
    private static final String DATABASE_NAME = "komiktelaat";
    private static final int DATABASE_VERSION = 2;
	
	
	private static final String DATABASE_REIS =
	        "create table reis (reisid integer primary key autoincrement, "
	        + "beginlocatie integer not null, " //<-- Foreign key(beginlocatie == locatieid)
	        + "eindlocatie integer not null, " //<-- Foreign key(eindlocatie == locatieid)
	        + "voertuigid integer not null, " //<-- Foreign key
	        + "wasoptijd integer);"; //<-- Boolean(One does not simply create a boolean in Sqllite3)

	private static final String DATABASE_LOCATIE =
			"create table locatie (locatieid integer primary key autoincrement, "
			+ "naam text not null, "
			+ "lat text not null, "
			+ "long text not null);";
	
	private static final String DATABASE_VOERTUIG = 
			"create table voertuig (voertuigid integer primary key autoincrement, "
			+ "name text not null, "
			+ "snelheid integer, "
			+ "isfavoriet integer);"; //<--Boolean
	
	
	public Database(Context ctx){
		this.mCtx = ctx;
	}
	
	public Database open() throws SQLException {
        dbHelper = new DatabaseHelper(mCtx);
        setDb(dbHelper.getWritableDatabase());
        return this;
    }
	
	public void Close() {
		dbHelper.close();
	}
	
	public boolean checkDataBase() {
		File dbtest = new File("/data/data/nl.topicus/databases/komiktelaat");
		if(dbtest.exists()){
		  return true;    
		}
		else{
		  return false;
		}
	}
	
	public SQLiteDatabase getDb() {
		return db;
	}

	public void setDb(SQLiteDatabase db) {
		this.db = db;
	}

	private static class DatabaseHelper extends SQLiteOpenHelper {

		DatabaseHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

		@Override
		public void onCreate(SQLiteDatabase db) {
			db.execSQL(DATABASE_LOCATIE);
			db.execSQL(DATABASE_REIS);
			db.execSQL(DATABASE_VOERTUIG);
		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
}
