package luas.testing;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;
import android.widget.Toast;

public class Main extends Activity{
  
	private Spinner spinner1;
	
	Toast toast;
		
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstxml);      
        
        spinner1  = (Spinner) findViewById(R.id.spinner1);
            
        spinner1.setOnItemSelectedListener( new OnItemSelectedListener(){        	
       
	public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long arg3) {
		// TODO Auto-generated method stub
		
		toast = Toast.makeText(getApplicationContext(), "Please select your user type", 3000);
		toast.show();	
								
		switch (position) {
        case 0:
        	    		
        	break;
        case 1:
            Intent intentgooglemaps = new Intent(Main.this,
            		TabMapView.class);
            startActivity(intentgooglemaps);
            toast.cancel();
            break;
            
        case 2:
            Intent intentgreenline = new Intent(Main.this,
            		Tabview.class);
            startActivity(intentgreenline);
            toast.cancel();
            break;
     
        default:
            break;
		}		
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub

	}
        }); 
	
	}
}

	
