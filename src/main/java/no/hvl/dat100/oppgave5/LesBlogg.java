package no.hvl.dat100.oppgave5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.Innlegg;
import no.hvl.dat100.oppgave2.Bilde;
import no.hvl.dat100.oppgave2.Tekst;
import no.hvl.dat100.oppgave3.Blogg;

public class LesBlogg {

	private static String TEKST = "TEKST";
	private static String BILDE = "BILDE";

	public static Blogg les(String mappe, String filnavn) {
		File fil = new File(mappe, filnavn);
		Blogg blogg = null;

		try (Scanner leser = new Scanner(fil)) {
			blogg = new Blogg(Integer.parseInt(leser.nextLine()));
			while (leser.hasNextLine()) {
				String type = leser.nextLine();
				int id = Integer.parseInt(leser.nextLine());
				String bruker = leser.nextLine();
				String dato = leser.nextLine();
				int likes = Integer.parseInt(leser.nextLine());
				
				if (type.equals(TEKST)) {
					String tekst = leser.nextLine();
					Innlegg innlegg = new Tekst(id, bruker, dato, likes, tekst);
					blogg.leggTil(innlegg);
				} else if (type.equals(BILDE)) {
					String tekst = leser.nextLine();
					String url = leser.nextLine();
					Innlegg bilde = new Bilde(id, bruker, dato, likes, tekst, url);
					blogg.leggTil(bilde);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return blogg;
	}
}
