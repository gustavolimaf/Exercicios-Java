import java.util.Scanner;

public class aula_6_questao_02  {
    public static void main(String[] args) {
        int[] vetor = new int[8];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hora de digitar os valores para preencher o vetor");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Elemento " + i + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Agora, os índices dos elementos que deseja trocar");
        System.out.print("Índice do primeiro elemento: ");
        int indice1 = scanner.nextInt();
        System.out.print("Índice do segundo elemento: ");
        int indice2 = scanner.nextInt();

        if (indice1 >= 0 && indice1 < vetor.length && indice2 >= 0 && indice2 < vetor.length) {
            int temp = vetor[indice1];
            vetor[indice1] = vetor[indice2];
            vetor[indice2] = temp;

            System.out.println("Vetor resultante:");
            for (int elemento : vetor) {
                System.out.print(elemento + " ");
            }
        } else {
            System.out.println("Índices inválidos. Por favor, informe índices dentro do intervalo [0, " + (vetor.length - 1) + "].");
        }

        scanner.close();
    }
}
