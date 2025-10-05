import java.util.*;

public class Usuario {
        private String nombres;
        private String apellidos;
        private int dni ;

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getDni() {
        return dni;
    }
    //:v
    public Prestamo TomarPrestado(ArrayList<Libro> libros){
        Scanner sc = new Scanner(System.in);
        for (Libro libro : libros) {
            System.out.println(libro);
        }
        System.out.println("Ingrese el ISBNL del libro que desea prestarse");
        int isbn = sc.nextInt();
        sc.nextLine();
        return TomarPrestamo(libros, isbn);
    }
    public Prestamo TomarPrestamo(ArrayList<Libro> libros, int isbn) {
        Libro libro = buscarLibro(libros, isbn);
        if( libro != null && libro.estaDisponible()) {
            libro.cantidad--;
            return new Prestamo(libro, this);
        } else {
            System.out.println("El libro no esta disponible");
            return null;
        }
    }
    public void DevolverLibro(ArrayList<Prestamo> prestamos){
        for (Prestamo prestamo : prestamos) {
            if(prestamo.getPrestatario() == this) {
                prestamo.cancelado();
                break;
            }
        }
    }
    public Libro buscarLibro(ArrayList<Libro> libros, int isbn) {
        for (Libro libro : libros) {
            if(libro.getISBN() == isbn) return libro;
        }
        return null;
    }
}
