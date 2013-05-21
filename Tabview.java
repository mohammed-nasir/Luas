package luas.testing;

import android.app.TabActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabHost.TabSpec;

public class Tabview extends TabActivity {
  
	TabHost tabHost;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabmap);
 
        tabHost = getTabHost();
 
        // Tab for Green
        TabSpec greenTab = tabHost.newTabSpec("Green");
        // setting Title and Icon for the Tab
        greenTab.setIndicator("Green");
        Intent greenline = new Intent(this, Greenline.class);
        greenTab.setContent(greenline);
 
        // Tab for Red
        TabSpec redTab = tabHost.newTabSpec("Red");
        redTab.setIndicator("Red");
        Intent redline = new Intent(this, Redline.class);
        redTab.setContent(redline);
               
        // Adding all TabSpec to TabHost
        tabHost.addTab(greenTab); // Adding photos tab
        tabHost.addTab(redTab); // Adding songs tab
             
        tabHost.getTabWidget().getChildAt(tabHost.getCurrentTab()).setBackgroundColor(Color.parseColor("#FFFFFF")); // selected
  
        tabHost.getTabWidget().getChildAt(0).setBackgroundColor(Color.GREEN);
        tabHost.getTabWidget().getChildAt(1).setBackgroundColor(Color.RED);
        
        //ChangeTabColor();
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
			        					
				 //tabHost.getTabWidget().getChildAt(tabHost.getCurrentTab()).setBackgroundColor(Color.parseColor("#FFFFFF")); // selected
			}					
		});	                       
	}	
}
