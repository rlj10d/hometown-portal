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
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.util.Log;

public class EmploymentActivity extends Activity {
	
	//
	// Constants
	//
	
	private static final int ID_B_JOB_LISTINGS		= R.id.bJobListings;
	private static final int ID_B_TIPS_AND_TRICKS	= R.id.bTipsAndTricks;
	
	//
	// Private attributes
	//
	private WebView _myWebView;
	
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
		WebSettings webSettings = this._myWebView.getSettings();
		webSettings.setJavaScriptEnabled(true);
		
		switch( view.getId() )
		{	
			case ID_B_JOB_LISTINGS:
				Log.w("EmploymentActivity", "Button Click: Job Listings" );
				this._myWebView.loadUrl("http://m.monster.com/JobSearch/Search?jobtitle=&keywords=&where=32408");
				break;
				
			case ID_B_TIPS_AND_TRICKS:
				Log.w("EmploymentActivity", "Button Click: Tips and Tricks" );
				this._myWebView.loadUrl("http://m.yahoo.com/w/legobpengine/finance/news/6-sure-ways-sabotage-job-114506127.html?.b=career-education%2F&.cf3=Jumbotron&.cf4=3&.cf5=Forbes&.cf6=%2Fcareer-education%2F&.ts=1366059661&.intl=us&.lang=en&.ysid=EBP99q36bhvLJlhSOFMvq0IG");
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
		
		this._myWebView = (WebView) findViewById(R.id.webView1);
	}

	
	
	//
	// Private Methods
	//
	
}
