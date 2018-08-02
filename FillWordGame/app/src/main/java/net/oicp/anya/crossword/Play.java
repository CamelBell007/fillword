package net.oicp.anya.crossword;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import net.oicp.anya.CrossEditText;
import net.oicp.anya.Observer;
import net.oicp.anya.Utils;
import net.oicp.anya.db.DbTools;
import net.oicp.anya.tools.SuccessView;

import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Play extends Activity implements Observer
{
  static final int PICK_HINT_REQUEST = 0;
  static int SCREEN_HEIGHT;
  private static int SCREEN_WIDTH;
  private TextWatcher contentWatcher = null;
  private Context ctx = null;
  private int curX;
  private int curY;
  CrossEditText[][] eds = (CrossEditText[][])Array.newInstance(CrossEditText.class, new int[] { 10, 10 });
  private String fileName;
  private List<ResolveInfo> mApps;
  HashMap<Integer, String> puz;
  private int serialNum;
  SuccessView viewSuccess;
  
  private boolean checkPuzFinished()
  {
    Iterator localIterator = this.puz.keySet().iterator();
    int i;
    int j;
    int k;
    do
    {
      if (!localIterator.hasNext()) {
        return true;
      }
      i = ((Integer)localIterator.next()).intValue();
      j = i / 10;
      k = i % 10;
      Log.d("Play", "check cell[" + j + "][" + k + "]");
    } while (((String)this.puz.get(Integer.valueOf(i))).equals(this.eds[j][k].getText().toString()));
    return false;
  }
  
  private void checkPuzzle()
  {
    int i = 0;
    if (i > 9)
    {
      Toast.makeText(this, "错误处显示为红色", 1).show();
      return;
    }
    for (int j = 0;; j++)
    {
      if (j > 9)
      {
        i++;
        break;
      }
      if ((this.eds[i][j].isUsed()) && (!this.eds[i][j].getText().toString().trim().equals("")))
      {
        int k = j + i * 10;
        String str = (String)this.puz.get(Integer.valueOf(k));
        if (!this.eds[i][j].getText().toString().equals(str)) {
          this.eds[i][j].setBackgroundColor(-65536);
        }
      }
    }
  }
  
  private HashMap<Integer, String> getPuzzle(String paramString)
  {
    HashMap localHashMap1 = new HashMap();
    File localFile;
    byte[] arrayOfByte;
    try
    {
      localFile = new File(paramString);
      if (localFile.length() < 100L)
      {
        Toast.makeText(this.ctx, 2131034117, 0).show();
        return localHashMap1;
      }
      arrayOfByte = Utils.getBytesFromFile(localFile, localFile.length());
      String str1 = new String(arrayOfByte, 0, 11);
      if (!str1.equals("YY's puzzle"))
      {
        Toast.makeText(this.ctx, 2131034117, 0).show();
        return localHashMap1;
      }
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      return localHashMap1;
    }
    int i = 11 + 1;
    int j = arrayOfByte[11] << 24;
    int k = i + 1;
    int m = j + (arrayOfByte[i] << 16);
    int n = k + 1;
    int i1 = m + (arrayOfByte[k] << 8);
    int i2 = n + 1;
    int i3 = i1 + arrayOfByte[n];
    System.out.println("serail number:" + i3);
    PrintStream localPrintStream1 = System.out;
    StringBuilder localStringBuilder1 = new StringBuilder("version:");
    int i4 = i2 + 1;
    localPrintStream1.println(arrayOfByte[i2]);
    PrintStream localPrintStream2 = System.out;
    StringBuilder localStringBuilder2 = new StringBuilder("column:");
    int i5 = i4 + 1;
    localPrintStream2.println(arrayOfByte[i4]);
    PrintStream localPrintStream3 = System.out;
    StringBuilder localStringBuilder3 = new StringBuilder("row:");
    int i6 = i5 + 1;
    localPrintStream3.println(arrayOfByte[i5]);
    int i7 = 0;
    int i8 = i6;
    int i9;
    label344:
    int i11;
    int i12;
    int i13;
    if (i7 >= 100)
    {
      Utils.horHints.clear();
      Utils.verHints.clear();
      i9 = i8;
      if (i9 >= localFile.length()) {
        break label555;
      }
      int i10 = i9 + 1;
      i11 = arrayOfByte[i9];
      i12 = i10 + 1;
      i13 = arrayOfByte[i10];
    }
    for (int i14 = i12;; i14++)
    {
      int i15;
      if (i14 >= localFile.length())
      {
        i15 = 0;
        break label557;
        if (arrayOfByte[i8] == 0)
        {
          i8++;
          break label589;
        }
        String str4 = new String(arrayOfByte, i8, 2, "gbk");
        localHashMap1.put(Integer.valueOf(i7), str4);
        i8 += 2;
        break label589;
      }
      else
      {
        if (arrayOfByte[i14] != 0) {
          continue;
        }
        i15 = i14;
        break label557;
        HashMap localHashMap3 = Utils.horHints;
        Integer localInteger2 = Integer.valueOf(i11);
        String str3 = new String(arrayOfByte, i12, i15 - i12, "gbk");
        localHashMap3.put(localInteger2, str3);
        break label580;
        HashMap localHashMap2 = Utils.verHints;
        Integer localInteger1 = Integer.valueOf(i11);
        String str2 = new String(arrayOfByte, i12, i15 - i12, "gbk");
        localHashMap2.put(localInteger1, str2);
        break label580;
        label555:
        return localHashMap1;
      }
      label557:
      switch (i13)
      {
      }
      label580:
      i9 = i15 + 1;
      break label344;
      label589:
      i7++;
      break;
    }
  }
  
  private void hintPuzzle()
  {
    int i = 0;
    int j = 0;
    if (j > 9) {}
    while (i != 0) {
      return;
    }
    label193:
    label205:
    for (int k = 0;; k++)
    {
      if (k > 9) {}
      for (;;)
      {
        j++;
        break;
        if ((!this.eds[j][k].isUsed()) || (!this.eds[j][k].getText().toString().trim().equals(""))) {
          break label205;
        }
        int m = DbTools.getHintCnt(this.serialNum);
        if (m <= 0) {
          break label193;
        }
        int n = k + j * 10;
        String str = (String)this.puz.get(Integer.valueOf(n));
        this.eds[j][k].setText(str);
        this.eds[j][k].setBackgroundColor(-16711681);
        DbTools.insertPuzAnswer(this.serialNum, n, str);
        int i1 = m - 1;
        Toast.makeText(this, "剩余提示次数：" + i1, 1).show();
        DbTools.updateHintCnt(this.serialNum, i1);
        i = 1;
      }
      Toast.makeText(this, 2131034129, 1).show();
      return;
    }
  }
  
  private void loadApps()
  {
    Intent localIntent = new Intent("android.intent.action.MAIN", null);
    int i = SCREEN_WIDTH / 10;
    this.eds[0][0] = ((CrossEditText)findViewById(2131165208));
    this.eds[0][1] = ((CrossEditText)findViewById(2131165209));
    this.eds[0][2] = ((CrossEditText)findViewById(2131165210));
    this.eds[0][3] = ((CrossEditText)findViewById(2131165211));
    this.eds[0][4] = ((CrossEditText)findViewById(2131165212));
    this.eds[0][5] = ((CrossEditText)findViewById(2131165213));
    this.eds[0][6] = ((CrossEditText)findViewById(2131165214));
    this.eds[0][7] = ((CrossEditText)findViewById(2131165215));
    this.eds[0][8] = ((CrossEditText)findViewById(2131165216));
    this.eds[0][9] = ((CrossEditText)findViewById(2131165217));
    this.eds[1][0] = ((CrossEditText)findViewById(2131165219));
    this.eds[1][1] = ((CrossEditText)findViewById(2131165220));
    this.eds[1][2] = ((CrossEditText)findViewById(2131165221));
    this.eds[1][3] = ((CrossEditText)findViewById(2131165222));
    this.eds[1][4] = ((CrossEditText)findViewById(2131165223));
    this.eds[1][5] = ((CrossEditText)findViewById(2131165224));
    this.eds[1][6] = ((CrossEditText)findViewById(2131165225));
    this.eds[1][7] = ((CrossEditText)findViewById(2131165226));
    this.eds[1][8] = ((CrossEditText)findViewById(2131165227));
    this.eds[1][9] = ((CrossEditText)findViewById(2131165228));
    this.eds[2][0] = ((CrossEditText)findViewById(2131165230));
    this.eds[2][1] = ((CrossEditText)findViewById(2131165231));
    this.eds[2][2] = ((CrossEditText)findViewById(2131165232));
    this.eds[2][3] = ((CrossEditText)findViewById(2131165233));
    this.eds[2][4] = ((CrossEditText)findViewById(2131165234));
    this.eds[2][5] = ((CrossEditText)findViewById(2131165235));
    this.eds[2][6] = ((CrossEditText)findViewById(2131165236));
    this.eds[2][7] = ((CrossEditText)findViewById(2131165237));
    this.eds[2][8] = ((CrossEditText)findViewById(2131165238));
    this.eds[2][9] = ((CrossEditText)findViewById(2131165239));
    this.eds[3][0] = ((CrossEditText)findViewById(2131165241));
    this.eds[3][1] = ((CrossEditText)findViewById(2131165242));
    this.eds[3][2] = ((CrossEditText)findViewById(2131165243));
    this.eds[3][3] = ((CrossEditText)findViewById(2131165244));
    this.eds[3][4] = ((CrossEditText)findViewById(2131165245));
    this.eds[3][5] = ((CrossEditText)findViewById(2131165246));
    this.eds[3][6] = ((CrossEditText)findViewById(2131165247));
    this.eds[3][7] = ((CrossEditText)findViewById(2131165248));
    this.eds[3][8] = ((CrossEditText)findViewById(2131165249));
    this.eds[3][9] = ((CrossEditText)findViewById(2131165250));
    this.eds[4][0] = ((CrossEditText)findViewById(2131165252));
    this.eds[4][1] = ((CrossEditText)findViewById(2131165253));
    this.eds[4][2] = ((CrossEditText)findViewById(2131165254));
    this.eds[4][3] = ((CrossEditText)findViewById(2131165255));
    this.eds[4][4] = ((CrossEditText)findViewById(2131165256));
    this.eds[4][5] = ((CrossEditText)findViewById(2131165257));
    this.eds[4][6] = ((CrossEditText)findViewById(2131165258));
    this.eds[4][7] = ((CrossEditText)findViewById(2131165259));
    this.eds[4][8] = ((CrossEditText)findViewById(2131165260));
    this.eds[4][9] = ((CrossEditText)findViewById(2131165261));
    this.eds[5][0] = ((CrossEditText)findViewById(2131165263));
    this.eds[5][1] = ((CrossEditText)findViewById(2131165264));
    this.eds[5][2] = ((CrossEditText)findViewById(2131165265));
    this.eds[5][3] = ((CrossEditText)findViewById(2131165266));
    this.eds[5][4] = ((CrossEditText)findViewById(2131165267));
    this.eds[5][5] = ((CrossEditText)findViewById(2131165268));
    this.eds[5][6] = ((CrossEditText)findViewById(2131165269));
    this.eds[5][7] = ((CrossEditText)findViewById(2131165270));
    this.eds[5][8] = ((CrossEditText)findViewById(2131165271));
    this.eds[5][9] = ((CrossEditText)findViewById(2131165272));
    this.eds[6][0] = ((CrossEditText)findViewById(2131165274));
    this.eds[6][1] = ((CrossEditText)findViewById(2131165275));
    this.eds[6][2] = ((CrossEditText)findViewById(2131165276));
    this.eds[6][3] = ((CrossEditText)findViewById(2131165277));
    this.eds[6][4] = ((CrossEditText)findViewById(2131165278));
    this.eds[6][5] = ((CrossEditText)findViewById(2131165279));
    this.eds[6][6] = ((CrossEditText)findViewById(2131165280));
    this.eds[6][7] = ((CrossEditText)findViewById(2131165281));
    this.eds[6][8] = ((CrossEditText)findViewById(2131165282));
    this.eds[6][9] = ((CrossEditText)findViewById(2131165283));
    this.eds[7][0] = ((CrossEditText)findViewById(2131165285));
    this.eds[7][1] = ((CrossEditText)findViewById(2131165286));
    this.eds[7][2] = ((CrossEditText)findViewById(2131165287));
    this.eds[7][3] = ((CrossEditText)findViewById(2131165288));
    this.eds[7][4] = ((CrossEditText)findViewById(2131165289));
    this.eds[7][5] = ((CrossEditText)findViewById(2131165290));
    this.eds[7][6] = ((CrossEditText)findViewById(2131165291));
    this.eds[7][7] = ((CrossEditText)findViewById(2131165292));
    this.eds[7][8] = ((CrossEditText)findViewById(2131165293));
    this.eds[7][9] = ((CrossEditText)findViewById(2131165294));
    this.eds[8][0] = ((CrossEditText)findViewById(2131165296));
    this.eds[8][1] = ((CrossEditText)findViewById(2131165297));
    this.eds[8][2] = ((CrossEditText)findViewById(2131165298));
    this.eds[8][3] = ((CrossEditText)findViewById(2131165299));
    this.eds[8][4] = ((CrossEditText)findViewById(2131165300));
    this.eds[8][5] = ((CrossEditText)findViewById(2131165301));
    this.eds[8][6] = ((CrossEditText)findViewById(2131165302));
    this.eds[8][7] = ((CrossEditText)findViewById(2131165303));
    this.eds[8][8] = ((CrossEditText)findViewById(2131165304));
    this.eds[8][9] = ((CrossEditText)findViewById(2131165305));
    this.eds[9][0] = ((CrossEditText)findViewById(2131165307));
    this.eds[9][1] = ((CrossEditText)findViewById(2131165308));
    this.eds[9][2] = ((CrossEditText)findViewById(2131165309));
    this.eds[9][3] = ((CrossEditText)findViewById(2131165310));
    this.eds[9][4] = ((CrossEditText)findViewById(2131165311));
    this.eds[9][5] = ((CrossEditText)findViewById(2131165312));
    this.eds[9][6] = ((CrossEditText)findViewById(2131165313));
    this.eds[9][7] = ((CrossEditText)findViewById(2131165314));
    this.eds[9][8] = ((CrossEditText)findViewById(2131165315));
    this.eds[9][9] = ((CrossEditText)findViewById(2131165316));
    this.puz = getPuzzle(this.fileName);
    HashMap localHashMap = DbTools.getPuzzleAnswer(this.serialNum);
    int k;
    for (int j = 0;; j++)
    {
      if (j >= 10)
      {
        localIntent.addCategory("android.intent.category.LAUNCHER");
        this.mApps = getPackageManager().queryIntentActivities(localIntent, 0);
        return;
      }
      k = 0;
      if (k < 10) {
        break;
      }
    }
    this.eds[j][k].setWidth(i);
    this.eds[j][k].setHeight(i);
    this.eds[j][k].addTextChangedListener(this.contentWatcher);
    this.eds[j][k].register(this);
    int m = k + j * 10;
    if (this.puz.containsKey(Integer.valueOf(m)))
    {
      this.eds[j][k].setUsed(true);
      if (localHashMap.containsKey(Integer.valueOf(m))) {
        this.eds[j][k].setText((CharSequence)localHashMap.get(Integer.valueOf(m)));
      }
    }
    for (;;)
    {
      k++;
      break;
      this.eds[j][k].setUsed(false);
      this.eds[j][k].setBackgroundColor(-16777216);
      this.eds[j][k].setEnabled(false);
      this.eds[j][k].setFocusable(false);
    }
  }
  
  private void submitScore(int paramInt)
  {
    Toast.makeText(this.ctx, "服务器故障，本版本不能提交！", 1).show();
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    Log.d("Play", "puzzle play get result:" + paramInt2);
    if (paramInt1 == 0)
    {
      this.curX = (paramInt2 % 10);
      this.curY = (paramInt2 / 10);
      this.eds[this.curY][this.curX].requestFocus();
      update(this.eds[this.curY][this.curX]);
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.ctx = getApplicationContext();
    Bundle localBundle = getIntent().getExtras();
    this.serialNum = localBundle.getInt("serial_number");
    this.fileName = localBundle.getString("file_name");
    setContentView(2130903044);
    DisplayMetrics localDisplayMetrics = getApplicationContext().getResources().getDisplayMetrics();
    SCREEN_WIDTH = localDisplayMetrics.widthPixels;
    SCREEN_HEIGHT = localDisplayMetrics.heightPixels;
    this.contentWatcher = new TextWatcher()
    {
      CharSequence temp = null;
      
      public void afterTextChanged(Editable paramAnonymousEditable)
      {
        if (this.temp.length() > 0) {
          paramAnonymousEditable.delete(1, this.temp.length());
        }
        if (!this.temp.toString().trim().equals(""))
        {
          DbTools.insertPuzAnswer(Play.this.serialNum, 10 * Play.this.curY + Play.this.curX, this.temp.toString());
          if (!Utils.IS_HORIZONAL) {
            break label322;
          }
          if ((Play.this.curX >= 9) || (!Play.this.eds[Play.this.curY][(1 + Play.this.curX)].isUsed())) {
            break label227;
          }
          Play localPlay4 = Play.this;
          localPlay4.curX = (1 + localPlay4.curX);
          Play.this.eds[Play.this.curY][Play.this.curX].requestFocus();
        }
        for (;;)
        {
          boolean bool = Play.this.checkPuzFinished();
          Log.d("Play", "check puzzle finished:" + bool);
          if (bool) {
            Play.this.submitScore(100);
          }
          return;
          label227:
          Utils.IS_HORIZONAL = false;
          if ((Play.this.curY < 9) && (Play.this.eds[(1 + Play.this.curY)][Play.this.curX].isUsed()))
          {
            Play localPlay3 = Play.this;
            localPlay3.curY = (1 + localPlay3.curY);
            Play.this.eds[Play.this.curY][Play.this.curX].requestFocus();
            continue;
            label322:
            if ((Play.this.curY < 9) && (Play.this.eds[(1 + Play.this.curY)][Play.this.curX].isUsed()))
            {
              Play localPlay2 = Play.this;
              localPlay2.curY = (1 + localPlay2.curY);
              Play.this.eds[Play.this.curY][Play.this.curX].requestFocus();
            }
            else
            {
              Utils.IS_HORIZONAL = true;
              if ((Play.this.curX < 9) && (Play.this.eds[Play.this.curY][(1 + Play.this.curX)].isUsed()))
              {
                Play localPlay1 = Play.this;
                localPlay1.curX = (1 + localPlay1.curX);
                Play.this.eds[Play.this.curY][Play.this.curX].requestFocus();
              }
            }
          }
        }
      }
      
      public void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        this.temp = paramAnonymousCharSequence;
      }
      
      public void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3) {}
    };
    ((Button)findViewById(2131165200)).setOnClickListener(new OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        Bundle localBundle = new Bundle();
        localBundle.putString("hints", "horizon_hints");
        Intent localIntent = new Intent(Play.this.ctx, PuzzleHintsBrowser.class);
        localIntent.putExtras(localBundle);
        Play.this.startActivityForResult(localIntent, 0);
      }
    });
    ((Button)findViewById(2131165203)).setOnClickListener(new OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        Bundle localBundle = new Bundle();
        localBundle.putString("hints", "vertical_hints");
        Intent localIntent = new Intent(Play.this.ctx, PuzzleHintsBrowser.class);
        localIntent.putExtras(localBundle);
        Play.this.startActivityForResult(localIntent, 0);
      }
    });
    ((Button)findViewById(2131165194)).setOnClickListener(new OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        Play.this.finish();
      }
    });
    ((Button)findViewById(2131165195)).setOnClickListener(new OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        Play.this.hintPuzzle();
      }
    });
    ((Button)findViewById(2131165196)).setOnClickListener(new OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        Play.this.checkPuzzle();
      }
    });
    ((Button)findViewById(2131165197)).setOnClickListener(new OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        boolean bool = Play.this.checkPuzFinished();
        Log.d("Play", "check puzzle finished:" + bool);
        if (bool)
        {
          Play.this.submitScore(100);
          return;
        }
        Toast.makeText(Play.this.ctx, "尚未完成游戏，不能提交！", 1).show();
      }
    });
    loadApps();
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    Log.d(getLocalClassName(), "用户按退出键，关闭AdManager.destoryAd()。");
  }
  
  public void update(CrossEditText paramCrossEditText)
  {
    int i = 0;
    int k;
    int n;
    int i1;
    int i5;
    label84:
    label89:
    int i2;
    label132:
    label139:
    int i3;
    if (i >= 10)
    {
      k = 0;
      if (k < 10) {
        break label249;
      }
      System.out.println("curY=" + this.curY + ",curX=" + this.curX);
      n = this.curY;
      i1 = this.curX;
      if (this.curY > 0)
      {
        i5 = this.curY - 1;
        if (i5 >= 0) {
          break label300;
        }
      }
      ((TextView)findViewById(2131165204)).setText((CharSequence)Utils.verHints.get(Integer.valueOf(n * 10 + this.curX)));
      i2 = 1 + this.curY;
      if (i2 < 10) {
        break label349;
      }
      i3 = this.curX - 1;
      label147:
      if (i3 >= 0) {
        break label394;
      }
      label152:
      ((TextView)findViewById(2131165201)).setText((CharSequence)Utils.horHints.get(Integer.valueOf(i1 + 10 * this.curY)));
    }
    for (int i4 = 1 + this.curX;; i4++)
    {
      if (i4 >= 10) {}
      label249:
      label294:
      label300:
      label349:
      label394:
      while (!this.eds[this.curY][i4].isUsed())
      {
        return;
        for (int j = 0;; j++)
        {
          if (j >= 10)
          {
            i++;
            break;
          }
          if (this.eds[i][j].isUsed()) {
            this.eds[i][j].setBackgroundColor(-1);
          }
        }
        for (int m = 0;; m++)
        {
          if (m >= 10) {}
          for (;;)
          {
            k++;
            break;
            if (this.eds[k][m] != paramCrossEditText) {
              break label294;
            }
            this.curY = k;
            this.curX = m;
          }
        }
        if (!this.eds[i5][this.curX].isUsed()) {
          break label89;
        }
        this.eds[i5][this.curX].setBackgroundColor(Color.parseColor("#F0CF4A"));
        n = i5;
        i5--;
        break label84;
        if (!this.eds[i2][this.curX].isUsed()) {
          break label139;
        }
        this.eds[i2][this.curX].setBackgroundColor(Color.parseColor("#F0CF4A"));
        i2++;
        break label132;
        if (!this.eds[this.curY][i3].isUsed()) {
          break label152;
        }
        this.eds[this.curY][i3].setBackgroundColor(Color.parseColor("#74FF6F"));
        i1 = i3;
        i3--;
        break label147;
      }
      this.eds[this.curY][i4].setBackgroundColor(Color.parseColor("#74FF6F"));
    }
  }
  
  public class AppsAdapter
    extends BaseAdapter
  {
    public AppsAdapter() {}
    
    public final int getCount()
    {
      return Play.this.mApps.size();
    }
    
    public final Object getItem(int paramInt)
    {
      return Play.this.mApps.get(paramInt);
    }
    
    public final long getItemId(int paramInt)
    {
      return paramInt;
    }
    
    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      TextView localTextView;
      if (paramView == null)
      {
        localTextView = new TextView(Play.this);
        localTextView.setLayoutParams(new AbsListView.LayoutParams(20, 20));
      }
      for (;;)
      {
        ((ResolveInfo)Play.this.mApps.get(paramInt));
        localTextView.setBackgroundColor(65280);
        return localTextView;
        localTextView = (TextView)paramView;
      }
    }
  }
}


/* Location:              E:\反编译工程\反编译工具包\反编译工具包\dex2jar-0.0.9.15\dex2jar-0.0.9.15\项目APP\填字游戏 1.8\_dex2jar.jar!\net\oicp\anya\crossword\Play.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */