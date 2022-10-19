import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Valor depositado: ");
		double depositado = scan.nextDouble();
		
		double valorFinal = depositado * (1 + 0.7 * 1);
		
		System.out.println("Rendimento: " + valorFinal);
	}
}