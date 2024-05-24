package pruebas;

enum Orientacion{
	NORTE, SUR, ESTE, OESTE;
}


public class Test {

	public static void main(String[] args) {
		Orientacion or=Orientacion.NORTE;
		/*switch(or) {
		case NORTE->System.out.println("frío");
		case SUR->System.out.println("calor");
		
		}*/
		var res=switch(or) {
		case NORTE->"frio";
		case SUR->"calor";
		case ESTE->"seco";
		case OESTE->  "húmedo";
		default->"sin datos";//no pasa nada pero no hay sentido
		
		};
		

	}

}
