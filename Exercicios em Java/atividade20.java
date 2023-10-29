import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class atividade20 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a string: ");
        String texto = scanner.nextLine();

        System.out.print("Digite a palavra para contar as ocorrências: ");
        String palavra = scanner.next();

        int ocorrencias = contarOcorrencias(texto, palavra);

        System.out.println("Número de ocorrências da palavra '" + palavra + "': " + ocorrencias);

        scanner.close();
    }

    public static int contarOcorrencias(String texto, String palavra) {
        Pattern padrao = Pattern.compile("\\b" + Pattern.quote(palavra) + "\\b");
        Matcher matcher = padrao.matcher(texto);
        int ocorrencias = 0;

        while (matcher.find()) {
            ocorrencias++;
        }

        return ocorrencias;
    }
}
