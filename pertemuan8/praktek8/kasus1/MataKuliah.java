import java.util.ArrayList;

// program abstrak mata kuliah
public abstract class MataKuliah {
	public static ArrayList<String> x = new ArrayList<String>();
	public static ArrayList<String> y = new ArrayList<String>();
	
	public void Tambah(String a, String b) {
		x.add(a);
		y.add(b);
	}
	public void Kurang(int a, int b) {
		x.remove(a);
		y.remove(b);
	}
	public void Ubah(int a, int b,String i, String j) {
		x.set(a,i);
		x.set(b,j);
	}
	
	abstract ArrayList<String> GetMatkul();
	abstract ArrayList<String> GetJadwal();
	abstract String GetMatkul(int a);
	abstract String GetJadwal(int b);
}