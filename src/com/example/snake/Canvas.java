package com.example.snake;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Toast;

public class Canvas extends GLSurfaceView {

	CanvasRenderer renderer;
	public Canvas(Context context, AttributeSet attrs) {
		super(context, attrs);
		
		//Must specify that OpenGL 2.0 API is used
		setEGLContextClientVersion(2);
		
		//Instantiate Renderer
		renderer = new CanvasRenderer();
		setRenderer(renderer);
		
		//Set Rendering Mode
		setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
	}
	


    private final float TOUCH_SCALE_FACTOR = 180.0f / 320;
    private float mPreviousX;
    private float mPreviousY;
    
	@Override
	public boolean onTouchEvent(MotionEvent e) {
		if ( e.getAction() == MotionEvent.ACTION_DOWN)
		{
			Toast.makeText(getContext(), "Touched Screen", Toast.LENGTH_LONG).show();
		}
        // MotionEvent reports input details from the touch screen
        // and other input controls. In this case, you are only
        // interested in events where the touch position changed.

        float x = e.getX();
        float y = e.getY();

        switch (e.getAction()) {
            case MotionEvent.ACTION_MOVE:

                float dx = x - mPreviousX;
                float dy = y - mPreviousY;

                // reverse direction of rotation above the mid-line
                if (y > getHeight() / 2) {
                    dx = dx * -1 ;
                }

                // reverse direction of rotation to left of the mid-line
                if (x < getWidth() / 2) {
                    dy = dy * -1 ;
                }

                renderer.setAngle(
                		renderer.getAngle() +
                        ((dx + dy) * TOUCH_SCALE_FACTOR));  // = 180.0f / 320
                requestRender();
        }

        mPreviousX = x;
        mPreviousY = y;
		return super.onTouchEvent(e);
	}
}
