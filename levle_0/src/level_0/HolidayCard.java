package level_0;
import java.applet.AudioClip;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JApplet;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.TurtlePanel;

public class HolidayCard extends MouseAdapter {



	/* 1. Paste your methods from the Christmas Tree Recipe here. */
	double treeWidth = 15;
	double scale = 1.1;	

	void drawTreeBody() {	
		Tortoise.setPenColor(Colors.Greens.ForestGreen);

		int turnAmount = 175;
		int startTurn = 90;
	
		Tortoise.turn(startTurn);
		Tortoise.setSpeed(10);
	
			for(int I=0; I<11; I++){
			 Tortoise.move(treeWidth);
			 Tortoise.turn(turnAmount);				
			 treeWidth=treeWidth*scale;	
			 Tortoise.move(treeWidth);
			 Tortoise.turn(-turnAmount);
			 treeWidth=treeWidth*scale;
			 turnAmount--;
			}
}
	
	void drawTreeTrunk() {
		Tortoise.move(treeWidth/2);
		Tortoise.turn(90);
		Tortoise.setPenWidth(treeWidth/10);	
		Tortoise.penDown();
		Tortoise.setPenColor(Colors.Browns.BurlyWood);
		Tortoise.move(treeWidth/4);

	}
	
	void drawStar() {
		Tortoise.penDown();
		Tortoise.setSpeed(10);
		Tortoise.setPenColor(Colors.Reds.Crimson);
		for(int x = 0; x<5; x++){
		Tortoise.move(50);
		Tortoise.turn(144);
		}
	}
	/* 2. When the mouse is clicked draw a tree at that position. */
	public void mouseClicked(MouseEvent mouseEvent) {
		
		System.out.println("mouse clicked!");

		int mouseX = mouseEvent.getX();
		int mouseY = mouseEvent.getY();
		// Set the X position of the Tortoise to the X position of the mouse
		Tortoise.setX(mouseX);
		Tortoise.setY(mouseY);
		drawTree();
		
	}

	/* 3. Personalize your card. */
	void drawGreetingAndSing() {
		// Download a Christmas sound (wav, midi or aiff) and use the playMusic() method to play it
		
		// Use the writeGreeting() method to add a festive message
		
	}

	private void writeGreeting(String greeting) {
		tortoiseWindow.getGraphics().drawString(greeting, 250, 50);
	}

	private void playMusic(String nameOfSoundFile) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(nameOfSoundFile));
		sound.play();
	}

	void drawTree() {
		drawStar();
		drawTreeBody();
		drawTreeTrunk();
		treeWidth = 15;
		Tortoise.setAngle(0);
		Tortoise.setPenWidth(treeWidth/5);
	}

	public static void main(String[] args) {
		new HolidayCard();
	}

	TurtlePanel tortoiseWindow;

	HolidayCard() {
		tortoiseWindow = Tortoise.getBackgroundWindow();
		tortoiseWindow.addMouseListener(this);
		Tortoise.show();
		Tortoise.setSpeed(10);
		drawGreetingAndSing();
	}
}


