package com.mycompany.zhutingxuanbaodalihuan;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;
import android.content.*;
import java.util.concurrent.*;
import android.view.View.*;
import android.view.ViewGroup.*;

public class xml3 extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
		tiaozhuan();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xml3);
		final ImageView image1 = (ImageView) findViewById(R.id.image1);
		final ImageView image2 = (ImageView) findViewById(R.id.image2);
		final ImageView image3 = (ImageView) findViewById(R.id.image3);
        Button button1 = (Button) findViewById(R.id.button1);
		Button button2 = (Button) findViewById(R.id.button2);
		Button button3 = (Button) findViewById(R.id.button3);
		Button button4 = (Button) findViewById(R.id.button4);
		final weizhi wz1=new weizhi();
        button1.setOnClickListener(new OnClickListener() {
        
				@Override
				public void onClick(View p1)
				{
					wz1.w1=wz1.w1+20;
					wz1.w2=wz1.w2+20;
					image1.setX(wz1.w1);
				   image2.setX(wz1.w1);   
				   image3.setX(wz1.w2);
				}
			});
		button2.setOnClickListener(new OnClickListener() {
			
				@Override
				public void onClick(View p1)
				{
					wz1.w2=wz1.w2-20;
					wz1.w1=wz1.w1-20;
					image1.setX(wz1.w1);
					image2.setX(wz1.w1);
					image3.setX(wz1.w2);
				}
			});
        button3.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View p1)
				{
					wz1.w3=wz1.w3-20;
					wz1.w4=wz1.w4-20;
					image1.setY(wz1.w4);
					image2.setY(wz1.w3);   
					image3.setY(wz1.w3-10);
				}
			});
		button4.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View p1)
				{
					wz1.w3=wz1.w3+20;
					wz1.w4=wz1.w4+20;
					image1.setY(wz1.w4);
					image2.setY(wz1.w3);   
					image3.setY(wz1.w3+10);
				}
			});
	}
	public class weizhi
	{
		public int w1=190;
		public int w2=254;
		public int w3=220;
		public int w4=100;
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
