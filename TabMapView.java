package luas.testing;

import android.app.TabActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabHost.TabSpec;

public class TabMapView extends TabActivity {
  
	TabHost tabHost;
		
	@SuppressWarnings("deprecation")
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabview);
 
        tabHost = getTabHost();
             
        // Tab for Green
        TabSpec mapspec = tabHost.newTabSpec("MapView");
        // setting Title and Icon for the Tab
        mapspec.setIndicator("",getResources().getDrawable(R.drawable.map1));
        Intent mapIntent = new Intent(this, MainActivity.class);
        mapspec.setContent(mapIntent);
        
        // Tab for Red
        TabSpec stationspec = tabHost.newTabSpec("Station's");
        stationspec.setIndicator("",getResources().getDrawable(R.drawable.luaspicture));
        Intent stationIntent = new Intent(this, Secondscreen.class);
        stationspec.setContent(stationIntent); 
      
        // Adding all TabSpec to TabHost
        tabHost.addTab(mapspec); // Adding photos tab
        tabHost.addTab(stationspec); // Adding songs tab
        
        tabHost.getTabWidget().getChildAt(tabHost.getCurrentTab()).setBackgroundColor(Color.parseColor("#FFFFFF")); // selected
        
        ChangeTabColor();
	}
	private void ChangeTabColor() {
		// TODO Auto-generated method stub
		
		 tabHost.setOnTabChangedListener(new OnTabChangeListener(){

				@Override
				public void onTabChanged(String arg0) {
					// TODO Auto-generated method stub
					for(int i=0;i<tabHost.getTabWidget().getChildCount();i++)
				    {
				        tabHost.getTabWidget().getChildAt(i).setBackgroundColor(Color.parseColor("#333329")); //unselected
				    }					
					   tabHost.getTabWidget().getChildAt(tabHost.getCurrentTab()).setBackgroundColor(Color.parseColor("#FFFFFF")); // selected
					}
					
			 });		        	
	                       
	     }	
	}
