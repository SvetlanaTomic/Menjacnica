package menjacnica.valuta;

import java.util.GregorianCalendar;
import java.util.LinkedList;

public class Valuta {

	private String naziv;
	private String skraceniNaziv;
	private LinkedList<KursZaDatum> kursZaDatum = new LinkedList<KursZaDatum>();
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if(naziv!=null && !naziv.isEmpty())
			this.naziv = naziv;
		else
			throw new RuntimeException("Naziv je pogresno unet");
	}
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}
	public void setSkraceniNaziv(String skraceniNaziv) {
		if(naziv!=null && !naziv.isEmpty())
			this.skraceniNaziv = skraceniNaziv;
		else
			throw new RuntimeException("Skraceni naziv je pogresno unet");
		
	}
	public LinkedList<KursZaDatum> getKursZaDatum() {
		return kursZaDatum;
	}
	public void setKursZaDatum(LinkedList<KursZaDatum> kursZaDatum) {
			this.kursZaDatum=kursZaDatum;
	}
	public void addKursZaDatum(KursZaDatum k)
	{
		if(k!=null)
		this.kursZaDatum.add(k);
	}
	public void delateKursZaDatum(GregorianCalendar d)
	{
		for(int i=0;i<kursZaDatum.size();i++)
			if(kursZaDatum.get(i).getDatum().equals(d))
				kursZaDatum.remove(i);
	}
	public KursZaDatum vratiZaDatum(GregorianCalendar d)
	{
		for(int i=0;i<kursZaDatum.size();i++)
			if(kursZaDatum.get(i).getDatum().equals(d))
				return this.kursZaDatum.get(i);
		return null;
	}
	@Override
	public String toString() {
		return "Valuta [naziv=" + naziv + ", skraceniNaziv=" + skraceniNaziv
				+ ", kursZaDatum=" + kursZaDatum + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((kursZaDatum == null) ? 0 : kursZaDatum.hashCode());
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result
				+ ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Valuta))
			return false;
		Valuta other = (Valuta) obj;
		
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (skraceniNaziv == null) {
			if (other.skraceniNaziv != null)
				return false;
		} else if (!skraceniNaziv.equals(other.skraceniNaziv))
			return false;
		return true;
	}
	
}
