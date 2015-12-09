package level_0;
import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		for(int I=0; I<10; I++){
		// 1. Watch the first 2 minutes of this movie: http://vimeo.com/2485018
		int randomNumber = new Random().nextInt(5);
		// 2. On paper, write all the numbers that get printed when you run this class
		System.out.println(randomNumber);

		// 3. Use the randomNumber to give the user a random compliment.
		
		if(randomNumber == 0){
			JOptionPane.showMessageDialog(null, "you have a nice tie");
		}
		else if(randomNumber == 1){
			JOptionPane.showMessageDialog(null, "you are great!");
		}
		else if(randomNumber == 2){
			JOptionPane.showMessageDialog(null, "you are awsome!");
		}
		else if(randomNumber == 3){
			JOptionPane.showMessageDialog(null, "you are ok");
		}
		else if(randomNumber == 4){
			JOptionPane.showMessageDialog(null, "you look sick");
		}
		}
		// 4. Repeat all the code above 10 times
		
		// 5. Find someone to test out your program. They will like it :)
	}
}


