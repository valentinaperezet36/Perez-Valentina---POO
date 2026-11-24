package ejercicio2;

public class MedioPago {
    private String titular;

    // Guarda el nombre del titular.
    public MedioPago(String titular) {
        this.titular = titular;
    }

    // Devuelve el nombre del titular.
    public String getTitular() {
        return titular;
    }

    // Solo informa el pago cuando el monto es positivo.
    public void procesarPago(double monto) {
        if (monto > 0) {
            System.out.println("Procesando pago por $" + monto);
        } else {
            System.out.println("El monto debe ser mayor que cero.");
        }
    }
}
