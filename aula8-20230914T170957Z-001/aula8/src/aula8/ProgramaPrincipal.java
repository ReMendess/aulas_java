package aula8;

import java.util.Scanner;

public class ProgramaPrincipal {
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		Aula8 calc = new Aula8();
		int op = calc.menu();
		System.out.println("N1: ");
		double n1 = input.nextDouble();
		calc.setN1(n1);
		System.out.println("N2: ");
		double n2 = input.nextDouble();
		calc.setN2(n2);
		double result = calc.controlador(op, n1, n2);
		calc.imprimir(result);
	}

}
