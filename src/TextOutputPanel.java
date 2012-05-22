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
import java.awt.*;

public class TextOutputPanel extends JFrame implements Outputable
{
	JTextArea textArea = null;
	public TextOutputPanel ()
	{
		setLayout (new BorderLayout());
		textArea = new JTextArea ();
		textArea.setEditable (false);
		JScrollPane areaScrollPane = new JScrollPane (textArea);
		add (areaScrollPane, "Center");
		setPreferredSize(new Dimension(1100, 400));
		setLocation(100,100);
		pack();
		setVisible(true);
	}
	public TextOutputPanel (String title)
	{
		setLayout (new BorderLayout());
		textArea = new JTextArea ();
		textArea.setEditable (false);
		JScrollPane areaScrollPane = new JScrollPane (textArea);
		add (areaScrollPane, "Center");
		setPreferredSize(new Dimension(1100, 400));
		setLocation(100,100);
		setTitle(title);
		pack();
		setVisible(true);
	}
	//precondition: none
	//postcondition: The string is added to the textArea 
	//	in a new line
	public void println (String str)
	{
		textArea.append (str + CR);
	}
	//precondition: none
	//postcondition: The string is added to the textArea
	public void print (String str)
	{
		textArea.append (str);
	}
}