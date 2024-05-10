import java.util.Scanner;

public class aula_6_questao_01 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[7];
        System.out.print("digite um numero: ");
        int numero = sc.nextInt();

        array[0] += numero;
        array[array.length - 1] += numero;

        System.out.println("array resiultante: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + "");
        }
        sc.close();
    }
}