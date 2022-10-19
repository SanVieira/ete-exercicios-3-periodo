import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o 1° num: ");
		double num1 = scan.nextDouble();
		System.out.println("Digite o 2° num: ");
		double num2 = scan.nextDouble();
		
		if (num1 < num2) System.out.println("Números Informados: " + num2 + " e " + num1);
		else System.out.println("Números Informados: " + num1 + " e " + num2);
	}
}