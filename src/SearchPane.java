/**
 * @author Abe Raina
 * @date February 2010
 *
 * Bed and Breakfast Manager
 * IDE - JCreator
 * Java - Ver 1.6.0
 * Platform - PC
 **/

import javax.swing.JComboBox;
import javax.swing.*;
import java.util.*;


public class SearchPane
{
	public static final String[] prompts = {"name","room number",
	"arrival date","departure date",
	"phone number","number of guests","coupon used","address"};
	JComboBox promptBox = new JComboBox(prompts);			

		
	public SearchPane()
	{
		JFrame frame = new JFrame("Enter Search Criteria");
	    String choice = (String) JOptionPane.showInputDialog(frame, 
	    "Enter Search Criteria","Enter Search Criteria",JOptionPane.QUESTION_MESSAGE, 
	    null,prompts, prompts[0]);
	    // choice will be null if the user clicks Cancel
	    if(!(choice==null))
		{
	        this.analyzeChoice(choice);
		}
	}
	public void analyzeChoice(String choice)
	{
	    if (choice.equals("name"))
	    {
	    	String answer = JOptionPane.showInputDialog(null, "Enter Name");
			if(!(answer==null))
			{
				ArrayList<String> temp = new ArrayList<String>();
		    	for(int i=0; i<DossierGUI
		    		
		    		.gettextdatabase().size(); i++)
		    	{
		    		if(DossierGUI.getarraydatabase().get(i)[0].contains(answer))
		    		{
			    		temp.add(DossierGUI.gettextdatabase().get(i));
		    		}
		    	}
		   		TextOutputPanel output = new TextOutputPanel ("Search Results");
	        	for( int i = 0; i<temp.size();i++)
				{
					output.println(temp.get(i));
				}	
			}
	    }
	    if (choice.equals("room number"))
		{
			String answer = JOptionPane.showInputDialog(null, "Enter Room Number");
			if(!(answer==null))
			{
				ArrayList<String> temp = new ArrayList<String>();
		    	for(int i=0; i<DossierGUI.gettextdatabase().size(); i++)
		    	{
		    		if(DossierGUI.getarraydatabase().get(i)[1].contains(answer))
		    		{
			    		temp.add(DossierGUI.gettextdatabase().get(i));
		    		}
		    	}
		   		TextOutputPanel output = new TextOutputPanel ("Search Results");
	        	for( int i = 0; i<temp.size();i++)
				{
					output.println(temp.get(i));
				}	
			}
		}
		if (choice.equals("arrival date"))	
		{
	   		String answer = JOptionPane.showInputDialog(null, "Enter Arrival Date");
			if(!(answer==null))
			{
				ArrayList<String> temp = new ArrayList<String>();
		    	for(int i=0; i<DossierGUI.gettextdatabase().size(); i++)
		    	{
		    		if(DossierGUI.getarraydatabase().get(i)[2].contains(answer))
		    		{
			    		temp.add(DossierGUI.gettextdatabase().get(i));
		    		}
		    	}
		   		TextOutputPanel output = new TextOutputPanel ("Search Results");
	        	for( int i = 0; i<temp.size();i++)
				{
					output.println(temp.get(i));
				}
			}	
	    }
		if (choice.equals("departure date"))
		{
	    	String answer = JOptionPane.showInputDialog(null, "Enter Departure Date");
			if(!(answer==null))
			{
				ArrayList<String> temp = new ArrayList<String>();
		    	for(int i=0; i<DossierGUI.gettextdatabase().size(); i++)
		    	{
		    		if(DossierGUI.getarraydatabase().get(i)[3].contains(answer))
		    		{
			    		temp.add(DossierGUI.gettextdatabase().get(i));
		    		}
		    	}
		   		TextOutputPanel output = new TextOutputPanel ("Search Results");
	        	for( int i = 0; i<temp.size();i++)
				{
					output.println(temp.get(i));
				}
			}	
	    }
		if (choice.equals("phone number"))				  
		{
	    	String answer = JOptionPane.showInputDialog(null, "Enter Phone Number");
			if(!(answer==null))
			{
				ArrayList<String> temp = new ArrayList<String>();
		    	for(int i=0; i<DossierGUI.gettextdatabase().size(); i++)
		    	{
		    		if(DossierGUI.getarraydatabase().get(i)[4].contains(answer))
		    		{
			    		temp.add(DossierGUI.gettextdatabase().get(i));
		    		}
		    	}
		   		TextOutputPanel output = new TextOutputPanel ("Search Results");
	        	for( int i = 0; i<temp.size();i++)
				{
					output.println(temp.get(i));
				}
			}
	    }	   
		if (choice.equals("number of guests"))				    
		{
	    	String answer = JOptionPane.showInputDialog(null, "Enter Number of Guests");
			if(!(answer==null))
			{
				ArrayList<String> temp = new ArrayList<String>();
		    	for(int i=0; i<DossierGUI.gettextdatabase().size(); i++)
		    	{
		    		if(DossierGUI.getarraydatabase().get(i)[5].contains(answer))
		    		{
			    		temp.add(DossierGUI.gettextdatabase().get(i));
		    		}
		    	}
		   		TextOutputPanel output = new TextOutputPanel ("Search Results");
	        	for( int i = 0; i<temp.size();i++)
				{
					output.println(temp.get(i));
				}
			}
	    }
		if (choice.equals("coupon used"))			    
		{
	    	String answer = JOptionPane.showInputDialog(null, "Enter Whether Coupon is Used or Not (Y/N)");
			if(!(answer==null))
			{
				ArrayList<String> temp = new ArrayList<String>();
		    	for(int i=0; i<DossierGUI.gettextdatabase().size(); i++)
		    	{
		    		if(DossierGUI.getarraydatabase().get(i)[6].contains(answer))
		    		{
			    		temp.add(DossierGUI.gettextdatabase().get(i));
		    		}
		    	}
		   		TextOutputPanel output = new TextOutputPanel ("Search Results");
	        	for( int i = 0; i<temp.size();i++)
				{
					output.println(temp.get(i));
				}
			}
	    }
		if (choice.equals("address"))
		{
	    	String answer = JOptionPane.showInputDialog(null, "Enter Address");
			if(!(answer==null))
			{
				ArrayList<String> temp = new ArrayList<String>();
		    	for(int i=0; i<DossierGUI.gettextdatabase().size(); i++)
		    	{
		    		if(DossierGUI.getarraydatabase().get(i)[7].contains(answer))
		    		{
			    		temp.add(DossierGUI.gettextdatabase().get(i));
		    		}
		    	}
		   		TextOutputPanel output = new TextOutputPanel ("Search Results");
	        	for( int i = 0; i<temp.size();i++)
				{
					output.println(temp.get(i));
				}
			}
	    }
	}
}