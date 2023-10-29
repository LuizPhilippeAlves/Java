import java.util.Scanner;

public class atividade15 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        if (ePalindromo(palavra)) {
            System.out.println(palavra + " é um palíndromo.");
        } else {
            System.out.println(palavra + " não é um palíndromo.");
        }

        scanner.close();
    }

    public static boolean ePalindromo(String palavra) {
        palavra = palavra.replaceAll("\\s", "").toLowerCase(); 
        int tamanho = palavra.length();

        for (int i = 0; i < tamanho / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(tamanho - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
