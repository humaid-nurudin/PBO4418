public class Sedan extends Mobil {
	private String nama;
	private int harga;
	
	Sedan() {
		super();
	}
	public void SetNama(String newNama) {
		nama = newNama;
	}
	public void SetHarga(int newHarga) {
		harga = newHarga;
	}
	
	public String GetNama() {
		return nama;
	}
	public int GetHarga() {
		return harga;
	}
}