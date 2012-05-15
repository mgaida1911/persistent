package nl.topicus;

public class Vervoersmiddel {
	private String naam;
	private String beschrijving;
	private double gemiddeldeSnelheid;
	
	public Vervoersmiddel(String naam, String beschrijving){
		this.setNaam(naam);
		this.setBeschrijving(beschrijving);
		
	}

	public String getBeschrijving() {
		return beschrijving;
	}

	public void setBeschrijving(String beschrijving) {
		this.beschrijving = beschrijving;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

}
