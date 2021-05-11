import java.util.ArrayList;

// program abstrak biodata
public abstract class Biodata {
	public static ArrayList<String> x = new ArrayList<String>();
	
	public void Tambah(String Neo) {
		x.add(Neo);
	}
	public void Kurang(int Index) {
		x.remove(Index);
	}
	public void Ubah(int Index,String Neo) {
		x.set(Index,Neo);
	}
	
	public abstract ArrayList<String> GetData();
	public abstract String GetInfo(int Index);
}