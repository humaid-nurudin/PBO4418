public class MotorVehicle extends Vehicle {
	public int sizeofEngine = 1;
	public String licencePlate = "H 1 IDN";
	
	public MotorVehicle() {
		super();
	}
	public MotorVehicle(int sizeEng, String lcPlate) {
		super();
		this.sizeofEngine = sizeEng;
		this.licencePlate = lcPlate;
	}
	public int getSizeofEngine() {
		return sizeofEngine;
	}
	public String getLicencePlate() {
		return licencePlate;
	}
}