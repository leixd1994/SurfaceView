package com.example.leixd.surfaceviewtest;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by leixd on 17-1-31.
 */

public class MySurfaceView extends SurfaceView implements SurfaceHolder.Callback{
    SurfaceHolder surfaceHolder;
    Paint paint;


    public MySurfaceView(Context context, AttributeSet attributeSet)
    {
        super(context,attributeSet);
        surfaceHolder=getHolder();
        surfaceHolder.addCallback(this);
        draw();

    }

    @Override
    public void surfaceCreated(SurfaceHolder surfaceHolder) {

    }

    @Override
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {

    }

    public void draw()
    {
        Canvas canvas=surfaceHolder.lockCanvas();
        paint=new Paint();
        paint.setColor(Color.RED);
        canvas.drawColor(Color.GREEN);
        canvas.drawLine(0,0,600,600,paint);
        surfaceHolder.unlockCanvasAndPost(canvas);

    }
}
