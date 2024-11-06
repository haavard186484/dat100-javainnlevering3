package no.hvl.dat100.oppgave6;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.Innlegg;
import no.hvl.dat100.oppgave3.Blogg;

public class HtmlBlogg extends Blogg {

	public HtmlBlogg() {
		super();
	}
	
	private static String HTMLPREFIX = 
			"<html>\n\t<head>\n\t\t<title>DAT100 Blogg</title>\n\t</head>\n\t<body>\n";
	
	private static String HTMLPOSTFIX = 
			"\t</body>\n</html>";
	
	@Override
	public String toString() {
		String htmlString = HTMLPREFIX;
		Innlegg[] innlegg = HtmlBlogg.super.getSamling();
		
		if (HtmlBlogg.super.getAntall() > 0) {
			htmlString += innlegg[0].toHTML();
		} else {
			return "";
		}
		
		for (int i = 1, nesteLedige = HtmlBlogg.super.getAntall(); i < nesteLedige; i++) {
			htmlString += "<hr>" + innlegg[i].toHTML() + "<hr>\n";
		}
		htmlString += HTMLPOSTFIX;
		
		return htmlString;
	}
}
