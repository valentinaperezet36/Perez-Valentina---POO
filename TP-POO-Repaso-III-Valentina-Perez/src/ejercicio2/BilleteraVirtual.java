package ejercicio2;

public class BilleteraVirtual extends MedioPago {
    private String nombreAplicacion;

    // Inicializa el titular y el nombre de la aplicación.
    public BilleteraVirtual(String titular, String nombreAplicacion) {
        super(titular);
        this.nombreAplicacion = nombreAplicacion;
    }

    // Sobrescribe el pago para mostrar los datos de la billetera.
    @Override
    public void procesarPago(double monto) {
        if (monto > 0) {
            System.out.println("Pago con billetera virtual - Titular: " + getTitular()
                    + " - Aplicación: " + nombreAplicacion
                    + " - Monto: $" + monto);
        } else {
            System.out.println("El monto debe ser mayor que cero.");
        }
    }
}
