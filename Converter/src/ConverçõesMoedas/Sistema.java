package ConverçõesMoedas;

import java.util.Scanner;

public class Sistema {
	public static void main(String[] args) {
		MetodoConverção converter = new MetodoConverção();
		Scanner entrada = new Scanner(System.in);
		System.out.println("Bem vindo/a ao conversor de moedas\n" 
				+"****************************************************\n"
				+ "Do real para o Dolar digite =>>> 'DOLAR'\n"
				+ "Do Dolar para o Real digite =>>> 'DOLAR, REAL'\n" 
				+ "Do real para o Euro digite =>>> 'EURO'\n"
				+ "Do Euro para o Peso Argentino digite =>>> 'EURO, PESO'\n"
				+ "Do Real para o Peso Argentino digite =>>> 'PESO'\n"
				+ "Do Peso Argentino para o Dolar digite =>>> 'PESO, DOLAR'\n"
				+ "****************************************************");
		String opção = entrada.nextLine();
		System.out.println("Qual o valor?");
		double valor = Double.parseDouble(entrada.nextLine().replace(",", "."));
		if (opção.equalsIgnoreCase("dolar")) {
			converter.converterDolar(valor);
			System.out.printf("O valor %.3fR$ em Dolar é de %.3fUS", valor, converter.valor);
		} else if (opção.equalsIgnoreCase("euro")) {
			converter.converterEuro(valor);
			System.out.printf("O valor %.3fR$ em Euro é de %.3fEUR", valor, converter.valor);
		} else if (opção.equalsIgnoreCase("Dolar, Real")) {
			converter.dolarParaReal(valor);
			System.out.printf("O valor %.3fUS é de %.3fR$", valor, converter.valor);
		} else if (opção.equalsIgnoreCase("'Euro, Peso")) {
			converter.euroPesoArgentino(valor);
			System.out.printf("O valor de %.3fEUR em Peso Argentino é de %.3fARS",valor,  converter.valor);
		} else if (opção.equalsIgnoreCase("Peso")) {
			converter.realPesoArgentino(valor);
			System.out.printf("O valor de %.3fR$ em Peso Argentino é de %.3fARS", valor, converter.valor);
		} else if (opção.equalsIgnoreCase("Peso, Dolar")) {
			converter.pesoDolar(valor);
			System.out.printf("O valor de %.3fUS em Peso Argentino é de %.3fARS", valor, converter.valor);
		}
		

		entrada.close();

	}
}
