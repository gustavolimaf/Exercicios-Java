class FiguraGeometrica {
    String nome;
    FiguraGeometrica(String nome) {
        this.nome = nome;
    }
    double calcularArea() {
        return 0.0;
    }
    double calcularPerimetro() {
        return 0.0;
    }
}
class Quadrado extends FiguraGeometrica {
    double lado;

    Quadrado(String nome, double lado) {
        super(nome);
        this.lado = lado;
    }
    double calcularArea() {
        return lado * lado;
    }
    double calcularPerimetro() {
        return 4 * lado;
    }
}
class Circulo extends FiguraGeometrica {
    double raio;
    final double PI = 3.14159;

    Circulo(String nome, double raio) {
        super(nome);
        this.raio = raio;
    }
    double calcularArea() {
        return PI * raio * raio;
    }
    double calcularPerimetro() {
        return 2 * PI * raio;
    }
}
class Triangulo extends FiguraGeometrica {
    double lado1, lado2, lado3;

    Triangulo(String nome, double lado1, double lado2, double lado3) {
        super(nome);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    double calcularArea() {
        double semiPerimetro = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(semiPerimetro * (semiPerimetro - lado1) * (semiPerimetro - lado2) * (semiPerimetro - lado3));
    }

    @Override
    double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
}