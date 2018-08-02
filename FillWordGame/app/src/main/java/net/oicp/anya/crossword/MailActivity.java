package net.oicp.anya.crossword;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MailActivity
  extends Activity
{
  public static final String MAIL_SMTP_AUTH = "true";
  public static final String MAIL_SMTP_HOST = "smtp.gmail.com";
  public static final String MAIL_SMTP_PORT = "465";
  private EditText contentEditText;
  private Context cxt;
  private OnClickListener listener = new OnClickListener()
  {
    public void onClick(View paramAnonymousView)
    {
      String str = MailActivity.this.contentEditText.getText().toString();
      if ((str == null) || (str.trim().equals("")))
      {
        Toast.makeText(MailActivity.this.cxt, "建议意见不能为空!", 1).show();
        return;
      }
      String[] arrayOfString1 = { "yuyang98@gmail.com" };
      String[] arrayOfString2 = { "对填字游戏的意见和建议" };
      Intent localIntent = new Intent("android.intent.action.SEND");
      localIntent.setType("plain/text");
      localIntent.putExtra("android.intent.extra.EMAIL", arrayOfString1);
      localIntent.putExtra("android.intent.extra.SUBJECT", arrayOfString2);
      localIntent.putExtra("android.intent.extra.TEXT", str);
      MailActivity.this.startActivity(Intent.createChooser(localIntent, "mail test"));
    }
  };
  private Button sendBtn;
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903042);
    this.cxt = getApplicationContext();
    setTitle("意见建议");
    this.contentEditText = ((EditText)findViewById(2131165187));
    this.contentEditText.setHeight(getWallpaperDesiredMinimumHeight());
    this.sendBtn = ((Button)findViewById(2131165186));
    this.sendBtn.setOnClickListener(this.listener);
  }
}


/* Location:              E:\反编译工程\反编译工具包\反编译工具包\dex2jar-0.0.9.15\dex2jar-0.0.9.15\项目APP\填字游戏 1.8\_dex2jar.jar!\net\oicp\anya\crossword\MailActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */