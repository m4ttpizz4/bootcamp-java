//bibliotecas:
import java.util.Scanner;
//função dedicada a fatorial:
public class FatorialFibonacci
{
//função para calcular a fatorial:
    public static long calcularFatorial(int numero)
    {
        long fatorial = 1;
        for (int i = 1; i <= numero; i++)
        {
            fatorial *= i;
        }
        return fatorial;
    }
//função para gerar o fibonacci:
    public static void gerarFibonacci(int limite)
    {
        int a = 0, b = 1;
        System.out.print("Sequência de Fibonacci até " + limite + ": ");
        while (a <= limite)
        {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }
        System.out.println();
    }
//função principal:
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();
        System.out.println("Fatorial de " + numero + " é: " + calcularFatorial(numero));
        System.out.print("Digite um limite para a sequência de Fibonacci: ");
        int limite = scanner.nextInt();
        gerarFibonacci(limite);
        scanner.close();
    }
}