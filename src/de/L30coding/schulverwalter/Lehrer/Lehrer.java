package de.L30coding.schulverwalter.Lehrer;

import de.L30coding.schulverwalter.util.Geschlecht;

public class Lehrer {
	private final String kürzel;
	private String vorname;
	private String nachname;
	private Geschlecht geschlecht;
	
	public Lehrer (String _kürzel, Geschlecht _geschlecht){
		this.kürzel = _kürzel;
		this.geschlecht = _geschlecht;
	}
	
	//TODO Weitere Initialisierungsmöglichkeiten implementieren
	
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

	public String getKürzel() {
		return kürzel;
	}
	
	public String toString() {
		if (geschlecht == Geschlecht.MÄNNLICH && nachname == null)
			return "Der Lehrer hat das Kürzel \"" + kürzel + "\".";
		else if (geschlecht == Geschlecht.MÄNNLICH && nachname != null)
			return "Herr " + nachname + ", " + vorname + "hat das Kürzel \"" + kürzel + "\".";
		else if (geschlecht == Geschlecht.WEIBLICH && nachname == null)
			return "Die Lehrerin hat das Kürzel \"" + kürzel + "\".";
		else if (geschlecht == Geschlecht.WEIBLICH && nachname != null)
			return "Frau " + nachname + ", " + vorname + "hat das Kürzel \"" + kürzel + "\".";
		else
			return "ERROR";
	}

}
