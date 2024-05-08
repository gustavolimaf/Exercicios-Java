import java.util.Scanner;

public class aula_5_questao_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contAlc = 0;
        int contGas = 0;
        int contDis = 0;

        int tipoCombustivel = 0;

        System.out.print("Informe o tipo de combustível abastecido:");
        System.out.println("1. Álcool");
        System.out.println("2. Gasolina");
        System.out.println("3. Diesel");
        System.out.println("4. Fim");

        do {

            tipoCombustivel = sc.nextInt();

            switch (tipoCombustivel) {
                case 1:
                    contAlc++;
                    break;
                case 2:
                    contGas++;
                    break;
                case 3:
                    contDis++;
                    break;
                case 4:
                    break;
                default:
                    continue;
            }
        }while (tipoCombustivel != 4);
        System.out.println("MUITO OBRIGADO!");
        System.out.println("Alcool: " + contAlc);
        System.out.println("Gasolina: " + contGas);
        System.out.println("Diesel: " + contDis);
    }
}
