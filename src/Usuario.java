import javax.swing.JOptionPane;

public class Usuario {
	private String nombre;
	private String mail;
	private String contrasenia;
	public Usuario(String nombre, String mail, String contrasenia) {
		this.nombre = nombre;
		this.mail = mail;
		this.contrasenia = contrasenia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", mail=" + mail + ", contrasenia=" + contrasenia + "]";
	}
	
	public boolean Login(String email,String contrasenia) {
		if (this.mail.equals(email) && this.contrasenia.equals(contrasenia)) {
			JOptionPane.showMessageDialog(null, "Ingresó");
			return true;
			
		}else {
			JOptionPane.showMessageDialog(null, "No ingresó");
			return false;

		}
		
		
	}
	
}
