package br.com.senaigo.test.AquecimentoN1;

public class ConversorTemperatura {
	
	public static double converteCelsiusParaFahrenheit(double celsius) {
		return 1.8 * celsius + 32;
	}

	public static double converteFahrenheitParaCelsius(double fahrenheit) {
		return (fahrenheit-32)/1.8;
	}

}
