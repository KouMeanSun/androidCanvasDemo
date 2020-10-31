package com.gmy.mycanvas.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class DrawCircleView  extends View {
    private Paint paint;
    public DrawCircleView(Context context) {
        super(context);
        paint = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawCircle(canvas);
    }
    private void drawCircle(Canvas canvas){
        paint.setColor(0xff8bc5ba);//设置颜色
        paint.setStyle(Paint.Style.FILL);//默认绘图为填充模式
        int canvasWidth = canvas.getWidth();
        int canvasHeight = canvas.getHeight();
        int halfCanvasWidth = canvasWidth / 2;
        int count = 3;
        int D = canvasHeight / (count + 1);
        int R = D / 2;

        //绘制圆
        canvas.translate(0, D / (count + 1));
        canvas.drawCircle(halfCanvasWidth, R, R, paint);

        //通过绘制两个圆形成圆环
        //1. 首先绘制大圆
        canvas.translate(0, D + D / (count + 1));
        canvas.drawCircle(halfCanvasWidth, R, R, paint);
        //2. 然后绘制小圆，让小圆覆盖大圆，形成圆环效果
        int r = (int)(R * 0.75);
        paint.setColor(0xffffffff);//将画笔设置为白色，画小圆
        canvas.drawCircle(halfCanvasWidth, R, r, paint);

        //通过线条绘图模式绘制圆环
        canvas.translate(0, D + D / (count + 1));
        paint.setColor(0xff8bc5ba);//设置颜色
        paint.setStyle(Paint.Style.STROKE);//绘图为线条模式
        float strokeWidth = (float)(R * 0.25);
        paint.setStrokeWidth(strokeWidth);
        canvas.drawCircle(halfCanvasWidth, R, R, paint);
    }

}
