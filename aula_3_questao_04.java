import java.util.Scanner;

public class aula_3_questao_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double a = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double b = sc.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double c = sc.nextDouble();

        System.out.println("Digite 'a'/'A' para média simples ou 'p'/'P' para média ponderada: ");
        String x = sc.next();

        result(a, b, c, x.toLowerCase());

        sc.close();
    }

    public static void result(double a, double b, double c, String x) {
        if (x.equals("a")) {
            double media = (a + b + c) / 3;
            System.out.println("Média: " + media);
        } else if (x.equals("p")) {
            double media = ((a * 5) + (b * 3) + (c * 2)) / 10;
            System.out.println("Média ponderada: " + media);
        } else {
            System.out.println("Opção inválida!");
        }
    }
}
