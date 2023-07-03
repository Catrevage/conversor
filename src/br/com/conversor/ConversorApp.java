package br.com.conversor;

/**
 * Este aplicativo tem por finalidade realizar a conversao de moedas ou 
temperaturas,
 * cabe ao usuario escolhar a funcao que ele deseja. No final, o usuario pode continuar
 * utilizando a aplicacao, clicando em YES(O processo recomeca do inicio), ou clicar
 * e NO ou CANCEL para finalizar.
 * 
 * Esta é a classe principal da aplicacao . Aqui acontece toda a interacao com
 * o usuario, sao instanciaqdas a classes e chamados os metodos. 
 * 
 * @author Damião Júnior
 * @version 1.0
 */

import javax.swing.JOptionPane;

import br.com.conversor.models.Coin;
import br.com.conversor.models.Menu;
import br.com.conversor.models.Temp;

public class ConversorApp {
	public static void main(String[] args) {
		
		while(true) {			
			Menu menuPrincial = new Menu();
			Coin coinConvert = new Coin();
			Temp tempConvert = new Temp();
			
			//Chama o metodo e armazena o resultado na variavel			
			Object escolhaMain = menuPrincial.CreateMainMenu(); 

			
			if(escolhaMain == "Conversor de Moedas") {
				double valor = menuPrincial.InputBox();
				Object escolha = menuPrincial.CreateCoinMenu();
				String result = coinConvert.convert(escolha, valor);
				JOptionPane.showMessageDialog(null, "O valor convertido é "+result);
				
			} else if (escolhaMain == "Conversor de Temperaturas") {
				double valor = menuPrincial.InputBox();
				Object escolha =  menuPrincial.CreateTempMenu();
				String result = tempConvert.convert(escolha, valor);
				JOptionPane.showMessageDialog(null, "O valor convertido é "+result);
				
			}
			
			int prosseguir =	JOptionPane.showConfirmDialog(null, 
					"Deseja Continuar?");
			
			if (prosseguir != 0) {//Só sai do loop se clicar em NO ou CANCEL.
				JOptionPane.showMessageDialog(null, "Programa Finalizado");
				break; 
			}
			
		}
		
		
		
	}
}
