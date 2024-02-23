package controladores;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class inicio {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter sdf =  DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
	String fechaUsuario1;
	System.out.println("Introduzca una fecha");
	fechaUsuario1 = sc.nextLine();
	
	String fechaUsuario2;
	System.out.println("Introduzca la segunda fecha");
	fechaUsuario2= sc.nextLine();
	
	 LocalDate fecha1 = LocalDate.parse(fechaUsuario1, sdf);
	 System.out.println(fecha1.toString());
	 
	 LocalDate fecha2 = LocalDate.parse(fechaUsuario2, sdf);
	 System.out.println(fecha2.toString());
	 
	 System.out.println("Fecha ingresada: " + fecha1);
	 
	 Period duracion = Period.between(fecha1, fecha2); 
	 System.out.println(duracion);
	 
	 System.out.println("años: " + duracion.getYears() + "  meses: " + duracion.getMonths() + "  dias: " + duracion.getDays());
	 /*ejercicio2*/
}
}