package level_0;
 import java.util.Random;

import javax.swing.JOptionPane;

// Copyright Wintriss Technical Schools 2013
public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100);
		// 2. Print out the random variable above
		//System.out.println(random);
		// 11. do the following 10 times
		int maxtries = 10;
		for(int i=1; i<=maxtries; i++){
			// 1. ask the user for a guess using a pop-up window, and save their response 
				 String string = JOptionPane.showInputDialog(null,"guess a number 1-100.");
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
			int guess = (Integer.parseInt(string));
			// 5. if the guess is correct
			if(i==maxtries){
			JOptionPane.showMessageDialog(null, "you lost ):");}
			
			else{
			if(guess==random){
				JOptionPane.showMessageDialog(null, "You Won (:");
				i=maxtries+1;
			}
			else if(guess>random){
				JOptionPane.showMessageDialog(null, "Too high");
			}
			else if(guess<random){
				JOptionPane.showMessageDialog(null, "Too low");
			}
			}

		}

		// 12. tell them they lose
		
		
	}

}