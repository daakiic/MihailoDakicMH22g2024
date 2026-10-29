package domaci;

import java.util.Scanner;

public class PetZadataka {
	
	public static void prviZadatak(double cenaProizvoda, int kolicina) {
		
		double bezPdv = Math.round(cenaProizvoda * kolicina);
		double pdv = bezPdv * 0.2;
		double saPdv = Math.round(bezPdv + pdv);
		
		System.out.println("Vrednost " + kolicina + " proizvoda jedinicne cene " + cenaProizvoda + " bez PDV-a je: " + bezPdv + ", a uz PDV je: " + saPdv);
				
	}
	public static void drugiZadatak() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Unesite koliko imate godina");
		int godine = scanner.nextInt();
		
		if(godine>=0 && godine<=12) {
			System.out.println("Dete");
		} else if(godine>=13 && godine<=19) {
			System.out.println("Tinejdzer");
		} else if(godine>=20 && godine<=64) {
			System.out.println("Odrasla osoba");
		} else if(godine>=65) {
			System.out.println("Starija osoba");
		} else {
			System.out.println("Uneti broj godina nije validan");
		}
		
	}
	public static void treciZadatak() {
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Unesite cenu proizvoda");
		double cenaProizvoda = scanner2.nextDouble();
		
		Scanner scanner3 = new Scanner(System.in);
		System.out.println("Unesite broj zvezdica u opsegu od 1 do 5");
		int zvezdice = scanner3.nextInt();
		
		double popust;
		
		if(zvezdice == 1) {
			popust = 1;
		} else if(zvezdice == 2) {
			popust = 0.95;
		} else if(zvezdice == 3) {
			popust = 0.90;
		} else if(zvezdice == 4) {
			popust = 0.85;
		} else if(zvezdice == 5) {
			popust = 0.80;
		} else {
			System.out.println("Greska prilikom unosa broja zvezdica - prodaja bez popusta ");
			popust = 1;
		}
		
		double konacnaCena = cenaProizvoda * popust;
		
		System.out.println("Cena proizvoda je: " + cenaProizvoda + ", broj zvezdica lojalnosti je: " + zvezdice + " pa je konacna cena: " + konacnaCena);
		
		
		
	}
	public static void cetvrtiZadatak() {
		
		Scanner scanner4 = new Scanner(System.in);
		System.out.println("Unesite celobrojnu vrednost vecu od 0");
		int brojN = scanner4.nextInt();
		int zbir = 0;
		
		for(int i = 1; i < brojN; i++) {
			if(i%2==0) {
				zbir+=i;
			}
		};
		System.out.println("for: Zbir parnih brojeva od 1 do " + brojN + " je: " + zbir);
		
		zbir = 0;
		int i = 1;
		while(i < brojN) {
			if(i%2==0) {
				zbir+=i; 
			}
			i++;
		}
		System.out.println("while: Zbir parnih brojeva od 1 do " + brojN + " je: " + zbir);
	}
	public static void petiZadatak() {
		
		Scanner scanner5 = new Scanner(System.in);
		System.out.println("Unesite trocifreni broj");
		int trocifrenBroj = scanner5.nextInt();
		
		int stotina = trocifrenBroj / 100;
		int desetica = (trocifrenBroj % 100) / 10;
		int jedinica = trocifrenBroj % 10;
		
		System.out.println("Za broj " + trocifrenBroj + " stotina je: " + stotina + ", desetica " + desetica + " i jedinica " + jedinica);
		
		int maxi = 0;
		if (stotina > desetica && stotina > jedinica) {
			maxi = stotina;
		} else if (desetica > stotina && desetica > jedinica) {
			maxi = desetica;
		} else {
			maxi = jedinica;
		}
		
		System.out.println("Najveca cifra u broju " + trocifrenBroj + " je: " + maxi);
		
	}
	
	public static void main(String[] args) {

		System.out.println("\n--- PRVI ZADATAK ---");
		prviZadatak(80.99, 12);
		
		System.out.println("\n--- DRUGI ZADATAK --- ");
		drugiZadatak();

		System.out.println("\n--- TRECI ZADATAK --- ");
		treciZadatak();
		
		System.out.println("\n--- CETVRTI ZADATAK --- ");
		cetvrtiZadatak();
		
		System.out.println("\n--- PETI ZADATAK --- ");
		petiZadatak();
		
	}
}
