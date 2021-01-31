package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner salario = new Scanner(System.in);
		
		System.out.print("Digite o sal�rio do m�s 1 R$ ");
		String mes1 = salario.nextLine().replace(",", ".");
		
		System.out.print("Digite o sal�rio do m�s 2 R$ ");
		String mes2 = salario.nextLine().replace(",", ".");
		
		System.out.print("Digite o sal�rio do m�s 3 R$ ");
		String mes3 = salario.nextLine().replace(",", ".");
		
		double salario1 = Double.parseDouble(mes1);
		double salario2 = Double.parseDouble(mes2);
		double salario3 = Double.parseDouble(mes3);
		
		double soma = (salario1 + salario2 + salario3);
		double media = soma / 3;
		
		System.out.printf("\nA soma dos 3 sal�rios � R$ " + soma);
		System.out.printf("\nA m�dia salarial � R$ %.2f " + media);
		
		salario.close();
		
	}

}
