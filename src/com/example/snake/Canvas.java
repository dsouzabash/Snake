package com.example.snake;

import android.content.Context;
import android.graphics.PixelFormat;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Toast;

public class Canvas extends GLSurfaceView {

	myRenderer renderer;
	public Canvas(Context context, AttributeSet attrs) {
		super(context, attrs);
		
		//Must specify that OpenGL 2.0 API is used
		setEGLContextClientVersion(2);
		
		//Instantiate Renderer
		renderer = new myRenderer();// CanvasRenderer();
		setRenderer(renderer);
		
		//Set Rendering Mode
		//setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
		
		//setEGLConfigChooser (8, 8, 8, 8, 16, 0);
		//getHolder ().setFormat (PixelFormat.TRANSLUCENT);
		//setZOrderOnTop (true); 
		
		//setBackgroundResource(R.drawable.background1);
		Log.d("Canvas", "Constructor");
	}
    
	@Override
	public boolean onTouchEvent(MotionEvent e) {
		if ( e.getAction() == MotionEvent.ACTION_DOWN)
		{
			Toast.makeText(getContext(), "Touched Screen", Toast.LENGTH_SHORT).show();
		}
		return super.onTouchEvent(e);
	}
}
