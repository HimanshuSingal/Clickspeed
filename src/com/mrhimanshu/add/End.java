package com.mrhimanshu.add;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class End extends Activity{
TextView display1,display2;
Button restart;	
@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.end);
		Intent openend=getIntent();
	float score=openend.getIntExtra("counter",-1);
	display1 = (TextView) findViewById(R.id.tvisplay);
    display1.setTextColor(Color.WHITE);
    display2 = (TextView) findViewById(R.id.score);
    display2.setText("Your Speed is "+(score/30)+" taps per second");
    display2.setTextColor(Color.WHITE);
    restart = (Button) findViewById(R.id.restart);
    restart.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent re = new Intent("com.mrhimanshu.add.MAINACTIVITY");
			startActivity(re);
		}
	});
    
	}

@Override
protected void onPause() {
	// TODO Auto-generated method stub
	super.onPause();
	finish();
}
}
