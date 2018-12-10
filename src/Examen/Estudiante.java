package Examen;

public class Estudiante extends Persona  {

	int indice;
	
	public String indiceEnLetra() {
		if (indice >= 9) {
			return "A";
		} else if(indice == 8) {
			return "B";
		} else if(indice == 7) {
			return "C";
		} else if(indice == 6) {
			return "D";
		} else if(indice < 6) {
			return "F";
		}
		return "";
	}
	
	public boolean esMayorDeEdad() {
		System.out.println("No importa si es menor de edad.");
		return true;
	}
	
	public String toString() {
		return super.ToString() + indice + "\n"
				+ this.indiceEnLetra();
	}
	
	public void setIndice(int indice) {
		if (indice > 0 && indice <= 10){
			this.indice = indice;
		} else {
			System.out.println("Ese indice no es valido.");
		}
	}
	

	public int getIndice() {
		return indice;
	}
	
}
