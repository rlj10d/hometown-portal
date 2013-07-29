/**
 * 
 * EntertainmentListAdapter.java
 * Author: Laura Jackson
 * July 28, 2013
 * 
 * This class implements the EntertainmentListAdapter.
 * This is a custom adapter for an EntertainmentList object.
 * 
 */

package com.example.hometownportal;

import java.util.ArrayList;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class EntertainmentListAdapter extends ArrayAdapter<EntertainmentList> {
	
	private ArrayList<EntertainmentList> mEntertainmentList;
	
	public EntertainmentListAdapter(Context context, int textViewResourceId, ArrayList<EntertainmentList> objects) {
		super(context, textViewResourceId, objects);
		this.mEntertainmentList = objects;
	}
	
	@Override
	public int getCount() {
		if (mEntertainmentList == null) 
			return 0;
		return mEntertainmentList.size();
	}

	@Override
	public EntertainmentList getItem(int pos) {
		return mEntertainmentList.get(pos);
	}

	@Override
	public long getItemId(int pos) {
		return pos;
	}

	@Override
	public View getView(int pos, View convertView, ViewGroup parent) {
		EntertainmentList entry = mEntertainmentList.get(pos);
		
		View row = convertView;
		
		// inflating list view layout if null
        if(row == null) {
        	LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			row = inflater.inflate(R.layout.entertainment_entry, null);
        }

        // set name
        TextView eName = (TextView)row.findViewById(R.id.eName);
        eName.setText(entry.getName());
        
        // set short description
        TextView eSDescript = (TextView)row.findViewById(R.id.eSDescript);
        eSDescript.setText(entry.getsDescript());
 
        // set phone
        TextView ePhone = (TextView)row.findViewById(R.id.ePhone);
        ePhone.setText(entry.getPhone());
 
        // set email
        TextView eAddress = (TextView)row.findViewById(R.id.eAddress);
        eAddress.setText(entry.getAddress());
        
        // set website
        TextView eWebsite = (TextView)row.findViewById(R.id.eWebsite);
        eWebsite.setText(entry.getWebsite());
 
        return row;
	}

}
