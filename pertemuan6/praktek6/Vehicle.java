public class Vehicle {
	
	public double speed;
	public String color = "orange";
	
	public Vehicle() {
	}
	public void goStraight() {
		System.out.println("Maju");
	}
	public void turnLeft() {
		System.out.println("Belok Kiri");
	}
	public void turnRight() {
		System.out.println("Belok Kanan");
	}
}