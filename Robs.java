package robs;
import robocode.*;
import java.awt.Color;

/**
 * Robs - a class by (Márcio Roberto L. Farias Jr.)
 */
public class Robs extends Robot {
	public void run() {
			setColors(Color.black,Color.darkGray,Color.lightGray,Color.red,Color.white);
			while(true) {
				ahead(100);
            	turnGunRight(360);
				turnRight(100);
            	back(100);
            	turnGunRight(360);
			}
	}
	
	public void onScannedRobot(ScannedRobotEvent e) {
		String robotank = e.getName();
		double distancia = e.getDistance();
		System.out.println(robotank + " distância " + distancia);
		if (distancia < 135) {
			fire(3);
		}	else {
			fire(1);
		}
	}
	
	public void onHitWall(HitWallEvent e) {
		back(50);
		turnRight(90);
	}
}
