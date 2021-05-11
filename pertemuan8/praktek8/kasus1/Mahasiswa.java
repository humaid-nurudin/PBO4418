import java.util.ArrayList;

// turunan dari program abstrak biodata
public class Mahasiswa extends Biodata {
	public static ArrayList<String> mhs = new ArrayList<String>();
	
	public void Tambah(String Neo) {
		mhs.add(Neo);
	}
	public void Kurang(int Index) {
		mhs.remove(Index);
	}
	public void Ubah(int Index,String Neo) {
		mhs.set(Index,Neo);
	}
	
	public ArrayList<String> GetData() {
		return mhs;
	}
	public String GetInfo(int Index) {
		return mhs.get(Index);
	}
}