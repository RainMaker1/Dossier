/**
 * @author Abe Raina
 * @date February 2010
 *
 * Bed and Breakfast Manager
 * IDE - JCreator
 * Java - Ver 1.6.0
 * Platform - PC
 **/

import javax.swing.JOptionPane;
import java.io.PrintWriter;
import java.io.*;

public class ReservePane 
{
	String input = new String();
	String ans = null;
	PrintWriter writer = null;
	
	public ReservePane()
	{
		this.reservationPrompt();
		DossierGUI.gettextdatabase().add(input);
		DossierGUI.updateArrayDatabase();
		try
		{
			File file = new File("database.txt");
			writer = new PrintWriter(file);
			for(int i =0; i<DossierGUI.gettextdatabase().size(); i++)
			{
				writer.println(DossierGUI.gettextdatabase().get(i));
			}
			writer.flush();
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	//precondition:  the user has entered a valid string
	//error handling:  if the user does not enter anything, the program
	// will return null for that component of the entry
	//postcondition: return the user's input
	public String promptUser(String question)
	{
		return JOptionPane.showInputDialog(null, question);	  
	}
	
	//precondition: none
	//postcondition:  the program has appended all of the user responses to 
	// the input string 
	// error handling:  the arraydatabase field in the DossierGUI class would
	//   not work if the user entered a tab character in one of the entries. this
	//   method checks to make sure the response does not include it
	public void reservationPrompt()
	{
		String temp = this.promptUser("Please enter name");
		if(!temp.contains("\t"))
		{
			input += temp;
		}	
		else
		{
			input += "null";
		}
		input += "\t";
		
		temp = this.promptUser("Please enter room number");
		if(!temp.contains("\t"))
		{
			input += temp;
		}	
		else
		{
			input += "null";
		}
		input += "\t";
		
		temp = this.promptUser("Please enter arrival date");
		if(!temp.contains("\t"))
		{
			input += temp;
		}	
		else
		{
			input += "null";
		}
		input += "\t";
		
		temp = this.promptUser("Please enter departure date");
		if(!temp.contains("\t"))
		{
			input += temp;
		}	
		else
		{
			input += "null";
		}
		input += "\t";
		temp = this.promptUser("Please enter phone number");
		if(!temp.contains("\t"))
		{
			input += temp;
		}	
		else
		{
			input += "null";
		}
		input += "\t";
		temp = this.promptUser("Please enter number of guests");
		if(!temp.contains("\t"))
		{
			input += temp;
		}	
		else
		{
			input += "null";
		}
		input += "\t";
		temp = this.promptUser("Please enter whether a coupon has been used or not (Y/N)");
		if(!temp.contains("\t"))
		{
			input += temp;
		}	
		else
		{
			input += "null";
		}
		input += "\t";
		temp = this.promptUser("Please enter address");
		if(!temp.contains("\t"))
		{
			input += temp;
		}	
		else
		{
			input += "null";
		}
	}
}