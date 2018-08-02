package net.oicp.anya.crossword;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import net.oicp.anya.Utils;

public class PuzzleHintsBrowser
  extends ListActivity
{
  String hintDir = null;
  private List<String> hintList = new ArrayList();
  HashMap<Integer, String> hints = new HashMap();
  
  private void fill(String paramString)
  {
    this.hintList.clear();
    Iterator localIterator;
    if (paramString.equals("horizon_hints"))
    {
      Utils.IS_HORIZONAL = true;
      this.hints = Utils.horHints;
      localIterator = this.hints.values().iterator();
    }
    for (;;)
    {
      if (!localIterator.hasNext())
      {
        setListAdapter(new ArrayAdapter(this, 2130903041, this.hintList));
        return;
        if (!paramString.equals("vertical_hints")) {
          break;
        }
        Utils.IS_HORIZONAL = false;
        this.hints = Utils.verHints;
        break;
      }
      String str = (String)localIterator.next();
      Log.d("PuzzleHintsBrowser", str);
      this.hintList.add(str);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    getListView().setBackgroundResource(2130837504);
    getListView().setCacheColorHint(0);
    this.hintDir = getIntent().getExtras().getString("hints");
    fill(this.hintDir);
  }
  
  protected void onListItemClick(ListView paramListView, View paramView, int paramInt, long paramLong)
  {
    String str = (String)this.hintList.get(paramInt);
    Log.d("PuzzleHintsBrowser", "You select puzzle hints:" + str);
    Iterator localIterator = this.hints.keySet().iterator();
    boolean bool = localIterator.hasNext();
    int i = 0;
    if (!bool) {}
    for (;;)
    {
      setResult(i);
      finish();
      return;
      Integer localInteger = (Integer)localIterator.next();
      if (!((String)this.hints.get(localInteger)).endsWith(str)) {
        break;
      }
      i = localInteger.intValue();
    }
  }
  
  protected void onPause()
  {
    super.onPause();
    Log.d("PuzzleHintsBrowser", "puzzle hints broswer paused");
  }
  
  protected void onRestart()
  {
    super.onRestart();
    Log.d("PuzzleHintsBrowser", "puzzle hints broswer restart");
  }
  
  protected void onResume()
  {
    super.onResume();
    Log.d("PuzzleHintsBrowser", "puzzle hints broswer resume");
  }
}


/* Location:              E:\反编译工程\反编译工具包\反编译工具包\dex2jar-0.0.9.15\dex2jar-0.0.9.15\项目APP\填字游戏 1.8\_dex2jar.jar!\net\oicp\anya\crossword\PuzzleHintsBrowser.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */