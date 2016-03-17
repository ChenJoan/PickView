package com.jock.pickerview;

import java.util.jar.Attributes.Name;

import android.R.integer;

public class RegionInfo {
	
	private int id;
	private int parent;
	private String name;
	private int type;
	public RegionInfo() {
		super();
	}
	
	public RegionInfo(int id, int parent, String name) {
		super();
		this.id = id;
		this.parent = parent;
		this.name = name;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getParent() {
		return parent;
	}
	public void setParent(int parent) {
		this.parent = parent;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}

	@Override
	public String toString()
	{
		return "RegionInfo [name=" + name + "]";
	}

	
	  //这个用来显示在PickerView上面的字符串,PickerView会通过反射获取getPickerViewText方法显示出来。
    public String getPickerViewText() {
        //这里还可以判断文字超长截断再提供显示
		return name;
    }
	
	

}
