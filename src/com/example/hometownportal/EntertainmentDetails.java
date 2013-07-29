/**
 * 
 * EntertainmentDetails.java
 * Author: Laura Jackson
 * July 28, 2013
 * 
 * This class implements the EntertainmentDetails Activity.
 * It displays the details of an Entertainment item, including
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

public class EntertainmentDetails extends Activity {
	
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
			
			// Get the type of item from the Intent			
			String whichArray = extras.getString("list");
			
			// Pull data from item in the appropriate array
			if (whichArray.equals("parks")) {
				icon.setImageBitmap(EntertainmentActivity.getParks().get(extras.getInt("position")).getIcon());
				name.setText(EntertainmentActivity.getParks().get(extras.getInt("position")).getName());
				phone.setText(EntertainmentActivity.getParks().get(extras.getInt("position")).getPhone());
				address.setText(EntertainmentActivity.getParks().get(extras.getInt("position")).getAddress());
				website.setText(EntertainmentActivity.getParks().get(extras.getInt("position")).getWebsite());
				description.setText(EntertainmentActivity.getParks().get(extras.getInt("position")).getlDescript());
			}
			
			else if (whichArray.equals("nightlife")) {
				icon.setImageBitmap(EntertainmentActivity.getNightlife().get(extras.getInt("position")).getIcon());
				name.setText(EntertainmentActivity.getNightlife().get(extras.getInt("position")).getName());
				phone.setText(EntertainmentActivity.getNightlife().get(extras.getInt("position")).getPhone());
				address.setText(EntertainmentActivity.getNightlife().get(extras.getInt("position")).getAddress());
				website.setText(EntertainmentActivity.getNightlife().get(extras.getInt("position")).getWebsite());
				description.setText(EntertainmentActivity.getNightlife().get(extras.getInt("position")).getlDescript());
			}
			
			else {
				icon.setImageBitmap(EntertainmentActivity.getArts().get(extras.getInt("position")).getIcon());
				name.setText(EntertainmentActivity.getArts().get(extras.getInt("position")).getName());
				phone.setText(EntertainmentActivity.getArts().get(extras.getInt("position")).getPhone());
				address.setText(EntertainmentActivity.getArts().get(extras.getInt("position")).getAddress());
				website.setText(EntertainmentActivity.getArts().get(extras.getInt("position")).getWebsite());
				description.setText(EntertainmentActivity.getArts().get(extras.getInt("position")).getlDescript());
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
