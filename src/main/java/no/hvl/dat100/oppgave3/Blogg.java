package no.hvl.dat100.oppgave3;

import no.hvl.dat100.Ansatt;
import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.Innlegg;

public class Blogg {

	private Innlegg[] innleggtabell;
	private int nesteLedige;

	public Blogg() {

		innleggtabell = new Innlegg[20];
		nesteLedige = 0;
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
		nesteLedige = 0;
	}

	public int getAntall() {
		return nesteLedige;
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


	public boolean leggTil(Innlegg innlegg) {
		if (!finnes(innlegg) && ledigPlass()) {
			innleggtabell[nesteLedige++] = innlegg;
			return true;
		} else {
			return false;
		}

	}

	public String toString() {

		String str = getAntall() + super.toString();
		
		return str;
		
		
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