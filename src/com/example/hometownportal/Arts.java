/**
 * 
 * Arts.java
 * Author: Laura Jackson
 * July 28, 2013
 * 
 * This class implements the Arts ListActivity.
 * It displays a ListView of Arts activities in Panama City, FL.
 * When the user clicks the item, they can view the item's details.
 * 
 */

package com.example.hometownportal;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;

public class Arts extends ListActivity {
	
EntertainmentListAdapter adapter;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		// Set contents of ListView
		adapter = new EntertainmentListAdapter(this, R.layout.entertainment_entry, EntertainmentActivity.getArts());
		setListAdapter(adapter);
		
	}	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	// When item is clicked, start new activity to see the details
	public void onListItemClick(ListView parent, View v, int position,
			long id) {
			Intent i = new Intent(this, EntertainmentDetails.class);
			i.putExtra("position", position);
			i.putExtra("list", "arts");
			startActivity(i);
	}

}
