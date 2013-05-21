package luas.testing;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ToggleButton;

public class Secondscreen extends Activity{
  
	Button movenextscreen;
	ToggleButton greennred;
	EditText greenedit;
	
	Drawable red,green;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        
        greenedit = (EditText) findViewById(R.id.greenedit);
        greennred = (ToggleButton) findViewById(R.id.toggle);
        movenextscreen = (Button) findViewById(R.id.button);
                
        movenextscreen.setTextColor(Color.BLUE);
        greennred.setTextColor(Color.BLUE);
        
        greenedit.setEnabled(false);
       		
			green = getBaseContext().getResources().getDrawable( R.drawable.greenline1 );
			green.setBounds( 0, 0, 470, 150 );
			greenedit.setCompoundDrawables( null, green, null, null );
						
        greenedit.setText(" Green Line Information \n" + "\n Trams Connecting Brides Glen to St. Stephen's Green through Sandyford" +
							  "\n \n TimeTable" + " \n FROM St. Stephen's Green TO Brides Glen" +
							  " \n Monday - Friday - 5:30am to 0:30am " + "\n Saturday - 6:30am to 0:30am" + "\n Sunday & Bk Hol - 7:00am to 11:30pm" +
							  " \n\n FROM Brides Glen TO St. Stephen's Green" + " \n Monday - Friday - 5:30am to Midnight" + " \n Saturday - 6:30am to Midnight" +
							  " \n Sunday & Bk Hol - 7:00am to 11:00pm" +
							  "\n \n Facilities Available at some Luas station's" + "\n Luas P(Park)+R(Ride) Car Park Locations\n" +
							  " \n Balally Park + Ride " + " \n Stillorgan Park + Ride " + "\n Sandyford Park + Ride " +
							  "\n Carrickmines Park + Ride " +
							  "\n \n Bike parking is available at following stations:\n" + "\n Harcourt:7 racks  Charlemont:14 racks " + 
							  "\n Kilmacud:10 racks  Ranelagh:16 racks " + "\n Stillorgan:15 racks  Beechwood:10 racks " + 
							  "\n Sandyford:34 racks  Cowper:13 racks " + "\n Glencairn:12 racks  Milltown:10 racks " + 
							  "\n The Gallops:5 racks  Windy Arbour:11 racks" + "\n Leopardstown Valley:10 racks  Dundrum:21 racks " +
							  "\n Carrickmines:7 racks  Brides Glen:2 racks ");					
													 										
        greennred.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(greennred.isChecked()){
					
					green = getBaseContext().getResources().getDrawable( R.drawable.greenline1 );
					green.setBounds( 0, 0, 470, 150 );
					greenedit.setCompoundDrawables( null, green, null, null );
						
					greenedit.setText(" Green Line Information \n" + "\n Trams Connecting Brides Glen to St. Stephen's Green through Sandyford" +
									  "\n \n TimeTable" +
									  " \n FROM St. Stephen's Green TO Brides Glen" +
									  " \n Monday - Friday - 5:30am to 0:30am " + "\n Saturday - 6:30am to 0:30am" + "\n Sunday & Bk Hol - 7:00am to 11:30pm" +
									  " \n\n FROM Brides Glen TO St. Stephen's Green" + " \n Monday - Friday - 5:30am to Midnight" + " \n Saturday - 6:30am to Midnight" +
									  " \n Sunday & Bk Hol - 7:00am to 11:00pm" +
									  "\n \n Facilities Available at some Luas station's" + "\n Luas P(Park)+R(Ride) Car Park Locations\n" +
									  " \n Balally Park + Ride " + " \n Stillorgan Park + Ride " + "\n Sandyford Park + Ride " +
									  "\n Carrickmines Park + Ride " +
									  "\n \n Bike parking is available at following stations:\n" + "\n Harcourt:7 racks  Charlemont:14 racks " + 
									  "\n Kilmacud:10 racks  Ranelagh:16 racks " + "\n Stillorgan:15 racks  Beechwood:10 racks " + 
									  "\n Sandyford:34 racks  Cowper:13 racks " + "\n Glencairn:12 racks  Milltown:10 racks " + 
									  "\n The Gallops:5 racks  Windy Arbour:11 racks" + "\n Leopardstown Valley:10 racks  Dundrum:21 racks " +
									  "\n Carrickmines:7 racks  Brides Glen:2 racks ");		
																				 										
						}else{
					
					red = getBaseContext().getResources().getDrawable( R.drawable.redline1 );
					red.setBounds( 0, 0, 470, 150 );					
					greenedit.setCompoundDrawables( null, red, null, null );
											
					greenedit.setText(" Red Line Information \n" + "\n Trams Connecting Tallaght to The Point and Saggart to  Connolly" +
									  "\n TimeTable" +
									  "\n FROM The Point to Tallaght " + "\n Monday - Friday - 5:30am to 0:30am " + "\n Saturday - 6:30am to 0:30am " + "\n Sunday & Bk Hol - 7:00am to 11:30pm" +
									  "\n \n Facilities Available at some Luas station's" + "\n \n Luas P(Park)+R(Ride) Car Park Locations \n" + "\n Red Cow Park + Ride " + "\n Tallaght Cross West Car Park" + 
									  "\n Cheeverstown Park + Ride" +
									  "\n \n Bike parking is available at following stations:\n" + "\n Connolly: 8 racks 	Kingswood: 8 racks " +
									  "\n Abbey Street: 14 racks  Belgard: 3 racks " + "\n Jervis: 3 racks  Cookstown: 4 racks " +
									  "\n Smithfield:7 racks  Tallaght:3 racks" + "\n Heuston:4 racks  Fettercairn:10 racks " +
										"\n Fatima:5 racks  Cheeverstown:10 racks" + "\n Suir Road:5 racks  Citywest Campus:10 racks " +
										"\n Goldenbridge:5 racks  Fortunestown:10 racks " + "\n Bluebell:3 racks  Saggart:10 racks " +
										"\n Red Cow:13 racks ");		
										
					}	
				}        	
        }
       ); 
        
        movenextscreen.setOnTouchListener(new OnTouchListener(){

		public boolean onTouch(View arg0, MotionEvent arg1) {
				// TODO Auto-generated method stub
				Intent i = new Intent(Secondscreen.this,Tabview.class);
	            startActivity(i);
				return true;
		  	}        	
        });        
	}	
}
