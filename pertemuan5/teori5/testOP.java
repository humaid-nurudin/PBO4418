public class testOP {
	public static void main(String[] args) {
		// tes daftar
		Daftar teletubies = new Daftar();
		teletubies.Tambah("winky");
		teletubies.Tambah("lala");
		teletubies.Tambah("po");
		teletubies.Kurang(1);
		teletubies.Ubah(0,"dipsy");
		teletubies.Tampil();
                
		// tes antrian
		Antrian avenger = new Antrian();
		avenger.Tambah1("iron man");
		avenger.Tambah1("hulk");
		avenger.Ubah(1,"thor");
		avenger.Kurang();
		avenger.Tampil1();
		
		// tes tumpukkan
		Tumpukkan stage = new Tumpukkan();
		stage.Tambah2("pemula");
		stage.Tambah2("dasar");
		stage.Ubah1(1,"menegah");
		stage.Kurang1(0);
		stage.Tampil2();
	}
}