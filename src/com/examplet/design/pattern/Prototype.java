package com.examplet.design.pattern;

import java.util.ArrayList;
import java.util.List;

import android.util.Log;

public class Prototype implements Cloneable{
	
	private static String TAG=Prototype.class.getName();
	
	private int title;
	
	private String str;
	
	
	private ArrayList<String>  liststr;


	public int getTitle() {
		return title;
	}


	public void setTitle(int title) {
		this.title = title;
	}


	public String getStr() {
		return str;
	}


	public void setStr(String str) {
		this.str = str;
	}


	public List<String> getListstr() {
		return liststr;
	}


	public void setListstr(ArrayList<String> liststr) {
		this.liststr = liststr;
	}


	@Override
	public Prototype clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Prototype prototype=(Prototype) super.clone(); 
		prototype.title=this.title;
		prototype.str=this.str;
		prototype.liststr=(ArrayList<String>) this.liststr.clone();
		
		return prototype;
	}
	
	
	public void show()
	{
		Log.i("TAG", "title:"+title+"  str:"+str+"  strlist:"+liststr.toString());
	}
	
	

}
