/**
 * 
 * MainActivity.java
 * Author: Laura Jackson
 * July 28, 2013
 * 
 * This is the MainActivity class.
 * It generates a new Activity based on the user's selection.
 * 
 */

package com.example.hometownportal;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void entertainmentActivity(View view) {
		
		Intent i = new Intent(this, EntertainmentActivity.class);
		startActivity(i);
		
	}
	
	public void diningActivity(View view) {		
		Intent i = new Intent(this, DiningActivity.class);
		startActivity(i);
	}
	
	public void shoppingActivity(View view) {
		
		Intent i = new Intent(this, ShoppingActivity.class);
		startActivity(i);
		
	}
	
	public void employmentActivity(View view) {
		Intent i = new Intent(this, EmploymentActivity.class);
		startActivity(i);
	}
	
	public void schoolActivity(View view) {
		Intent i = new Intent(this, EducationActivity.class);
		startActivity(i);
	}
	
	public void newsActivity(View view) {
		Intent i = new Intent(this, NewsActivity.class);
		startActivity(i);
	}
	
	public void historyActivity(View view) {
		Intent i = new Intent(this, HistoryActivity.class);
		startActivity(i);
	}

}
