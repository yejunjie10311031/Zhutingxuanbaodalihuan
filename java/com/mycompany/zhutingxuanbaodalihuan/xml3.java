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
		final ImageView image4 = (ImageView) findViewById(R.id.image4);
        final ImageView image5 = (ImageView) findViewById(R.id.image5);
		final TextView text1=(TextView) findViewById(R.id.text1);
		final TextView text2=(TextView) findViewById(R.id.text2);
		final TextView text3=(TextView) findViewById(R.id.text3);
        Button button1 = (Button) findViewById(R.id.button1);
		Button button2 = (Button) findViewById(R.id.button2);
		Button button3 = (Button) findViewById(R.id.button3);
		Button button4 = (Button) findViewById(R.id.button4);
		Button button5 = (Button) findViewById(R.id.button5);
		final weizhi wz1=new weizhi();
		image1.setX(0);
		image4.setX(0);
		image1.setY(0);
		image4.setY(0);
        button1.setOnClickListener(new OnClickListener() {
        
				@Override
				public void onClick(View p1)
				{
					wz1.w1=wz1.w1+20;
					wz1.w2=wz1.w2+20;
					image1.setX(wz1.w1);
				   image2.setX(wz1.w1);   
				   image3.setX(wz1.w2);
					text1.setText("坐标"+wz1.w2+"   "+wz1.w3);
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
					text1.setText("坐标"+wz1.w2+"   "+wz1.w3);
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
					text1.setText("坐标"+wz1.w2+"   "+wz1.w3);
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
					text1.setText("坐标"+wz1.w2+"   "+wz1.w3);
				}
			});
			
		button5.setOnClickListener(new OnClickListener() {
                int sm1=30;
				@Override
				public void onClick(View p1)
				{
					float p2=image4.getX()-image3.getX();
					float p3=image2.getY()-image4.getY();
					if(p2<=120&&p2>=-120&&p3<=140&&p3>=-140)
					{
					sm1=sm1-3;
					if (sm1==0)
					{
						fight();
					}
				}
				else sm1=sm1+0;
				text2.setText("李焕生命值:"+"  "+sm1);
				}
			});
			final int health2=40;
		new Thread()
		{
			public void run()
			{
				while (true)
				{
					float p1=image4.getX()-image1.getX();
					float p2=image1.getY()-image4.getY();
					float p3=wz1.w5-wz1.w1;
					float p4=wz1.w3-wz1.w6;
					if(p1>=80)
					{
						try
						{
							image4.setX(image4.getX()-18);
                            image5.setX(image5.getX()-18);
							Thread.sleep(500);
						}
						catch (InterruptedException e)
						{

						}
					}
					if(p1<=-80)
					{
						try
						{
							image4.setX(image4.getX()+18);
                            image5.setY(image5.getY()+18);
							Thread.sleep(500);
						}
						catch (InterruptedException e)
						{

						}
					}
					if (p2<=-60)
					{
						try
						{
							image4.setY(image4.getY()-20);
                            image5.setY(image5.getY()-20);
							Thread.sleep(500);
						}
						catch (InterruptedException e)
						{

						}
					}
					if (p2>=60)
					{
						try
						{
							image4.setY(image4.getY()+20);
                            image5.setY(image5.getY()+20);
							Thread.sleep(500);
						}
						catch (InterruptedException e)
						{

						}
					}
					if(p3<=100&&p3>=-100&&p2<=100&&p2>=-100)
					{
						try
						{
							Thread.sleep(300);
						float sm2=health2-4;
						if (sm2==0)
						{
							fight();
						}
						else sm2=sm2+0;
						}
						catch (InterruptedException e)
						{

						}
					}
				}
			}
		}.start();
			
		}
		
	public class weizhi
	{
		public int w1=190;
		public int w2=254;
		public int w3=220;
		public int w4=100;
		public int w5=1000;
		public int w6=150;
		}
		
	public int health1=30;
	public void fight () 
    {
		finish();
    	Intent intent = new Intent(this,xml4.class);
    	startActivity(intent);
		
	}
	public void tiaozhuan ()
	{
		try
		{
			TimeUnit.SECONDS.sleep(3);
		}
		catch (InterruptedException e)
		{
			
		}
	}
	}
	
