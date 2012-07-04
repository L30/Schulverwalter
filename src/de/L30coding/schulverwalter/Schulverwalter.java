package de.L30coding.schulverwalter;

import de.L30coding.schulverwalter.Lehrer.Lehrer;
import de.L30coding.schulverwalter.util.Geschlecht;

public class Schulverwalter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Lehrer lehrer1 = new Lehrer ("ad", Geschlecht.MÄNNLICH);
		System.out.println(lehrer1);

	}

}
