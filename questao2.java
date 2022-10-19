import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o 1° num: ");
		double num1 = scan.nextDouble();
		System.out.println("Digite o 2° num: ");
		double num2 = scan.nextDouble();
		
		double soma = num1 + num2;
		double sub = num1 - num2;
		double multi = num1 * num2;
		double div = num1 / num2;
		
		System.out.println("Soma: " + soma);
		System.out.println("Subtracao: " + sub);
		System.out.println("Multi: " + multi);
		System.out.println("Divisao: " + div);
	}
}