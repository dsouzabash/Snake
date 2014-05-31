package com.example.snake;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

	Button creditBtn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button btn = (Button) findViewById(R.id.btn_resume);
		btn.setEnabled(false);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void onClick ( View v )
	{
		switch(v.getId())
		{
			case R.id.btn_help:
				open_help_page ( );
				break;
			case R.id.btn_credit:
				open_credit_page();
				break;
			case R.id.btn_exit:
				exit_app();
				break;
			case R.id.btn_setting:
				open_setting ();
				break;
			default:
				break;
		}
	}
	
	private void open_help_page ()
	{
		startActivity(new Intent(this,HelpActivity.class));
	}
	
	private void open_credit_page ( )
	{
		startActivity(new Intent (this,CreditActivity.class));
	}
	
	private void open_setting ( )
	{
		startActivity(new Intent (this,SettingActivity.class));
	}
	private void exit_app()
	{
		finish();
	}
}
