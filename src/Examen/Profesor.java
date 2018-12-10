package Examen;

public class Profesor extends Persona {
	int salario;
	String materia;
	
	
	public int getSalario() {
		return salario;
	}


	public void setSalario(int salario) {
		this.salario = salario;
	}


	public String getMateria() {
		return materia;
	}


	public void setMateria(String materia) {
		this.materia = materia;
	}


	public int CalculoSalario() {
		int SalarioTotal = salario + 500;
		return SalarioTotal;
	}
	
	
	
}
