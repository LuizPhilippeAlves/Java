import java.util.Scanner;

public class atividade14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número até o qual você deseja calcular a sequência de Fibonacci: ");
        int numero = scanner.nextInt();

        System.out.println("Sequência de Fibonacci até " + numero + ":");
        for (int i = 0; i <= numero; i++) {
            long resultado = calcularFibonacci(i);
            System.out.print(resultado + " ");
        }

        scanner.close();
    }

    public static long calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            long fib1 = 0;
            long fib2 = 1;
            long fib = 0;

            for (int i = 2; i <= n; i++) {
                fib = fib1 + fib2;
                fib1 = fib2;
                fib2 = fib;
            }

            return fib;
        }
    }
}

