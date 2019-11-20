 
package br.com.ufc.es.poo.controller;
import br.com.ufc.es.poo.exception.ValidaCpfException;
import java.util.InputMismatchException;
import br.com.ufc.es.poo.model.Usuario;

public class ValidaCpfController {

    public void metodoMau(String cpf) throws ValidaCpfException, NullPointerException {
		boolean dadosCorretos = verificaDados(cpf);
		if(!dadosCorretos) {
			ValidaCpfException x = new ValidaCpfException ("Erro ao processar dados");
			throw x;
		}
	}
	
	public void metodoBom(String cpf) {
		try {
			this.metodoMau(cpf);
		} catch(ValidaCpfException e) {
			System.out.println("Houve erros nos dados");
			e.printStackTrace();
		}
	}
		
	// retorna true se os dados estão corretos e false se não estão
	public  boolean verificaDados(String cpf) {
            // considera-se erro CPF's formados por uma sequencia de numeros iguais
        if (cpf.equals("00000000000") ||
            cpf.equals("11111111111") ||
            cpf.equals("22222222222") || cpf.equals("33333333333") ||
            cpf.equals("44444444444") || cpf.equals("55555555555") ||
            cpf.equals("66666666666") || cpf.equals("77777777777") ||
            cpf.equals("88888888888") || cpf.equals("99999999999") ||
            (cpf.length() != 11))
            return(false);
          
        char dig10, dig11;
        int sm, i, r, num, peso;
          
        // "try" - protege o codigo para eventuais erros de conversao de tipo (int)
        try {
        // Calculo do 1o. Digito Verificador
            sm = 0;
            peso = 10;
            for (i=0; i<9; i++) {              
        // converte o i-esimo caractere do CPF em um numero:
        // por exemplo, transforma o caractere '0' no inteiro 0         
        // (48 eh a posicao de '0' na tabela ASCII)         
            num = (int)(cpf.charAt(i) - 48); 
            sm = sm + (num * peso);
            peso = peso - 1;
            }
          
            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig10 = '0';
            else dig10 = (char)(r + 48); // converte no respectivo caractere numerico
          
        // Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 11;
            for(i=0; i<10; i++) {
            num = (int)(cpf.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
            }
          
            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                 dig11 = '0';
            else dig11 = (char)(r + 48);
          
        // Verifica se os digitos calculados conferem com os digitos informados.
            if ((dig10 == cpf.charAt(9)) && (dig11 == cpf.charAt(10)))
                 return(true);
            else return(false);
                } catch (InputMismatchException erro) {
                return(false);
            }
        }
          
	}




