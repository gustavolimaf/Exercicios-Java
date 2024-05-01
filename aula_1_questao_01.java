import java.util.Scanner;

public class aula_1_questao_01 {

    public static void main(String[] args) {
        double tri, cir, tra, qua, ret;
        double pi = 3.14159;

        Scanner scanner = new Scanner(System.in);

        System.out.print("digite o valor de A: ");
        double a = scanner.nextDouble();

        System.out.print("\ndigite o valor de B: ");
        double b = scanner.nextDouble();

        System.out.print("\ndigite o valor de C: ");
        double c = scanner.nextDouble();

            tri = (a * c) / 2;
            cir = pi * (c * c);
            tra = ((a + b) * c) / 2;
            qua = b * b;
            ret = a * b;
        System.out.println("TRIÂNGULO: " + tri);
        System.out.println("CÍRCULO: " + cir);
        System.out.println("TRAPÉZIO: " + tra);
        System.out.println("QUADRADO: " + qua);
        System.out.println("RETÂNGULO: " + ret);
    }
}
