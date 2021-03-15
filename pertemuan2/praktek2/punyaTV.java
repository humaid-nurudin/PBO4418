public class punyaTV {
	public static void main(String[] args) {
		// identitas manusia
		Manusia man1 = new Manusia("Erik");
		System.out.println(man1.namaSaya());
		// punya tv atau tidak
		TV tvku = new TV();
		man1.beliTV(tvku);
		System.out.println(man1.cekTV());
		man1.jualSemuaTV();
		System.out.println(man1.cekTV());
	}
}

class Manusia {
	String nama;
	boolean punyaTV = false;
	
	Manusia() {
	}
	Manusia(String newNama) {
		nama = newNama;
	}
	String namaSaya() {
		return nama;
	}
	void beliTV(TV tiviku) {
		punyaTV = true;
	}
	void jualSemuaTV() {
		if (punyaTV = true) punyaTV = false;
	}
	boolean cekTV() {
		return punyaTV;
	}
}