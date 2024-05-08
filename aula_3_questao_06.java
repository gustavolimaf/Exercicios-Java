import java.util.Scanner;

public class aula_3_questao_06 {
    public static String removeVogais(String str) {
        String semVogais = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!isVogal(c)) {
                semVogais += c;
            }
        }
        return semVogais;
    }
    public static boolean isVogal(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String string = sc.nextLine();
        String resultado = removeVogais(string);
        System.out.println("String sem vogais: " + resultado);
        sc.close();
    }
}