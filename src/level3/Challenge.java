package level3;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level3.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	public void initialize() {
		driveDirect(500, 500);
		sleep(1100);
		driveDirect(0,0);
		driveDirect(390, 500);
		sleep(2000);
		driveDirect(0,0);
		driveDirect(500, 500);
		sleep(330);
		driveDirect(0,0);
		driveDirect(500, 390);
		sleep(2000);
		driveDirect(0,0);
		
	
		
		driveDirect(390, 500);
		sleep(2000);
		driveDirect(0,0);
		driveDirect(500, 500);
		sleep(500);
		driveDirect(0,0);
		
		
		driveDirect(500, 400);
		sleep(2000);
		driveDirect(0,0);
	}

	public void loop() {
	
	}
}
