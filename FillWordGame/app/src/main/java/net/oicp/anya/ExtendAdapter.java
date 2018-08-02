package net.oicp.anya;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Checkable;
import android.widget.Filter;
import android.widget.Filter.FilterResults;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExtendAdapter
  extends BaseAdapter
  implements Filterable
{
  private List<? extends Map<String, ?>> mData;
  private int mDropDownResource;
  private SimpleFilter mFilter;
  private String[] mFrom;
  private LayoutInflater mInflater;
  private int mResource;
  private int[] mTo;
  private ArrayList<Map<String, ?>> mUnfilteredData;
  private ViewBinder mViewBinder;
  
  public ExtendAdapter(Context paramContext, List<? extends Map<String, ?>> paramList, int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    this.mData = paramList;
    this.mDropDownResource = paramInt;
    this.mResource = paramInt;
    this.mFrom = paramArrayOfString;
    this.mTo = paramArrayOfInt;
    this.mInflater = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
  }
  
  private void bindView(int paramInt, View paramView)
  {
    Map localMap = (Map)this.mData.get(paramInt);
    if (localMap == null) {
      return;
    }
    ViewBinder localViewBinder = this.mViewBinder;
    View[] arrayOfView = (View[])paramView.getTag();
    String[] arrayOfString = this.mFrom;
    int i = this.mTo.length;
    int j = 0;
    label50:
    View localView;
    Object localObject;
    String str;
    if (j < i)
    {
      localView = arrayOfView[j];
      if (localView != null)
      {
        localObject = localMap.get(arrayOfString[j]);
        if (localObject != null) {
          break label168;
        }
        str = "";
        label91:
        if (str == null) {
          str = "";
        }
        boolean bool = false;
        if (localViewBinder != null) {
          bool = localViewBinder.setViewValue(localView, localObject, str);
        }
        if (!bool)
        {
          if (!(localView instanceof Checkable)) {
            break label220;
          }
          if (!(localObject instanceof Boolean)) {
            break label178;
          }
          ((Checkable)localView).setChecked(((Boolean)localObject).booleanValue());
        }
      }
    }
    for (;;)
    {
      j++;
      break label50;
      break;
      label168:
      str = localObject.toString();
      break label91;
      label178:
      throw new IllegalStateException(localView.getClass().getName() + " should be bound to a Boolean, not a " + localObject.getClass());
      label220:
      if ((localView instanceof TextView))
      {
        setViewText((TextView)localView, str);
      }
      else if ((localView instanceof ProgressBar))
      {
        setProgressValue((ProgressBar)localView, str);
      }
      else
      {
        if (!(localView instanceof ImageView)) {
          break label314;
        }
        if ((localObject instanceof Integer)) {
          setViewImage((ImageView)localView, ((Integer)localObject).intValue());
        } else {
          setViewImage((ImageView)localView, str);
        }
      }
    }
    label314:
    throw new IllegalStateException(localView.getClass().getName() + " is not a " + " view that can be bounds by this ExtendAdapter");
  }
  
  private View createViewFromResource(int paramInt1, View paramView, ViewGroup paramViewGroup, int paramInt2)
  {
    View localView;
    int[] arrayOfInt;
    View[] arrayOfView;
    int j;
    if (paramView == null)
    {
      localView = this.mInflater.inflate(paramInt2, paramViewGroup, false);
      arrayOfInt = this.mTo;
      int i = arrayOfInt.length;
      arrayOfView = new View[i];
      j = 0;
      if (j >= i) {
        localView.setTag(arrayOfView);
      }
    }
    for (;;)
    {
      bindView(paramInt1, localView);
      return localView;
      arrayOfView[j] = localView.findViewById(arrayOfInt[j]);
      j++;
      break;
      localView = paramView;
    }
  }
  
  public int getCount()
  {
    return this.mData.size();
  }
  
  public View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    return createViewFromResource(paramInt, paramView, paramViewGroup, this.mDropDownResource);
  }
  
  public Filter getFilter()
  {
    if (this.mFilter == null) {
      this.mFilter = new SimpleFilter(null);
    }
    return this.mFilter;
  }
  
  public Object getItem(int paramInt)
  {
    return this.mData.get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    return createViewFromResource(paramInt, paramView, paramViewGroup, this.mResource);
  }
  
  public ViewBinder getViewBinder()
  {
    return this.mViewBinder;
  }
  
  public void setDropDownViewResource(int paramInt)
  {
    this.mDropDownResource = paramInt;
  }
  
  public void setProgressValue(ProgressBar paramProgressBar, String paramString)
  {
    paramProgressBar.setProgress(Integer.parseInt(paramString.substring(0, paramString.length() - 1)));
  }
  
  public void setViewBinder(ViewBinder paramViewBinder)
  {
    this.mViewBinder = paramViewBinder;
  }
  
  public void setViewImage(ImageView paramImageView, int paramInt)
  {
    paramImageView.setImageResource(paramInt);
  }
  
  public void setViewImage(ImageView paramImageView, String paramString)
  {
    try
    {
      paramImageView.setImageResource(Integer.parseInt(paramString));
      return;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      paramImageView.setImageURI(Uri.parse(paramString));
    }
  }
  
  public void setViewText(TextView paramTextView, String paramString)
  {
    paramTextView.setText(paramString);
  }
  
  private class SimpleFilter
    extends Filter
  {
    private SimpleFilter() {}
    
    protected FilterResults performFiltering(CharSequence paramCharSequence)
    {
      FilterResults localFilterResults = new FilterResults();
      if (ExtendAdapter.this.mUnfilteredData == null) {
        ExtendAdapter.this.mUnfilteredData = new ArrayList(ExtendAdapter.this.mData);
      }
      if ((paramCharSequence == null) || (paramCharSequence.length() == 0))
      {
        ArrayList localArrayList1 = ExtendAdapter.this.mUnfilteredData;
        localFilterResults.values = localArrayList1;
        localFilterResults.count = localArrayList1.size();
        return localFilterResults;
      }
      String str = paramCharSequence.toString().toLowerCase();
      ArrayList localArrayList2 = ExtendAdapter.this.mUnfilteredData;
      int i = localArrayList2.size();
      ArrayList localArrayList3 = new ArrayList(i);
      Map localMap;
      int m;
      for (int j = 0;; j++)
      {
        if (j >= i)
        {
          localFilterResults.values = localArrayList3;
          localFilterResults.count = localArrayList3.size();
          return localFilterResults;
        }
        localMap = (Map)localArrayList2.get(j);
        if (localMap != null)
        {
          int k = ExtendAdapter.this.mTo.length;
          m = 0;
          if (m < k) {
            break;
          }
        }
      }
      String[] arrayOfString = ((String)localMap.get(ExtendAdapter.this.mFrom[m])).split(" ");
      int n = arrayOfString.length;
      label258:
      for (int i1 = 0;; i1++)
      {
        if (i1 >= n) {}
        for (;;)
        {
          m++;
          break;
          if (!arrayOfString[i1].toLowerCase().startsWith(str)) {
            break label258;
          }
          localArrayList3.add(localMap);
        }
      }
    }
    
    protected void publishResults(CharSequence paramCharSequence, FilterResults paramFilterResults)
    {
      ExtendAdapter.this.mData = ((List)paramFilterResults.values);
      if (paramFilterResults.count > 0)
      {
        ExtendAdapter.this.notifyDataSetChanged();
        return;
      }
      ExtendAdapter.this.notifyDataSetInvalidated();
    }
  }
  
  public static abstract interface ViewBinder
  {
    public abstract boolean setViewValue(View paramView, Object paramObject, String paramString);
  }
}


/* Location:              E:\反编译工程\反编译工具包\反编译工具包\dex2jar-0.0.9.15\dex2jar-0.0.9.15\项目APP\填字游戏 1.8\_dex2jar.jar!\net\oicp\anya\ExtendAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */