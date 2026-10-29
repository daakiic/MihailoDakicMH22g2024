package domaci;

public class AutoTest {

public static void main(String[] args) {
		
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		Auto auto3 = new Auto();
		
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
		auto1.oAutu();
		auto1.ubrzaj(10);
		auto1.stani();
		auto1.oAutu();
		
		System.out.println("\n---auto2---");
		auto2.oAutu();
		auto2.ubrzaj(10);
		auto2.stani();
		auto2.oAutu();
		
		System.out.println("\n---auto3---");
		auto3.oAutu();
		auto3.ubrzaj(10);
		auto3.stani();
		auto3.oAutu();
		
	}
}
