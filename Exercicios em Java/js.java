    import java.util.Random;
    import java.util.Scanner;
    
    public class js{
        public static void main(String[] args) {
            Random random = new Random();
            int numeroAleatorio = random.nextInt(100) + 1;
            int tentativas = 0;
            
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Bem-vindo ao Jogo de Adivinhação!");
            System.out.println("Tente adivinhar o número entre 1 e 100.");
            
            while (true) {
                System.out.print("Digite o seu palpite: ");
                int palpite = scanner.nextInt();
                tentativas++;
                
                if (palpite < numeroAleatorio) {
                    System.out.println("Tente um número maior.");
                } else if (palpite > numeroAleatorio) {
                    System.out.println("Tente um número menor.");
                } else {
                    System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
                    break;
                }
            }
            
            scanner.close();
        }
    }                    

