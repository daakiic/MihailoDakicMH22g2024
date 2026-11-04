package domaci;

public class AutoTest {

public static void main(String[] args) {
		
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		Auto auto3 = new Auto();
		Auto auto4 = new Auto("Pezo", 50, true);
		Auto auto5 = new Auto(new String("Pezo"), 100, false);
				
		auto1.setMarka("Korveta");
		auto1.setBrzina(120);
		auto1.setUkljucen(true);
		
		auto2.setMarka("Golf");
		auto2.setBrzina(0);
		auto2.setUkljucen(false);
		
		auto3.setMarka("BMW");
		auto3.setBrzina(80);
		auto3.setUkljucen(true);
		
		
		System.out.println("\n---auto1---");
		auto1.ubrzaj(10);
//		auto1.stani();
		System.out.println(auto1);
		
		System.out.println("\n---auto2---");
		auto2.ubrzaj(10);
		auto2.stani();
		System.out.println(auto2);

		
		System.out.println("\n---auto3---");
		auto3.ubrzaj(10);
//		auto3.stani();
		System.out.println(auto3);
		
		System.out.println("\n---auto4---");
		System.out.println(auto4);
		auto4.ubrzaj(50);
		System.out.println(auto4);
		auto4.stani();
		System.out.println(auto4);

		System.out.println("\nTESTIRANJE EQUALS");
		System.out.println(auto4.equals(auto5));
		System.out.println(auto4.equals(auto3));
		System.out.println(auto1.equals(auto1));
		
	}
}
