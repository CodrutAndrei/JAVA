
public class Bicycle {
	
	private int cadence=0;
	private int speed=0;
	private int gear=1;
	
	void changeGear(int newValue) {
		gear = newValue;
	}
	
	void changeCadence(int newValue) {
		cadence=newValue;
	}
	
	void speedUp(int increment) {
		speed = speed + increment;
	}
	
	void applyBrakes(int decrement) {
		speed = speed - decrement;
	}

	void printStates() {
		System.out.println("cadence=" + cadence + ", speed=" + speed + ", gear=" + gear);
	}
	
	
}
