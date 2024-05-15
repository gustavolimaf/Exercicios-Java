public class solidos {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado("Quadrado", 8);
        Circulo circulo = new Circulo("Círculo", 5);
        Triangulo triangulo = new Triangulo("Triângulo", 7, 9, 1);

        System.out.println(quadrado.nome + " - Área: " + quadrado.calcularArea() + ", Perímetro: " + quadrado.calcularPerimetro());
        System.out.println(circulo.nome + " - Área: " + circulo.calcularArea() + ", Perímetro: " + circulo.calcularPerimetro());
        System.out.println(triangulo.nome + " - Área: " + triangulo.calcularArea() + ", Perímetro: " + triangulo.calcularPerimetro());
    }
}