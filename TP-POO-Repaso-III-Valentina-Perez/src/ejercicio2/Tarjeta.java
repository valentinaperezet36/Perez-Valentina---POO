package ejercicio2;

public class Tarjeta extends MedioPago {
    private String ultimosCuatroDigitos;

    // Inicializa el titular y los últimos cuatro dígitos.
    public Tarjeta(String titular, String ultimosCuatroDigitos) {
        super(titular);
        this.ultimosCuatroDigitos = ultimosCuatroDigitos;
    }

    // Sobrescribe el pago para mostrar los datos de la tarjeta.
    @Override
    public void procesarPago(double monto) {
        if (monto > 0) {
            System.out.println("Pago con tarjeta - Titular: " + getTitular()
                    + " - Últimos cuatro dígitos: " + ultimosCuatroDigitos
                    + " - Monto: $" + monto);
        } else {
            System.out.println("El monto debe ser mayor que cero.");
        }
    }
}
