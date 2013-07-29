/*
 * Roy Johnson - rlj10d
 * CIS 4930 - Android
 * 7/21/13
 * Group Portal Project
 * 
 * This class defines the Employment activity
 */

package com.example.hometownportal;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.util.Log;

public class EmploymentActivity extends Activity {
	
	//
	// Constants
	//
	
	private static final int ID_B_JOB_LISTINGS		= R.id.bJobListings;
	private static final int ID_B_TIPS_AND_TRICKS	= R.id.bTipsAndTricks;
	
	
	//
	// Public methods
	//
	
	//-----------------------------------------------------------------------
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	//-----------------------------------------------------------------------
	public void onButtonClick(View view)
	{
		switch( view.getId() )
		{
			case ID_B_JOB_LISTINGS:
				Log.w("EmploymentActivity", "Button Click: Job Listings" );
				break;
				
			case ID_B_TIPS_AND_TRICKS:
				Log.w("EmploymentActivity", "Button Click: Tips and Tricks" );
				break;
		}
	}
	
	//
	// Protected methods
	//
	
	//-----------------------------------------------------------------------
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.employment);
	}

	
	
	//
	// Private Methods
	//
	
}
