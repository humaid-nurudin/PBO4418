public class matematikaDemo {
	public static void main(String[] args) {
		// operasi menghitung
		Matematika noteku = new Matematika();
		
		// tampilan hasil penambahan
		noteku.a = 20; noteku.b = 20;
		noteku.Tambah();
		System.out.println("penambahan "+ noteku.a +" + " + noteku.b + "=" + noteku.hasil);
		// tampilan hasil pengurangan
		noteku.a = 10; noteku.b = 5;
		noteku.Kurang();
		System.out.println("pengurangan "+ noteku.a +" - " + noteku.b + "=" + noteku.hasil);
		// tampilan hasil perkalian
		noteku.a = 10; noteku.b = 20;
		noteku.Kali();
		System.out.println("perkalian "+ noteku.a +" x " + noteku.b + "=" + noteku.hasil);
		// tampilan hasil pembagian
		noteku.a = 20; noteku.b = 2;
		noteku.Bagi();
		System.out.println("pembagian "+ noteku.a +" / " + noteku.b + "=" + noteku.hasil2);
	}
}

class Matematika {
	int a;
	int b;
	int hasil;
	int hasil2;
	
	void Matematika() {
	}
	void Tambah() {
		hasil = a + b;
	}
	void Kurang() {
		hasil = a - b;
	}
	void Kali() {
		hasil = a * b;
	}
	void Bagi() {
		hasil2 = a / b;
	}
}