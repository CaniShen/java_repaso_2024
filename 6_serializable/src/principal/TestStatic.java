package principal;
class Superior {
	static class Estatica {
		public void print() {
			System.out.println("clase estética interna");										
		}
		
	}
}
public class TestStatic {

	public static void main(String[] args) {
		Superior.Estatica c=new Superior.Estatica();
		c.print();

	}

}
