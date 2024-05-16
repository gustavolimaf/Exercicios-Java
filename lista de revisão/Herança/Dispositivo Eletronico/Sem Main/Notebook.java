import java.util.Scanner;

public class Notebook extends DispositivoEletronico{
    Scanner sc = new Scanner(System.in);

    private String sistOperacional = "Windows";
    private int armazenamento = 528;

    public Notebook(String marca, int anoFabricacao) {
        super(marca, anoFabricacao);
    }

    public String getSistOperacional(){
        return sistOperacional;
    }
    public void setSistOperacional(String sistOperacional){
        this.sistOperacional = sistOperacional;
    }
    public int getArmazenamento(){
        return armazenamento;
    }
    public void setArmazenamento(int armazenamento){
        this.armazenamento = armazenamento;
    }
    public void jogar(){
        System.out.println("O que deseja jogar?: ");
        String jogar = sc.nextLine();
        System.out.println("Rodando: " + jogar);
    }
}
