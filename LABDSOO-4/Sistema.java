import java.util.*;
public class Sistema {
    private ArrayList<Libro> libros;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Prestamo> Prestamos;
    public Sistema() {
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.Prestamos = new ArrayList<>();
    }
    public void registrarLibro(Libro libro) {
        libros.add(libro);
    }
    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    public Libro buscarLibro(int isbn) {
        for (Libro libro : libros) {
            if (libro.getISBN() == isbn) return libro;
        }
        return null;
    }
    public void registrarPrestamo(Prestamo prestamo) {
        if (prestamo != null){
        Libro libroprestado = buscarLibro(prestamo.getIsbnLibro());
        if (libroprestado != null && libroprestado.isDisponibilidad()) {
            Prestamos.add(prestamo);
            libroprestado.setDisponibilidad(false);
        }           
        }    
    }
    public void registrarDevolucion(int dniPrestamista, int isbnLibro) {
        for (Prestamo prestamo:Prestamos){
            if (prestamo.getDniPrestamista() == dniPrestamista && prestamo.getIsbnLibro() == isbnLibro && prestamo.isVigencia()) {
                prestamo.cancelado();
                Libro libroDevuelto = buscarLibro(isbnLibro);
                if (libroDevuelto != null) {
                    libroDevuelto.setDisponibilidad(true);
                }
                break;    
            }
        }
    } 
    public void mostrarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
    public void mostrarUsuarios() {
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }
    public void mostrarPrestamos() {
        for (Prestamo prestamo : Prestamos) {
            System.out.println(prestamo);
        }
    }
    public  void verificarDisponibilidad(int isbn) {
        Libro libro = buscarLibro(isbn);
        if (libro != null) {
            libro.estaDisponible();
        } else {
            System.out.println("El libro con ISBN " + isbn + " no se encuentra registrado.");
        }
    }
}
