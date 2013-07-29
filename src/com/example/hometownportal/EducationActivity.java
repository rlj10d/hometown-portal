/*
 * Roy Johnson - rlj10d
 * CIS 4930 - Android
 * 7/21/13
 * Group Portal Project
 * 
 * This class defines the Education activity
 */

package com.example.hometownportal;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.util.Log;

public class EducationActivity extends Activity {
	
	//
	// Constants
	//
	
	private static final int ID_B_PRIMARY_SCHOOLS	= R.id.bPrimarySchools;
	private static final int ID_B_SECONDARY_SCHOOLS	= R.id.bSecondarySchools;
	private static final int ID_B_COLLEGES			= R.id.bColleges;
	private static final int ID_B_UNIVERSITIES		= R.id.bUniversities;
	
	
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
			case ID_B_PRIMARY_SCHOOLS:
				Log.w("EducationActivity", "Button Click: Primary Schools" );
				break;
				
			case ID_B_SECONDARY_SCHOOLS:
				Log.w("EducationActivity", "Button Click: Secondary Schools" );
				break;
				
			case ID_B_COLLEGES:
				Log.w("EducationActivity", "Button Click: Colleges" );
				break;
				
			case ID_B_UNIVERSITIES:
				Log.w("EducationActivity", "Button Click: Universities" );
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
		setContentView(R.layout.education);
	}

	
	
	//
	// Private Methods
	//
	
}