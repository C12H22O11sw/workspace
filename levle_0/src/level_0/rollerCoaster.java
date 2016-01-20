package level_0;

import javax.swing.JOptionPane;

public class rollerCoaster {
	public static void main(String[] args) {
		int height = Integer.parseInt(JOptionPane.showInputDialog("what is your height (in feet)"));
		if(height >= 4){
			JOptionPane.showMessageDialog(null, "you can ride");
		}
		else if(height < 4){
			JOptionPane.showMessageDialog(null, "come back when you are taller");
		}
		else{}
	}
}
