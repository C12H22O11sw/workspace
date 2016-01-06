package level_0;

import javax.swing.JOptionPane;

public class areYouHappy {
	public static void main(String[] args){
		int stage = 0;
		int a = 0;
		while(a == 0){
			if(stage == 0){
			String stringOne=JOptionPane.showInputDialog("ARE YOU HAPPY?");
				if(stringOne.equalsIgnoreCase("Yes"))
				{
					stage = 10;
				}
				else if(stringOne.equalsIgnoreCase("no"))
				{
					stage = 2;
				}
			}
			else if(stage == 2){
			String stringOne=JOptionPane.showInputDialog("DO YOU WANT TO BE HAPPY?");
				if(stringOne.equalsIgnoreCase("Yes"))
				{
					JOptionPane.showMessageDialog(null, "CHANGE SOMETHING.");
					a = 1;
				}
				else if(stringOne.equalsIgnoreCase("no"))
				{
					stage = 10;
				}
			}
			if(stage == 10){
			JOptionPane.showMessageDialog(null, "KEEP DOING WHATEVER YOU'RE DOING.");
			a =1;
			
			}

	
		}
	}
}
