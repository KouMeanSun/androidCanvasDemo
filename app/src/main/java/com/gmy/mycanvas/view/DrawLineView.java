package com.gmy.mycanvas.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class DrawLineView  extends View {
    private Paint paint;
    public DrawLineView(Context context) {
        super(context);
        paint  = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawARGB(255, 139, 197, 186);
        drawLine(canvas);
    }

    private void drawLine(Canvas canvas){

        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(6 * 1);

        //用绿色画x轴，用蓝色画y轴

        //第一次绘制坐标轴
        paint.setColor(0xff00ff00);//绿色
        canvas.drawLine(100, 100, 200, 100, paint);//绘制x轴

        canvas.drawLine(100, 300, 600, 300, paint);//绘制x轴
    }
}
