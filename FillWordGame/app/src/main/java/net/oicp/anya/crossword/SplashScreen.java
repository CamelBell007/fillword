package net.oicp.anya.crossword;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;

public class SplashScreen
  extends Activity
{
  protected boolean _active = true;
  protected int _splashTime = 3000;
  Context ctx = null;
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903047);
    this.ctx = getApplicationContext();
    new Thread()
    {
      /* Error */
      public void run()
      {
        // Byte code:
        //   0: iconst_0
        //   1: istore_1
        //   2: aload_0
        //   3: getfield 15	net/oicp/anya/crossword/SplashScreen$1:this$0	Lnet/oicp/anya/crossword/SplashScreen;
        //   6: getfield 25	net/oicp/anya/crossword/SplashScreen:_active	Z
        //   9: ifeq +18 -> 27
        //   12: aload_0
        //   13: getfield 15	net/oicp/anya/crossword/SplashScreen$1:this$0	Lnet/oicp/anya/crossword/SplashScreen;
        //   16: getfield 29	net/oicp/anya/crossword/SplashScreen:_splashTime	I
        //   19: istore 4
        //   21: iload_1
        //   22: iload 4
        //   24: if_icmplt +38 -> 62
        //   27: aload_0
        //   28: getfield 15	net/oicp/anya/crossword/SplashScreen$1:this$0	Lnet/oicp/anya/crossword/SplashScreen;
        //   31: invokevirtual 32	net/oicp/anya/crossword/SplashScreen:finish	()V
        //   34: aload_0
        //   35: getfield 15	net/oicp/anya/crossword/SplashScreen$1:this$0	Lnet/oicp/anya/crossword/SplashScreen;
        //   38: new 34	android/content/Intent
        //   41: dup
        //   42: aload_0
        //   43: getfield 15	net/oicp/anya/crossword/SplashScreen$1:this$0	Lnet/oicp/anya/crossword/SplashScreen;
        //   46: getfield 38	net/oicp/anya/crossword/SplashScreen:ctx	Landroid/content/Context;
        //   49: ldc 40
        //   51: invokespecial 43	android/content/Intent:<init>	(Landroid/content/Context;Ljava/lang/Class;)V
        //   54: invokevirtual 47	net/oicp/anya/crossword/SplashScreen:startActivity	(Landroid/content/Intent;)V
        //   57: aload_0
        //   58: invokevirtual 50	net/oicp/anya/crossword/SplashScreen$1:interrupt	()V
        //   61: return
        //   62: ldc2_w 51
        //   65: invokestatic 56	net/oicp/anya/crossword/SplashScreen$1:sleep	(J)V
        //   68: aload_0
        //   69: getfield 15	net/oicp/anya/crossword/SplashScreen$1:this$0	Lnet/oicp/anya/crossword/SplashScreen;
        //   72: getfield 25	net/oicp/anya/crossword/SplashScreen:_active	Z
        //   75: istore 5
        //   77: iload 5
        //   79: ifeq -77 -> 2
        //   82: iinc 1 100
        //   85: goto -83 -> 2
        //   88: astore_3
        //   89: aload_3
        //   90: invokevirtual 59	java/lang/Exception:printStackTrace	()V
        //   93: aload_0
        //   94: getfield 15	net/oicp/anya/crossword/SplashScreen$1:this$0	Lnet/oicp/anya/crossword/SplashScreen;
        //   97: invokevirtual 32	net/oicp/anya/crossword/SplashScreen:finish	()V
        //   100: aload_0
        //   101: getfield 15	net/oicp/anya/crossword/SplashScreen$1:this$0	Lnet/oicp/anya/crossword/SplashScreen;
        //   104: new 34	android/content/Intent
        //   107: dup
        //   108: aload_0
        //   109: getfield 15	net/oicp/anya/crossword/SplashScreen$1:this$0	Lnet/oicp/anya/crossword/SplashScreen;
        //   112: getfield 38	net/oicp/anya/crossword/SplashScreen:ctx	Landroid/content/Context;
        //   115: ldc 40
        //   117: invokespecial 43	android/content/Intent:<init>	(Landroid/content/Context;Ljava/lang/Class;)V
        //   120: invokevirtual 47	net/oicp/anya/crossword/SplashScreen:startActivity	(Landroid/content/Intent;)V
        //   123: aload_0
        //   124: invokevirtual 50	net/oicp/anya/crossword/SplashScreen$1:interrupt	()V
        //   127: return
        //   128: astore_2
        //   129: aload_0
        //   130: getfield 15	net/oicp/anya/crossword/SplashScreen$1:this$0	Lnet/oicp/anya/crossword/SplashScreen;
        //   133: invokevirtual 32	net/oicp/anya/crossword/SplashScreen:finish	()V
        //   136: aload_0
        //   137: getfield 15	net/oicp/anya/crossword/SplashScreen$1:this$0	Lnet/oicp/anya/crossword/SplashScreen;
        //   140: new 34	android/content/Intent
        //   143: dup
        //   144: aload_0
        //   145: getfield 15	net/oicp/anya/crossword/SplashScreen$1:this$0	Lnet/oicp/anya/crossword/SplashScreen;
        //   148: getfield 38	net/oicp/anya/crossword/SplashScreen:ctx	Landroid/content/Context;
        //   151: ldc 40
        //   153: invokespecial 43	android/content/Intent:<init>	(Landroid/content/Context;Ljava/lang/Class;)V
        //   156: invokevirtual 47	net/oicp/anya/crossword/SplashScreen:startActivity	(Landroid/content/Intent;)V
        //   159: aload_0
        //   160: invokevirtual 50	net/oicp/anya/crossword/SplashScreen$1:interrupt	()V
        //   163: aload_2
        //   164: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	165	0	this	1
        //   1	82	1	i	int
        //   128	36	2	localObject	Object
        //   88	2	3	localException	Exception
        //   19	6	4	j	int
        //   75	3	5	bool	boolean
        // Exception table:
        //   from	to	target	type
        //   2	21	88	java/lang/Exception
        //   62	77	88	java/lang/Exception
        //   2	21	128	finally
        //   62	77	128	finally
        //   89	93	128	finally
      }
    }.start();
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getAction() == 0) {
      this._active = false;
    }
    return true;
  }
}


/* Location:              E:\反编译工程\反编译工具包\反编译工具包\dex2jar-0.0.9.15\dex2jar-0.0.9.15\项目APP\填字游戏 1.8\_dex2jar.jar!\net\oicp\anya\crossword\SplashScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */