package com.alorweb.flashlightsmall;

import android.app.*;
import android.os.*;
import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.widget.*;
import android.view.View.*;
import android.view.*;

public class MainActivity extends Activity 
{
	boolean on=false;
	Camera c;
	ToggleButton tb;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		tb=(ToggleButton) findViewById(R.id.tb);
		c=Camera.open();
		final Parameters p=c.getParameters();
		tb.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					if(on){
						p.setFlashMode(Parameters.FLASH_MODE_OFF);
						c.setParameters(p);
						on=false;
					}else{
						p.setFlashMode(Parameters.FLASH_MODE_TORCH);
						c.setParameters(p);
						on=true;
					}
					
				}
				
			
		});
    }
}
