package principal;

import java.io.Serializable;

public class Test1 {

	public static void main(String[] args) {
		Serializable s=20;
		System.out.println(s instanceof Number);
		System.out.println(s instanceof Integer);
		System.out.println(s instanceof String); // porque String el tipo de variable pertenece a un mismo Rama, pero no tiene la relación con el objeto que está asignando
	}

}
