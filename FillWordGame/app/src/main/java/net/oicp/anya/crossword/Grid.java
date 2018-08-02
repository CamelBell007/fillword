package net.oicp.anya.crossword;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

import java.util.List;

public class Grid
  extends Activity
{
  private List<ResolveInfo> mApps;
  GridView mGrid;
  
  private void loadApps()
  {
    Intent localIntent = new Intent("android.intent.action.MAIN", null);
    localIntent.addCategory("android.intent.category.LAUNCHER");
    this.mApps = getPackageManager().queryIntentActivities(localIntent, 0);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    loadApps();
    setContentView(2130903040);
    this.mGrid = ((GridView)findViewById(2131165184));
    this.mGrid.setAdapter(new AppsAdapter());
  }
  
  public class AppsAdapter
    extends BaseAdapter
  {
    public AppsAdapter() {}
    
    public final int getCount()
    {
      return Grid.this.mApps.size();
    }
    
    public final Object getItem(int paramInt)
    {
      return Grid.this.mApps.get(paramInt);
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
        localTextView = new TextView(Grid.this);
        localTextView.setLayoutParams(new AbsListView.LayoutParams(20, 20));
      }
      for (;;)
      {
        ((ResolveInfo)Grid.this.mApps.get(paramInt));
        localTextView.setBackgroundColor(65280);
        return localTextView;
        localTextView = (TextView)paramView;
      }
    }
  }
}


/* Location:              E:\反编译工程\反编译工具包\反编译工具包\dex2jar-0.0.9.15\dex2jar-0.0.9.15\项目APP\填字游戏 1.8\_dex2jar.jar!\net\oicp\anya\crossword\Grid.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */