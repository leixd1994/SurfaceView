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
    Canvas canvas;
    private MyThread myThread;
    public MySurfaceView(Context context, AttributeSet attributeSet)
    {
        super(context,attributeSet);
        surfaceHolder=getHolder();
        surfaceHolder.addCallback(this);
        paint=new Paint();
        paint.setColor(Color.RED);

    }

    @Override
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
myThread=new MyThread();
  myThread.start();
    }

    @Override
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {

    }
    class MyThread extends Thread
    {
        @Override
        public void run() {
            super.run();
            canvas=surfaceHolder.lockCanvas();
            canvas.drawColor(Color.);
            canvas.drawLine(0,0,600,600,paint);

surfaceHolder.unlockCanvasAndPost(canvas);
        }
    }

}
