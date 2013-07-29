/**
 * 
 * ShopDetails.java
 * Author: Laura Jackson
 * July 28, 2013
 * 
 * This class implements the ShopDetails Activity.
 * It displays the details of an Shop item, including
 * name, phone number, address, website, and a description.
 * 
 */

package com.example.hometownportal;

import android.app.Activity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

public class ShopDetails extends Activity {
	
	TextView name;
	TextView phone;
	TextView address;
	TextView website;
	TextView description;
	ImageView icon;
			
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.shop_details); 
			
			Bundle extras = getIntent().getExtras();
			
			name = (TextView)findViewById(R.id.sdName);
			phone = (TextView)findViewById(R.id.sdPhone);
			address = (TextView)findViewById(R.id.sdAddress);
			website = (TextView)findViewById(R.id.sdWebsite);
			description = (TextView)findViewById(R.id.sdLDescript);
			icon = (ImageView)findViewById(R.id.sdIcon);
			
			// Get item type from intent
			String whichArray = extras.getString("list");
			
			// Pull data from item in the appropriate array			
			if (whichArray.equals("all")) {
				icon.setImageBitmap(ShoppingActivity.getAllShops().get(extras.getInt("position")).getIcon());
				name.setText(ShoppingActivity.getAllShops().get(extras.getInt("position")).getName());
				phone.setText(ShoppingActivity.getAllShops().get(extras.getInt("position")).getPhone());
				address.setText(ShoppingActivity.getAllShops().get(extras.getInt("position")).getAddress());
				website.setText(ShoppingActivity.getAllShops().get(extras.getInt("position")).getWebsite());
				description.setText(ShoppingActivity.getAllShops().get(extras.getInt("position")).getlDescript());
			}
			
			else if (whichArray.equals("malls")) {
				icon.setImageBitmap(ShoppingActivity.getMalls().get(extras.getInt("position")).getIcon());
				name.setText(ShoppingActivity.getMalls().get(extras.getInt("position")).getName());
				phone.setText(ShoppingActivity.getMalls().get(extras.getInt("position")).getPhone());
				address.setText(ShoppingActivity.getMalls().get(extras.getInt("position")).getAddress());
				website.setText(ShoppingActivity.getMalls().get(extras.getInt("position")).getWebsite());
				description.setText(ShoppingActivity.getMalls().get(extras.getInt("position")).getlDescript());
			}
			
			else {
				icon.setImageBitmap(ShoppingActivity.getSpecialty().get(extras.getInt("position")).getIcon());
				name.setText(ShoppingActivity.getSpecialty().get(extras.getInt("position")).getName());
				phone.setText(ShoppingActivity.getSpecialty().get(extras.getInt("position")).getPhone());
				address.setText(ShoppingActivity.getSpecialty().get(extras.getInt("position")).getAddress());
				website.setText(ShoppingActivity.getSpecialty().get(extras.getInt("position")).getWebsite());
				description.setText(ShoppingActivity.getSpecialty().get(extras.getInt("position")).getlDescript());
			}
			
			// add links
			Linkify.addLinks(phone, Linkify.PHONE_NUMBERS);
			Linkify.addLinks(website, Linkify.WEB_URLS);

		}	

		@Override
		public boolean onCreateOptionsMenu(Menu menu) {
			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.main, menu);
			return true;
		}

}
