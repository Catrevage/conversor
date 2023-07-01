package br.com.conversor.models;

/**
 * Esta classe possui o metodo de conversao de temperaturas.
 */
import java.text.DecimalFormat;

public class Temp {

	public String convert(Object option, Double valor) {
		DecimalFormat df = new DecimalFormat("#0.00");
		double r = 0;
		String m = "";
		if (option == "De Celcius para Fahrenheit") {
			r = ((valor*9/5) + 32);//formula de conversao C to F
			m = "F";
		} else if (option == "De Fahrenheit para Celcius") {
			r = (5*(valor - 32))/9;//formula de conversao F to C
			m = "C";
		}
		
		return (df.format(r)+m);
		
	}
}
