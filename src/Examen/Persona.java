package Examen;

public abstract class Persona {
	private String nombre;
	private int edad, peso, altura, salario;
	private String sexo;
	int pesoIdeal=  (peso/(altura^2));
	
	public Persona() {
		
	}
	
	public Persona(String nombre,int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Persona(String nombre, int edad, String sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		
	}
	
	public boolean esMayorDeEdad() {
		boolean EsMayor;
		if(edad >= 18) {
			EsMayor = true;
		}else {
			EsMayor = false;
		}
		return EsMayor;
	}
	/*
	private void comprobarSexo() {
		if(sexo == 0) {
			this.sexo = 0; // Hombre
		}else {
			this.sexo = 1; // Mujer
		}
	}
	*/
	
	public String ToString() {
		return 
				"Persona: " + nombre + "\n"
				+ "Edad: " + edad + "\n"
				+ "Sexo: " + sexo + "\n"
				+ "Peso: " + peso + " kg\n"
		        + "Altura: " + altura + " metros\n"
				+ "IMC: " + calcularIMC();
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		
		if(sexo == "h") {
			this.sexo = "Hombre";
		}else if(sexo == "m") {
			this.sexo = "Mujer";
		}else {
			this.sexo = "H";
		}
	}
	
	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public int calcularIMC(){
		int enForma = 0;
		if(pesoIdeal < 20){
			enForma=-1;
		} else if (pesoIdeal >= 20 && pesoIdeal<=25){
			enForma=0;
		} else if(pesoIdeal > 25){
			enForma=1;
		}
		return enForma;
	}
	
	
	
	
}
