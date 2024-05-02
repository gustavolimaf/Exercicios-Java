import java.util.Scanner;

public class aula_2_questao_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int a = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        int b = sc.nextInt();
        System.out.println("Digite a operação desejada(1 - Soma, 2 - Subtração, 3 - Divisão ou 4 - Multiplicação): ");
        int c = sc.nextInt();
        switch (c){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a/b);
                break;
            case 4:
                System.out.println(a*b);
                break;
            default:
                System.out.println("Erro!");
        }
    }
}
