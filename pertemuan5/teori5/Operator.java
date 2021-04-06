
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Operator {
        public static ArrayList<String> x = new ArrayList<String>();
        public static Queue<String> y = new LinkedList<String>();
        public static Stack<String> z = new Stack<String>();
    
	public void Tambah(String Neo) {
		x.add(Neo);
	}
	public void Tambah1(String Neo) {
		y.add(Neo);
	}
	public void Tambah2(String Neo) {
		z.add(Neo);
	}
	public void Kurang() {
		y.remove();
	}
	public void Kurang(int Index) {
		x.remove(Index);
	}
	public void Kurang1(int Index) {
		z.remove(Index);
	}
	public void Ubah(int Index,String Neo) {
		x.set(Index,Neo);
		// y.set(Index,Neo); <- tidak bisa dipakai
	}
	public void Ubah1(int Index,String Neo) {
		z.set(Index,Neo);
	}
	public void Tampil() {
		System.out.println("isi arraylist:"+x);
	}
	public void Tampil1() {
		System.out.println("isi queue:"+y);
	}
	public void Tampil2() {
		System.out.println("isi stack:"+z);
	}
}