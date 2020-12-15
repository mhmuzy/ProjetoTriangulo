package Hitss.Treinamento.Apresentacao;

import java.util.Scanner;

public class Show {

	public static void main(String[] args) {
		System.out.println("");
		System.out.println("             Hitss Treinamento");
		System.out.println("");
		try {
			int a,b, c;
			System.out.println("Digite o valor de A:");
			Scanner teclado = new Scanner(System.in);
			a = teclado.nextInt();
			System.out.println("");
			System.out.println("Digite o valor de B:");
			b = teclado.nextInt();
			System.out.println("");
			System.out.println("Digite o valor de C:");
			c = teclado.nextInt();
			System.out.println("");
			if (((a + b) <= c) || ((b + c) <= a) || ((a + c) <= b)) {
				System.out.println("Os valores informados não podem formar um triângulo.");
			} else {
				System.out.println("Os lados formam um triângulo.");
			}
		} catch (Exception e) {
			System.out.println("Erro de processamento: " + e.getMessage());
		}
	}
	
}
