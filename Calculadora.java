package calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		int resultado;

		Scanner leitor = new Scanner(System.in);
		
		System.out.println("********** CALCULADORA **********");
		
		System.out.println("Digite o primeiro n�mero: ");
		int num1 = leitor.nextInt();
		
		System.out.println("Digite outro n�mero: ");
		int num2 = leitor.nextInt();
		
		System.out.println("Digite a opera��o desejada: \n1 - Adi��o\n2 - Subtra��o\n3 - Multiplica��o\n4 - Divis�o");
		int select = leitor.nextInt();
		
		if (select == 1) {
			resultado = soma(num1, num2);
			System.out.printf("O resultado �: %d", resultado);
		} else if(select == 2 ) {
			resultado = subtracao(num1, num2);
			System.out.printf("O resultado �: %d", resultado);
		} else if(select == 3) {
			resultado = multiplicacao(num1, num2);
			System.out.printf("O resultado �: %d", resultado);
		} else if(select == 4) {
			resultado = divisao(num1, num2);
			System.out.printf("O resultado �: %d", resultado);
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
