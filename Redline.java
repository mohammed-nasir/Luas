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

public class Redline extends ListActivity{
  
	Context Context;
	ListView listview;
	TextView inboundtextview;
	TextView outboundtextview;
	
	String text;
	String inbound = "";
	String outbound = "";
		
	Document doc;
	
	ArrayAdapter<String> adapter;
	
	String url = "http://www.luas.ie/luaspid.html?get=";
	
	static final String[] redline = new String[] {"Saggart","Fortunestown","Citywest Campus","Cheeverstown","Fettercairn","Tallaght","Hospital",
		"Cookstown","Belgard","Kingswood","Red Cow","Kylemore","Bluebell","Blackhorse","Drimnagh",
		"Goldenbridge","Suir Road","Rialto","Fatima","James's","Heuston","Museum","Smithfield",
		"Four Courts","Jervis","Abbey Street","Busaras","Connolly","George's Dock",
		"Mayor Square NCI","Spencer Dock","The Point"};
	
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.greenline);
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
		        android.R.layout.simple_list_item_1, redline);
		    setListAdapter(adapter);
		    
		inboundtextview = (TextView) findViewById(R.id.textView1);	
		outboundtextview = (TextView) findViewById(R.id.textView2);	
		
	}
	
	
	protected void onListItemClick(ListView l, View v, int position, long id) {
			super.onListItemClick(l, v, position, id);
			
			 text = redline[position];
			 
			 if(text.equals("Busaras")){
				 text = "Bus%E1ras";
			 }
			 if(text.equals("Citywest Campus")){				 
					text = "Citywest+Campus";				
			}
			 if(text.equals("Red Cow")){				 
					text = "Red+Cow";				
			}
			 if(text.equals("Suir Road")){				 
					text = "Suir+Road";				
			}
			 if(text.equals("James's")){				 
					text = "James%27s";				
			}
			 if(text.equals("Four Courts")){				 
					text = "Four+Courts";				
			}
			 if(text.equals("Abbey Street")){				 
					text = "Abbey+Street";				
			}
			 if(text.equals("Four Courts")){				 
					text = "Four+Courts";				
			}
			if(text.equals("George's Dock")){				 
					text = "George's+Dock";				
			}
			if(text.equals("Mayor Square NCI")){				 
				text = "Mayor+Square+-+NCI";				
			}
			if(text.equals("Spencer Dock")){				 
				text = "Spencer+Dock";				
			}
			if(text.equals("The Point")){				 
				text = "The+Point";				
			}
			 
			 try {
				 	Document doc = Jsoup.connect(url + text).get();
													 
					Element Inbound = doc.select("div.inbound").first();
									
					if (Inbound != null) {
			 
						Elements inboundnames = Inbound.select("div.location");
						Elements inboundtimes = Inbound.select("div.time");
				
						inbound = Inbound.text();	
						
						inboundtextview.setText(redline[position] + " - " + inbound);								
					}
									
					Element Outbound = doc.select("div.outbound").first().appendText(" \n");
					
					if (Outbound != null) {
						 
						Elements outboundnames = Inbound.select("div.location");
						Elements outboundtimes = Inbound.select("div.time");
						
						outbound = Outbound.text();  
						
						outboundtextview.setText(redline[position] + " - " + outbound);
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
