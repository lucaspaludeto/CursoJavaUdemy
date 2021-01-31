package controle;

import java.util.Scanner;

public class DesafioSemana {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o dia da semana: ");
		String dia = entrada.next();
		
		if(dia.equalsIgnoreCase("Domingo"))  {
			System.out.println("1");
		} else if(dia.equalsIgnoreCase("Segunda-feira")) {
			System.out.println("2");
		} else if(dia.equalsIgnoreCase("Terça-feira") 
				|| (dia.equalsIgnoreCase("Terca-feira"))) {
			System.out.println("3");
		} else if(dia.equalsIgnoreCase("Quarta-feira")) {
			System.out.println("4");
		} else if(dia.equalsIgnoreCase("Quinta-feira")) {
			System.out.println("5");
		} else if(dia.equalsIgnoreCase("Sexta-feira")) {
			System.out.println("6");
		} else if("Sábado".equalsIgnoreCase(dia)
				|| ("Sabado".equalsIgnoreCase(dia))) {
			System.out.println("7");
		}
		
		entrada.close();
		
	}

}
