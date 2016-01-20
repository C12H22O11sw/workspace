package level_0;

import javax.swing.JOptionPane;

public class adventure {
	public static void main(String[] args) {
		String one = JOptionPane.showInputDialog("There are two doors one has spiders the other has crickets wich do you chose?");
		if(one.equalsIgnoreCase("crickets")){
			
			String two = JOptionPane.showInputDialog("There are two rooms one has a TV playing Barny the other hase a TV playing Baby Einstein wich do you chose.");
			if(two.equalsIgnoreCase("Barny")){
				JOptionPane.showMessageDialog(null, "Dang you like barny, barny is after you run!");
			}
			else if(two.equalsIgnoreCase("Baby Einstein")){
				JOptionPane.showMessageDialog(null, "take a ride on a rocket ship!");
			}
			else{			
				JOptionPane.showMessageDialog(null, "That's not an option");
			}
		}
		
		else if(one.equalsIgnoreCase("spiders")){
			String two = JOptionPane.showInputDialog("There are two rooms one has candy the other has chocolate.");
			if(two.equalsIgnoreCase("chocolate")){
				String three = JOptionPane.showInputDialog("There are two rooms one has a shark tank the other has a electeric chair");
				if(three.equalsIgnoreCase("electeric chair")){
					JOptionPane.showMessageDialog(null, "there is no power");
				}
				else if(three.equalsIgnoreCase("shark tank")){
					JOptionPane.showMessageDialog(null, "you are dead!");
				}
				else{			
					JOptionPane.showMessageDialog(null, "That's not an option");
				}
			}
			else if(two.equalsIgnoreCase("candy")){
				JOptionPane.showMessageDialog(null, "dead end.");
			}
			else{			
				JOptionPane.showMessageDialog(null, "That's not an option");
			}
		}
		else{			
				JOptionPane.showMessageDialog(null, "That's not an option");
		}

	}
}
