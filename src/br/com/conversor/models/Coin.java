package br.com.conversor.models;

/**
 * Esta classe possui os atributos que armazenam a 
 * cotação de cada moeda e possui o metodo de conversao.
 */

import java.text.DecimalFormat;

public class Coin {
	private double dollar = 4.79;
	private double euro = 5.23;
	private double libraEterlina = 6.09;
	private double pesoArgentino = 0.019;
	private double pesoChileno = 0.0060;
	
	
	public String convert(Object option, Double valor) {
		DecimalFormat df = new DecimalFormat("#,###,##0.00");
		double r = 0;
		String m = "";
		
		if (option == "De Reais a Dolares") {
			r = valor/this.dollar;
			m = "Dolares Americanos";
		} 
		else if (option == "De Reais a Euros") {
			r = valor/this.euro;
			m = "Euros";
		} 
		else if (option == "De Reais a Libras") {
			r = valor/this.libraEterlina;
			m = "Libras Esterlinas";
		} 
		else if (option == "De Reais a Pesos Argentinos") {
			r = valor/this.pesoArgentino;
			m = "Pesos Argentinos";
		} 
		else if (option =="De Reais a Pesos Chilenos") {
			r = valor/this.pesoChileno;
			m = "Pesos Chilenos";
		} 
		else if (option == "De Dolares a Reais") {
			r = valor*this.dollar;
			m = "Reais";
		} 
		else if (option == "De Euros a Reais") {
			r = valor*this.euro;
			m = "Reais";
		} 
		else if (option == "De Libras a Reais") {
			r = valor*this.libraEterlina;
			m = "Reais";
		} 
		else if (option == "De Pesos Argentinos a Reais") {
			r = valor*this.pesoArgentino;
			m = "Reais";
		} 
		else if (option == "De Pesos Chilenos a Reais") {
			r = valor*this.pesoChileno;
			m = "Reais";
		}
		
		return (df.format(r)+" "+m);
	}

}
