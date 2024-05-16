import java.util.Scanner;

public class Tablet extends  DispositivoEletronico{
    Scanner sc = new Scanner(System.in);
    private String sistOperacional = "IOS";
    private int armazenamento = 256;

    public Tablet(String marca, int anoFabricacao) {
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
    public void assistir(){
        System.out.println("O que deseja assitir?: ");
        String assistir = sc.nextLine();
        System.out.println("Reproduzindo "+assistir);
    }
}
