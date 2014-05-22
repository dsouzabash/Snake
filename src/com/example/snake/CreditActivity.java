package com.example.snake;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CreditActivity extends Activity {
	
	String[] list = { "Noel Chavady", "Ashley Dsouza" };
	TextView name;
	
	View credit_layout;
	LinearLayout main_layout;
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_main);
	    
	    //TODO:Write function to read names from text file
	    //list = getname...
	    
	    //enable visibility on credits
	    credit_layout = findViewById(R.id.credit_layout);
	    credit_layout.setVisibility(View.VISIBLE);
	    
	    //disable touch on rest of the buttons
	    main_layout = (LinearLayout) findViewById(R.id.main_layout);
	    for (int i = 0; i < main_layout.getChildCount(); i++) {
	        View child = main_layout.getChildAt(i);
	        child.setEnabled(false);
	    }
	    
	    //generate developer names
	    name = (TextView) findViewById(R.id.credit_view_line2);
	    for (int i = 0; i < list.length; i++) {
			name.append(list[i]);
			name.append("\n\n");
		}
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		if ( event.getAction() == MotionEvent.ACTION_DOWN)
		{
			finish ( );
		}
		return super.onTouchEvent(event);
	}
}
