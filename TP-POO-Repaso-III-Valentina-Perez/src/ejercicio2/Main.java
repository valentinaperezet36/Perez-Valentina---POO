package ejercicio2;

public class Main {
    // Crea los dos medios y realiza un pago de prueba con cada uno.
    public static void main(String[] args) {
        Tarjeta tarjeta = new Tarjeta("Valentina Pérez", "0123");
        BilleteraVirtual billetera = new BilleteraVirtual("Valentina Pérez", "Mercado Pago");

        tarjeta.procesarPago(1500);
        billetera.procesarPago(800);
    }
}
