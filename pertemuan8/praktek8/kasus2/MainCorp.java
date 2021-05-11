public class MainCorp {
	public static void main(String[] args) {
		System.out.println("---data di perusahaan Harpindo Kita---");
		
		// lakukan persiapan
		Biodata pekerja = new Karyawan();
		pekerja.SetNama("Panji");
		System.out.println("nama seorang karyawan: "+pekerja.GetNama());
		System.out.println("---daftar tipe mobil yang dijual---");
		Mobil car = new Sedan();
		car.SetNama("Sedan");
		car.SetHarga(100000000);
		System.out.println("mobil tipe "+car.GetNama()+" seharga Rp "+car.GetHarga()+" per unit");
		Mobil car1 = new MiniBus();
		car1.SetNama("Mini Bus");
		car1.SetHarga(150000000);
		System.out.println("mobil tipe "+car1.GetNama()+" seharga Rp "+car1.GetHarga()+" per unit");
		Mobil car2 = new Bus();
		car2.SetNama("Bus");
		car2.SetHarga(200000000);
		System.out.println("mobil tipe "+car2.GetNama()+" seharga Rp "+car2.GetHarga()+" per unit");
		
		// pembeli membeli mobil
		System.out.println("---transaksi penjual dan pembeli---");
		Individu orang = new Individu();
		orang.SetNama("Upin");
		System.out.println("pembeli individu "+orang.GetNama()+" membeli mobil tipe "+car.GetNama()+" sebanyak "+2+" unit seharga Rp "+2*car.GetHarga());
		Borongan grup = new Borongan();
		grup.SetNama("Grup Shiva");
		System.out.println("pembeli borongan "+grup.GetNama()+" membeli mobil tipe "+car2.GetNama()+" sebanyak "+1+" unit seharga Rp "+1*car2.GetHarga());
		
		// hitung keuntungan penjualan
		System.out.println("---menghitung hasil penjualan---");
		System.out.println("daftar para pembeli dan barang telah terjual:");
		System.out.println("pembeli individu "+orang.GetNama()+" membeli mobil tipe "+car.GetNama()+" sebanyak "+2+" unit seharga Rp "+2*car.GetHarga());
		System.out.println("pembeli borongan "+grup.GetNama()+" membeli mobil tipe "+car2.GetNama()+" sebanyak "+1+" unit seharga Rp "+1*car2.GetHarga());
		System.out.println("keuntungan yang di dapat oleh karyawan ini: Rp "+(2*car.GetHarga()+1*car2.GetHarga())/10);
	}
}