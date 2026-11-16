class Libro {
    String titulo;
    String autor;
    int paginas;
    boolean prestado;
}

public class Ejercicio1 {
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.titulo = "El principito";
        libro1.autor = "Antoine de Saint-Exupéry";
        libro1.paginas = 96;
        libro1.prestado = false;

        Libro libro2 = new Libro();
        libro2.titulo = "Don Quijote";
        libro2.autor = "Miguel de Caervantes";
        libro2.paginas = 1250;
        libro2.prestado = true;

        int largo = libro1.paginas;
        if (largo < libro2.paginas) {
            System.out.println("El libro más largo es " + libro2.titulo);
        } else {
            System.out.println("El libro más largo es " + libro1.titulo);
        }

        System.out.println(libro1.titulo + " - " + libro1.autor + " - " + libro1.paginas + " paginas.");
        System.out.println(libro2.titulo + " - " + libro2.autor + " - " + libro2.paginas + " paginas.");
    }
}