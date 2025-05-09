package Ejercicio1;

import javax.swing.JOptionPane;

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
	
	public	double bonoXdesempenio() {
		double bono=0;
		if (this.desempeño.equals("Bueno")) {
			bono = this.sueldoBase*0.10;
			JOptionPane.showMessageDialog(null, "Tuvo bono por buen desempeño de 10% $" + bono);
		}else if (this.desempeño.equals("Regular")) {
			bono = 80;
			JOptionPane.showMessageDialog(null, "Tuvo bono por desempeño regular de $80 ");
		}else {
			JOptionPane.showMessageDialog(null, "No tuvo bono por mal desempeño");
		}
		return bono;
	}
	public	double bonoXpresentismo() {
		double bono=0;
		if (this.diasFalto==0) {
			bono = 100;
			JOptionPane.showMessageDialog(null, "No faltó nunca, corresponde $100");
		}else if (this.diasFalto==1) {
			bono = 50;
			JOptionPane.showMessageDialog(null, "No faltó nunca, corresponde $50");
		}else {
			JOptionPane.showMessageDialog(null, "No tuvo bono");
		}
		return bono;
	}
	public void CalcularBonos() {
		
		double total = this.bonoXdesempenio() + this.bonoXpresentismo() + this.sueldoBase;
		
		JOptionPane.showMessageDialog(null, "El empleado " + this.getNombre() + " tuvo un sueldo base de " + this.sueldoBase + " más los bonos queda en " + total);
		
	}

}
