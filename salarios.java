import java.util.Scanner;
public class salarios {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n1, n2, n3, n4, media;
		System.out.println("Insira o valor do primeiro sal�rio (ex: 1.000): ");
		n1 = ler.nextInt();
		System.out.println("Insira o valor do segundo sal�rio (ex: 1.000): ");
		n2 = ler.nextInt();
		System.out.println("Insira o valor do terceiro sal�rio (ex: 1.000): ");
		n3 = ler.nextInt();
		System.out.println("Insira o valor do quarto sal�rio (ex: 1.000): ");
		n4 = ler.nextInt();
		
		media = (n1 + n2 + n3 + n4) / 4;
		System.out.println("A m�dia salarial da empresa � de R$" + media);
	}
}
