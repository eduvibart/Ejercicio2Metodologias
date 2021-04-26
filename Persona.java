package tp3;

import java.time.LocalDate;

public class Persona {
	public final int MAYORIA_DE_EDAD=18;
	public final int EDAD_VOTAR=16;
	private int dni;
	private int diaNacimiento;
	private int mesNacimiento;
	private int anioNacimiento;
	private String sexo;
	private String nombre;
	private String apellido;
	private float peso;
	private float altura;
	
	public Persona(int unDni) {
		this.dni=unDni;
		this.anioNacimiento=2000;
		this.diaNacimiento=1;
		this.mesNacimiento=1;
		this.sexo="Femenino";
		this.nombre="N";
		this.apellido="N";
		this.peso=1;
		this.altura=1;
	}
	
	public Persona(int unDni, String unNombre, String unApellido) {
		this(unDni);
		this.nombre=unNombre;
		this.apellido=unApellido;

	}
	public Persona(int unDni, String unNombre, String unApellido, int dia, int mes, int anio) {
		this(unDni, unNombre, unApellido);
		this.anioNacimiento=anio;
		this.diaNacimiento=dia;
		this.mesNacimiento=mes;
	}
	public float masaCorporal() {
		return this.peso/this.altura;
	}
	
	public boolean enForma() {
		if ((this.masaCorporal()>=18.5) && (this.masaCorporal()<=25)) {
			return true;
		}
		return false;
	}
	
	public boolean cumpleaños() {
		LocalDate.now();
		LocalDate hoy = LocalDate.now();
		return ((hoy.getDayOfMonth()==this.diaNacimiento)&&(hoy.getMonthValue()==this.getMesNacimiento())&&(hoy.getYear()==this.anioNacimiento));


	}
	
	public int edad() {
		LocalDate.now();
		LocalDate hoy = LocalDate.now();
		return (hoy.getYear()-this.anioNacimiento);
	}
	
	public boolean mayorDeEdad() {
		return (this.edad()>=MAYORIA_DE_EDAD);
		
	}
	
	public boolean puedeVotar() {
		return (this.edad()>=EDAD_VOTAR);
	}
	
	public boolean edadCoherente() {
		LocalDate.now();
		LocalDate hoy = LocalDate.now();
		return ((hoy.getYear()-this.anioNacimiento)==this.edad());
	}
	
	public String datos() {
		return "DNI: "+this.dni+ " NOMBRE: "+this.nombre+" APELLIDO: "+this.apellido+" SEXO: "+this.sexo+
				" PESO: "+this.peso+" ALTURA: "+this.altura+" FECHA DE NACIMIENTO: "+this.diaNacimiento+"/"
				+this.mesNacimiento+"/"+this.anioNacimiento;
	}
	
	public int getMAYORIA_DE_EDAD() {
		return MAYORIA_DE_EDAD;
	}

	public void setDiaNacimiento(int diaNacimiento) {
		this.diaNacimiento = diaNacimiento;
	}

	public void setMesNacimiento(int mesNacimiento) {
		this.mesNacimiento = mesNacimiento;
	}

	public void setAnioNacimiento(int anioNacimiento) {
		this.anioNacimiento = anioNacimiento;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public int getDni() {
		return dni;
	}
	public int getDiaNacimiento() {
		return diaNacimiento;
	}
	public int getMesNacimiento() {
		return mesNacimiento;
	}
	public int getAnioNacimiento() {
		return anioNacimiento;
	}
	public String getSexo() {
		return sexo;
	}
	
	
	
}
