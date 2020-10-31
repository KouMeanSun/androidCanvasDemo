package com.gmy.mycanvas.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class ARGBView extends View {
    public ARGBView(Context context) {
        super(context);
    }

    public ARGBView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ARGBView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public ARGBView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawARGB(canvas);
    }
    private void drawARGB(Canvas canvas){
        canvas.drawARGB(255, 139, 197, 186);
    }

}
