public class Pembeli extends Biodata {
	private String nama;
	
	Pembeli() {
		super();
	}
	public void SetNama(String newNama) {
		nama = newNama;
	}
	
	public String GetNama() {
		return nama;
	}
}