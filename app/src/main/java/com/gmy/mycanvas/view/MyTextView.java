package com.gmy.mycanvas.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class MyTextView extends View {
    private final static int textHeight = 50;
    private Paint paint;

    public MyTextView(Context context) {
        super(context);
        paint = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawARGB(canvas);
        drawText(canvas);
    }
    private void drawARGB(Canvas canvas){
        canvas.drawARGB(255, 139, 197, 186);
    }
    private void drawText(Canvas canvas){
        int canvasWidth = canvas.getWidth();
        int halfCanvasWidth = canvasWidth / 2;
        float translateY = textHeight;

        paint.setTextSize(35);

        //绘制正常文本
        canvas.save();
        canvas.translate(0, translateY);
        canvas.drawText("正常绘制文本", 0, 0, paint);
        canvas.restore();
        translateY += textHeight * 2;

        //绘制绿色文本
        paint.setColor(0xff00ff00);//设置字体为绿色
        canvas.save();
        canvas.translate(0, translateY);//将画笔向下移动
        canvas.drawText("绘制绿色文本", 0, 0, paint);
        canvas.restore();
        paint.setColor(0xff000000);//重新设置为黑色
        translateY += textHeight * 2;

        //设置左对齐
        paint.setTextAlign(Paint.Align.LEFT);//设置左对齐
        canvas.save();
        canvas.translate(halfCanvasWidth, translateY);
        canvas.drawText("左对齐文本", 0, 0, paint);
        canvas.restore();
        translateY += textHeight * 2;

        //设置居中对齐
        paint.setTextAlign(Paint.Align.CENTER);//设置居中对齐
        canvas.save();
        canvas.translate(halfCanvasWidth, translateY);
        canvas.drawText("居中对齐文本", 0, 0, paint);
        canvas.restore();
        translateY += textHeight * 2;

        //设置右对齐
        paint.setTextAlign(Paint.Align.RIGHT);//设置右对齐
        canvas.save();
        canvas.translate(halfCanvasWidth, translateY);
        canvas.drawText("右对齐文本", 0, 0, paint);
        canvas.restore();
        paint.setTextAlign(Paint.Align.LEFT);//重新设置为左对齐
        translateY += textHeight * 2;

        //设置下划线
        paint.setUnderlineText(true);//设置具有下划线
        canvas.save();
        canvas.translate(0, translateY);
        canvas.drawText("下划线文本", 0, 0, paint);
        canvas.restore();
        paint.setUnderlineText(false);//重新设置为没有下划线
        translateY += textHeight * 2;

        //绘制加粗文字
        paint.setFakeBoldText(true);//将画笔设置为粗体
        canvas.save();
        canvas.translate(0, translateY);
        canvas.drawText("粗体文本", 0, 0, paint);
        canvas.restore();
        paint.setFakeBoldText(false);//重新将画笔设置为非粗体状态
        translateY += textHeight * 2;

        //文本绕绘制起点顺时针旋转
        canvas.save();
        canvas.translate(0, translateY);
        canvas.rotate(20);
        canvas.drawText("文本绕绘制起点旋转20度", 0, 0, paint);
        canvas.restore();
    }

}
