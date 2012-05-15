package nl.topicus;

public class Locatie {
	private double xwaarde;
	private double ywaarde;
	private String naam;
	private String beschrijving;
	
	public Locatie(double xwaarde, double ywaarde,String naam,String beschrijving){	
		this.xwaarde = xwaarde;
		this.ywaarde = ywaarde;
		this.setNaam(naam);
		this.setBeschrijving(beschrijving);	
	}
	
	public double getYwaarde() {
		return ywaarde;
	}
	public void setYwaarde(double ywaarde) {
		this.ywaarde = ywaarde;
	}
	public double getXwaarde() {
		return xwaarde;
	}
	public void setXwaarde(double xwaarde) {
		this.xwaarde = xwaarde;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getBeschrijving() {
		return beschrijving;
	}

	public void setBeschrijving(String beschrijving) {
		this.beschrijving = beschrijving;
	}
}
