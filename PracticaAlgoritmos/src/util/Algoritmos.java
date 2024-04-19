package util;

public abstract class Algoritmos {
	
	/**
	 * Devuelve el número de fibonacci de dicho número
	 * 
	 * @param numero	el numero del que queremos calcular fibonacci
	 * @return			el fibonacci del numero especificado
	 */
	
	
	public static int fibonacci (int numero){
		
		int fibo=0;
		
		if (numero<=0) {
			return fibo=0;
		}
		else if (numero==1) {
			
			return fibo=1;
		}
		else if (numero==2) {
			
			return fibo=1;
		}
		else {
			int n1=0;
			int n2=1;
			
			for (int i = 2; i <= numero; i++){
				fibo=n1+n2;
				n1=n2;
				n2=fibo;	
			}
			return fibo;
		}
	}
	
	/**
	 * Devuelve el factorial del numero especificado
	 * 
	 * @param numero	el numero del que queremos calcular el factorial
	 * @return			el factorial del numero especificado
	 */
	public static int factorial (int numero) {
		int fact =1;
		
		for (int i=1; i<=numero; i++) {
			fact =fact*i;
			
		}
		
		return fact;
	}
	
	/**
	 * Devuelve true o false en función de si es primo o no.
	 * 
	 * @param numero	el numero del que queremos calcular si es primo
	 * @return			el true o false en función de si es primo o no.
	 */
	
	public static boolean esPrimo (int numero) {
		
		boolean primo=false;
		
		if (numero <= 0) {
			return primo;
		}
		else if(numero == 1) {
			
			return primo;
		}
                else if(numero == 2) {
			
			return primo=true;
		}else {
			for (int i=2; i<numero; i++) {
				if	(numero % i==0) {
					return primo;
				}
				
			}
			return primo=true;
			
		}
		
	}
	
}
