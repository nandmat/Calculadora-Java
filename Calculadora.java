package calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		int resultado;

		Scanner leitor = new Scanner(System.in);
		
		System.out.println("********** CALCULADORA **********");
		
		System.out.println("Digite o primeiro número: ");
		int num1 = leitor.nextInt();
		
		System.out.println("Digite outro número: ");
		int num2 = leitor.nextInt();
		
		System.out.println("Digite a operação desejada: \n1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");
		int select = leitor.nextInt();
		
		if (select == 1) {
			resultado = soma(num1, num2);
			System.out.printf("O resultado é: %d", resultado);
		} else if(select == 2 ) {
			resultado = subtracao(num1, num2);
			System.out.printf("O resultado é: %d", resultado);
		} else if(select == 3) {
			resultado = multiplicacao(num1, num2);
			System.out.printf("O resultado é: %d", resultado);
		} else if(select == 4) {
			resultado = divisao(num1, num2);
			System.out.printf("O resultado é: %d", resultado);
		} else {
			
		}
		
		
		leitor.close();

	}
	
	public static int soma(int a, int b) {
		
		int resultado = a + b;
		
		return resultado;
	}
	
	public static int subtracao(int a, int b) {
		
		int resultado = a - b;
		
		return resultado;
	}
	
	public static int multiplicacao(int a, int b) {
		
		int resultado = a * b;
		
		return resultado;
	}
	
	public static int divisao(int a, int b) {
		
		int resultado = a / b;
		
		return resultado;
	}

}
