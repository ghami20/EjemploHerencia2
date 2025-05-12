package polimorfismo;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Celular iphone = new Celular("15 pro max",5,"catalina",true);
		
		Celular motorola = new Celular("g20",5,"juliana",true);
		JOptionPane.showMessageDialog(null, motorola);
		iphone.Llamar(motorola, 10);
		motorola.Llamar(iphone, 10);
	}
}
