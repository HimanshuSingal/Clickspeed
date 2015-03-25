package com.mrhimanshu.add;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;


public class MainActivity extends Activity {

	int counter;
	Button add;
	TextView display;
    Thread timer;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        counter=0;
        add = (Button) findViewById(R.id.badd);
        display = (TextView) findViewById(R.id.tvDisplay);
        display.setTextColor(Color.WHITE);
        timer=new Thread()
    	{
    	public void run(){
    		try{
    			sleep(30000);
    		}catch(InterruptedException e){
    			e.printStackTrace();
    		}finally{
    			Intent openend = new Intent("com.mrhimanshu.add.END");
    			openend.putExtra("counter", counter);
    			startActivity(openend);
    		}
    		
    		
    		
    	}
    	};

        add.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
	if(counter==0)
	{
		timer.start();
	    add.setText("Tap");
	}
	else
				counter++;	
			}
		})   ;     
            	
    	
    		

     
    }
    @Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
	
    
    
    
    

    
}
