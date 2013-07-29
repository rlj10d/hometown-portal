/**
 * 
 * EntertainmentList.java
 * Author: Laura Jackson
 * July 28, 2013
 * 
 * This class defines an EntertainmentList object.
 * This object contains basic information about an entertainment activity.
 * 
 */

package com.example.hometownportal;

import android.graphics.Bitmap;

public class EntertainmentList {
	
	private Bitmap icon;
	private String name;
	private String phone;
	private String address;
	private String website;
	private String sDescript;
	private String lDescript;
	
	// Constructor for items without a website
	public EntertainmentList(Bitmap icon_, String name_, String phone_, String address_, String sDescript_, String lDescript_)
	{
		icon = icon_;
		name = name_;
		phone = phone_;
		address = address_;
		website = "";
		sDescript = sDescript_;
		lDescript = lDescript_;
		
	}
	
	public EntertainmentList(Bitmap icon_, String name_, String phone_, String address_, String sDescript_, String lDescript_, String website_)
	{
		icon = icon_;
		name = name_;
		phone = phone_;
		address = address_;
		sDescript = sDescript_;
		lDescript = lDescript_;
		website = website_;
	}

	// Getters and Setters
	
	protected Bitmap getIcon() {
		return icon;
	}

	protected void setIcon(Bitmap icon) {
		this.icon = icon;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	protected String getsDescript() {
		return sDescript;
	}

	protected void setsDescript(String sDescript) {
		this.sDescript = sDescript;
	}

	protected String getlDescript() {
		return lDescript;
	}

	protected void setlDescript(String lDescript) {
		this.lDescript = lDescript;
	}


}
