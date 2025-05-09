package Ejercicio1;

public class Empleado {
	
	private String nombre;
	private int sueldoBase;
	private int diasFalto;
	private String desempeño;
	public Empleado(String nombre, int sueldoBase, int diasFalto, String desempeño) {
		super();
		this.nombre = nombre;
		this.sueldoBase = sueldoBase;
		this.diasFalto = diasFalto;
		this.desempeño = desempeño;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(int sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	public int getDiasFalto() {
		return diasFalto;
	}
	public void setDiasFalto(int diasFalto) {
		this.diasFalto = diasFalto;
	}
	public String getDesempeño() {
		return desempeño;
	}
	public void setDesempeño(String desempeño) {
		this.desempeño = desempeño;
	}
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", sueldoBase=" + sueldoBase + ", diasFalto=" + diasFalto + ", desempeño="
				+ desempeño + "]";
	}
	

}
