package level_0;
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

/**
 * Airline registration 
 * 
 * You are writing a program for a new airline to take their registration information at the check-in counter
 * and print their boarding pass. You need to collect the following information: 
 * 		First name 
 * 		Last name
 * 		Destination airport 
 * 		Birthday (for security purposes) 
 * 		Male/female (for security purposes) 
 * 
 * Print the boarding pass in this format:
 * LAST NAME / FIRST NAME (BIRTHDAY, M/F) 
 * Traveling to: DESTINATION
 * 
 * Toolbox: main() method, JOptionPane.showInputDialog, variables
 * 
 **/
public class AirlineRegistration {
	
	public static void main(String[] args) {
	String firstName= JOptionPane.showInputDialog(null,"first name");
	String lastName= JOptionPane.showInputDialog(null, "last name");
	String destinationAirport = JOptionPane.showInputDialog(null,"Destination airport");
	String Birthday= JOptionPane.showInputDialog(null, "Birthday");
	String Gender= JOptionPane.showInputDialog(null,"Gender");
	JOptionPane.showMessageDialog(null, firstName+"/" + lastName + "/"  + "(" + Birthday  + "," + Gender + ")"+ "Traveling to : " +destinationAirport);
	
	}
}




