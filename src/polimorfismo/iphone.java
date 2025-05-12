package polimorfismo;

public class iphone extends Celular{
	
	private String VersIos;

	public iphone(String marca, int bateria, String duenio, boolean estado, String versIos) {
		super(marca, bateria, duenio, estado);
		VersIos = versIos;
	}
	@Override
	public  void Llamar(Celular receptor,int duracion) {
		if (this.estado==true && receptor.estado == true ) {
			if (this.bateria>0 && this.bateria >= duracion*0.1) {
				
			}
			
		}
	}


}
