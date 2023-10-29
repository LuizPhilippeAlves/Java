public class atividade16 {
    public static void main(String[] args) {
        int n = 10;
        int count = 0;
        int numero = 2;

        System.out.println("Os primeiros " + n + " números primos são:");

        while (count < n) {
            if (ehPrimo(numero)) {
                System.out.print(numero + " ");
                count++;
            }
            numero++;
        }
    }

    public static boolean ehPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

