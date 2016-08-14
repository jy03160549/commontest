package com.example.commontest;

import java.util.ArrayList;

import com.examplet.design.pattern.Prototype;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ArrayList<String>  liststr=new ArrayList<String>();
        liststr.add("0001");
        Prototype prototype=new Prototype();
        prototype.setStr("dsfds");
        prototype.setTitle(1);
        prototype.setListstr(liststr);
        prototype.show();
        try {
        	 ArrayList<String>  liststr2=new ArrayList<String>();
        	 liststr2.add("0002");
			Prototype prototype2=prototype.clone();
			prototype2.setTitle(2);
			prototype2.setStr("cxvxc");
			prototype2.setListstr(liststr2);
			prototype2.show();
			prototype.show();
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }
}
