package net.oicp.anya.crossword;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class UserRegisterActivity
  extends Activity
{
  private Button cancelBtn;
  private EditText etConfPwd;
  private EditText etName;
  private EditText etPhone;
  private EditText etPwd;
  private Button submitBtn;
  
  private void showAlert(String paramString)
  {
    Builder localBuilder = new Builder(this);
    localBuilder.setMessage(paramString).setCancelable(false).setPositiveButton("确定", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
    });
    localBuilder.create().show();
  }
  
  private boolean submit()
  {
    return false;
  }
  
  private boolean validate()
  {
    Log.d("UserRegister", "password hash code:" + this.etPwd.getText().toString().hashCode());
    Log.d("UserRegister", "confirm password hash code:" + this.etConfPwd.getText().toString().hashCode());
    if (this.etName.getText().toString().trim().equals(""))
    {
      showAlert("用户名不能为空！");
      return false;
    }
    if (this.etPwd.getText().toString().trim().equals(""))
    {
      showAlert("密码不能为空！");
      return false;
    }
    if (this.etPwd.getText().toString().equals(this.etConfPwd.getText().toString())) {
      return true;
    }
    showAlert("两次输入的密码不同！");
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903048);
    setTitle("用户注册");
    this.etName = ((EditText)findViewById(2131165326));
    this.etPwd = ((EditText)findViewById(2131165327));
    this.etConfPwd = ((EditText)findViewById(2131165328));
    this.etPhone = ((EditText)findViewById(2131165329));
    this.cancelBtn = ((Button)findViewById(2131165330));
    this.submitBtn = ((Button)findViewById(2131165197));
    this.cancelBtn.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        UserRegisterActivity.this.finish();
      }
    });
    this.submitBtn.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        if (UserRegisterActivity.this.validate())
        {
          if (UserRegisterActivity.this.submit()) {
            UserRegisterActivity.this.showAlert("提交成功！");
          }
        }
        else {
          return;
        }
        UserRegisterActivity.this.showAlert("提交失败！");
      }
    });
  }
  
  private class CommunicateTask
    extends AsyncTask<String, Integer, Long>
  {
    private static final int DIALOG1_KEY = 0;
    private static final int DIALOG2_KEY = 1;
    
    private CommunicateTask() {}
    
    protected Long doInBackground(String... paramVarArgs)
    {
      return null;
    }
    
    protected void onPostExecute(Long paramLong)
    {
      super.onPostExecute(paramLong);
      UserRegisterActivity.this.dismissDialog(1);
    }
    
    protected void onPreExecute()
    {
      super.onPreExecute();
      UserRegisterActivity.this.showDialog(1);
    }
    
    protected void onProgressUpdate(Integer... paramVarArgs)
    {
      super.onProgressUpdate(paramVarArgs);
    }
  }
}


/* Location:              E:\反编译工程\反编译工具包\反编译工具包\dex2jar-0.0.9.15\dex2jar-0.0.9.15\项目APP\填字游戏 1.8\_dex2jar.jar!\net\oicp\anya\crossword\UserRegisterActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */