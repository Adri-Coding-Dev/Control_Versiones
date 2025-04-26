package condicionales;
import java.util.*;
public class Ejercicio_1 {
	public static void main(String[]args) {
		/*Par/Inpar*/
		Scanner s=new Scanner (System.in);
		System.out.println("Introduce un número");
		int numUsuario=s.nextInt();
		if(numUsuario%2==0){
			System.out.println("Numero Par");
		}else {
			System.out.println("Número InPar");
		}
	}
}
