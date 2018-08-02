package net.oicp.anya.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class RSSFeed
{
  private int itemcount = 0;
  private List<RSSItem> itemlist = new Vector(0);
  private String pubdate = null;
  private String title = null;
  
  public int addItem(RSSItem paramRSSItem)
  {
    this.itemlist.add(paramRSSItem);
    this.itemcount = (1 + this.itemcount);
    return this.itemcount;
  }
  
  public List<RSSItem> getAllItems()
  {
    return this.itemlist;
  }
  
  public List<Map<String, Object>> getAllItemsForListView()
  {
    ArrayList localArrayList = new ArrayList();
    int i = this.itemlist.size();
    for (int j = 0;; j++)
    {
      if (j >= i) {
        return localArrayList;
      }
      HashMap localHashMap = new HashMap();
      localHashMap.put("title", ((RSSItem)this.itemlist.get(j)).getTitle());
      localHashMap.put("pubdate", ((RSSItem)this.itemlist.get(j)).getPubDate());
      localArrayList.add(localHashMap);
    }
  }
  
  public RSSItem getItem(int paramInt)
  {
    return (RSSItem)this.itemlist.get(paramInt);
  }
  
  int getItemCount()
  {
    return this.itemcount;
  }
  
  public String getPubDate()
  {
    return this.pubdate;
  }
  
  public String getTitle()
  {
    return this.title;
  }
  
  public void setPubDate(String paramString)
  {
    this.pubdate = paramString;
  }
  
  public void setTitle(String paramString)
  {
    this.title = paramString;
  }
}


/* Location:              E:\反编译工程\反编译工具包\反编译工具包\dex2jar-0.0.9.15\dex2jar-0.0.9.15\项目APP\填字游戏 1.8\_dex2jar.jar!\net\oicp\anya\model\RSSFeed.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */