package menjacnica.valuta;

import java.util.GregorianCalendar;

public class KursZaDatum {

	private GregorianCalendar datum;
	private double prodajni;
	private double kupovni;
	private double srednji;
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) {
		if(datum==null)
			throw new RuntimeException("Pogresan datum");
		if(!datum.after(GregorianCalendar.DATE))
			this.datum = datum;
		else
			throw new RuntimeException("Ne mozete uneti kruseve za buducnost");
	}
	public double getProdajni() {
		return prodajni;
	}
	public void setProdajni(double prodajni) {
		if(prodajni>0)
			this.prodajni = prodajni;
		else
			throw new RuntimeException();
	}
	public double getKupovni() {
		return kupovni;
	}
	public void setKupovni(double kupovni) {
		if(kupovni>0)
			this.kupovni = kupovni;
		else
			throw new RuntimeException();
	}
	public double getSrednji() {
		return srednji;
	}
	public void setSrednji(double srednji) {
		if(srednji>0)
			this.srednji = srednji;
		else
			throw new RuntimeException();
	}
	@Override
	public String toString() {
		return "KursZaDatum [datum=" + datum + ", prodajni=" + prodajni
				+ ", kupovni=" + kupovni + ", srednji=" + srednji + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kupovni);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(prodajni);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(srednji);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof KursZaDatum))
			return false;
		KursZaDatum other = (KursZaDatum) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (Double.doubleToLongBits(kupovni) != Double
				.doubleToLongBits(other.kupovni))
			return false;
		if (Double.doubleToLongBits(prodajni) != Double
				.doubleToLongBits(other.prodajni))
			return false;
		if (Double.doubleToLongBits(srednji) != Double
				.doubleToLongBits(other.srednji))
			return false;
		return true;
	}
	
	
}
