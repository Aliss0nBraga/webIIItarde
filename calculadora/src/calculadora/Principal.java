package calculadora;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
		float num1 = teclado.nextFloat();
		
		System.out.println("Digite o segundo número:");
		float num2 = teclado.nextFloat();
		
		teclado.close();
		
		float resultadoSoma = calc.somar(num1, num2);
		System.out.printf("O resultado da soma é %.2f",resultadoSoma);
		
		float resultadoSubtracao = calc.subtrair(num1, num2);
		System.out.printf("\nO resultado da subtração é %.2f",resultadoSubtracao);
	}

}
