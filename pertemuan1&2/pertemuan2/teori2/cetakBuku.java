public class cetakBuku {
	public static void main(String[] args) {
		// buku baru
		Buku book1 = new Buku();
		Buku book2 = new Buku();
		
		// informasi buku 1
		book1.judul = "Pemrograman Berbasis Objek dengan Java";
		book1.pengarang = "Indrajani";
		book1.penerbit = "Elexmedia Komputindo";
		book1.tahun = 2007;
		System.out.println("Judul: " + book1.judul);
		System.out.println("Pengarang: " + book1.pengarang);
		System.out.println("Penerbit: " + book1.penerbit);
		System.out.println("Tahun: " + book1.tahun);
		
		// informasi buku 2
		book2.judul = "Dasar Pemrograman Java";
		book2.pengarang = "Abdul Kadir";
		book2.penerbit = "Andi Offset";
		book2.tahun = 2004;
		System.out.println("Judul: " + book2.judul);
		System.out.println("Pengarang: " + book2.pengarang);
		System.out.println("Penerbit: " + book2.penerbit);
		System.out.println("Tahun: " + book2.tahun);
	}
}

class Buku {
	String judul;
	String pengarang;
	String penerbit;
	int tahun;
	
	Buku() {
	}
}