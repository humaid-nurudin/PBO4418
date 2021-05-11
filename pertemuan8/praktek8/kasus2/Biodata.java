public abstract class Biodata {
	private String nama;
	
	Biodata() {
	}
	public void SetNama(String newNama) {
		nama = newNama;
	}
	
	public abstract String GetNama();
}