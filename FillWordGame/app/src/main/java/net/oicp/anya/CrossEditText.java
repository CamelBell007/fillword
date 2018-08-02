package net.oicp.anya;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.EditText;

public class CrossEditText
  extends EditText
{
  Canvas canvas = null;
  private boolean isUsed = false;
  private Observer observer = null;
  
  public CrossEditText(Context paramContext)
  {
    super(paramContext);
  }
  
  public CrossEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public CrossEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public boolean isUsed()
  {
    return this.isUsed;
  }
  
  public void notifyObserver()
  {
    if (this.observer != null) {
      this.observer.update(this);
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    this.canvas = paramCanvas;
    int i = getWidth();
    Paint localPaint = new Paint();
    localPaint.setAntiAlias(true);
    localPaint.setStyle(Style.STROKE);
    localPaint.setColor(-7829368);
    paramCanvas.drawRect(0.0F, 0.0F, i, i, localPaint);
    if (hasFocus())
    {
      localPaint.setStyle(Style.STROKE);
      localPaint.setStrokeWidth(3.0F);
      if (!Utils.IS_HORIZONAL) {
        break label236;
      }
      localPaint.setColor(-16711936);
      paramCanvas.drawCircle(i * 3 / 4, i / 2, i / 20, localPaint);
    }
    for (;;)
    {
      localPaint.setStrokeWidth(1.0F);
      localPaint.setColor(Color.parseColor("#8080FF"));
      paramCanvas.drawRect(5.0F, 5.0F, i - 5, i - 5, localPaint);
      localPaint.setColor(Color.parseColor("#7070FF"));
      paramCanvas.drawRect(4.0F, 4.0F, i - 4, i - 4, localPaint);
      localPaint.setColor(Color.parseColor("#6060FF"));
      paramCanvas.drawRect(3.0F, 3.0F, i - 3, i - 3, localPaint);
      localPaint.setColor(Color.parseColor("#5050FF"));
      paramCanvas.drawRect(2.0F, 2.0F, i - 2, i - 2, localPaint);
      localPaint.setColor(Color.parseColor("#4040FF"));
      paramCanvas.drawRect(1.0F, 1.0F, i - 1, i - 1, localPaint);
      return;
      label236:
      localPaint.setColor(65280);
      paramCanvas.drawCircle(i / 2, i * 3 / 4, i / 20, localPaint);
    }
  }
  
  protected void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect)
  {
    super.onFocusChanged(paramBoolean, paramInt, paramRect);
    if (hasFocus()) {
      notifyObserver();
    }
  }
  
  public void register(Observer paramObserver)
  {
    this.observer = paramObserver;
  }
  
  public void setUsed(boolean paramBoolean)
  {
    this.isUsed = paramBoolean;
  }
}


/* Location:              E:\反编译工程\反编译工具包\反编译工具包\dex2jar-0.0.9.15\dex2jar-0.0.9.15\项目APP\填字游戏 1.8\_dex2jar.jar!\net\oicp\anya\CrossEditText.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */