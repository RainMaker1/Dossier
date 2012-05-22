/**
 * @author Abe Raina
 * @date February 2010
 *
 * Bed and Breakfast Manager
 * IDE - JCreator
 * Java - Ver 1.6.0
 * Platform - PC
 **/

import javax.swing.*;
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
/*
	The class implements the ActionListener interface to handle the
	events when the buttons are clicked. 
*/
public class DossierGUI extends JFrame implements ActionListener  
{
	/* FIELDS
	   -There are three buttons that the user can click to access the 
	   other parts of the program.
	   -The file object constructs an object from the database text file.
	   -There are two ArrayLists.  
	   First, the textdatabase is an ArrayList of Strings, 
	   and each String represents another entry in the database.  Each entry has
	   the different fields seperated by a tab (\t) character.
	   Second, the arraydatabase is an ArrayList of String arrays.  Each String 
	   array has each field in each entry in the textdatabase seperated into 
	   arrays. 
	*/
	private JButton mySearchButton = new JButton("search");
	private JButton myReserveButton = new JButton("reserve");
	private JButton myReportButton = new JButton("report");
	public File file = new File("database.txt");
	public static ArrayList<String> textdatabase = new ArrayList<String>();
	public static ArrayList<String[]> arraydatabase = new ArrayList<String[]>();
	private static final long serialVersionUID = 1;
	/* The constructor does three main tasks.  
	 * First, it constructs the GUI, and adds the three buttons by putting them
	 * inside of a box.
	 * Second, it scans the database and puts the information into the 
	 * ArrayList<String> called textdatabase.
	 * Third, it updates the ArrayList<Sting[]> called arraydatabse so 
	 * it has the same information as the textdatabase.
	 */
	public DossierGUI()
	{
		mySearchButton.setPreferredSize(new Dimension(200,200));
		myReserveButton.setPreferredSize(new Dimension(200,200));
		myReportButton.setPreferredSize(new Dimension(200,200));
		
		mySearchButton.addActionListener(this);
		myReserveButton.addActionListener(this);
		myReportButton.addActionListener(this);
		
		Box box = Box.createHorizontalBox();
		box.add(mySearchButton);
		box.add(myReserveButton);
		box.add(myReportButton);
		this.add(box);
		
		this.setTitle("Martha's Bed and Breakfast");
		this.setPreferredSize(new Dimension(400, 400));
		this.setLocation(200, 50);
		this.setBackground(Color.WHITE);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		this.pack();
		this.setVisible(true);
	
		try
		{
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine())
			{
				String line = scanner.nextLine();
				textdatabase.add(line);
			}
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}			
		catch (IOException e)
		{
			e.printStackTrace();
		}
		this.updateArrayDatabase();	
	}
	
	//precondition: the user clicked one of the three buttons
	//postcondition:  one of the three corresponding seconds of code
	//has executed
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == myReserveButton)
		{
			new ReservePane();
		}
		if (e.getSource() == mySearchButton)
		{
			new SearchPane();
		}
		if (e.getSource() == myReportButton)
		{
        	new ReportPane();
        	
  		}
	}	
	//precondition: none
	//postcondition:  returns the textdatabase
	public static ArrayList<String> gettextdatabase()
	{
		return textdatabase;
	} 
	//precondition: none
	//postcondition:  returns the arraydatabase
	public static ArrayList<String[]> getarraydatabase()
	{
		return arraydatabase;
	}
	//precondition:  textdatabase and arraydatabase are correctly initialized 
	//postcondition:  arraydatabase is filled with the corresponding values
	// in textdatabase
	public static void updateArrayDatabase()
	{
		for (int i=0;i<textdatabase.size();i++)
		{
			String[] temp;
			temp = textdatabase.get(i).split("\t");
			arraydatabase.add(i,temp);
		}  
	}
}
