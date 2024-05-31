package cliente;

import java.util.Scanner;
import _20_otras_clases_no_modular.DatosService;
import operaciones.Calculadora;
public class AppCalculadora {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1,n2;
		System.out.print("Introduce un número: ");
		n1=sc.nextInt();
		System.out.println("Introduce otr número");
		n2=sc.nextInt();
		Calculadora cal=new Calculadora();
		System.out.println("Suma: "+cal.sumar(n1, n2));
		System.out.println("Resta: "+cal.restar(n1, n2));
		System.out.println("Multiplicación: "+cal.multiplicar(n1, n2));
		System.out.println("División: "+cal.dividir(n1, n2));
		
		DatosService service;
	}

}
