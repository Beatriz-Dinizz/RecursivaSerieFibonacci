package view;

import controller.SerieFibonacci;

public class Principal {

	public static void main(String[] args) {
		int n = 7;
		
		if(n < 1 || n > 20) {
			System.out.println("Número inválido! Digite um número entre 1 e 20.");
			return;
		}
		
		int numeroFibonacci = SerieFibonacci.calcularSerieFibonacci(n);
		System.out.println("O valor na posição " + n + " da série Fibonacci é: " + numeroFibonacci);
	}
}
