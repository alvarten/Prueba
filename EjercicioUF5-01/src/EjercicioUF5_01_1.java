import java.util.Scanner; 

public class EjercicioUF5_01_1 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		//Objeto de mi fiesta
		Fiesta mia = new Fiesta();
		mia.invitar();
		mia.consultar();
		int miPrecio = mia.precioFiesta();
		System.out.println("Mi fiesta costara: " + miPrecio + " euros y vendr�n " + mia.getInvitados() + " personas");
		//Objeto tu fiesta
		System.out.println("�Como ser� tu fiesta?");
		//Definir atributos de tu fiesta
		System.out.println("�Donde es?");
		String tulugar = new String(leer.nextLine());
		System.out.println("�Cuantos asistir�n?");
		int tuinvitados = Integer.parseInt(leer.nextLine());
		System.out.println("�De que tipo ser�?");
		String tutipo = new String(leer.nextLine());
		System.out.println("�Cuantas bebidas se servir�n?");
		int tubebidas = Integer.parseInt(leer.nextLine());
		System.out.println("�Cu�ntos bocadillos se servir�n?");
		int tubocadillos = Integer.parseInt(leer.nextLine());
		System.out.println("�Cuando ser�?");
		String tufecha = new String(leer.nextLine());
		Fiesta tuFiesta = new Fiesta(tubebidas, tubocadillos, tulugar, tufecha, tutipo, tuinvitados);
		tuFiesta.consultar();
	}
	

}
