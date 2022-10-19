import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Preco de custo: ");
		double precoCusto= scan.nextDouble();
		System.out.println("Acrescimo de venda(%): ");
		double valorAcrescimo = scan.nextDouble();
		System.out.println();
		
		double valorVenda = precoCusto * (1 + valorAcrescimo/100);
	
		System.out.println("Valor se venda: "  + valorVenda);
	}
}