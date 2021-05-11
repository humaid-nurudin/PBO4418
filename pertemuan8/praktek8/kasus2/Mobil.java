public abstract class Mobil {
	private String nama;
	private int harga;
	
	Mobil() {
	}
	public void SetNama(String newNama) {
		nama = newNama;
	}
	public void SetHarga(int newHarga) {
		harga = newHarga;
	}
	
	public abstract String GetNama();
	public abstract int GetHarga();
}