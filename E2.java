import java.util.*;

public class E2 {
    private static final Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		double promedio; 
		int sumaTotal = 0;
		int i = 0;
		
		System.out.println("Ingrese los numeros (en caso desea finalizar el recuento de numero escriba -1)");
		int numero= sc.nextInt();
		
		while (numero != -1){
			if (numero >= 0) {
				sumaTotal += numero;
				i++;
			}
			System.out.println("Ingresa un número (en caso desea terminar ingresa -1): ");
            numero = sc.nextInt();
	}
		promedio = sumaTotal / i;
		System.out.println("La suma total es: "+ sumaTotal);
		System.out.println("El promedio es: " + promedio);
		
	}
}

