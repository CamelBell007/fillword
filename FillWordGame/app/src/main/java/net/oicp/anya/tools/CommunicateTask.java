package net.oicp.anya.tools;

import android.os.AsyncTask;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class CommunicateTask
  extends AsyncTask<String, Integer, Long>
{
  private static final int DIALOG1_KEY = 0;
  private static final int DIALOG2_KEY = 1;
  
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
        byte[] arrayOfByte = new byte[''];
        int i = 0;
        for (;;)
        {
          int j = localInputStream.read(arrayOfByte);
          if (j == -1)
          {
            String str = new String(localByteArrayOutputStream.toByteArray(), "GBK");
            BufferedWriter localBufferedWriter = new BufferedWriter(new FileWriter("/sdcard/news.xml"));
            localBufferedWriter.write(str);
            localBufferedWriter.close();
            break;
          }
          localByteArrayOutputStream.write(arrayOfByte, 0, j);
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
  }
  
  protected void onPreExecute()
  {
    super.onPreExecute();
  }
  
  protected void onProgressUpdate(Integer... paramVarArgs)
  {
    super.onProgressUpdate(paramVarArgs);
  }
}


/* Location:              E:\反编译工程\反编译工具包\反编译工具包\dex2jar-0.0.9.15\dex2jar-0.0.9.15\项目APP\填字游戏 1.8\_dex2jar.jar!\net\oicp\anya\tools\CommunicateTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */