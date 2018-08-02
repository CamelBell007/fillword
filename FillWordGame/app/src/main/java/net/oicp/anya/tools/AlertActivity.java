package net.oicp.anya.tools;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;

public class AlertActivity
  extends Activity
{
  private boolean isConfirm = false;
  
  private void sendDataBack()
  {
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("isConfirm", this.isConfirm);
    Intent localIntent = new Intent();
    localIntent.putExtras(localBundle);
    setResult(-1, localIntent);
    finish();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    showAlertDialog(this, 2131034120, 2131034121);
  }
  
  public void showAlertDialog(Context paramContext, int paramInt1, int paramInt2)
  {
    OnClickListener local1 = new OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        try
        {
          AlertActivity.this.isConfirm = true;
          AlertActivity.this.sendDataBack();
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
        AlertActivity.this.isConfirm = false;
        AlertActivity.this.sendDataBack();
      }
    };
    Builder localBuilder = new Builder(paramContext);
    localBuilder.setPositiveButton(2131034118, local1).setNegativeButton(2131034119, local2).setTitle(paramInt1).setIcon(2130837507).setMessage(paramInt2);
    localBuilder.create().show();
  }
}


/* Location:              E:\反编译工程\反编译工具包\反编译工具包\dex2jar-0.0.9.15\dex2jar-0.0.9.15\项目APP\填字游戏 1.8\_dex2jar.jar!\net\oicp\anya\tools\AlertActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */