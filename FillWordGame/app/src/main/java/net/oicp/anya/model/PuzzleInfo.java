package net.oicp.anya.model;

public class PuzzleInfo
{
  private int charCnt;
  private String fileName;
  private String puzName;
  private String readTime;
  private int serialNum;
  
  public PuzzleInfo(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    this.fileName = paramString1;
    this.puzName = paramString2;
    this.charCnt = paramInt2;
    this.serialNum = paramInt1;
  }
  
  public int getCharCnt()
  {
    return this.charCnt;
  }
  
  public String getFileName()
  {
    return this.fileName;
  }
  
  public String getPuzzleName()
  {
    return this.puzName;
  }
  
  public String getReadTime()
  {
    return this.readTime;
  }
  
  public int getSerialNum()
  {
    return this.serialNum;
  }
  
  public void setCharCnt(int paramInt)
  {
    this.charCnt = paramInt;
  }
  
  public void setFileName(String paramString)
  {
    this.fileName = paramString;
  }
  
  public void setPuzzleName(String paramString)
  {
    this.puzName = paramString;
  }
  
  public void setReadTime(String paramString)
  {
    this.readTime = paramString;
  }
  
  public void setSerialNum(int paramInt)
  {
    this.serialNum = paramInt;
  }
  
  public String toString()
  {
    return this.readTime + "    " + this.puzName.substring(1 + this.puzName.lastIndexOf("/"));
  }
}


/* Location:              E:\反编译工程\反编译工具包\反编译工具包\dex2jar-0.0.9.15\dex2jar-0.0.9.15\项目APP\填字游戏 1.8\_dex2jar.jar!\net\oicp\anya\model\PuzzleInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */