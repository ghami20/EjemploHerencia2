import javax.swing.JOptionPane;

public class Alumno extends Usuario{

	private String matricula;
	private Materia inscripto;
	

	public Alumno(String nombre, String mail, String contrasenia, String matricula, Materia inscripto) {
		super(nombre, mail, contrasenia);
		this.matricula = matricula;
		this.inscripto = inscripto;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	

	public Materia getInscripto() {
		return inscripto;
	}

	public void setInscripto(Materia inscripto) {
		this.inscripto = inscripto;
	}

	@Override
	public String toString() {
		return "Alumno [matricula=" + matricula + ",\n inscripto=" + inscripto + ", \ntoString()=" + super.toString() + "]";
	}
	/**
	 * LOGIN DE ALUMNO*/
	@Override
	public boolean Login(String email,String contrasenia) {
		if (this.mail.equals(email) && this.getContrasenia().equals(contrasenia)) {
			JOptionPane.showMessageDialog(null, "Ingresó Alumno");
			String[] opcionesAlumno= {
					
					"Rendir examen","Ver información","Salir"
			};
			int elegido;
			do {
				 elegido = JOptionPane.showOptionDialog(null, "Bienvenido alumno "+ this.nombre, "Perfil alumno", 0, 0, null, opcionesAlumno, opcionesAlumno[0]);
				switch (elegido) {
				case 0:
					RendirExamen();
					break;
				case 1:
					JOptionPane.showMessageDialog(null, this);
					
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "Salir");
					
					break;
				default:
					break;
				}
			} while (elegido!=2);
			
			return true;
			
		}else {
			JOptionPane.showMessageDialog(null, "No ingresó");
			return false;

		}
	}
	public boolean RendirExamen() {
		
		int nota = (int)(Math.random()*10+1);
		if (nota<4) {
			JOptionPane.showMessageDialog(null, "Desapruebo");
			return false;
		}else {
			JOptionPane.showMessageDialog(null, "Apruebo");

			return true;
			
		}
	}

	
}
