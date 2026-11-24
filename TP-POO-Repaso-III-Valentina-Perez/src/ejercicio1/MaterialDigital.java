package ejercicio1;

public class MaterialDigital {
    private String titulo;

    // Guarda el título del material.
    public MaterialDigital(String titulo) {
        this.titulo = titulo;
    }

    // Devuelve el título.
    public String getTitulo() {
        return titulo;
    }

    // Muestra la descripción general del material.
    public void mostrarDescripcion() {
        System.out.println("Material disponible en la biblioteca digital");
    }
}
