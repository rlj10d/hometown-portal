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
import android.widget.EditText;
import android.util.Log;

public class EducationActivity extends Activity {
	
	//
	// Constants
	//
	
	private static final int ID_B_PRIMARY_SCHOOLS	= R.id.bPrimarySchools;
	private static final int ID_B_SECONDARY_SCHOOLS	= R.id.bSecondarySchools;
	private static final int ID_B_COLLEGES			= R.id.bColleges;
	
	private static final String S_PRIMARY_SCHOOLS =
			"Primary Schools in Panama City\n\n" +
			"Bay Haven Charter Academy\n" 	+	
			"Callaway Elementary School\n" 	+	
			"Cedar Grove Elementary School\n" +	
			"Covenant Christian School\n" +
			"Good Shepherd Lutheran School\n" +
			"Hiland Park Elementary School\n" +	
			"Holy Nativity Episcopal School\n" +
			"Hutchison Beach Elementary School\n" +	
			"Kaleidoscope School Of Discovery\n" +
			"Lucille Moore Elementary School\n" +		
			"Merriam Cherry Street Elementary\n" +	
			"Millville Elementary School\n" +
			"Northside Elementary School\n" +
			"Oakland Terrace School\n" + 
			"Oscar Patterson Elementary Magnet\n" +
			"Panama City Advanced School\n" +
			"Panama City Christian School\n" +
			"Parker Elementary School\n" +
			"Springfield Elementary School\n" +
			"St. Andrew School\n" +
			"St. John Catholic School\n" +
			"Tommy Smith Elementary School\n";
	
	private static final String S_SECONDARY_SCHOOLS =
			"Secondary Schools in Panama City\n\n"	+
			"A. D. Harris High School\n"	+
			"Bay County Sheriff's Boot Camp\n"	+
			"Bay High School\n"	+
			"Chautauqua Charter School\n"	+
			"Covenant Christian School\n"	+
			"Fellowship Christian Academy\n"	+
			"Haney Technical High School\n"	+
			"Panama City Advanced School\n"	+
			"Rutherford High School\n";
	
	private static final String S_COLLEGES_UNIV =
			"Colleges & Universities in Panama City\n\n" +
			"Gulf Coast State College\n" +
			"Florida State University\n" +
			"Embry-Riddle Aeronautical University\n";
	
	//
	// Private attributes
	//
	private EditText _editText1;
	
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
				this._editText1.setText(S_PRIMARY_SCHOOLS);
				break;
				
			case ID_B_SECONDARY_SCHOOLS:
				Log.w("EducationActivity", "Button Click: Secondary Schools" );
				this._editText1.setText(S_SECONDARY_SCHOOLS);
				break;
				
			case ID_B_COLLEGES:
				Log.w("EducationActivity", "Button Click: Colleges" );
				this._editText1.setText(S_COLLEGES_UNIV);
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
		
		this._editText1 = (EditText) findViewById(R.id.editText1);
	}

	
	
	//
	// Private Methods
	//
	
}