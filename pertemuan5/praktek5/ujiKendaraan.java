public class ujiKendaraan {
	public static void main(String[] args) {
		// uji Vehicle
		Vehicle kendaraan = new Vehicle();
		System.out.println("kecepatan: "+kendaraan.speed);
		System.out.println("warna: "+kendaraan.color);
		kendaraan.goStraight();
		kendaraan.turnLeft();
		kendaraan.turnRight();
		
		// uji Bicycle
		Bicycle sepeda = new Bicycle();
		System.out.println("warna: "+sepeda.color);
		sepeda.ringBell();
		sepeda.goStraight();
		
		// uji MotorVehicle
		MotorVehicle motor = new MotorVehicle(2, "D 2 HGN");
		System.out.println("kecepatan: "+motor.speed);
		System.out.println("jumlah mesin: "+motor.getSizeofEngine());
		System.out.println("plat nomor kendaraan: "+motor.getLicencePlate());
		motor.goStraight();
	}
}