import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Temperatura(°C): ");
		double C = scan.nextDouble();
		
		double F = (9*C+160) / 5;
		
		System.out.println("Temperatura(°C: " + C);
		System.out.println("Temperatura(°F: " + F);
	}
}