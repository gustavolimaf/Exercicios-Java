package eletronico;
import eletronico.Notebook;
import eletronico.Tablet;
import eletronico.Smartphone;
public class main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("Samsung", 2023);
        smartphone.ligar();

        Tablet tablet = new Tablet("Apple", 2022);
        tablet.assistir();

        Notebook notebook = new Notebook("Dell", 2021);
        notebook.jogar();
    }
}
