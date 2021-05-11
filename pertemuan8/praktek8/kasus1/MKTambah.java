import java.util.ArrayList;

// turunan dari program abstrak mata kuliah
public class MKTambah extends MataKuliah {
	public static ArrayList<String> matkul = new ArrayList<String>();
	public static ArrayList<String> hari = new ArrayList<String>();
	
	public void Tambah(String a, String b) {
		matkul.add(a);
		hari.add(b);
	}
	public void Kurang(int a, int b) {
		matkul.remove(a);
		hari.remove(b);
	}
	public void Ubah(int a, int b,String i, String j) {
		matkul.set(a,i);
		hari.set(b,j);
	}
	
	public ArrayList<String> GetMatkul() {
		return matkul;
	}
	public ArrayList<String> GetJadwal() {
		return hari;
	}
	public String GetMatkul(int a) {
		return matkul.get(a);
	}
	public String GetJadwal(int b) {
		return hari.get(b);
	}
}