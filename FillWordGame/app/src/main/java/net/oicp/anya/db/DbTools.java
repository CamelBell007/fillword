package net.oicp.anya.db;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.util.HashMap;
import java.util.LinkedList;
import net.oicp.anya.model.PuzzleInfo;
import net.oicp.anya.tools.Tools;

public class DbTools
{
  public static final String BOOKMARK_TABLE = "bookmark";
  private static final String DATABASE_NAME = "yyPuzzle.db";
  private static final int DATABASE_VERSION = 1;
  public static final String HISTORY_TABLE = "history";
  private static SQLiteDatabase db = null;
  
  /* Error */
  public static int getAnswerCnt(int paramInt)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: getstatic 23	net/oicp/anya/db/DbTools:db	Landroid/database/sqlite/SQLiteDatabase;
    //   5: new 32	java/lang/StringBuilder
    //   8: dup
    //   9: ldc 34
    //   11: invokespecial 37	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   14: iload_0
    //   15: invokevirtual 41	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   18: ldc 43
    //   20: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   23: invokevirtual 50	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   26: aconst_null
    //   27: invokevirtual 56	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   30: astore_2
    //   31: ldc 58
    //   33: new 32	java/lang/StringBuilder
    //   36: dup
    //   37: ldc 60
    //   39: invokespecial 37	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   42: aload_2
    //   43: invokeinterface 66 1 0
    //   48: invokevirtual 41	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   51: ldc 68
    //   53: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   56: aload_2
    //   57: invokeinterface 71 1 0
    //   62: invokevirtual 41	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   65: invokevirtual 50	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   68: invokestatic 77	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   71: pop
    //   72: aload_2
    //   73: invokeinterface 81 1 0
    //   78: istore 6
    //   80: iload 6
    //   82: ifne +11 -> 93
    //   85: aload_2
    //   86: invokeinterface 84 1 0
    //   91: iload_1
    //   92: ireturn
    //   93: aload_2
    //   94: iconst_0
    //   95: invokeinterface 87 2 0
    //   100: istore_1
    //   101: ldc 58
    //   103: new 32	java/lang/StringBuilder
    //   106: dup
    //   107: ldc 89
    //   109: invokespecial 37	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   112: iload_1
    //   113: invokevirtual 41	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   116: invokevirtual 50	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   119: invokestatic 77	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   122: pop
    //   123: goto -51 -> 72
    //   126: astore 4
    //   128: aload 4
    //   130: invokevirtual 92	java/lang/Exception:printStackTrace	()V
    //   133: aload_2
    //   134: invokeinterface 84 1 0
    //   139: iload_1
    //   140: ireturn
    //   141: astore_3
    //   142: aload_2
    //   143: invokeinterface 84 1 0
    //   148: aload_3
    //   149: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	150	0	paramInt	int
    //   1	139	1	i	int
    //   30	113	2	localCursor	Cursor
    //   141	8	3	localObject	Object
    //   126	3	4	localException	Exception
    //   78	3	6	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   31	72	126	java/lang/Exception
    //   72	80	126	java/lang/Exception
    //   93	123	126	java/lang/Exception
    //   31	72	141	finally
    //   72	80	141	finally
    //   93	123	141	finally
    //   128	133	141	finally
  }
  
  public static LinkedList<PuzzleInfo> getBookmarks()
  {
    return new LinkedList();
  }
  
  public static int getBookmarksNum()
  {
    String[] arrayOfString = { "fileName", "MarkPlace", "ReadTime" };
    Cursor localCursor = db.query("bookmark", arrayOfString, null, null, null, null, null);
    int i = localCursor.getCount();
    Log.d("DbTools", "Total bookmarks:" + i);
    localCursor.close();
    return i;
  }
  
  /* Error */
  public static int getHintCnt(int paramInt)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: getstatic 23	net/oicp/anya/db/DbTools:db	Landroid/database/sqlite/SQLiteDatabase;
    //   5: new 32	java/lang/StringBuilder
    //   8: dup
    //   9: ldc 115
    //   11: invokespecial 37	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   14: iload_0
    //   15: invokevirtual 41	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   18: ldc 43
    //   20: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   23: invokevirtual 50	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   26: aconst_null
    //   27: invokevirtual 56	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   30: astore_2
    //   31: aload_2
    //   32: invokeinterface 66 1 0
    //   37: istore 5
    //   39: iconst_0
    //   40: istore_1
    //   41: iload 5
    //   43: ifgt +115 -> 158
    //   46: new 32	java/lang/StringBuilder
    //   49: dup
    //   50: ldc 117
    //   52: invokespecial 37	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   55: iload_0
    //   56: invokevirtual 41	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   59: ldc 119
    //   61: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   64: invokevirtual 50	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   67: astore 6
    //   69: getstatic 23	net/oicp/anya/db/DbTools:db	Landroid/database/sqlite/SQLiteDatabase;
    //   72: aload 6
    //   74: invokevirtual 122	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   77: bipush 10
    //   79: istore_1
    //   80: ldc 58
    //   82: new 32	java/lang/StringBuilder
    //   85: dup
    //   86: ldc 124
    //   88: invokespecial 37	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   91: iload_0
    //   92: invokevirtual 41	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   95: ldc 126
    //   97: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: iload_1
    //   101: invokevirtual 41	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   104: invokevirtual 50	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   107: invokestatic 77	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   110: pop
    //   111: aload_2
    //   112: invokeinterface 84 1 0
    //   117: iload_1
    //   118: ireturn
    //   119: aload_2
    //   120: iconst_0
    //   121: invokeinterface 87 2 0
    //   126: istore_1
    //   127: ldc 58
    //   129: new 32	java/lang/StringBuilder
    //   132: dup
    //   133: ldc 124
    //   135: invokespecial 37	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   138: iload_0
    //   139: invokevirtual 41	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   142: ldc -128
    //   144: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   147: iload_1
    //   148: invokevirtual 41	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   151: invokevirtual 50	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   154: invokestatic 77	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   157: pop
    //   158: aload_2
    //   159: invokeinterface 81 1 0
    //   164: istore 8
    //   166: iload 8
    //   168: ifne -49 -> 119
    //   171: goto -60 -> 111
    //   174: astore 4
    //   176: aload 4
    //   178: invokevirtual 92	java/lang/Exception:printStackTrace	()V
    //   181: aload_2
    //   182: invokeinterface 84 1 0
    //   187: iload_1
    //   188: ireturn
    //   189: astore_3
    //   190: aload_2
    //   191: invokeinterface 84 1 0
    //   196: aload_3
    //   197: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	198	0	paramInt	int
    //   1	187	1	i	int
    //   30	161	2	localCursor	Cursor
    //   189	8	3	localObject	Object
    //   174	3	4	localException	Exception
    //   37	5	5	j	int
    //   67	6	6	str	String
    //   164	3	8	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   31	39	174	java/lang/Exception
    //   46	77	174	java/lang/Exception
    //   80	111	174	java/lang/Exception
    //   119	158	174	java/lang/Exception
    //   158	166	174	java/lang/Exception
    //   31	39	189	finally
    //   46	77	189	finally
    //   80	111	189	finally
    //   119	158	189	finally
    //   158	166	189	finally
    //   176	181	189	finally
  }
  
  public static LinkedList<PuzzleInfo> getHistory()
  {
    LinkedList localLinkedList = new LinkedList();
    new String[] { "SerialNumber", "Percent", "ReadTime" };
    Cursor localCursor = db.rawQuery("select d.HintChar,b.SerialNumber,count(b.SerialNumber) as allCnt from puzzles b,hints d where b.SerialNumber=d.SerialNumber group by b.SerialNumber;", null);
    Log.d("DbTools", "Total puzzles:" + localCursor.getCount() + ",cusor pos:" + localCursor.getPosition());
    for (;;)
    {
      if (!localCursor.moveToNext()) {
        return localLinkedList;
      }
      String str = localCursor.getString(0);
      int i = localCursor.getInt(1);
      int j = localCursor.getInt(2);
      Log.d("DbTools", "history-puzzle name:" + str + ",serial:" + i + ",all number:" + j);
    }
  }
  
  public static int getHistoryBookReadPos(String paramString)
  {
    String[] arrayOfString = { paramString };
    Cursor localCursor = db.rawQuery("SELECT MarkPlace from history WHERE fileName=?", arrayOfString);
    boolean bool = localCursor.moveToNext();
    int i = 0;
    if (bool) {
      i = localCursor.getInt(0);
    }
    Log.d("DbTools", "Total readed book[" + paramString + "]'sr position:" + i);
    return i;
  }
  
  public static int getHistoryNum()
  {
    String[] arrayOfString = { "fileName", "MarkPlace", "ReadTime" };
    Cursor localCursor = db.query("history", arrayOfString, null, null, null, null, null);
    Log.d("DbTools", "Total readed books:" + localCursor.getCount() + ",cusor pos:" + localCursor.getPosition());
    return localCursor.getCount();
  }
  
  public static HashMap<Integer, String> getPuzzle(int paramInt)
  {
    HashMap localHashMap = new HashMap();
    String[] arrayOfString1 = { "Position", "PuzChar" };
    String[] arrayOfString2 = new String[1];
    arrayOfString2[0] = String.valueOf(paramInt);
    Cursor localCursor = db.query("puzzles", arrayOfString1, "SerialNumber=?", arrayOfString2, null, null, "Position");
    Log.d("DbTools", "Total puzzles:" + localCursor.getCount() + ",cusor pos:" + localCursor.getPosition());
    for (;;)
    {
      if (!localCursor.moveToNext()) {
        return localHashMap;
      }
      int i = localCursor.getInt(0);
      String str = localCursor.getString(1);
      Log.d("DbTools", "position:" + i + ",puzzle char:" + str);
      localHashMap.put(Integer.valueOf(i), str);
    }
  }
  
  /* Error */
  public static HashMap<Integer, String> getPuzzleAnswer(int paramInt)
  {
    // Byte code:
    //   0: new 160	java/util/HashMap
    //   3: dup
    //   4: invokespecial 161	java/util/HashMap:<init>	()V
    //   7: astore_1
    //   8: iconst_2
    //   9: anewarray 100	java/lang/String
    //   12: dup
    //   13: iconst_0
    //   14: ldc -93
    //   16: aastore
    //   17: dup
    //   18: iconst_1
    //   19: ldc -68
    //   21: aastore
    //   22: astore_2
    //   23: iconst_1
    //   24: anewarray 100	java/lang/String
    //   27: astore_3
    //   28: aload_3
    //   29: iconst_0
    //   30: iload_0
    //   31: invokestatic 168	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   34: aastore
    //   35: getstatic 23	net/oicp/anya/db/DbTools:db	Landroid/database/sqlite/SQLiteDatabase;
    //   38: ldc -66
    //   40: aload_2
    //   41: ldc -84
    //   43: aload_3
    //   44: aconst_null
    //   45: aconst_null
    //   46: ldc -93
    //   48: invokevirtual 110	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   51: astore 4
    //   53: ldc 58
    //   55: new 32	java/lang/StringBuilder
    //   58: dup
    //   59: ldc 60
    //   61: invokespecial 37	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   64: aload 4
    //   66: invokeinterface 66 1 0
    //   71: invokevirtual 41	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   74: ldc 68
    //   76: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   79: aload 4
    //   81: invokeinterface 71 1 0
    //   86: invokevirtual 41	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   89: invokevirtual 50	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   92: invokestatic 77	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   95: pop
    //   96: aload 4
    //   98: invokeinterface 81 1 0
    //   103: istore 8
    //   105: iload 8
    //   107: ifne +12 -> 119
    //   110: aload 4
    //   112: invokeinterface 84 1 0
    //   117: aload_1
    //   118: areturn
    //   119: aload 4
    //   121: iconst_0
    //   122: invokeinterface 87 2 0
    //   127: istore 9
    //   129: aload 4
    //   131: iconst_1
    //   132: invokeinterface 139 2 0
    //   137: astore 10
    //   139: ldc 58
    //   141: new 32	java/lang/StringBuilder
    //   144: dup
    //   145: ldc -82
    //   147: invokespecial 37	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   150: iload 9
    //   152: invokevirtual 41	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   155: ldc -64
    //   157: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   160: aload 10
    //   162: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   165: invokevirtual 50	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   168: invokestatic 77	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   171: pop
    //   172: aload_1
    //   173: iload 9
    //   175: invokestatic 181	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   178: aload 10
    //   180: invokevirtual 185	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   183: pop
    //   184: goto -88 -> 96
    //   187: astore 6
    //   189: aload 6
    //   191: invokevirtual 92	java/lang/Exception:printStackTrace	()V
    //   194: aload 4
    //   196: invokeinterface 84 1 0
    //   201: aload_1
    //   202: areturn
    //   203: astore 5
    //   205: aload 4
    //   207: invokeinterface 84 1 0
    //   212: aload 5
    //   214: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	215	0	paramInt	int
    //   7	195	1	localHashMap	HashMap
    //   22	19	2	arrayOfString1	String[]
    //   27	17	3	arrayOfString2	String[]
    //   51	155	4	localCursor	Cursor
    //   203	10	5	localObject	Object
    //   187	3	6	localException	Exception
    //   103	3	8	bool	boolean
    //   127	47	9	i	int
    //   137	42	10	str	String
    // Exception table:
    //   from	to	target	type
    //   53	96	187	java/lang/Exception
    //   96	105	187	java/lang/Exception
    //   119	184	187	java/lang/Exception
    //   53	96	203	finally
    //   96	105	203	finally
    //   119	184	203	finally
    //   189	194	203	finally
  }
  
  public static void init(Context paramContext)
  {
    db = new DatabaseHelper(paramContext).getWritableDatabase();
  }
  
  public static void insertBookmark(String paramString, int paramInt)
  {
    String str = "INSERT INTO bookmark (FileName,MarkPlace,ReadTime) values('" + paramString + "'," + paramInt + ",'" + Tools.getCurrentTime() + "');";
    db.execSQL(str);
  }
  
  public static void insertPuzAnswer(int paramInt1, int paramInt2, String paramString)
  {
    String str1 = "DELETE FROM answer WHERE SerialNumber=" + paramInt1 + " AND Position=" + paramInt2 + ";";
    db.execSQL(str1);
    String str2 = "INSERT INTO answer (SerialNumber,Position,AnswerChar) values(" + paramInt1 + "," + paramInt2 + ",'" + paramString + "');";
    db.execSQL(str2);
  }
  
  public static void removeAllBookmark()
  {
    db.execSQL("DELETE FROM bookmark;");
  }
  
  public static void removeAllHistory()
  {
    db.execSQL("DELETE FROM history;");
  }
  
  public static void removeBookmark(String paramString)
  {
    String str = "DELETE FROM bookmark WHERE FileName='" + paramString + "';";
    db.execSQL(str);
  }
  
  public static void stopDb()
  {
    db.close();
  }
  
  public static void updateHintCnt(int paramInt1, int paramInt2)
  {
    String str = "UPDATE hintNum SET HintCnt=" + paramInt2 + " WHERE SerialNumber=" + paramInt1 + ";";
    db.execSQL(str);
  }
  
  private static class DatabaseHelper
    extends SQLiteOpenHelper
  {
    DatabaseHelper(Context paramContext)
    {
      super("yyPuzzle.db", null, 1);
    }
    
    public void onCreate(SQLiteDatabase paramSQLiteDatabase)
    {
      paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS answer (SerialNumber int,Position int,AnswerChar CHAR(4));");
      paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS hintNum (SerialNumber int,HintCnt int);");
    }
    
    public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {}
  }
}


/* Location:              E:\反编译工程\反编译工具包\反编译工具包\dex2jar-0.0.9.15\dex2jar-0.0.9.15\项目APP\填字游戏 1.8\_dex2jar.jar!\net\oicp\anya\db\DbTools.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */