package Ejercicio1;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		
		String []empleados = {
				"Cadete","Gerente"
		};
		
		int opcion = JOptionPane.showOptionDialog(null, "Elija su rol", null, 0, 0, null, empleados, empleados);
		String []Desempenio = {
				"Bueno","Regular","Malo"	
			};
			
			String seleccionado = (String)JOptionPane.showInputDialog(null, "Seleccione el desempeño", null, 0,  null, Desempenio, Desempenio[0]);
			
			
		if (opcion==0) {
			Cadete nuevo = new Cadete("",1,seleccionado,"");
			JOptionPane.showMessageDialog(null, nuevo);
		}else if (opcion==1){
			//...gerente creación
			JOptionPane.showMessageDialog(null, "Gerente");
		}
		
		
		
		
	}
}
