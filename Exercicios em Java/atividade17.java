import java.util.Scanner;

public class atividade17 {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String textoOriginal = scanner.nextLine();

        String textoInvertido = inverterString(textoOriginal);

        System.out.println("String original: " + textoOriginal);
        System.out.println("String invertida: " + textoInvertido);

        scanner.close();
    }

    public static String inverterString(String texto) {
        StringBuilder reverso = new StringBuilder();
        for (int i = texto.length() - 1; i >= 0; i--) {
            reverso.append(texto.charAt(i));
        }
        return reverso.toString();
    }
}
