import java.time.LocalDate;
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
        if(verificarDisponibilidad(isbn, libros)) 
            return new Prestamo(isbn,dni,LocalDate.now());
        else {
            System.out.println("El libro no esta disponible");
            return null;
        }
    }
    public void DevolverLibro(ArrayList<Prestamo> prestamos){
        for (Prestamo prestamo : prestamos) {
            if(prestamo.getDniPrestamista() == dni) {
                prestamo.cancelado();
                break;
            }
        }
    }
    public boolean verificarDisponibilidad(int isbn, ArrayList<Libro> libros){
        for (Libro libro : libros) {
            if (libro.getISBN() == isbn) return libro.isDisponibilidad();
        }
        return false;
    }
}
