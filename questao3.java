import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Distancia percorrida: ");
		double dist = scan.nextDouble();
		System.out.println("Combustivel gasto: ");
		double gasolina = scan.nextDouble();
		
		double usoCombustivel = dist / gasolina;
		
		System.out.println("Distancia por Litro"  + usoCombustivel);
	}
}