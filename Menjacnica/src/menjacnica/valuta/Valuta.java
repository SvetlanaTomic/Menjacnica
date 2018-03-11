package menjacnica.valuta;

import java.util.LinkedList;

public class Valuta {

	private String naziv;
	private String skraceniNaziv;
	private LinkedList<KursZaDatum> kursZaDatum = new LinkedList<KursZaDatum>();
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}
	public void setSkraceniNaziv(String skraceniNaziv) {
		this.skraceniNaziv = skraceniNaziv;
	}
	public LinkedList<KursZaDatum> getKursZaDatum() {
		return kursZaDatum;
	}
	public void setKursZaDatum(LinkedList<KursZaDatum> kursZaDatum) {
		this.kursZaDatum = kursZaDatum;
	}
}
