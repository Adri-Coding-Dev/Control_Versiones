package primitivos;
import java.util.*;
public class Ejercicio_4 {
	public static void main(String[] args) {
		//Suma y media de numeros hasta que 
		//se introduzca 0
		boolean parar=false;
		float acumulador=0;
		int cantidad=0;
		Scanner s=new Scanner(System.in);
		//Si se introduce 0 se sale del bucle.
		while(!parar) {
			System.out.println("Introduce un número: ");
			int num=s.nextInt();
			if(num==0) {
				parar=true;
			}else {
				acumulador+=num;
				cantidad++;
			}
		}
		System.out.println("Suma: "+acumulador);
		System.out.println("Media: "+(acumulador/cantidad));
	}
}
