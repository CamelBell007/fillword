package net.oicp.anya.tools;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;

public class SuccessView
  extends View
{
  private ShapeDrawable mDrawable = new ShapeDrawable(new OvalShape());
  
  public SuccessView(Context paramContext)
  {
    super(paramContext);
    this.mDrawable.getPaint().setColor(-9130973);
    this.mDrawable.setBounds(10, 10, 10 + 'Ĭ', 10 + 50);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    this.mDrawable.draw(paramCanvas);
  }
}


/* Location:              E:\反编译工程\反编译工具包\反编译工具包\dex2jar-0.0.9.15\dex2jar-0.0.9.15\项目APP\填字游戏 1.8\_dex2jar.jar!\net\oicp\anya\tools\SuccessView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */