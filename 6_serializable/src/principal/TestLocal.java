package principal;

public class TestLocal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void metodo() {
		int a=1;
		
		class Local {
			void print() {
				System.out.println("local!!!"+a);// se considera una constante efectiva
			}
			
		}
		Local l= new Local();
		l.print();	
		//a++;
	}

}
