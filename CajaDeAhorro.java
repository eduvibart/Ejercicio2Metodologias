package tp3;

public class CajaDeAhorro {
	float ahorros;
	String nombre;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public CajaDeAhorro(String nombre) {
		this.nombre=nombre;
		this.ahorros=0;
	}

	public float getAhorros() {
		return ahorros;
	}
	
	public void depositar(float aDepositar) {
		this.ahorros+=aDepositar;
	}
	
	public void retirar(float aRetirar) {
		this.ahorros-=aRetirar;
	}
}
