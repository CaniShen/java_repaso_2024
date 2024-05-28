import java.time.LocalDate;

public class NoGenerica {
	public <T> T obtener(T dato) {
		if (dato.getClass().getName().equals("String")) {
			return dato;
		}else {
			return null;
		}
	}
	
	public <T> void print(T dato) {
		
	}
}
