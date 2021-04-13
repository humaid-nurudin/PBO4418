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
		
		// uji MotorCycle
		MotorCycle scoopy = new MotorCycle();
		System.out.println("gear saat ini: "+scoopy.getGearfoot());
		scoopy.turnRight();
		System.out.println("plat nomor kendaraan: "+scoopy.getLicencePlate());
		
		// uji Car
		Car mobil = new Car();
		System.out.println("kondisi seatbelt dari "+mobil.getSeatBelt()+" diubah menjadi "+mobil.setSeatBelt());
		mobil.turnLeft();
		System.out.println("jumlah mesin: "+mobil.getSizeofEngine());
	}
}