package luas.testing;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Greenline extends ListActivity{

  Context Context;
	ListView listview;
	TextView inboundtextview;
	TextView outboundtextview;
	String  text;
	
	String inbound = "";
	String outbound = "";
	
	Document doc;
	
	String url = "http://www.luas.ie/luaspid.html?get=";
		
	static String[] green;
	
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.greenline);
		
		green = new String[] {"Stephen","Harcourt","Charlemont","Ranelagh","Beechwood","Cowper","Milltown",
				"Windy Arbour","Dundrum","Balally","Kilmacud","Stillorgan","Sandyford","Central Park"
				,"Glencairn","The Gallops","Leopardstown Valley","Ballyogan Wood","Carrickmines","Laughanstown",
				"Cherrywood","Brides Glen"};
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
		       android.R.layout.simple_list_item_1, green);
		    setListAdapter(adapter);	    
		    
		    inboundtextview = (TextView) findViewById(R.id.textView1);	
		    outboundtextview = (TextView) findViewById(R.id.textView2);	
		    		    		    		        
	}
	
	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		
		 text = green[position];
		 
		if(text.equals("Stephen")){			 
				text = "St.+Stephen%27s+Green";
		}
		 if(text.equals("Ballyogan Wood")){				 
				text = "Ballyogan+Wood";				
		}
		 if(text.equals("Windy Arbour")){				 
				text = "Windy+Arbour";				
		}
		if(text.equals("Central Park")){				 
				text = "Central+Park";				
		}
		if(text.equals("The Gallops")){				 
				text = "The+Gallops";				
		}
		if(text.equals("Leopardstown Valley")){				 
			text = "Leopardstown+Valley";				
		}
		if(text.equals("Ballyogan Wood")){				 
			text = "Ballyogan+Wood";				
		}
		if(text.equals("Brides Glen")){				 
			text = "Brides+Glen";				
		}
				 
		 try {
			 	Document doc = Jsoup.connect(url + text).get();
												 
				Element Inbound = doc.select("div.inbound").first();
								
				if (Inbound != null) {
		 
					Elements inboundnames = Inbound.select("div.locationss");
					Elements inboundtimes = Inbound.select("div.time");
			
					inbound = Inbound.text();	
					
					inboundtextview.setText(green[position] + " - " + inbound);	
				}
								
				Element Outbound = doc.select("div.outbound").first();
				
				if (Outbound != null) {
					 
					Elements outboundnames = Inbound.select("div.location");
					Elements outboundtimes = Inbound.select("div.time");
					
					outbound = Outbound.text();  
					
					outboundtextview.setText(green[position] + " - " + outbound);
				}		
				
				else{
					
					Toast.makeText(Context, "Error", 5000);
				}
		 }	            
	         catch (Exception ex) {
	        	 inboundtextview.setText("Sorry no timing.. May be Network/ luas issue");
		         outboundtextview.setText("");
	        		        	
	        } 
	}	
}

