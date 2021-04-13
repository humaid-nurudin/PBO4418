public class Car extends MotorVehicle {
	boolean seatbelt = false;
	
	public Car() {
		super();
	}
	public boolean setSeatBelt() {
		return seatbelt = true;
	}
	public boolean getSeatBelt() {
		return seatbelt;
	}
}