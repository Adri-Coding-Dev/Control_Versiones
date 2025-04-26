package primitivos;
import java.util.*;
public class Ejercicio_1 {
	public static void main(String[] args) {
		/*Realiza un programa que pida al usuario 
		 * cuatro números enteros, y calcule la suma 
		 * solo de aquellos números introducidos por 
		 * el usuario, que sean mayores de 10. Es decir, 
		 * que si el usuario introduce el 5, el 15, el 6 
		 * y el 25, el programa debe calcular la suma solo 
		 * de 15 más 25, ya que 5 y 6 son menores de 10*/
		System.out.println("Cuantos numeros quieres introducir: ");
		Scanner s=new Scanner(System.in);
		int cantidad=s.nextInt();
		int acumulador=0;
		for(int i=0;i<cantidad;i++) {
			System.out.println("Introduce un número:");
			int num=s.nextInt();
			//Verificamos si el valor es mayor a 10
			if(num>10) {
				acumulador+=num;
			}
		}
		System.out.println("Suma de los mayores de 10: "+acumulador);
	}
}
