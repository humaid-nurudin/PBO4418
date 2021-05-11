import java.util.ArrayList;

// turunan dari program abstrak biodata
public class Dosen extends Biodata {
	public static ArrayList<String> dosen = new ArrayList<String>();
	
	public void Tambah(String Neo) {
		dosen.add(Neo);
	}
	public void Kurang(int Index) {
		dosen.remove(Index);
	}
	public void Ubah(int Index,String Neo) {
		dosen.set(Index,Neo);
	}
	
	public ArrayList<String> GetData() {
		return dosen;
	}
	public String GetInfo(int Index) {
		return dosen.get(Index);
	}
}