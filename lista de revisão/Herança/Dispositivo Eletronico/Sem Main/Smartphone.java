import java.util.Scanner;

public class Smartphone extends  DispositivoEletronico{
    Scanner sc = new Scanner(System.in);
    private String sistOperacional = "android";
    private int armazenamento = 128;

    public Smartphone(String marca, int anoFabricacao) {
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
    public void ligar (String [] args){
        System.out.println("Número: ");
        int numero = sc.nextInt();
        System.out.println("Ligando "+numero+"...");
    }
}
