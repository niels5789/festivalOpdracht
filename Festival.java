package festivalProject;

import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Festival {
	
	ArrayList<FestivalDag> da = new ArrayList<>();
	ArrayList<Act> aa = new ArrayList<>();
	ArrayList<Medewerker> ma = new ArrayList<>();
	Random r = new Random();
	Scanner sc = new Scanner(System.in);
	
	void startFestival() {


//		****** opzetten festival ******		
//		[1] Maak array voor festivalDagen met random weercijfers (10 dagen)
		maakfestivaldagen();
		
//		[1] Laat weerbericht aan speler zien
		weerVoorspelling();
		
//			- [2] maak weer bericht realistischer (als dag 1 = 10 C, dan dag 2 waarschijnlijk niet 24 C)
//			
//		[1] Maak arraylist acts 
		maakActs();
//		- vul met acts (double kosten, double inkomsten per kaartje, double omzet, String naam)
//			-	[2] acts inkopen door gebruiker		
//			
		
//		[1]	speler moet medewerkers inhuren. (werknemer kost geld, kan x klanten helpen per dag)
//			-	[2] optie inbouwen upgraded employes
//
		huurPersoneel();
		
		System.out.println("Je hebt " + ma.size() + "Werknemers ingehuurd. ");
//		[2] Reklame maken voor festival
//
//		[1] Maak festival gangers array ()
//			- vul array met festivalgangers. Aantal weersafhankelijk. 
//			- [2] verschillende types festival gangers maken
//			- [3] type festivalganger is act afhankelijk
//			- [4] vaste werknemers optie, zijn goedkoper/ efficienter, maar moet je doorbetalen bij volgende (kleinere festivals)
		
		
		
		
//		******* Loop over festival dagen *******
		
//		start festival dag
//			- [1] loop over gasten. Elke gast gaat per dag 1x naar een act. (in fase 1 is de act random bepaald) 
//				- [2] Afhankelijk van het weer bepalen we welke act (Beter weer is duurdere act)
//		
//			- [1]  
//
		
//		******* einde loop *******
		
//		[1] Overzicht wordt geprint. financieel totaal omzet vs kosten.
//			-	[2] optie om gedetaileerder naar het rapport te kijken.

	}

	private void huurPersoneel() {
		int aantalMedewerkers;
		
		// vraag de gebruiker om te kiezen hoeveel personeel hij wilt inhuren
		System.out.println("Een werknemer kost €25,- per dag en kan 10 klanten per dag helpen. ");
		System.out.println("Hoeveel werknemers wil je inhuren?");
		
		// verkrijg user input
		aantalMedewerkers = sc.nextInt();
		// creeer benodigde aantal werknemers en stop werknemers in een array.
		for( int i = 0; i < aantalMedewerkers ; i++ ) {
			ma.add(new Medewerker());			
		}
		
	}

	private void maakActs() {
		Act a1 = new LiveMuziek("Live Concert", 100.00, 5.00);
		Act a2 = new Toneel("Standup Show", 30.00, 2.00);
		
		aa.add(a1);
		aa.add(a2);
		
	}

	private void weerVoorspelling() {
		System.out.println("Weerbericht:");
		for(FestivalDag fd : da) {
			System.out.println("Dag " + fd.dagNummer + ": " + "Weercijfer :" + fd.weerCijfer );
		}
		
	}

	private void maakfestivaldagen() {
		
		for( int i=0; i < 10; i++ ) {
			int weerCijfer = r.nextInt(10);
			da.add(new FestivalDag(i, weerCijfer));
		}
		
	}

	
	
}
