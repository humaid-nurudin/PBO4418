public class Nilai {
	int np;
	int nt;
	int na;
	
	Nilai() {
	}
	Nilai(int np, int nt) {
		this.np = np;
		this.nt = nt;
	}
	public void NilaiAkhir() {
		this.na = ((3*np)/5 + (2*nt)/5);
	}
	public int GetNp() {
		return np;
	}
	public int GetNt() {
		return nt;
	}
	public int GetNa() {
		return na;
	}
}