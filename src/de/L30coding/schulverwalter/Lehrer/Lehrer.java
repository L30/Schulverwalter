package de.L30coding.schulverwalter.Lehrer;

import de.L30coding.schulverwalter.util.Geschlecht;

public class Lehrer {
	private final String k�rzel;
	private String vorname;
	private String nachname;
	private Geschlecht geschlecht;
	
	public Lehrer (String _k�rzel, Geschlecht _geschlecht){
		this.k�rzel = _k�rzel;
		this.geschlecht = _geschlecht;
	}
	
	//TODO Weitere Initialisierungsm�glichkeiten implementieren
	
	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public Geschlecht getGeschlecht() {
		return geschlecht;
	}

	public void setGeschlecht(Geschlecht geschlecht) {
		this.geschlecht = geschlecht;
	}

	public String getK�rzel() {
		return k�rzel;
	}
	
	public String toString() {
		if (geschlecht == Geschlecht.M�NNLICH && nachname == null)
			return "Der Lehrer hat das K�rzel \"" + k�rzel + "\".";
		else if (geschlecht == Geschlecht.M�NNLICH && nachname != null)
			return "Herr " + nachname + ", " + vorname + "hat das K�rzel \"" + k�rzel + "\".";
		else if (geschlecht == Geschlecht.WEIBLICH && nachname == null)
			return "Die Lehrerin hat das K�rzel \"" + k�rzel + "\".";
		else if (geschlecht == Geschlecht.WEIBLICH && nachname != null)
			return "Frau " + nachname + ", " + vorname + "hat das K�rzel \"" + k�rzel + "\".";
		else
			return "ERROR";
	}

}
