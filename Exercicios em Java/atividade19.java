import java.util.Scanner;

public class atividade19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de elementos no array: ");
        int n = scanner.nextInt();

        int[] numeros = new int[n];

        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();
        }

        double media = calcularMedia(numeros);

        System.out.println("A média aritmética é: " + media);

        scanner.close();
    }

    public static double calcularMedia(int[] numeros) {
        int soma = 0;

        for (int numero : numeros) {
            soma += numero;
        }

        return (double) soma / numeros.length;
    }

}
