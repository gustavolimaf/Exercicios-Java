import java.util.Scanner;

public class aula_5_questao_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char rep;
        do {
            System.out.print("Digite a tempperatura em Celsius: ");
            double c = sc.nextDouble();
            double f = (9 * c / 5 )+ 32;
            System.out.print("Equivalente em Fahrenheit: "+f);
            System.out.print("\nDeseja repetir(s/n)?: ");
            rep = sc.next().charAt(0);
        }while (rep == 's');
        sc.close();
    }
}
