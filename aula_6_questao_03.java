import java.util.Scanner;

public class aula_6_questao_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int n = scanner.nextInt();
        scanner.close();

        int[] primos = new int[n];
        int count = 0;
        int num = 2;

        while (count < n) {
            if (isPrimo(num)) {
                    primos[count] = num;
                    count++;
            }
            num++;
        }

        System.out.println("Os " + n + " primeiros números primos são:");
        for (int primo : primos) {
                System.out.print(primo + " ");
        }
    }

    static boolean isPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}