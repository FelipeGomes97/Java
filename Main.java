import java.util.Locale;
import java.util.Scanner;

public class Main {
	 
	public static void main (String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos funcionários serão digitados ?");
		int x = sc.nextInt();
		
		int i;
		String[] nomes = new String[x];
		double[] salarios = new double[x];
		
		for (i = 0; i < x; i++) {
			System.out.print("Digite o nome do " + i + " funcionário: ");
			nomes[i] = sc.nextLine();
			sc.nextLine();
		}
		
		for (i = 0; i < x; i++) {
			System.out.print("Qual o salário do " + i + " funcionário? ");
			salarios[i] = sc.nextDouble();
		}
		
		String nome = nomes[0];
		double maiorSalario = 0;
		for (i = 0; i < x; i++) {
			if (salarios[i] > maiorSalario) {
				maiorSalario = salarios[i];
				nome = nomes[i];
			}
		}
		
		System.out.printf("O funcionário com maior salário é o(a) " + nome + " com um salário de " + String.format("%.2f%n", maiorSalario));
		
		sc.close();
	}
}
