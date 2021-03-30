import java.util.Scanner;

public class PBO {
	public static void main(String[] args) {
		int nAngka;
		char nHUruf;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("masukkan nilai tugas = ");
		int a = scn.nextInt();
		System.out.print("masukkan nilai mid = ");
		int b = scn.nextInt();
		System.out.print("masukkan nilai uas = ");
		int c = scn.nextInt();
		
		nAngka=(int) ((0.4*c)+(0.3*a)+(0.3*b));
		System.out.println("nilai akhir = "+nAngka);
                
                if (nAngka > 85)
			{nHUruf='A';}
		else if ((nAngka > 70) && (nAngka <= 85))
			{nHUruf='B';}
		else if ((nAngka > 60) && (nAngka <= 70))
			{nHUruf='C';}
		else if ((nAngka > 50) && (nAngka <= 60))
			{nHUruf='D';}
		else {nHUruf='E';}
		
		System.out.println("nilai huruf = "+nHUruf);
	}
}