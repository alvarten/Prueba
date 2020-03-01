import java.util.Scanner;                                            //importo las librerias que voy a usar
import java.util.StringTokenizer;
public class Principal {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);                       //creo un scanner
		String texto[] = new String[99999];                          //creo un string con dimensiones de sobra
		int i = 0;                                                   //inicializo el contador del puesto en el array de strings
		String fin = "FIN";                                          //creo la condición para que el bucle pare
		StringBuilder total = new StringBuilder("");                 //inicializo el StringBuilder
		System.out.println("Escribe un texto:");                     //Creo la primera lectura para saber el primer dato
		texto[i] = leer.nextLine();
		while (texto[i].equals(fin) == false) {                      //Si el ultimo texto introducido es FIN si ignora el bucle	
			total.append(texto[i].toUpperCase() + ";");              //añado el texto a el StringBuilder
			System.out.println("Longitud: " + texto[i].length());    //escribo su longitud
			i++;                                                     //pasamos a leer el siguiente texto
			System.out.println("Escribe un texto:");
			texto[i] = leer.nextLine();                              //se lee el siguiente texto, si es FIN se pasa directamente sin añadirlo al StringBuilder ni escribiendo su longitud
		}
		String tokens = total.toString();                            //creo un string nuevo desde el StringBuilder para pasarlo a tokens
		StringTokenizer token = new StringTokenizer( tokens ,";");   //lo convierto a tokens
		while(token.hasMoreTokens()){                                //escribo todos los tokens
            System.out.println(token.nextToken());
        }	
		leer.close();                                                //cierro el escaner		
	}		
}
