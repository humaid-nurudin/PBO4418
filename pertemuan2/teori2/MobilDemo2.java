public class MobilDemo2 {
	public static void main(String[] args) {
		// membuat objek
		Mobil2 mobilku = new Mobil2();
		mobilku.mobilOn();
		mobilku.ubahGear(3);
		
		// memanggil atribut dan memberi nilai
		mobilku.warna = "hitam";
		mobilku.tahunProduksi = 2006;
		System.out.println("Warna: "+ mobilku.warna);
		System.out.println("Tahun: "+ mobilku.tahunProduksi);
		System.out.println("gear mobilku diubah ke gear: "+mobilku.gear);
	}	
}

class Mobil2 {
	String warna;
	int tahunProduksi;
	boolean on = false;
	int gear = 1;
	
	Mobil2() {
	}
	void mobilOn() {
		if (on = false) on = true;
	}
	void mobilOff() {
		if (on = true) on = false;
	}
	void ubahGear(int newGear) {
		if (on = true) gear = newGear;
	}
}