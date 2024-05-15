public class aluno {
    public String nome;
    public int matricula;
    public double [] notas;

    public aluno(String nome, int matricula, int numDisciplinas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = new double[numDisciplinas];
    }

    public void setNotas(int numDisciplinas, double nota) {
        if (numDisciplinas >= 0 && numDisciplinas < notas.length) {
            notas[numDisciplinas] = nota;
        }else{
            System.out.println("erro");
        }
    }

    public double calcularMedia() {
        double soma = 0.0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
    public boolean verApRep(double notaMin){
        return calcularMedia() >= notaMin;
    }
}