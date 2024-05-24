package clases;


class Test{
	public void m(){
		System.out.print("A");
	}

class B extends Test{
	public void m(){
		System.out.print("B");
	}
}
class C extends B{
	public void m(){
		System.out.print("C");
	}
}


	
	public static void main(String[] args) {

		Test a=new C();
		a.m();
		B b=(B)a;
		b.m();
		

	}

}
