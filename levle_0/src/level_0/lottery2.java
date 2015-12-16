package level_0;

import java.util.Random;

import javax.swing.JOptionPane;

public class lottery2 {
	public static void main(String[] args){
		int randomNumber = new Random().nextInt(49);
		for(int I = 0; I<6; I++)
		{
			

			int number = randomNumber+I;
			System.out.println(number);
}
	}
		}
