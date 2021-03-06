package com.mycompany.zhutingxuanbaodalihuan;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;
import android.content.*;

public class xml1 extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xml1);
	}
	public void click5 (View view) 
    {
		finish();
    	Intent intent = new Intent(this,MainActivity.class);
    	startActivity(intent);
	}
	public void click4 (View view) 
    {
		finish();
    	Intent intent = new Intent(this,xml2.class);
    	startActivity(intent);
	}
}
