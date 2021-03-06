package com.mycompany.zhutingxuanbaodalihuan;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;
import android.content.*;
import java.util.concurrent.*;

public class xml2 extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xml2);
		tiaozhuan1();
		}
    	
	public void tiaozhuan1 () 
    {
		finish();
    	Intent intent = new Intent(this,xml3.class);
    	startActivity(intent);
	}
}
