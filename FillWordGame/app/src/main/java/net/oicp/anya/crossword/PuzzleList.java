package net.oicp.anya.crossword;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import net.oicp.anya.ExtendAdapter;
import net.oicp.anya.Utils;
import net.oicp.anya.db.DbTools;
import net.oicp.anya.model.PuzzleInfo;
import net.oicp.anya.tools.GenCrossWord;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class PuzzleList
  extends Activity
  implements OnItemClickListener
{
  private static final int DIALOG1_KEY = 0;
  private static final int DIALOG2_KEY = 1;
  int curByte = 0;
  private File currentDirectory = new File("/sdcard/puz");
  ListView itemlist = null;
  List<Map<String, Object>> list;
  LinkedList<PuzzleInfo> puzList = null;
  
  private void browseTo(File paramFile)
  {
    if (paramFile.isDirectory())
    {
      fill(paramFile.listFiles());
      return;
    }
    Bundle localBundle = new Bundle();
    Intent localIntent = new Intent(getApplicationContext(), Play.class);
    localIntent.putExtras(localBundle);
    setResult(-1, localIntent);
    finish();
  }
  
  private void fill(File[] paramArrayOfFile)
  {
    this.list = new LinkedList();
    int i = paramArrayOfFile.length;
    int j = 0;
    if (j >= i)
    {
      ExtendAdapter localExtendAdapter = new ExtendAdapter(this, this.list, 2130903046, new String[] { "name" }, new int[] { 2131165320 });
      this.itemlist.setAdapter(localExtendAdapter);
      this.itemlist.setOnItemClickListener(this);
      this.itemlist.setSelection(0);
      return;
    }
    File localFile = paramArrayOfFile[j];
    boolean bool1 = localFile.isDirectory();
    Map localMap = null;
    if (!bool1)
    {
      boolean bool2 = localFile.getAbsolutePath().toLowerCase().endsWith(".puz");
      localMap = null;
      if (bool2)
      {
        boolean bool3 = localFile.length() < 100L;
        localMap = null;
        if (bool3)
        {
          Object localObject = (byte[])null;
          try
          {
            byte[] arrayOfByte = Utils.getBytesFromFile(localFile, 11L);
            localObject = arrayOfByte;
          }
          catch (IOException localIOException)
          {
            for (;;)
            {
              localIOException.printStackTrace();
            }
            localMap = parseFile(localFile);
          }
          if (new String((byte[])localObject, 0, 11).equals("YY's puzzle")) {}
        }
      }
    }
    for (;;)
    {
      j++;
      break;
      this.list.add(localMap);
    }
  }
  
  private void fillPuzzles()
  {
    if (this.puzList == null) {
      this.puzList = getPuzList();
    }
    this.list = new LinkedList();
    Iterator localIterator = this.puzList.iterator();
    for (;;)
    {
      if (!localIterator.hasNext())
      {
        ExtendAdapter localExtendAdapter = new ExtendAdapter(this, this.list, 2130903046, new String[] { "percent", "puzzle_name", "percent" }, new int[] { 2131165319, 2131165320, 2131165321 });
        this.itemlist.setAdapter(localExtendAdapter);
        this.itemlist.setOnItemClickListener(this);
        this.itemlist.setSelection(0);
        return;
      }
      PuzzleInfo localPuzzleInfo = (PuzzleInfo)localIterator.next();
      HashMap localHashMap = new HashMap();
      localHashMap.put("puzzle_name", localPuzzleInfo.getPuzzleName());
      localHashMap.put("serial_number", Integer.valueOf(localPuzzleInfo.getSerialNum()));
      localHashMap.put("file_name", localPuzzleInfo.getFileName());
      localHashMap.put("percent", localPuzzleInfo.getCharCnt() + "%");
      this.list.add(localHashMap);
    }
  }
  
  private LinkedList<PuzzleInfo> getPuzList()
  {
    LinkedList localLinkedList = new LinkedList();
    int i;
    int j;
    try
    {
      arrayOfFile = this.currentDirectory.listFiles();
      i = arrayOfFile.length;
      j = 0;
    }
    catch (Exception localException)
    {
      File[] arrayOfFile;
      localException.printStackTrace();
      return localLinkedList;
    }
    File localFile = arrayOfFile[j];
    if ((!localFile.getPath().endsWith(".puz")) || (localFile.length() < 100L))
    {
      Toast.makeText(null, 2131034117, 0).show();
      return localLinkedList;
    }
    byte[] arrayOfByte = Utils.getBytesFromFile(localFile, localFile.length());
    String str1 = new String(arrayOfByte, 0, 11);
    if (!str1.equals("YY's puzzle"))
    {
      Toast.makeText(null, 2131034117, 0).show();
      return localLinkedList;
    }
    System.out.println("file name:" + localFile.getPath());
    int k = arrayOfByte[14] + (arrayOfByte[13] << 8) + (arrayOfByte[12] << 16) + (arrayOfByte[11] << 24);
    if (k > Utils.LAST_PUZZLE_SERIAL) {
      Utils.LAST_PUZZLE_SERIAL = k;
    }
    System.out.println("serail number:" + k);
    PrintStream localPrintStream1 = System.out;
    StringBuilder localStringBuilder1 = new StringBuilder("version:");
    int m = 15 + 1;
    localPrintStream1.println(arrayOfByte[15]);
    PrintStream localPrintStream2 = System.out;
    StringBuilder localStringBuilder2 = new StringBuilder("column:");
    int n = m + 1;
    localPrintStream2.println(arrayOfByte[m]);
    PrintStream localPrintStream3 = System.out;
    StringBuilder localStringBuilder3 = new StringBuilder("row:");
    int i1 = n + 1;
    localPrintStream3.println(arrayOfByte[n]);
    int i2 = i1;
    int i3 = 0;
    int i4 = 0;
    for (;;)
    {
      int i7 = arrayOfByte.length;
      if (i6 >= i7) {}
      for (;;)
      {
        int i9 = DbTools.getAnswerCnt(k);
        String str3 = localFile.getAbsolutePath();
        int i10 = i9 * 100 / i4;
        PuzzleInfo localPuzzleInfo = new PuzzleInfo(str3, str2, k, i10);
        localLinkedList.add(localPuzzleInfo);
        j++;
        break label480;
        if (arrayOfByte[i2] != 0) {
          break label520;
        }
        i2++;
        break label514;
        if (arrayOfByte[i6] != 0) {
          break;
        }
        int i8 = i6 - i5;
        str2 = new String(arrayOfByte, i5, i8, "gbk");
      }
      i6++;
      continue;
      label480:
      if (j < i) {
        break;
      }
      return localLinkedList;
      label489:
      if (i3 < 100) {
        break label518;
      }
      int i5 = i2 + 2;
      String str2 = "";
      int i6 = i5;
    }
    for (;;)
    {
      label514:
      i3++;
      break label489;
      label518:
      break;
      label520:
      i4++;
      i2 += 2;
    }
  }
  
  private Map<String, Object> parseFile(File paramFile)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("name", paramFile.getName());
    localHashMap.put("path", paramFile.getPath());
    return localHashMap;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903045);
    setTitle(2131034122);
    this.itemlist = ((ListView)findViewById(2131165317));
    this.itemlist.setCacheColorHint(0);
    if (!this.currentDirectory.exists())
    {
      this.currentDirectory.mkdir();
      GenCrossWord.genAllCrossword();
    }
    if (!new File(this.currentDirectory.getAbsoluteFile() + "/20.puz").exists()) {
      GenCrossWord.genCrossword1120();
    }
    if (!new File(this.currentDirectory.getAbsoluteFile() + "/30.puz").exists()) {
      GenCrossWord.genCrossword2130();
    }
    DbTools.init(getApplicationContext());
    fillPuzzles();
  }
  
  protected Dialog onCreateDialog(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 0: 
      ProgressDialog localProgressDialog2 = new ProgressDialog(this);
      localProgressDialog2.setTitle("Indeterminate");
      localProgressDialog2.setMessage(getString(2131034135));
      localProgressDialog2.setIndeterminate(true);
      localProgressDialog2.setCancelable(true);
      return localProgressDialog2;
    }
    ProgressDialog localProgressDialog1 = new ProgressDialog(this);
    localProgressDialog1.setMessage(getString(2131034135));
    localProgressDialog1.setIndeterminate(true);
    localProgressDialog1.setCancelable(true);
    return localProgressDialog1;
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    super.onCreateOptionsMenu(paramMenu);
    getMenuInflater().inflate(2131099648, paramMenu);
    return true;
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    Log.d("PuzzleList", "item clicked! [" + paramInt + "]" + ",list size:" + this.list.size());
    Integer localInteger = (Integer)((Map)this.list.get(paramInt)).get("serial_number");
    String str = (String)((Map)this.list.get(paramInt)).get("file_name");
    Bundle localBundle = new Bundle();
    localBundle.putInt("serial_number", localInteger.intValue());
    localBundle.putString("file_name", str);
    Intent localIntent = new Intent(getApplicationContext(), Play.class);
    localIntent.putExtras(localBundle);
    startActivity(localIntent);
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    default: 
      if (!paramMenuItem.hasSubMenu()) {
        return true;
      }
      break;
    case 2131165332: 
      startActivity(new Intent(getApplicationContext(), MailActivity.class));
      return true;
    case 2131165333: 
      finish();
    }
    for (;;)
    {
      return false;
      int i = Utils.freshPuzzles(getApplicationContext());
      Log.d("PuzzleList", "fresh puzzle count:" + i);
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    fillPuzzles();
  }
  
  private class DownloadFilesTask
    extends AsyncTask<String, Integer, Long>
  {
    private DownloadFilesTask() {}
    
    protected Long doInBackground(String... paramVarArgs)
    {
      try
      {
        HttpEntity localHttpEntity = new DefaultHttpClient().execute(new HttpGet(paramVarArgs[0])).getEntity();
        Long localLong = Long.valueOf(localHttpEntity.getContentLength());
        InputStream localInputStream = localHttpEntity.getContent();
        if (localInputStream != null)
        {
          ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
          byte[] arrayOfByte1 = new byte[''];
          int i = 0;
          for (;;)
          {
            int j = localInputStream.read(arrayOfByte1);
            if (j == -1)
            {
              byte[] arrayOfByte2 = localByteArrayOutputStream.toByteArray();
              Utils.writeBytes2File(new File("/sdcard/crossword.apk"), arrayOfByte2, arrayOfByte2.length);
              localInputStream.close();
              break;
            }
            localByteArrayOutputStream.write(arrayOfByte1, 0, j);
            i += j;
            if (localLong.longValue() > 0L)
            {
              Integer[] arrayOfInteger = new Integer[1];
              arrayOfInteger[0] = Integer.valueOf((int)(100.0F * (i / (float)localLong.longValue())));
              publishProgress(arrayOfInteger);
            }
          }
        }
        return localLong;
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        return null;
      }
    }
    
    protected void onPostExecute(Long paramLong)
    {
      super.onPostExecute(paramLong);
      PuzzleList.this.dismissDialog(1);
    }
    
    protected void onPreExecute()
    {
      super.onPreExecute();
      PuzzleList.this.showDialog(1);
    }
    
    protected void onProgressUpdate(Integer... paramVarArgs)
    {
      super.onProgressUpdate(paramVarArgs);
    }
  }
}


/* Location:              E:\反编译工程\反编译工具包\反编译工具包\dex2jar-0.0.9.15\dex2jar-0.0.9.15\项目APP\填字游戏 1.8\_dex2jar.jar!\net\oicp\anya\crossword\PuzzleList.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */