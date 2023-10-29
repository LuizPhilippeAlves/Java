import java.util.Scanner;

public class atividade04 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro não negativo: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("O fatorial de um número negativo não é definido.");
        } else {
            long fatorial = calcularFatorial(numero);
            System.out.println("O fatorial de " + numero + " é " + fatorial);
        }

        scanner.close();
    }

    public static long calcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            long fatorial = 1;
            for (int i = 2; i <= n; i++) {
                fatorial *= i;
            }
            return fatorial;
        }
    }
}
