package com.example.ttb;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class ActivitiesSecond extends Activity {
	private List<SonOfListView>  photosList=new ArrayList<SonOfListView>();
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.photos);
		initphotos();
		PictureAdapter adapter=new PictureAdapter(ActivitiesSecond.this, R.layout.square_of_activities, photosList);
		ListView listView=(ListView)findViewById(R.id.List_view);
	    listView.setAdapter(adapter);
	}
	private void initphotos(){
		//SonOfListView line1=new SonOfListView(R.drawable.ic_launcher,R.drawable.ic_launcher);
		for(int i=0;i<10;i++){
			SonOfListView line=new SonOfListView(R.drawable.ic_launcher,R.drawable.ic_launcher);
			photosList.add(line);
		}
	}

}
