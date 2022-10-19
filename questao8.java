import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Cotacao do Dolar: ");
		double cota = scan.nextDouble();
		System.out.println("Quanto possui em dolar: ");
		double quantidadeDolar = scan.nextDouble();
		
		double quantidadeReal = quantidadeDolar * cota;
		
		System.out.printf("Quantidade de Real: R$%.2f", quantidadeReal);
		
	}
}