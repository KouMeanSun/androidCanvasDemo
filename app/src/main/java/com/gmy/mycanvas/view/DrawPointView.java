package com.gmy.mycanvas.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class DrawPointView extends View {
    private Paint paint;
    public DrawPointView(Context context) {
        super(context);
        paint = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawPoint(canvas);
    }

    private void drawPoint(Canvas canvas){
        int canvasWidth = canvas.getWidth();
        int canvasHeight = canvas.getHeight();
        int x = canvasWidth / 2;
        int deltaY = canvasHeight / 3;
        int y = deltaY / 2;
        paint.setColor(0xff8bc5ba);//设置颜色
        paint.setStrokeWidth(50 * 1);//设置线宽，如果不设置线宽，无法绘制点

        //绘制Cap为BUTT的点
        paint.setStrokeCap(Paint.Cap.BUTT);
        canvas.drawPoint(x, y, paint);

        //绘制Cap为ROUND的点
        canvas.translate(0, deltaY);
        paint.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawPoint(x, y, paint);

        //绘制Cap为SQUARE的点
        canvas.translate(0, deltaY);
        paint.setStrokeCap(Paint.Cap.SQUARE);
        canvas.drawPoint(x, y, paint);
    }

}
