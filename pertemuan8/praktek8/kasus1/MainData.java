public class MainData {
	public static void main(String[] args) {
		
		System.out.println("---data di sistem Universitas Harapan Kita---");
		// daftar mahasiswa
		Biodata mhs = new Mahasiswa();
		mhs.Tambah("Budi");
		mhs.Tambah("Andi");
		mhs.Tambah("Celia");
		System.out.println("daftar mahasiswa: "+mhs.GetData());
		
		
		// daftar dosen
		Biodata dosen = new Dosen();
		dosen.Tambah("Pak Joko");
		dosen.Tambah("Bu Umi");
		dosen.Tambah("Pak Raden");
		dosen.Tambah("Bu Siti");
		dosen.Tambah("Bu Fatimah");
		System.out.println("daftar dosen: "+dosen.GetData());
		
		// daftar mata kuliah pokok
		MataKuliah mkp = new MKPokok();
		mkp.Tambah("komputer","senin");
		mkp.Tambah("kedokteran","selasa");
		mkp.Tambah("bisnis","rabu");
		System.out.println("daftar mata kuliah pokok: "+mkp.GetMatkul());
		System.out.println("jadwal mata kuliah pokok: "+mkp.GetJadwal());
		
		// daftar mata kuliah tambahan
		MataKuliah mkt = new MKTambah();
		mkt.Tambah("PPkn","kamis");
		mkt.Tambah("English","jumat");
		System.out.println("daftar mata kuliah tambahan: "+mkt.GetMatkul());
		System.out.println("jadwal mata kuliah tambahan: "+mkt.GetJadwal());
		
		System.out.println("---data seorang mahasiswa---");
		
		// laporan data dan nilai
		System.out.println("nama mahasiswa: "+mhs.GetInfo(1));
		System.out.println("mata kuliah pokok yang diambil: "+mkp.GetMatkul(2)+", jadwalnya: "+mkp.GetJadwal(2)+" dan diampu oleh dosen: "+dosen.GetInfo(3));
		System.out.println("mata kuliah pokok yang diambil: "+mkt.GetMatkul(0)+", jadwalnya: "+mkt.GetJadwal(1)+" dan diampu oleh dosen: "+dosen.GetInfo(1));
		Nilai nilai = new Nilai(85,75);
		nilai.NilaiAkhir();
		System.out.println("nilai mata kuliah pokok: "+nilai.GetNp());
		System.out.println("nilai mata kuliah tambahan: "+nilai.GetNt());
		System.out.println("nilai akhir: "+nilai.GetNa());
	}
}