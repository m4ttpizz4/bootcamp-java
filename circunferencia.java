package circulo;
import java.util.Scanner;
public class circunferencia {
	public static void main (String[] args){
	Scanner ler = new Scanner(System.in);
	double C, R;
	System.out.println("Insira o valor do raio:");
	R = ler.nextDouble();
	//Formula:
	C = 3.14*R*R;
	System.out.println("O valor da circunferência é:" + C);
	}
}
