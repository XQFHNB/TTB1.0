package com.example.ttb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity {
	private Button button1,button2,button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button1.setOnClickListener(new OnClickListener(){
        	@Override
        	public void onClick(View v){
        		Intent intent=new Intent(MainActivity.this,ActivitiesSecond.class);
        		startActivity(intent);
        	}
        });
    }
    

  
}
