package br.com.conversor.models;
/**
 * Esta classe eh responsavel pela criacao das caixas de mensagens
 *  com combobox.
 */
import javax.swing.JOptionPane;

public class Menu {
	private String[] optionsMain = {
			"Conversor de Moedas",
			"Conversor de Temperaturas"
	};
	private String[] optionsCoins = {
			"De Reais a Dolares",
			"De Reais a Euros",
			"De Reais a Libras",
			"De Reais a Pesos Argentinos",
			"De Reais a Pesos Chilenos",
			"De Dolares a Reais",
			"De Euros a Reais",
			"De Libras a Reais",
			"De Pesos Argentinos a Reais",
			"De Pesos Chilenos a Reais"
			
	};
	
	private String[] optionsTemp = {
			"De Celcius para Fahrenheit",
			"De Fahrenheit para Celcius"
	};
	/** Este metodo cria um caixa de mensagem com um combobox listando as poções
	 * armezenados no array s do tipo String. 
	 * @param s
	 * @return String do array s
	 */
	public Object CreateMenu(String[] s) {
		Object op = JOptionPane.showInputDialog(
				null, 
				"Escolha Uma Opção", "App Conversor",
				JOptionPane.INFORMATION_MESSAGE,
				null,
				s,
				s[0]
				);	
		return op;

	}
	
	public Object CreateMainMenu() {//Cria o menu principal.
		Object menu = this.CreateMenu(this.optionsMain);
		return menu;
	}
	
	public Object CreateCoinMenu() {//Cria o menu de conversão de moedas.
		Object menu = this.CreateMenu(this.optionsCoins);
		return menu;
	}
	
	public Object CreateTempMenu() {//Cria o menu de conversão de temperaturas.
		Object menu = this.CreateMenu(this.optionsTemp);
		return menu;
	}
	
	/**
	 * Este metodo exibe uma caixa de diálogo e recebe uma valor informado pelo
	 * usuário, que será convertido.
	 * O valor informado só pode ser numérico. Não pode ser letras ou caracteres,
	 * não pode conter espaço ou ser vazio. 
	 * 
	 * @return Um numero Double.
	 */
	
	public double InputBox() {//Ler o valor informado pelo usuario.
		double op = 0;
		while(true) {
			try {//trata as duas possíveis exceptions que podem acontecer. 
				op = Double.parseDouble(JOptionPane.showInputDialog(
						"Informe o valor:")); 
				break;
			} catch (NumberFormatException | NullPointerException e) {
				JOptionPane.showMessageDialog(null, "Informe um valor válido");
			}
			
		}	
		
		return op;
	}

}
