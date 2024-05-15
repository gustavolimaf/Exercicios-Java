public class main {
    public static void main(String[] args) {
        aluno aluno = new aluno("joãozinho", 4321, 4);
        aluno.setNotas(0, 9.7);
        aluno.setNotas(1, 9.7);
        aluno.setNotas(2, 5.5);

        double notaMin = 5.0;
        if (aluno.verApRep(notaMin)){
            System.out.println("Aluno aprovado!");
        }else{
            System.out.println("Aluno reprovado!");
        }
    }
}
