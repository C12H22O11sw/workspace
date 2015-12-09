package level_0;

import org.jointheleague.graphical.robot.Robot;

public class stars {
public static void main(String[]args){
	Robot robot = new Robot("batman");
	int distance = 10;
	int degrees =144;
	int x = 0;
	int y =0;
	//360-32=328
	robot.setX(x);
	robot.setY(500);
	robot.penDown();
	robot.setSpeed(10);
	while(true){
	for(int I = 0; I<5; I++){
		robot.move(distance);
		robot.turn(degrees);
	}
		robot.setX(x);
		x+=60;
	
	}
	
}

}
