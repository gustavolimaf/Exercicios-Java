public class DispositivoEletronico {
    String marca;
    int anoFabricacao;
    public DispositivoEletronico(String marca, int anoFabricacao) {
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public int getAnoFabricacao() {
        return anoFabricacao;
    }
    public void setAnoFabricacao(int anoFabricacao){
        this.anoFabricacao = anoFabricacao;
    }
}
