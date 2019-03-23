package br.com.senaigo.test.AquecimentoN1;

public class TemperaturaCelsius {
	
	private double celsius;
	
	public TemperaturaCelsius(double celsius){
		this.celsius = celsius;
	}
	
	public double converteCelsiusParaFahrenheit(){
		return (celsius*1.8)+32;
	}

}
