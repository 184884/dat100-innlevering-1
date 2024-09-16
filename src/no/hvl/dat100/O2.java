package no.hvl.dat100;

import java.util.Scanner;

public class O2 {

	public static void main(String[] args) {
		char karakter;
		Scanner poengin = new Scanner(System.in);
		
		
		for (int i = 0; i < 10; i++) {
			int poeng = -1;
			
			while (poeng < 0 || poeng > 100) { 
				System.out.println("\nSkriv inn poengsum: ");
				poeng = poengin.nextInt();
				
			if (poeng < 0 || poeng > 100) {
				System.out.println("Ugyldig poengsum! Prøv igjen");
				}
			}
			
				if (poeng > 0 && poeng < 40) {
				karakter = 'F';
				
			} else if (poeng > 39 && poeng < 50) {
				karakter = 'E';
			} else if (poeng > 49 && poeng < 60) {
				karakter = 'D';
			} else if (poeng > 59 && poeng < 80) {
				karakter = 'C';
			} else if (poeng > 79 && poeng < 90) {
				karakter = 'B';
			} else {
				karakter = 'A';
			}
				System.out.println("Karakteren din er " + karakter);
		
				}
			}
		}
	
			