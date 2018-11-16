package helloWorld;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import uk.co.placona.helloWorld.Mensch;

class MenschTest1 {
	
	public Mensch m;
	
	@Test
	void vorstellenTest() {
		m = new Mensch();
		String name = "Heinz";
		String text = m.vorstellen(name);
		assertEquals("Ich bin " + name, text);
	}
	 
	@Test
	void addierenTest() {
		m = new Mensch();
		double zahl = m.addiere(5.3, 6.7);
		assertEquals(12, zahl);
	}
	
	@Test
	void alterBerechnenTest() {
		m = new Mensch();
		double zahl = m.alterBerechnen(2000);
		assertEquals(18, zahl);
	}
}
