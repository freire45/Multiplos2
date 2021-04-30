package br.com.erickfreire.multiplos2;

import java.util.Scanner;

/**
 * Programa em Java que verifica se um número é multiplo
 * @author Erick Freire
 * @version 1 - Criado em 30-04-2021 as 15:00
 */

public class Multiplos2 {
	public static void main(String[] args) {
		
		int numero1;
		int numero2;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Porgrama verifica multiplo: ");
		
		System.out.print("Informe o primeiro valor: ");
		numero1 = entrada.nextInt();
		
		System.out.print("Informe o segundo valor: ");
		numero2 = entrada.nextInt();
		
		multiplo(numero1, numero2);

	}
	
	public static void multiplo(int n1, int n2) {
		
		int resultado = n1 % n2;
		
		if(resultado == 0) {
			System.out.printf("%n%nO número %d é Multiplo do número %d%n", n1, n2);
		} else {
			System.out.printf("%n%nO número %d NÃO é Multiplo do número %d%n", n1, n2);
		}
		
	}

}
