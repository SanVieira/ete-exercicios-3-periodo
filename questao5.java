import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Nome do aluno ");
		String nomeAluno = scan.next();
		System.out.println("Nota 1: ");
		double nota1 = scan.nextDouble();
		System.out.println("Nota 2: ");
		double nota2 = scan.nextDouble();
		System.out.println("Nota 3: ");
		double nota3 = scan.nextDouble();
		
		double mediaFinal = (nota1 + nota2 + nota3)/3;
		
		System.out.println("Aluno: "  + nomeAluno);
		System.out.println("Média Final: "  + mediaFinal);
	}
}