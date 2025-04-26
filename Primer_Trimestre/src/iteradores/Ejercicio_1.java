package iteradores;
import java.util.*;
public class Ejercicio_1 {
	public static void main(String[]args) {	
		/*Crea un ArrayList de 5 nombres de 
		 * personas y usa un Iterator para imprimir 
		 * todos los nombres en consola*/
		ArrayList<String>Nombres=new ArrayList<>();
		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println("Introduce un nombre");
			String nombre=s.next();
			Nombres.add(nombre);
		}
		System.out.println("Nombres Agregados: "+Nombres);
	}
}
