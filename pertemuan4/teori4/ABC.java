import java.util.Scanner;

public class ABC {
	public static void main(String[] args) {
		int D;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("masukkan nilai A = ");
		int a = scn.nextInt();
		System.out.print("masukkan nilai B = ");
		int b = scn.nextInt();
		System.out.print("masukkan nilai C = ");
		int c = scn.nextInt();
		
		D = (b*b)-(4*a*c);
		System.out.println("hasil dari D=b^2-4ac adalah "+D);
	}
}