package operaciones;
import static util.Utilidades.*;

public class Calculadora {
	public int sumar(int a, int b) {
		return a+b;
	}
	
	public int multiplicar(int a,int b) {
		return a*b;
		
	}
	
	public int restar(int a, int b) {
		return mayor(a,b)-menor(a,b);
	}
	public int dividir(int a,int b) {
		return mayor(a,b)/menor(a,b);
	}
	
}
