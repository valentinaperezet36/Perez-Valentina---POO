package tp.herencia.ej3;

class Animal {
    private String nombre;
    private int edad;

    Animal(String nombre, int edad) {
        setNombre(nombre);
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.nombre = nombre.trim();
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa.");
        }
        this.edad = edad;
    }
}

class Perro extends Animal {
    private String raza;

    Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        setRaza(raza);
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        if (raza == null || raza.trim().isEmpty()) {
            throw new IllegalArgumentException("La raza no puede estar vacía.");
        }
        this.raza = raza.trim();
    }

    public void mostrarDatos() {
        System.out.println(getNombre() + " es de raza " + raza
                + " y tiene " + getEdad() + " años.");
    }

    public void ladrar() {
        System.out.println("El perro está ladrando.");
    }
}

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Mora", 4, "mestiza");
        perro.mostrarDatos();
        perro.ladrar();
    }
}
