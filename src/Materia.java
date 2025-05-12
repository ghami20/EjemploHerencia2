
public class Materia {

	
	private String nombre;
	private String horario;
	private Profesor profesor;
	
	
	public Materia(String nombre, String horario, Profesor profesor) {
		super();
		this.nombre = nombre;
		this.horario = horario;
		this.profesor = profesor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public Profesor getProfesor() {
		return profesor;
	}
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	@Override
	public String toString() {
		return "Materia [nombre=" + nombre + ", horario=" + horario + ",\n profesor=" + profesor + "]";
	}
	
	
	
}
