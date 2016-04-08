package demo;

import java.util.Scanner;

public class StringTestiranje {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite Recenicu");
		String recenica = input.nextLine();
		// Odgovarajuce metode
		
		duzinaStringa(recenica);
		parnePozicije(recenica);
		neparnePozicije(recenica);
		brojUppera(recenica);
		brojLowecasa(recenica);
		karakteri(recenica);
		
	}

	private static void karakteri(String recenica) {
		// TODO Auto-generated method stub
		
	}

	private static void brojLowecasa(String recenica) {
		// TODO Auto-generated method stub
		
	}

	private static void brojUppera(String recenica) {
		// TODO Auto-generated method stub
		
	}

	private static void neparnePozicije(String recenica) {
		// TODO Auto-generated method stub
		
	}

	private static void parnePozicije(String recenica) {
		// TODO Auto-generated method stub
		
	}

	private static void duzinaStringa(String recenica) {
		System.out.println("Duzina stringa je: " + recenica.length());
		
	}

}