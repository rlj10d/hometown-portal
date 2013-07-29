package com.example.hometownportal;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class DiningActivity extends Activity 
{
	WebView wv;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.restaurants);
		
		
		wv = (WebView) findViewById(R.id.wvYelp);
		wv.setWebViewClient(new WebViewClient() {
			@Override  
			  public boolean shouldOverrideUrlLoading(WebView view, String url) {  
				    view.loadUrl(url);
				    return true;
			  }
		});
		wv.getSettings().setJavaScriptEnabled(true);
		wv.loadUrl("http://www.yelp.com/search?cflt=restaurants&find_loc=Panama+City%2C+FL");
	}
	
	public void goHomeClick(View view) {
		Intent i = new Intent(this, MainActivity.class);
		startActivity(i);
	}
	
	@Override
	public void onBackPressed()
	{
	    if(wv.canGoBack())
	    	wv.goBack();
	    else
	    {
			Intent i = new Intent(this, MainActivity.class);
			startActivity(i);
	    }
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
