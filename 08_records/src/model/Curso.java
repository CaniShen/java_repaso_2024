package model;

public record Curso (String nombre, int duracion) {
	
	/*public void setNombre(String nombvre) {
		this.nombre=nombre;
	}*/
	static int x;
	public void setX(int x) {
		Curso.x=x;
	}
	public static void print() {
		System.out.println(x);
	}
	
	
}
