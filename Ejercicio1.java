//Crea una clase Libro con estos atributos: titulo (texto), autor (texto), paginas (número entero) y prestado (verdadero o falso).
//En main, crea un objeto libro1 con estos datos: «El Principito», de Antoine de Saint-Exupéry, 96 páginas, no prestado.
//Crea un objeto libro2: «Don Quijote», de Miguel de Cervantes, 1250 páginas, prestado.
//Muestra los datos de cada libro en una línea, con el formato de la salida esperada.
//Con un if, muestra cuál de los dos libros tiene más páginas.
//Si libro2 está prestado, muestra un aviso.

class Libro {
    String titulo;
    String autor;
    int paginas;
    boolean prestado;
}

public class Ejercicio1 {
    public static void main(String[] args) {

        Libro libro1 = new Libro();
        libro1.titulo = "El Principito";
        libro1.autor = "Antoine de Saint-Exupéry";
        libro1.paginas = 96;
        libro1.prestado = false;

        Libro libro2 = new Libro();
        libro2.titulo = "Don Quijote";
        libro2.autor = "Miguel de Cervantes";
        libro2.paginas = 1250;
        libro2.prestado = true;

        System.out.println(libro1.titulo + " - " + libro1.autor + " - " + libro1.paginas + " paginas.");
        System.out.println(libro2.titulo + " - " + libro2.autor + " - " + libro2.paginas + " paginas.");

        if (libro1.paginas < libro2.paginas) {
            System.out.println("El libro más largo es " + libro2.titulo);
        } else {
            System.out.println("El libro más largo es " + libro1.titulo);
        }

        if (libro2.prestado == true) {
            System.out.println("Aviso: El libro " + libro2.titulo + " está prestado.");
        }
    }
}
