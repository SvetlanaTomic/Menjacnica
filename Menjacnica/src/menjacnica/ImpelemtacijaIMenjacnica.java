package menjacnica;

import java.util.GregorianCalendar;

import menjacnica.valuta.KursZaDatum;
import menjacnica.valuta.Valuta;
import menjacnicaInrefejs.IMenjacnica;

public class ImpelemtacijaIMenjacnica implements IMenjacnica{

	private Valuta v= new Valuta();
	@Override
	public void dodajKursZaDatum(KursZaDatum k) {
		if(k!=null)
		v.addKursZaDatum(k);
		
	}

	@Override
	public void obrisiKursZaDatum(GregorianCalendar datum) {
		v.delateKursZaDatum(datum);
		
	}

	@Override
	public KursZaDatum vratiKursZaDatum(GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return v.vratiZaDatum(datum);
	}

}
