

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;
import org.jointheleague.graphical.robot.RobotImage;

public class Houses {
	
	static Robot bob =new Robot();
	static Random num=new Random();
public static void main(String[] args) {
	 
	 bob.setSpeed(10);
	 bob.penDown();
	 bob.moveTo(10,400);
	 bob.turn(90);
	 
	 for (int i = 0; i < 10; i++) {
		 drawHouse(num.nextInt(120));
	}
	
}

static void  drawHouse(int hight) {

	 bob.setPenColor(Color.green);
	 bob.move(50);
	 bob.turn(-90);	
	 bob.setRandomPenColor();
	 bob.move(hight);
	 if (num.nextInt(2)==0) {
		bob.turn(90);
		bob.move(20);
		bob.turn(90);
	}else{
		bob.turn(45);
		bob.move(10);
		bob.turn(90);
		bob.move(10);
		bob.turn(45);
	}
	
	 
	 bob.move(hight);
	 bob.turn(-90);
	 
	 
}
}