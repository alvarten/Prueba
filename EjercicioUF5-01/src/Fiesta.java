

public class Fiesta {
	

	private String tipo, fechaHora, direccion;
	private int bebidas, bocadillos, invitados;
	
	//Constructores
	
	//Constructor "en blanco" para rellenar invitados cero
	Fiesta(int bebidas, int bocadillos, String direccion, String fechaHora, String tipo){
		this.bebidas = bebidas;
		this.bocadillos = bocadillos;
		this.direccion = direccion;
		this.fechaHora = fechaHora;
		this.tipo = tipo;
		this.invitados = 0;
	}
	//Constructor "en blanco" para rellenar pudiendo definir invitados
	Fiesta(int bebidas, int bocadillos, String direccion, String fechaHora, String tipo, int invitados){
		this.bebidas = bebidas;
		this.bocadillos = bocadillos;
		this.direccion = direccion;
		this.fechaHora = fechaHora;
		this.tipo = tipo;
		this.invitados = invitados;
	}
	//Constructor fiesta sin comida
	Fiesta(String direccion, String fechaHora, String tipo){
		this.direccion = direccion;
		this.fechaHora = fechaHora;
		this.tipo = tipo;
		this.invitados = 0;
	}
	//Construtor con valores ya especificados
	Fiesta(){
		this.bebidas = 240;
		this.bocadillos = 600;
		this.direccion = "C/Gaudi N5";
		this.fechaHora = "20:00 27/2/1917";
		this.tipo = "Brunch";
		this.invitados = 360;	
	}
	
	//Metodos
	
	//Especificaciones del objeto
	public void consultar(){
		System.out.println("La fiesta es en " + getDireccion() + " la fecha: " + getFechaHora() + " sera con temática de " + getTipo() + " serviremos " + getBocadillos() + " bocadillos, " + getBebidas() + " bebidas y asistiran " + getInvitados() + " invitados.");
	}
	//Metodo sencillo para invitar
	public void invitar() {
		this.invitados ++;
		
	}
	//Metodo sencillo para no invitar
	public void cancelarInvitacion() {
		this.invitados --;
		
	}
	//Metodo para determinar el precio de la fiesta
	public int precioFiesta() {
		return ((bocadillos * 3) + (bebidas * 2) + (invitados * 5));
		//return precio;
	}
	//Getters y setters
	public int getBebidas() {
		return bebidas;
	}

	public void setBebidas(int bebidas) {
		this.bebidas = bebidas;
	}

	public int getBocadillos() {
		return bocadillos;
	}

	public void setBocadillos(int bocadillos) {
		this.bocadillos = bocadillos;
	}

	public int getInvitados() {
		return invitados;
	}

	public void setInvitados(int invitados) {
		this.invitados = invitados;
	}
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(String fechaHora) {
		this.fechaHora = fechaHora;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}
