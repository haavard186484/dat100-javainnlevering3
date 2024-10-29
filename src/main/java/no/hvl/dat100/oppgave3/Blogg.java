package no.hvl.dat100.oppgave3;

import no.hvl.dat100.Ansatt;
import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.Innlegg;

public class Blogg {

	private Innlegg[] innleggtabell;
	private int nesteLedige;

	public Blogg() {

		innleggtabell = new Innlegg[20];
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
	}

	public int getAntall() {
		return nesteLedige - 1;
	}

	public Innlegg[] getSamling() {
		return innleggtabell;

	}

	public int finnInnlegg(Innlegg innlegg) {
		boolean funnet = false;
		int pos = 0;

		while (pos < nesteLedige && !funnet) {
			if (innleggtabell[pos] == innlegg) {
				funnet = true;
			} else
				pos++;
		}
		if (funnet) {
			return pos;
		} else {
			return -1;
		}
	}

	public boolean finnes(Innlegg innlegg) {
		boolean funnet = false;
		int pos = 0;

		while (pos < nesteLedige && !funnet) {
			if (innleggtabell[pos] == innlegg) {
				funnet = true;
			} else
				pos++;
		}
		if (funnet) {
			return funnet;
		} else {
			return false;
		}
	}

	public boolean ledigPlass() {
		
	return nesteLedige < innleggtabell.length;
	}
//		boolean ledig = false;
//		 if(nesteLedige < innleggtabell.length) {
//			ledig = true;
//		} 
//	return ledig;}

	public boolean leggTil(Innlegg innlegg) {

		/*
		 * Implementer en metode public boolean leggTil(Innlegg innlegg) som legger
		 * innlegg inn i tabellen. Dersom der ikke finnes et innlegg i tabellen med
		 * samme id som innlegg skal metoden legge til innlegget på neste ledige plass i
		 * tabellen. Ellers skal ikke metoden legge inn innlegg i tabellen. Metoden skal
		 * returnere true om innlegget blev lagt til og false ellers.
		 * 
		 */
		
		

	}
//		Boolean lagtTil = false;
//		int pos = 0;
//
//		while (pos < nesteledig && !lagtTil) {
//			if (innleggtabell[pos].getId() == innlegg.getId()) {
//				pos++;
//			} else {
//				if (pos == nesteledig && !lagtTil) {
//					innleggtabell[pos] = innlegg;
//					return lagtTil = true;
//
//				}
//
//			}
//
//		}

	public String toString() {

		/*
		 * Implementer en metode public String toString() som returnerer data i tabellen
		 * som en streng der første linje i strengen angir antall Innlegg-objekt i
		 * tabellen, eks., en tabell med to innlegg (et tekst-innlegg og et
		 * bilde-innlegg):
		 * 
		 * 2\nTEKST\n1\nOle Olsen\n23-10\n0\nen tekst\nBILDE\n2\nOline
		 * Olsen\n24-10\n0\net bilde\nhttp://www.picture.com/oo.jpg\n
		 * 
		 */
		throw new UnsupportedOperationException(TODO.method());
	}

	// valgfrie oppgaver nedenfor

	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());

	}

	public boolean slett(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
	}

	public int[] search(String keyword) {

		throw new UnsupportedOperationException(TODO.method());

	}
}