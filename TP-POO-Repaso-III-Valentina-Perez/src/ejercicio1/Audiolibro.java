package ejercicio1;

public class Audiolibro extends MaterialDigital {
    // El constructor de MaterialDigital guarda el título.
    public Audiolibro(String titulo) {
        super(titulo);
    }

    // Sobrescribe la descripción para un audiolibro.
    @Override
    public void mostrarDescripcion() {
        System.out.println(getTitulo() + " - Se puede escuchar");
    }
}
