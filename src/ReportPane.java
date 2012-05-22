/**
 * @author Abe Raina
 * @date February 2010
 *
 * Bed and Breakfast Manager
 * IDE - JCreator
 * Java - Ver 1.6.0
 * Platform - PC
 **/

public class ReportPane 
{
    public ReportPane() 
    {
    	TextOutputPanel output = new TextOutputPanel ("All Guest Entries Report");
        for(int i=0; i<DossierGUI.gettextdatabase().size(); i++)
        {
        	output.println(DossierGUI.gettextdatabase().get(i));
        }
    }        
}