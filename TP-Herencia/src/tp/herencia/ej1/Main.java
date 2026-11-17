package tp.herencia.ej1;

class Persona {
    private String nombre;
    private int edad;

    Persona(String nombre, int edad) {
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

class Empleado extends Persona {
    private double salario;

    Empleado(String nombre, int edad, double salario) {
        super(nombre, edad);
        setSalario(salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            throw new IllegalArgumentException("El salario no puede ser negativo.");
        }
        this.salario = salario;
    }

    public void mostrarDatos() {
        System.out.printf("Empleado: %s | Edad: %d | Salario: $%.2f%n",
                getNombre(), getEdad(), salario);
    }
}

public class Main {
    public static void main(String[] args) {
        Empleado empleada = new Empleado("Valentina Rojas", 28, 920_000.00);
        empleada.mostrarDatos();
    }
}
