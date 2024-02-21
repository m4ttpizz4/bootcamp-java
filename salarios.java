import java.util.Scanner;
public class salarios {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n1, n2, n3, n4, media;
		System.out.println("Insira o valor do primeiro salário (ex: 1.000): ");
		n1 = ler.nextInt();
		System.out.println("Insira o valor do segundo salário (ex: 1.000): ");
		n2 = ler.nextInt();
		System.out.println("Insira o valor do terceiro salário (ex: 1.000): ");
		n3 = ler.nextInt();
		System.out.println("Insira o valor do quarto salário (ex: 1.000): ");
		n4 = ler.nextInt();
		
		media = (n1 + n2 + n3 + n4) / 4;
		System.out.println("A média salarial da empresa é de R$" + media);
	}
}
