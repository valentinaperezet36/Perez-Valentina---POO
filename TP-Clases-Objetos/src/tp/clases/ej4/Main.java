package tp.clases.ej4;

class CuentaBancaria {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("El saldo no puede ser negativo.");
        }
        this.saldo = saldo;
    }
}

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setSaldo(185_750.50);

        System.out.printf("Saldo actual: $%.2f%n", cuenta.getSaldo());
    }
}
