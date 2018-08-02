package net.oicp.anya.model;

public class RSSItem
{
  public static final String PUBDATE = "pubdate";
  public static final String TITLE = "title";
  private String category = null;
  private String description = null;
  private String link = null;
  private String pubdate = null;
  private String title = null;
  
  public String getCategory()
  {
    return this.category;
  }
  
  public String getDescription()
  {
    return this.description;
  }
  
  public String getLink()
  {
    return this.link;
  }
  
  public String getPubDate()
  {
    return this.pubdate;
  }
  
  public String getTitle()
  {
    return this.title;
  }
  
  public void setCategory(String paramString)
  {
    this.category = paramString;
  }
  
  public void setDescription(String paramString)
  {
    this.description = paramString;
  }
  
  public void setLink(String paramString)
  {
    this.link = paramString;
  }
  
  public void setPubDate(String paramString)
  {
    this.pubdate = paramString;
  }
  
  public void setTitle(String paramString)
  {
    this.title = paramString;
  }
  
  public String toString()
  {
    if (this.title.length() > 20) {
      return this.title.substring(0, 42) + "...";
    }
    return this.title;
  }
}


/* Location:              E:\反编译工程\反编译工具包\反编译工具包\dex2jar-0.0.9.15\dex2jar-0.0.9.15\项目APP\填字游戏 1.8\_dex2jar.jar!\net\oicp\anya\model\RSSItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */