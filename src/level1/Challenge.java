package level1;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level1.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
		
	}
	/**
	 * Without touching the wall reach the endZone
	 * use sleep an driveDirect 
	 */
	public void initialize() {
	
	driveDirect(400, 500);
	sleep(3700);
	driveDirect(0,0);
	driveDirect(500, 500);	
	sleep(3500);
	driveDirect(0,0);
	driveDirect(400, 500);
	sleep(3700);
	driveDirect(0,0);

	
		
	}

	private void speed(int i) {
		// TODO Auto-generated method stub
		
	}

	public void loop() {
	
	}
}
