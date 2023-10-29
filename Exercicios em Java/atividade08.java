import java.util.Scanner;

public class atividade08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota da primeira disciplina: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota da segunda disciplina: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a nota da terceira disciplina: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média das notas é: " + media);

        if (media >= 7) {
            System.out.println("Aluno Aprovado!");
        } else {
            System.out.println("Aluno Reprovado.");
        }

        scanner.close();
    }
}
