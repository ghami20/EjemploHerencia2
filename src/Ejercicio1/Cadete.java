package Ejercicio1;

public class Cadete extends Empleado{
	private String puesto;

	public Cadete(String nombre, int diasFalto, String desempeño, String puesto) {
		super(nombre, 1500, diasFalto, desempeño);
		this.puesto = puesto;
	}
	
	
}
