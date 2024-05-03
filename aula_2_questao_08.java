import java.util.Scanner;

public class aula_2_questao_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de X: ");
        double x = sc.nextDouble();
        System.out.println("Digite o valor de Y: ");
        double y = sc.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("ORIGEM");
        }else if (x > 0 && y > 0) {
            System.out.println("1 QUADRANTE");
        }else if (x < 0 && y > 0) {
            System.out.println("2 QUADRANTE");
        }else if (x < 0 && y < 0) {
            System.out.println("3 QUADRANTE");
        }else if (x > 0 && y < 0) {
            System.out.println("4 QUADRANTE");
        }else if (x == 0 && y != 0) {
            System.out.println("EIXO X");
        }else if (x != 0 && y == 0) {
            System.out.println("EIXO Y");
        }
    }
}
