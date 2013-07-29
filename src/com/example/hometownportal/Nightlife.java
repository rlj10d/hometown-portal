/**
 * 
 * Nightlife.java
 * Author: Laura Jackson
 * July 28, 2013
 * 
 * This class implements the Nightlife ListActivity.
 * It contains a ListView of night life activities in Panama City, FL.
 * 
 */

package com.example.hometownportal;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;

public class Nightlife extends ListActivity {
	
EntertainmentListAdapter adapter;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		// set content of the ListView via the custom adapter
		adapter = new EntertainmentListAdapter(this, R.layout.entertainment_entry, EntertainmentActivity.getNightlife());
		setListAdapter(adapter);
		
	}	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	// when user clicks on a row, a new activity is started to view the details.
	public void onListItemClick(ListView parent, View v, int position,
			long id) {
			Intent i = new Intent(this, EntertainmentDetails.class);
			i.putExtra("position", position);
			i.putExtra("list", "nightlife");
			startActivity(i);
	}

}
