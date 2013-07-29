package com.example.hometownportal;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.LinearLayout;

public class NewsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.news);
		
		LinearLayout l = (LinearLayout)findViewById(R.id.article1);
		l.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.pcgov.org/city-news/2012waterqualityreport"));
				startActivity(browserIntent);
			}
		});
		
		l = (LinearLayout)findViewById(R.id.article1_2);
		l.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.pcgov.org/city-news/2012waterqualityreport"));
				startActivity(browserIntent);
			}
		});
		
		l = (LinearLayout)findViewById(R.id.article2);
		l.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.pcgov.org/city-news/2013tentativeannualbudget"));
				startActivity(browserIntent);
				
			}
		});

		l = (LinearLayout)findViewById(R.id.article2_2);
		l.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.pcgov.org/city-news/2013tentativeannualbudget"));
				startActivity(browserIntent);
			}
		});
		
		l = (LinearLayout)findViewById(R.id.article3);
		l.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.pcgov.org/city-news/thecityofpanamacitypubliceventshandbook"));
				startActivity(browserIntent);
				
			}
		});

		l = (LinearLayout)findViewById(R.id.article3_2);
		l.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.pcgov.org/city-news/thecityofpanamacitypubliceventshandbook"));
				startActivity(browserIntent);
			}
		});
		
		l = (LinearLayout)findViewById(R.id.article4);
		l.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.pcgov.org/city-news/onlinecrime-mapping"));
				startActivity(browserIntent);
				
			}
		});

		l = (LinearLayout)findViewById(R.id.article4_2);
		l.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.pcgov.org/city-news/onlinecrime-mapping"));
				startActivity(browserIntent);
			}
		});
		
		l = (LinearLayout)findViewById(R.id.article5);
		l.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.pcgov.org/city-news/waterwastewaterratesufficiencyreview"));
				startActivity(browserIntent);
				
			}
		});

		l = (LinearLayout)findViewById(R.id.article5_2);
		l.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.pcgov.org/city-news/waterwastewaterratesufficiencyreview"));
				startActivity(browserIntent);
			}
		});
		
		l = (LinearLayout)findViewById(R.id.article6);
		l.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.pcgov.org/city-news/affordablehousingsurvey"));
				startActivity(browserIntent);
				
			}
		});

		l = (LinearLayout)findViewById(R.id.article6_2);
		l.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.pcgov.org/city-news/affordablehousingsurvey"));
				startActivity(browserIntent);
			}
		});
		
		l = (LinearLayout)findViewById(R.id.article7);
		l.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.pcgov.org/city-news/biodieselprogram"));
				startActivity(browserIntent);
				
			}
		});

		l = (LinearLayout)findViewById(R.id.article7_2);
		l.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.pcgov.org/city-news/biodieselprogram"));
				startActivity(browserIntent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
