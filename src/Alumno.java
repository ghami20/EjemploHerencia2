
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
		return "Alumno [matricula=" + matricula + ", inscripto=" + inscripto + ", toString()=" + super.toString() + "]";
	}


	
}
