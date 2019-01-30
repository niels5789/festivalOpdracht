package festivalProject;

public abstract class Act {
	String naam;
	double kosten, prijsKaartje; 
	double omzet = 0;
		
	public Act(String naam, double kosten, double prijsKaartje) {
		super();
		this.naam = naam;
		this.kosten = kosten;
		this.prijsKaartje = prijsKaartje;
	}
	

	
}
