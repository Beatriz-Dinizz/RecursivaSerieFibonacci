package controller;

public class SerieFibonacci {

	public SerieFibonacci() {
		super();
	}
	
	public static int calcularSerieFibonacci(int n) {
		// Condição de parada: se n for igual a 1 ou 2 retorna 1 pois os dois primeiros números da série Fibonacci são 1
        if(n == 1 || n == 2) {
        	return 1;
        } else {
        	// Relação de chamada dos passos: o valor de Fibonacci na posição 'n' é a soma dos valores nas posições 'n-1' e 'n-2'
            
        	return calcularSerieFibonacci(n - 1) + calcularSerieFibonacci(n - 2);
        }
	}
}
