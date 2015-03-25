package com.mrhimanshu.add;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Entry extends Activity {
	MediaPlayer startsound;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	setContentView(R.layout.enrty);
	startsound = MediaPlayer.create(Entry.this,R.raw.untitled);
	startsound.start();
	Thread timer=new Thread()
	{
	public void run(){
		try{
			sleep(4500);
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			Intent openMain = new Intent("com.mrhimanshu.add.MAINACTIVITY");
			startActivity(openMain);
		}
		
		
		
	}
	};
	timer.start();
		
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	startsound.release();
		finish();
	}
	

}
