package com.mycompany.zhutingxuanbaodalihuan;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;
import android.content.*;
import java.util.concurrent.*;

public class xml3 extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
		tiaozhuan();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xml3);
		
	}
	public int health1=30;
	public void fight (View view) 
    {
		health1=health1-3;
		if(health1==0)
		{
		finish();
    	Intent intent = new Intent(this,xml4.class);
    	startActivity(intent);
		}
	}
	public void tiaozhuan ()
	{
		try
		{
			TimeUnit.SECONDS.sleep(3);
		}
		catch (InterruptedException e)
		{
			finish();
			Intent intent = new Intent(this,xml3.class);
			startActivity(intent);
		}
	}
}
