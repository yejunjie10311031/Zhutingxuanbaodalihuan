package com.mycompany.zhutingxuanbaodalihuan;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;
import android.content.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		}
	public void click1 (View view) 
    {
    	finish();
	}
	public void click2 (View view) 
    {
		finish();
    	Intent intent = new Intent(this,xml1.class);
    	startActivity(intent);
	}
}
