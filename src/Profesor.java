
public class Profesor extends Usuario{
	
	private String titulo;

	public Profesor(String nombre, String mail, String contrasenia, String titulo) {
		super(nombre, mail, contrasenia);
		this.titulo = titulo;
	}

	
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	@Override
	public String toString() {
		return "Profesor [titulo=" + titulo + ", toString()=" + super.toString() + "]";
	}
	

}
