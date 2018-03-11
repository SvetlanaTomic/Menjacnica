package menjacnicaInrefejs;

import java.util.GregorianCalendar;

import menjacnica.valuta.KursZaDatum;

public interface IMenjacnica {

	public void dodajKursZaDatum(KursZaDatum k);
	public void obrisiKursZaDatum(GregorianCalendar datum);
	public KursZaDatum vratiKursZaDatum(GregorianCalendar datum);
}
