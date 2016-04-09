package demo;

import java.util.Scanner;

public class StringTestiranje {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite Recenicu");
		String recenica = input.nextLine();
		
		// Odgovarajuce metode
		duzinaStringa(recenica + " \n");
		parnePozicije(recenica + " \n");
		neparnePozicije(recenica + " \n");
		brojUppera(recenica + " \n");
		brojLowecasa(recenica + " \n");
		karakteri(recenica + " \n");
		
	}

	private static void karakteri(String recenica) {
		// TODO Auto-generated method stub
		
	}

	private static void brojLowecasa(String recenica) {
		// TODO Auto-generated method stub
		
	}

	private static void brojUppera(String recenica) {
		for (char c : recenica.toCharArray()) {
	        if (Character.isUpperCase(c)) {
	            System.out.println("Velika slova u stringu su : " + c);
	        }
		}
	}

	private static void neparnePozicije(String recenica) {
		for (int i = 0; i < recenica.length(); i++) {
			if (i % 2 == 1) {
				System.out.print(recenica.charAt(i));
			}

		}

	}

	private static void parnePozicije(String recenica) {
		for(int i = 0; i < recenica.length(); i++){
		if(i % 2 == 0){
			System.out.print(recenica.charAt(i));
		}
			
		}
		
	}

	private static void duzinaStringa(String recenica) {
		System.out.println("Duzina stringa je: " + recenica.length());
		
	}

}