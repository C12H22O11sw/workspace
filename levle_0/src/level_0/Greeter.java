package level_0;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String answer=JOptionPane.showInputDialog(null, "what is your name");
	JOptionPane.showMessageDialog(null, "Hello " + answer);
}
}
