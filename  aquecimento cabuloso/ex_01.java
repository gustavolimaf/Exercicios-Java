import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite dois números inteiros: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        result(n1, n2);

        sc.close();
    }
    public static void result (int n1, int n2) {
        System.out.println(n1*n2);
    }
}
