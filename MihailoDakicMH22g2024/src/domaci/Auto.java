package domaci;

public class Auto {

	int brzina;
	String marka;
	boolean ukljucen;
	
	public Auto() {
		
	}
	
	public Auto(String marka, int brzina) {
		this.marka = marka;
		this.brzina = brzina;
	}
	
	public Auto(String marka, int brzina, boolean ukljucen) {
		this(marka,brzina);
		this.ukljucen = ukljucen;
	}
	
	
	@Override
	public String toString() {
		if(this.ukljucen == true) {
			return String.format("Objekat klase Auto, marke %s, koji je trenutno ukljucen i kreće se brzinom od %d km/h.",
					getMarka(), getBrzina());
		} else {
			return String.format("Objekat klase Auto, marke %s, koji je trenutno iskljucen i kreće se brzinom od %d km/h.",
					getMarka(), getBrzina());
		}
	}
		
	@Override
	public boolean equals(Object o) {
	    if (o instanceof Auto) {
	        Auto temp = (Auto) o;
	        if (this.marka.equals(temp.getMarka())) {
	            return true;
	        }
	    } 
	    return false;
	}
	
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
			this.ukljucen = false;
		} else {
			System.out.println("automobil je iskljucen - vec stoji");
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
