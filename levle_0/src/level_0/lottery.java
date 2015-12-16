package level_0;

import java.util.Random;

import javax.swing.JOptionPane;

public class lottery {
	public static void main(String[] args){
		int oldInt =0;
		for(int I = 0; I<6; I++)
		{
			
			int randomNumber = new Random().nextInt(49);
			if(randomNumber == oldInt){
				randomNumber++;
			}
			System.out.println(randomNumber);
			oldInt = randomNumber;

}
	}
		}
