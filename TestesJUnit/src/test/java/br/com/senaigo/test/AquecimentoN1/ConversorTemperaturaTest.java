package br.com.senaigo.test.AquecimentoN1;
import org.junit.Test;

import junit.framework.TestCase;

public class ConversorTemperaturaTest extends TestCase {

	@Test
	public void testConverteCelsiusParaFahrenheit() {
		double actual = ConversorTemperatura.converteCelsiusParaFahrenheit(10);
		assertEquals(50.0, actual, 0.0);
	}

	@Test
	public void testConverteFahrenheitParaCelsius() {
		double actual = ConversorTemperatura.converteFahrenheitParaCelsius(50);
		assertEquals(10.0, actual, 0.0);
	}

}
