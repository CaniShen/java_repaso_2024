package principal;

import java.time.LocalDate;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import model.Curso;
/*Ejercicio:
Vamos a crear un JavaBean Curso:(nombre,duración,fechaInicio). 
Después, creamos una lista con cuatro cursos cualquera(inventados) y la ordenaremos 
por fechaInicio. En caso de fechas iguales, se ordena por duración.La clase Curso NO implementa Comparable.*/
public class Test1 {

	public static void main(String[] args) {
		List<Curso> Cursos=new ArrayList<>(List.of(new Curso("Java",100,LocalDate.of(11,3,2023)),
													new Curso("PHP",120,LocalDate.of(15,06,2024)),
													new Curso("Phthon",100,LocalDate.of(8,10,2022)),
													new Curso("Angular",80,LocalDate.of(26,7,2023))
				));
				
		Collections.sort(Cursos, new Comparator<Curso>() {

			@Override
			public int compare(Curso o1, Curso o2) {
				if (o1.fechaInicio().equals(o2.fechaInicio()))  {
					return Integer.compare(o1.duracion(), o2.duracion());
				}else {
					return o1.fechaInicio().compareTo(o2.fechaInicio());
				}
				
			}
			
		});

	}



}
