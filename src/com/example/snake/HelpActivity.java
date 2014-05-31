package com.example.snake;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import android.os.Bundle;
import android.util.Log;
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
	    
	    // Check if the system supports OpenGL ES 2.0.
	    final ActivityManager activityManager = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
	    final ConfigurationInfo configurationInfo = activityManager.getDeviceConfigurationInfo();
	    final boolean supportsEs2 = configurationInfo.reqGlEsVersion >= 0x20000;
	 
	    if (supportsEs2)
	    {
	    	Log.d("HelpActivity", "Supports OpenGL 2.0");
	    	setContentView(R.layout.game_layout);
		    layout = (RelativeLayout) findViewById(R.id.parent);
		    layout.setVisibility(View.VISIBLE);
	    }
	    else
	    {
	        // This is where you could create an OpenGL ES 1.x compatible
	        // renderer if you wanted to support both ES 1 and ES 2.
	    	Log.d("HelpActivity", "Does not support OpenGL 2.0");
	        return;
	    }
	}
	
	public void onClick ( View v )
	{
		String text = "";
		switch ( v.getId())
		{
		case R.id.btn_setting:
			text = "Settings";
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
