package polimorfismo;

public class Celular {

	protected String marca;
	protected int bateria;
	protected String duenio;
	protected boolean estado;
	public Celular(String marca, int bateria, String duenio, boolean estado) {
		super();
		this.marca = marca;
		this.bateria = bateria;
		this.duenio = duenio;
		this.estado = estado;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getBateria() {
		return bateria;
	}
	public void setBateria(int bateria) {
		this.bateria = bateria;
	}
	public String getDuenio() {
		return duenio;
	}
	public void setDuenio(String duenio) {
		this.duenio = duenio;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", bateria=" + bateria + ", duenio=" + duenio + ", estado=" + estado + "]";
	}
	
	public  void Llamar(Celular receptor,int duracion) {
		if (this.estado==true && receptor.estado == true ) {
			
			
		}
	}

}
