package com.mycompany.zhutingxuanbaodalihuan;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;
import android.content.*;
import java.util.concurrent.*;

public class xml4 extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xml4);
	}
    public void c1 (View view) 
    {
        finish();
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
	}
}
