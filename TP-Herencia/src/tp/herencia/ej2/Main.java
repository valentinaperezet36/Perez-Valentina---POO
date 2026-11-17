package tp.herencia.ej2;

class Vehiculo {
    private String marca;
    private String modelo;

    Vehiculo(String marca, String modelo) {
        setMarca(marca);
        setModelo(modelo);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.trim().isEmpty()) {
            throw new IllegalArgumentException("La marca no puede estar vacía.");
        }
        this.marca = marca.trim();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty()) {
            throw new IllegalArgumentException("El modelo no puede estar vacío.");
        }
        this.modelo = modelo.trim();
    }
}

class Auto extends Vehiculo {
    private int cantidadPuertas;

    Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo);
        setCantidadPuertas(cantidadPuertas);
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        if (cantidadPuertas < 1) {
            throw new IllegalArgumentException("Un auto debe tener al menos una puerta.");
        }
        this.cantidadPuertas = cantidadPuertas;
    }

    public void mostrarInformacion() {
        System.out.println("Auto " + getMarca() + " " + getModelo()
                + " - " + cantidadPuertas + " puertas.");
    }
}

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto("Toyota", "Yaris", 5);
        auto.mostrarInformacion();
    }
}
