package net.oicp.anya.tools;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tools
{
  public static final int REQUEST_CODE = 1;
  public static boolean isConfirm = false;
  
  public static byte[] getBytes(char[] paramArrayOfChar)
  {
    Charset localCharset = Charset.forName("GBK");
    CharBuffer localCharBuffer = CharBuffer.allocate(paramArrayOfChar.length);
    localCharBuffer.put(paramArrayOfChar);
    localCharBuffer.flip();
    return localCharset.encode(localCharBuffer).array();
  }
  
  public static char[] getChars(byte[] paramArrayOfByte)
  {
    Charset localCharset = Charset.forName("UTF-8");
    ByteBuffer localByteBuffer = ByteBuffer.allocate(paramArrayOfByte.length);
    localByteBuffer.put(paramArrayOfByte);
    localByteBuffer.flip();
    return localCharset.decode(localByteBuffer).array();
  }
  
  public static String getCurrentTime()
  {
    return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
  }
  
  public static void showAlertDialog(Context paramContext, int paramInt1, int paramInt2)
  {
    OnClickListener local1 = new OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        try
        {
          Tools.isConfirm = true;
          return;
        }
        catch (Exception localException)
        {
          localException.printStackTrace();
        }
      }
    };
    OnClickListener local2 = new OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        Tools.isConfirm = false;
      }
    };
    Builder localBuilder = new Builder(paramContext);
    localBuilder.setPositiveButton(2131034118, local1).setNegativeButton(2131034119, local2).setTitle(paramInt1).setIcon(2130837507).setCancelable(false).setMessage(paramInt2);
    localBuilder.create().show();
    Log.d("Tools", "after show alert dialog");
  }
}


/* Location:              E:\反编译工程\反编译工具包\反编译工具包\dex2jar-0.0.9.15\dex2jar-0.0.9.15\项目APP\填字游戏 1.8\_dex2jar.jar!\net\oicp\anya\tools\Tools.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */