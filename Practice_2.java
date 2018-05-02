import java.nio.channels.ShutdownChannelGroupException;

import javax.swing.JOptionPane;

/*
 * Make a program that asks the user how many bedrooms their house has.
 * Give them the following response based on their input
 * 
 * less than 0 : Give them an error
 * equal to 0 : Come stay at my place!
 * one to three : That's cool
 * greater than 3 : You have a big house! 
 */
public class Practice_2 {
	public static void main(String[] args) {
		
String x = JOptionPane.showInputDialog(null, "How many bedrooms do you have in your house?");
int numRooms = Integer.parseInt(x);		
		
if(numRooms < 0) {
	JOptionPane.showMessageDialog(null, "Error, Try Again");
} else if(numRooms == 0) {
	JOptionPane.showMessageDialog(null, "Come stay at my place");
} else if(numRooms >= 1 && numRooms <= 3) {
	JOptionPane.showMessageDialog(null, "That's Cool!");
} else if (numRooms > 3) {
	JOptionPane.showMessageDialog(null, "You have a big house!");
}
		
		
	}
}
