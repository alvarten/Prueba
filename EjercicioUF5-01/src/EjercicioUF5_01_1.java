import java.util.Scanner; 

public class EjercicioUF5_01_1 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		//Objeto de mi fiesta
		Fiesta mia = new Fiesta();
		mia.invitar();
		mia.consultar();
		int miPrecio = mia.precioFiesta();
		System.out.println("Mi fiesta costara: " + miPrecio + " euros y vendrán " + mia.getInvitados() + " personas");
		//Objeto tu fiesta
		System.out.println("¿Como será tu fiesta?");
		//Definir atributos de tu fiesta
		System.out.println("¿Donde es?");
		String tulugar = new String(leer.nextLine());
		System.out.println("¿Cuantos asistirán?");
		int tuinvitados = Integer.parseInt(leer.nextLine());
		System.out.println("¿De que tipo será?");
		String tutipo = new String(leer.nextLine());
		System.out.println("¿Cuantas bebidas se servirán?");
		int tubebidas = Integer.parseInt(leer.nextLine());
		System.out.println("¿Cuántos bocadillos se servirán?");
		int tubocadillos = Integer.parseInt(leer.nextLine());
		System.out.println("¿Cuando será?");
		String tufecha = new String(leer.nextLine());
		Fiesta tuFiesta = new Fiesta(tubebidas, tubocadillos, tulugar, tufecha, tutipo, tuinvitados);
		tuFiesta.consultar();
	}
	

}
