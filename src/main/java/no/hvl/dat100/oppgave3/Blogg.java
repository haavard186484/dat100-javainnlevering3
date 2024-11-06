package no.hvl.dat100.oppgave3;

import no.hvl.dat100.oppgave1.Innlegg;

public class Blogg {

	// TODO: objektvariable
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
		for (int pos = 0; pos < nesteLedige; pos++) {
			if (innleggtabell[pos].erLik(innlegg)) {
				return pos;
			}
		}

		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		return finnInnlegg(innlegg) >= 0;
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
		String data = nesteLedige + "\n";

		for (Innlegg innlegg : innleggtabell) {
			data += innlegg.toString();
		}

		return data;
	}

	// valgfrie oppgaver nedenfor

	public void utvid() {
		Innlegg[] nyTabell = new Innlegg[innleggtabell.length * 2];

		for (int pos = 0; pos < nesteLedige; pos++) {
			nyTabell[pos] = innleggtabell[pos];
		}

		innleggtabell = nyTabell;
	}

	public boolean leggTilUtvid(Innlegg innlegg) {
		if (finnes(innlegg)) {
			return false;
		}
		if (!ledigPlass()) {
			utvid();
		}

		return leggTil(innlegg);
	}

	public boolean slett(Innlegg innlegg) {
		int pos = finnInnlegg(innlegg);

		if (pos >= 0) {
			innleggtabell[pos] = innleggtabell[nesteLedige - 1];
			innleggtabell[nesteLedige-- - 1] = null;
			return true;
		} else {
			return false;
		}

	}

	public int[] search(String keyword) {
		int teller = 0;

		for (int i = 0; i < nesteLedige; i++) {
			if (innleggtabell[i] != null && innleggtabell[i].toString().contains(keyword)) {
				teller++;
			}
		}

		int[] idTab = new int[teller];
		int indeks = 0;

		for (int i = 0; i < nesteLedige; i++) {
			if (innleggtabell[i] != null && innleggtabell[i].toString().contains(keyword)) {
				idTab[indeks++] = innleggtabell[i].getId();
			}
		}

		return idTab;
	}

}