import java.util.Scanner;

public class atividade03{
    public static void main (String[] arg){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
          
        if (numero % 2 == 0) {
            System.out.println(numero + " é um número par.");
        } else {
            System.out.println(numero + " é um número ímpar.");
        }
        
        scanner.close();
    }
}