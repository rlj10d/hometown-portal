/**
 * 
 * ShopListAdapter.java
 * Author: Laura Jackson
 * July 28, 2013
 * 
 * This class implements the ShopListAdapter.
 * This is a custom adapter for an ShopList object.
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

public class ShopListAdapter extends ArrayAdapter<ShopList> {

	private ArrayList<ShopList> mShopList;
	
	public ShopListAdapter(Context context, int textViewResourceId, ArrayList<ShopList> objects) {
		super(context, textViewResourceId, objects);
		this.mShopList = objects;
	}
	
	@Override
	public int getCount() {
		if (mShopList == null) 
			return 0;
		return mShopList.size();
	}

	@Override
	public ShopList getItem(int pos) {
		return mShopList.get(pos);
	}

	@Override
	public long getItemId(int pos) {
		return pos;
	}

	@Override
	public View getView(int pos, View convertView, ViewGroup parent) {
		ShopList entry = mShopList.get(pos);
		
		View row = convertView;
		
		// inflating list view layout if null
        if(row == null) {
        	LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			row = inflater.inflate(R.layout.shop_entry, null);
        }

        // set name
        TextView tvName = (TextView)row.findViewById(R.id.tvName);
        tvName.setText(entry.getName());
        
        // set short description
        TextView tvSDescript = (TextView)row.findViewById(R.id.tvSDescript);
        tvSDescript.setText(entry.getsDescript());
 
        // set phone
        TextView tvPhone = (TextView)row.findViewById(R.id.tvPhone);
        tvPhone.setText(entry.getPhone());
 
        // set email
        TextView tvAddress = (TextView)row.findViewById(R.id.tvAddress);
        tvAddress.setText(entry.getAddress());
        
        // set website
        TextView tvWebsite = (TextView)row.findViewById(R.id.tvWebsite);
        tvWebsite.setText(entry.getWebsite());
 
        return row;
	}

}
