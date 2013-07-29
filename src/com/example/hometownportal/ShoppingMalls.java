/**
 * 
 * ShoppingMalls.java
 * Author: Laura Jackson
 * July 28, 2013
 * 
 * This class implements the ShoppingMalls ListActivity.
 * It displays a ListView of shopping malls in Panama City.
 * 
 */

package com.example.hometownportal;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;

public class ShoppingMalls extends ListActivity {
	
	ShopListAdapter adapter;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		// set content of ListView via custom adapter
		adapter = new ShopListAdapter(this, R.layout.shop_entry, ShoppingActivity.getMalls());
		setListAdapter(adapter);
		
	}	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	
	public void onListItemClick(ListView parent, View v, int position,
			long id) {
			Intent i = new Intent(this, ShopDetails.class);
			i.putExtra("position", position);
			i.putExtra("list", "malls");
			startActivity(i);
	}


}
