import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um numero: ");
		double numero = scan.nextDouble();
		
		if (numero > 20) System.out.println("Numero informado: " + numero);
	}
}