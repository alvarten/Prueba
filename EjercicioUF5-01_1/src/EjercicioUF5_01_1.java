import java.util.Scanner;
import com.itt.fiesta.Fiesta;


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
//		System.out.println("�Cuantos asistir�n?");
//		int tuinvitados = Integer.parseInt(leer.nextLine());
		System.out.println("�De que tipo ser�?");
		String tutipo = new String(leer.nextLine());
		System.out.println("�Cuantas bebidas se servir�n?");
		int tubebidas = Integer.parseInt(leer.nextLine());
		System.out.println("�Cu�ntos bocadillos se servir�n?");
		int tubocadillos = Integer.parseInt(leer.nextLine());
		System.out.println("�Cuando ser�?");
		String tufecha = new String(leer.nextLine());
		//Creo la clase usando el constructor de invitados cero
		Fiesta tuFiesta = new Fiesta(tubebidas, tubocadillos, tulugar, tufecha, tutipo);
		//Define los invitados de tu fiesta
		System.out.println("�Cuantos asistir�n?");
		int tuinvitados = Integer.parseInt(leer.nextLine());
		tuFiesta.invitar(tuinvitados);
		tuFiesta.consultar();
		//Queda un poco absurdo modificar el m�todo invitar() ya que en la anterior versi�n ya era capaz de rellenar todos los datos con precisi�n 
	}
	

}
