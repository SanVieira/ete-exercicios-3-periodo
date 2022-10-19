import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double pi = 4.0;
		System.out.println("Valor do raio: ");
		double r = scan.nextDouble();
		
		double areaCirculo = pi * r * r;
		
		System.out.printf("Area do circulo: %.2fcm²" , areaCirculo);
	}
}