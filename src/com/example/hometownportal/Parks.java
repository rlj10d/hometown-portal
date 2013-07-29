/**
 * 
 * Parks.java
 * Author: Laura Jackson
 * July 28, 2013
 * 
 * This class implements the Parks ListActivity.
 * It contains a ListView of parks in Panama City, FL.
 * 
 */

package com.example.hometownportal;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;

public class Parks extends ListActivity {
	
EntertainmentListAdapter adapter;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		// set content of ListView via our custom adapter
		adapter = new EntertainmentListAdapter(this, R.layout.entertainment_entry, EntertainmentActivity.getParks());
		setListAdapter(adapter);
		
	}	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	// when user clicks item, start new activity to show item details
	public void onListItemClick(ListView parent, View v, int position,
			long id) {
			Intent i = new Intent(this, EntertainmentDetails.class);
			i.putExtra("position", position);
			i.putExtra("list", "parks");
			startActivity(i);
	}

}
