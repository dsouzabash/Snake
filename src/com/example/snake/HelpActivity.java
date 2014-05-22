package com.example.snake;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class HelpActivity extends Activity {

	Canvas canvas;
	RelativeLayout layout;
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.game_layout);
	    layout = (RelativeLayout) findViewById(R.id.parent);
	    layout.setVisibility(View.VISIBLE);
	}


	/*@Override
	public boolean onTouchEvent(MotionEvent event) {
		if ( event.getAction() == MotionEvent.ACTION_DOWN)
		{
			Toast.makeText(getBaseContext(), "Touched Screen", Toast.LENGTH_LONG).show();
		}
		return super.onTouchEvent( event );
	}*/
	
	public void onClick ( View v )
	{
		String text = "";
		switch ( v.getId())
		{
		case R.id.btn_setting:
			text = "Setting Button";
			break;
		case R.id.btn_left:
			text = "Left Button";
			break;
		case R.id.btn_up_left:
			text = "Up Button";
			break;
		case R.id.btn_down_left:
			text = "Down Button";
			break;
		case R.id.btn_back:
			text = "Back Button";
			finish();
			break;
		case R.id.btn_up_right:
			text = "Up Button";
			break;
		case R.id.btn_down_right:
			text = "Down Button";
			break;
		case R.id.btn_right:
			text = "Right Button";
			break;
		}
		Toast.makeText(getBaseContext(), text, Toast.LENGTH_SHORT).show();
	}
}
