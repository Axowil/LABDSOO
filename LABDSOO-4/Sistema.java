import java.util.*;
public class Sistema {
    private ArrayList<Libro> libros;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Prestamo> Prestamos;
    public Sistema() {
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }
    public void registrarPrestamo(Prestamo prestamo) {
        if (prestamo != null) Prestamos.add(prestamo);
    }
    public void registrarLibro(Libro libro) {
        libros.add(libro);
    }
    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
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
}
