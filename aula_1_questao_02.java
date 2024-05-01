import java.util.Scanner;

public class aula_1_questao_02 {
    public static void main (String[]args){
        Scanner Scanner = new Scanner (System.in);
        int diff;
        System.out.print("PROGRAMA QUE CALCULA A DIFERENÇA DE 4 VALORES");
        System.out.print("\nDigite o valor de A: ");
        int a = Scanner.nextInt();

        System.out.print("\nDigite o valor de B: ");
        int b = Scanner.nextInt();

        System.out.print("\nDigite o valor de C: ");
        int c = Scanner.nextInt();

        System.out.print("\nDigite o valor de D: ");
        int d = Scanner.nextInt();

        diff = ((a*b)-(c*d));

        System.out.print("\nDIFERENÇA: "+ diff);
        
        Scanner.close();
    }
}