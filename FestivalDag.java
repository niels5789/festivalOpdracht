package festivalProject;

public class FestivalDag {
	int weerCijfer;
	int dagNummer;
	
	FestivalDag( int dagNummer, int weerCijfer) {
		this.dagNummer = dagNummer;
		this.weerCijfer = weerCijfer;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return dagNummer;
	}
	
}
