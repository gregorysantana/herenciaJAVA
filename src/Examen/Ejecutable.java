package Examen;
import java.util.Scanner;

public class Ejecutable {
	
	public static void main(String[] args) {
		int edad, indice, salario, peso, altura;
		String nombre, sexo;
		
		Scanner sr = new Scanner (System.in);
		
		//Persona persona = new Persona();
		
		//Persona persona1 = new Persona();
		//edad = sr.nextInt();
		
		// Persona 1
		Estudiante persona1 = new Estudiante();
		Profesor profesor1 = new Profesor();
		
		System.out.println("Coloque el nombre: ");
		nombre = sr.next();
		
		System.out.println("Coloque la edad: ");
		edad = sr.nextInt();
		
		System.out.println("Coloque el sexo: ");
		sexo = sr.next();
		
		System.out.println("Coloque el indice: ");
		indice = sr.nextInt();
		
		System.out.println("Ingrese su salario: ");
		salario = sr.nextInt();
		
		System.out.println("Ingrese su peso: ");
		peso = sr.nextInt();
		
		System.out.println("Ingrese su altura: ");
		altura = sr.nextInt();
		
		
		persona1.setNombre(nombre);
		persona1.setEdad(edad);
		persona1.setSexo(sexo);
		persona1.setIndice(indice);
		persona1.setAltura(altura);
		persona1.setPeso(peso);
		profesor1.setSalario(salario);
		
		
		persona1.calcularIMC();
		
		System.out.println(persona1.toString());

	}

}
