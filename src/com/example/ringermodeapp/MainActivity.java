package com.example.ringermodeapp;

import android.media.AudioManager;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	Button btn1,btn2,btn3,btn4;
	AudioManager am;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn1=(Button)findViewById(R.id.button1);
		btn2=(Button)findViewById(R.id.button2);
		btn3=(Button)findViewById(R.id.button3);
		btn4=(Button)findViewById(R.id.button4);
		am=(AudioManager)getSystemService(AUDIO_SERVICE);
		btn1.setOnClickListener(this);
		btn2.setOnClickListener(this);
		btn3.setOnClickListener(this);
		btn4.setOnClickListener(this);
	}
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Integer a=arg0.getId();
		if(a==R.id.button1)
		{
			am.setRingerMode(AudioManager.RINGER_MODE_SILENT);
			Toast.makeText(getApplicationContext(), "Silent", Toast.LENGTH_SHORT).show();
		}
		else if(a==R.id.button2)
		{
			am.setRingerMode(AudioManager.RINGER_MODE_VIBRATE);
			Toast.makeText(getApplicationContext(), "Vibrate", Toast.LENGTH_SHORT).show();
		}
		else if(a==R.id.button3)
		{
			am.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
			Toast.makeText(getApplicationContext(), "Normal", Toast.LENGTH_SHORT).show();
		}
		else if(a==R.id.button4)
		{
			Integer i=am.getRingerMode();
			if(i==AudioManager.RINGER_MODE_SILENT)
			{
				Toast.makeText(getApplicationContext(), "Silent", Toast.LENGTH_SHORT).show();
			}
			if(i==AudioManager.RINGER_MODE_VIBRATE)
			{
				Toast.makeText(getApplicationContext(), "Vibrate", Toast.LENGTH_SHORT).show();
			}
			if(i==AudioManager.RINGER_MODE_NORMAL)
			{
				Toast.makeText(getApplicationContext(), "Normal", Toast.LENGTH_SHORT).show();
			}
		}
	}
}
