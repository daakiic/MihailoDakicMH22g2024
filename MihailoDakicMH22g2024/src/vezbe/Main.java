package vezbe;

import java.util.Scanner;

public class Main {

private static Scanner scanner;
private static Scanner scanner2;

//	Deklarisanje i inicijalizacija
	public static void prvaVezba() {
//		Deklarisanje
		int broj;
//		Inicijalizacija
		broj = 50;
		broj = 20;
		broj = 30;
		
//		Nevalidno
//		broj = "Tekst";
//		broj = 50.5;
		double decimalniBroj = 50.5;
		String tekst = "Nas prvi string";
		
		System.out.println(broj);
		System.out.println("Decimalni broj koji imamo je: " + decimalniBroj);
		System.out.println(tekst);
				
	}
	
//	Parni i neparni brojevi - if else struktura
	public static void drugaVezba() {
		scanner = new Scanner(System.in);
		System.out.println("Unesite broj");
		int broj = scanner.nextInt();
		
//		Operator koji se zove moduo sluzi za racunanje ostatka pri deljenju - %
		if(broj % 2 == 0) {
			System.out.println("Broj " + broj + " je paran");
		} else {
			System.out.println("Broj " + broj + " je neparan");
		}
	}
	
//	For i while petlja
	public static void trecaVezba() {
		
		System.out.println("Unesite broj");
		scanner2 = new Scanner(System.in);
		int broj = scanner2.nextInt();
		
//		For petlja
		for(int brojac = 0; brojac <= broj; brojac++) {
			System.out.print(brojac);
		}
		
		int brojac = 0;
		while(brojac <= broj) {
			System.out.print(" " + brojac);
			brojac++;
		}
		
	}
	
	public static void main(String[] args) {

//		prvaVezba();
//		drugaVezba();
		trecaVezba();
		
	}

}