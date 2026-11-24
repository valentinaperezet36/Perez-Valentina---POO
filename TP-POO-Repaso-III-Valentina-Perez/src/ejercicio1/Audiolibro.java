package ejercicio1;

public class Audiolibro extends MaterialDigital {
   
    public Audiolibro(String titulo) {
        super(titulo);
    }

    @Override
    public void mostrarDescripcion() {
        System.out.println(getTitulo() + " - Se puede escuchar");
    }
}
