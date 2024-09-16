package no.hvl.dat100;
import java.util.Scanner;

public class O1 {

	public static void main(String[] args) {
		System.out.println("Skriv inn bruttoinntekt: ");
		Scanner bruttoinn = new Scanner(System.in);
		double inntekt = bruttoinn.nextInt();
		double skatt;
		
		double fulltrinn1 = (292850 - 208051) *0.017;
		double fulltrinn2 = (670000 - 292851) *0.04;
		double fulltrinn3 = (937900 - 670001) *0.136;
		double fulltrinn4 = (1350000 - 937900) *0.166;
		double trinn1 = (inntekt - 208051) *0.017;
		double trinn2 = (inntekt - 292851) *0.04;
		double trinn3 = (inntekt - 670001) *0.136;
		double trinn4 = (inntekt - 937900) *0.166;
		double trinn5 = (inntekt - 1350000) *0.176;
		
		if (inntekt > 1350000) {
			skatt = trinn5 + fulltrinn1 + fulltrinn2 + fulltrinn3 + fulltrinn4;
			System.out.println("Du må betale " + skatt + "kr skatt");
		} else if (inntekt >= 937901 && inntekt <= 1350000) {
			skatt = trinn4 + fulltrinn1 + fulltrinn2 + fulltrinn3;
			System.out.println("Du må betale " + skatt + "kr skatt");
		} else if (inntekt >= 670001 && inntekt <= 937900) {
			skatt = trinn3 + fulltrinn1 + fulltrinn2;
			System.out.println("Du må betale " + skatt + "kr skatt");
		} else if (inntekt >= 292851 && inntekt <= 670000) {
			skatt = trinn2 + fulltrinn1;
			System.out.println("Du må betale " + skatt + "kr skatt");
		} else if (inntekt >= 208051 && inntekt <= 292850 ) {
			skatt = trinn1;
			System.out.println("Du må betale " + skatt + "kr skatt");
		}

	}

}
