import java.util.Scanner;

public class aula_4_questao_05 {
    public static void main(String[] args) {
        int cubo, quad;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int valor = sc.nextInt();
        for (int i = 1; i <= valor; i++) {
            quad = i * i;
            cubo = i*i*i;
            System.out.printf("%d  %d  %d\n", i, quad, cubo);
        }
    }
}
