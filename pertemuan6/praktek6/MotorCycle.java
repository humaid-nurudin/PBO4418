public class MotorCycle extends MotorVehicle {
	int numGear;
	
	MotorCycle() {
		super();
	}
	public void setGearfoot(int newGear) {
		numGear = newGear;
	}
	public int getGearfoot() {
		return numGear;
	}
}