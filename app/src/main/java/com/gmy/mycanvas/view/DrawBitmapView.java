package com.gmy.mycanvas.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

import com.gmy.mycanvas.R;

public class DrawBitmapView extends View {
    private Paint paint;
    private Bitmap bitmap;
    public DrawBitmapView(Context context) {
        super(context);
        paint = new Paint();
        bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.animal_detect);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawBitmap(canvas);
    }

    private void drawBitmap(Canvas canvas){
        //如果bitmap不存在，那么就不执行下面的绘制代码
        if(bitmap == null){
            return;
        }

        //直接完全绘制Bitmap
        canvas.drawBitmap(bitmap, 0, 0, paint);

        //绘制Bitmap的一部分，并对其拉伸
        //srcRect定义了要绘制Bitmap的哪一部分
        Rect srcRect = new Rect();
        srcRect.left = 0;
        srcRect.right = bitmap.getWidth();
        srcRect.top = 0;
        srcRect.bottom = (int)(0.33 * bitmap.getHeight());
        float radio = (float)(srcRect.bottom - srcRect.top)  / bitmap.getWidth();
        //dstRecF定义了要将绘制的Bitmap拉伸到哪里
        RectF dstRecF = new RectF();
        dstRecF.left = 0;
        dstRecF.right = canvas.getWidth();
        dstRecF.top = bitmap.getHeight();
        float dstHeight = (dstRecF.right - dstRecF.left) * radio;
        dstRecF.bottom = dstRecF.top + dstHeight;
        canvas.drawBitmap(bitmap, srcRect, dstRecF, paint);
    }

}
