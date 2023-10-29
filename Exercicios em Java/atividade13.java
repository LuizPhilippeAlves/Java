import java.util.Scanner;

public class atividade13 {
    
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        int mmc = calcularMMC(numero1, numero2);

        System.out.println("O MMC de " + numero1 + " e " + numero2 + " é " + mmc);

        scanner.close();
    }

    public static int calcularMMC(int a, int b) {
        int numero1 = a;
        int numero2 = b;

        while (numero2 != 0) {
            int temp = numero2;
            numero2 = numero1 % numero2;
            numero1 = temp;
        }

        int mdc = numero1;

        // O MMC é o produto dos números dividido pelo MDC.
        return (a * b) / mdc;
    }
}
