import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		
		
		Profesor yo  = new Profesor("Ghami","ghami@gmail.com","1234","Desarrollador de software");
		Materia poo = new Materia("Programación orientada a objetos" ,"Lunes, jueves",yo);
		Alumno juan = new Alumno("Juan","Juan@gmail.com","4321","1",poo);
	//	String mail = JOptionPane.showInputDialog("Ingrese mail");
		//String contrasenia = JOptionPane.showInputDialog("Ingrese contrasenia");
		//yo.Login("ghami@gmail.com","1234" );
		//juan.Login("Juan@gmail.com","4321");
		poo.GenerarNotas();
		poo.MostrarCurso();
	}

}
