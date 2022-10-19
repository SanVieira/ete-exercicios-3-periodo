import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Valor da compra: ");
		double compra = scan.nextDouble();
		
		double prestacao = compra/5;
		
		System.out.println("Total da Compra: R$" + compra);
		System.out.printf("Prestacoes: R$%.2f" , prestacao);
	}
}