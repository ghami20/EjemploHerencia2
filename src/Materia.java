import javax.swing.JOptionPane;

public class Materia {

	
	private String nombre;
	private String horario;
	private Profesor profesor;
	private String[][] notas =new String[10][2];

	
	public void GenerarNotas() {
		String[] nombres= {
				"Juan",
				"Emilio",
				"Murad",
				"Denise",
				"Gianella",
				"Kevin",
				"Luciano",
				"Anastasia",
				"Fernando",
				"Ignacio"
		};
		for (int i = 0; i < nombres.length; i++) {
			notas[i][0]= nombres[i];
			notas[i][1] = Integer.toString((int)(Math.random()*10+1));
//			notas[i][1] = JOptionPane.showInputDialog(null, "Ingrese la nota del alumno: " + notas[i][0]);
			
		}
		
	}
	public void MostrarCurso() {
		String curso = "Curso:"+this.getNombre() +"Alumnos:";
		for (int i = 0; i < notas.length; i++) {
			curso = curso	+"\nNombre: "+  notas[i][0] + " nota"+ notas[i][1];
		}
		JOptionPane.showMessageDialog(null, curso);
	}
	
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
