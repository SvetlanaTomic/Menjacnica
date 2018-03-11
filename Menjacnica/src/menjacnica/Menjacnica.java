package menjacnica;

import java.util.LinkedList;

import menjacnica.valuta.Valuta;

public class Menjacnica {

	private LinkedList<Valuta> valute = new LinkedList<Valuta>();

	public LinkedList<Valuta> getValute() {
		return valute;
	}

	public void setValute(LinkedList<Valuta> valute) {
		this.valute = valute;
	}

	@Override
	public String toString() {
		String poruka="";
		for(int i=0;i<valute.size();i++)
			poruka+=valute.get(i).getNaziv();
		return poruka;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((valute == null) ? 0 : valute.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Menjacnica))
			return false;
		Menjacnica other = (Menjacnica) obj;
		if (valute == null) {
			if (other.valute != null)
				return false;
		} else if (!valute.equals(other.valute))
			return false;
		return true;
	}
	
}
