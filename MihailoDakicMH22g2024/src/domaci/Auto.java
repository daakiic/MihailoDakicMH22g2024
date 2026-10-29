package domaci;

public class Auto {

	int brzina;
	String marka;
	boolean ukljucen;
	
	public void ubrzaj(int brzina) {	
		if(this.ukljucen == true) {
			this.brzina += brzina;
		} else {
			System.out.println("automobil je iskljucen");
		}
	}
	
	public void stani() {
		if(this.ukljucen == true) {
			if(this.brzina < 50) {
				System.out.println("vozilo ce se zaustaviti za 4 sekunde");
			} else if(this.brzina>=50 && this.brzina<=100) {
				System.out.println("vozilo ce se zaustaviti za 8 sekundi");
			} else if(this.brzina>100) {
				System.out.println("vozilo ce se zaustaviti za 12 sekundi");
			}
			this.brzina = 0;
		} else {
			System.out.println("automobil je iskljucen - vec stoji");
		}
	}
	
	public void oAutu() {
		System.out.println(getMarka());
		
		if(this.ukljucen == true) {
			System.out.println("ukljucen");
		} else {
			System.out.println("iskljucen");
		}
		
		if(this.ukljucen==true) {
			System.out.println(getBrzina());
		}
	}
	
	public int getBrzina() {
		return brzina;
	}

	public void setBrzina(int brzina) {
		this.brzina = brzina;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public boolean isUkljucen() {
		return ukljucen;
	}

	public void setUkljucen(boolean ukljucen) {
		this.ukljucen = ukljucen;
	}

}
