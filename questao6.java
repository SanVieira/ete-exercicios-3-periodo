import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o n° A: ");
		double numA = scan.nextDouble();
		System.out.println("Digite o n° B: ");
		double numB = scan.nextDouble();
		
		double aux;
		
		aux = numA ;
		numA = numB;
		numB = aux;
		
		System.out.println("Numero A: " + numA );
		System.out.println("Numero B: " + numB);
	}
}