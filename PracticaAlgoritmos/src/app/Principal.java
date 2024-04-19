package app;

import java.util.Random;

import util.Algoritmos;

public class Principal {

	public static void main(String[] args) {
		
		int numeros []=new int [5];
        
        Random rm = new Random();
       
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=rm.nextInt(1,11);
            
        }
        
        int resultadosFibonacci []=new int [5];
        for (int i = 0; i < resultadosFibonacci.length; i++) {
            resultadosFibonacci[i]= Algoritmos.fibonacci(numeros[i]);
            
        }
        int resultadosFactorial []=new int [5];
        for (int i = 0; i < resultadosFactorial.length; i++) {
            resultadosFactorial[i]= Algoritmos.factorial(numeros[i]);
            
        }
        
        boolean resultadosPrimo []=new boolean [5];
        for (int i = 0; i < resultadosPrimo.length; i++) {
            resultadosPrimo[i]= Algoritmos.esPrimo(numeros[i]);
            
        }

	}

}
