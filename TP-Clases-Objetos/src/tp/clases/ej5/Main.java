package tp.clases.ej5;

class Rectangulo {
    private double base;
    private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base <= 0) {
            throw new IllegalArgumentException("La base debe ser mayor que cero.");
        }
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("La altura debe ser mayor que cero.");
        }
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
    }
}

public class Main {
    public static void main(String[] args) {
        // Se usa Rectangulo: el enunciado menciona "Triangulo" por error,
        // pero los atributos y la fórmula solicitados corresponden a un rectángulo.
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setBase(7.5);
        rectangulo.setAltura(4.0);

        System.out.printf("Área del rectángulo: %.2f%n", rectangulo.calcularArea());
    }
}
