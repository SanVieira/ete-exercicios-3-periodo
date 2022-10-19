import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Seu nome: ");
		String vendedor = scan.next();
		System.out.println("Salario Fixo: ");
		double salarioFixo = scan.nextDouble();
		System.out.println("Vendas do mês: ");
		double vendas = scan.nextDouble();
		
		double comissao = vendas * 0.15;
		double salarioFinal = salarioFixo + comissao;
		
		System.out.println("Vendedor: "  + vendedor);
		System.out.println("Salario Fixo: "  + salarioFixo);
		System.out.println("Salario Final: "  + salarioFinal);
	}
}