package com.example.ttb;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

public class PictureAdapter extends ArrayAdapter<SonOfListView> {
	private int resourceId;
	public PictureAdapter(Context context,int imageViewResourceId,List<SonOfListView> objects ){
		super(context,imageViewResourceId,objects);
		resourceId=imageViewResourceId;
	}
	@Override
	public View getView(int position ,View convertView ,ViewGroup parent){
		SonOfListView twophotos=getItem(position);
		View view=LayoutInflater.from(getContext()).inflate(resourceId,null);
		ImageView Image1=(ImageView)view.findViewById(R.id.imageView1);
		ImageView Image2=(ImageView)view.findViewById(R.id.imageView2);
		Image1.setImageResource(twophotos.getImageId1());
		Image2.setImageResource(twophotos.grtImageId2());
		return view;
	}
}
