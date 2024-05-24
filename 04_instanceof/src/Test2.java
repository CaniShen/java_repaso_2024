
public class Test2 {

	public static void main(String[] args) {

		Object ob="hello";// no puede depender la primera si la primera instrucción es falso que pasa.
		if(ob instanceof String s||s.length()>4){ //error compilación
			System.out.println("superado");
		}else{
			System.out.println("no válido");
		}
		
		
		/*Object ob="hello";
		if(ob instanceof String s||s.length()>4){ //error compilación
			System.out.println("superado");
		}else{
			System.out.println("no válido");
		}*/
		Object ob="hello";
		if(ob instanceof String s&&s.length()>4){
			System.out.println(s.toLowerCase());
		}else{
			System.out.println(s.toUpperCase()); //error compilación
		}
		
		
		if(!(ob instanceof String s)){
			System.out.println(s.toLowerCase()); //error compilación
		}else{
			System.out.println(s.toUpperCase());
		}
		
		
	

	}

}
