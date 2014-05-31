package com.example.snake;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Toast;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class SettingActivity extends Activity implements OnSeekBarChangeListener {

	SeekBar level;
	int	progress;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.setting_page);
		Button btn = (Button) findViewById(R.id.btn_setting_resume);
		btn.setVisibility(View.INVISIBLE);
		level = (SeekBar) findViewById(R.id.seekBar1);
		level.setOnSeekBarChangeListener(this);
	}
	
	public void onClick ( View v )
	{
		if ( v.getId() == R.id.btn_setting_back )
		{
			finish ( );
		}
		else
		{
			
		}
	}

	@Override
	public void onProgressChanged(SeekBar arg0, int arg1, boolean arg2) {
		progress = arg1;
		
	}

	@Override
	public void onStartTrackingTouch(SeekBar arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStopTrackingTouch(SeekBar arg0) {
		Toast.makeText(getBaseContext(), "Level Selected "+progress, Toast.LENGTH_SHORT).show();
		
	}
}
