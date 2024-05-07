import java.util.Scanner;

public class ex_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int n = sc.nextInt();

        result(n);

        sc.close();
    }
    public static void result(int n) {
        if (n % 2 == 0) {
            System.out.println("é multiplo!");
        }else
            System.out.println("não é multiplo :/");
    }
}
