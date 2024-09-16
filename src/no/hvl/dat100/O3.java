package no.hvl.dat100;
import java.util.Scanner;
public class O3 {

	public static void main(String[] args) {
		System.out.println("Skriv inn heltall: ");
		Scanner input = new Scanner(System.in);
		int heltall = input.nextInt();
		int fakultet = 1;
		
		while (heltall <= 0) {
			System.out.println("Ugyldig, skriv inn positivt heltall: ");
			heltall = input.nextInt();
		}
		
		for (int i = 1; i<=heltall; i++) {
			fakultet = fakultet*i;
		}
		System.out.println(heltall + "! = " + fakultet);
	}
}
