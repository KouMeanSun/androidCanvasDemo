package com.gmy.mycanvas.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class DrawRectView  extends View {
    private Paint paint;
    public DrawRectView(Context context) {
        super(context);
        paint = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawARGB(255, 255, 0, 0);
        drawRect(canvas);
    }

    private void drawRect(Canvas canvas){
        int canvasWidth = canvas.getWidth();
        int canvasHeight = canvas.getHeight();

        //默认画笔的填充色是黑色
        int left1 = 10;
        int top1 = 10;
        int right1 = canvasWidth / 3;
        int bottom1 = canvasHeight /3;
        canvas.drawRect(left1, top1, right1, bottom1, paint);

        //修改画笔颜色
        paint.setColor(0xff8bc5ba);//A:ff,R:8b,G:c5,B:ba
        int left2 = canvasWidth / 3 * 2;
        int top2 = 10;
        int right2 = canvasWidth - 10;
        int bottom2 = canvasHeight / 3;
        canvas.drawRect(left2, top2, right2, bottom2, paint);
    }

}
