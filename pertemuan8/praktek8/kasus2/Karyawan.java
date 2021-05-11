public class Karyawan extends Biodata {
	private String nama;
	
	Karyawan() {
		super();
	}
	public void SetNama(String newNama) {
		nama = newNama;
	}
	
	public String GetNama() {
		return nama;
	}
}