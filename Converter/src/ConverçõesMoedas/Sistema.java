package ConverçõesMoedas;

import java.util.Scanner;

public class Sistema {
	public static void main(String[] args) {
		MetodoConverção converter = new MetodoConverção();
		Scanner entrada = new Scanner(System.in);
		System.out.println("Bem vindo ao conversor de moedas\n Do real para o Dolar digite => 'Dolar'\n Do real para o Dolar digite => 'Euro'");
		String opção = entrada.nextLine();
		System.out.println("Qual o valor?");
		double valor = Double.parseDouble(entrada.nextLine().replace(",", ".")) ; 
		if(opção.equalsIgnoreCase("dolar")  ) {
			converter.converterDolar(valor);
			System.out.printf("O valor em Dolar é de %.3f", converter.valor);
		}else if(opção.equalsIgnoreCase("euro")) {
			converter.converterEuro(valor);
			System.out.printf("O valor em Euro é de %.3f", converter.valor);
		}
	
		
		entrada.close();

	}
}
