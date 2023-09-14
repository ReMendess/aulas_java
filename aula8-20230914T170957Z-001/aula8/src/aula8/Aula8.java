package aula8;

import java.util.Scanner;

public class Aula8 {
	
	//atributos.
	
	private double n1;
	private double n2;
	
	
	//métodos modificadores.
	
	public void setN1(double n1) {
		this.n1 = n1;
	}


	public void setN2(double n2) {
		this.n2 = n2;
	}


	//métodos operacionais.
	public int menu() {
		Scanner input = new Scanner(System.in);
		int op;
		do {
			System.out.println("**- Calculadora Simples -**");
			System.out.println("1 - Adição");
			System.out.println("2 - Subtração");
			System.out.println("3 - Multiplicação");
			System.out.println("4 - Divisão");
			System.out.println("Escolha a operação: ");
			op = input.nextInt();
			if(op < 1 || op > 4) {
				 System.out.println("Oção inválida!");
			}
			
		}while(op < 1 || op > 4);
		
		return op;
	}
	
	
	public double add(double n1, double n2) {
		 System.out.println("**- Adição -**");
		 return n1+n2;
	
	}
	
	
	public double sub(double n1, double n2) {
		 System.out.println("**- Subtração -**");
		 return n1-n2;
	
	}
	
	
	public double mult(double n1, double n2) {
		 System.out.println("**- Multiplicação -**");
		 return n1*n2;
	
	}
	
	public double div(double n1, double n2) {
		 System.out.println("**- Divisão -**");
		 return n1/n2;
	}
	
	public void imprimir(double result) {
		System.out.println("Resultado: " + result);
	}
	
	
	public double controlador(int op, double n1, double n2) {
		double r;
		switch(op) {
		case 1:  
			r = add(n1, n2);
			break;
		case 2:
			r = sub(n1, n2);
			break;
		case 3:
			r = mult(n1, n2);
			break;
		case 4:
			r = div(n1, n2);
			break;
		default:
			r = -1;
		}
		return r;
	}
}
