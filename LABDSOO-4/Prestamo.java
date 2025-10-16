import java.time.LocalDate;
public class Prestamo {
    //Atributos
    private Usuario prestatario;
    private Libro libro;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private boolean vigencia;
    //Constructor
    public Prestamo(Libro libro, Usuario prestatario) {
        this.libro = libro;
        this.prestatario = prestatario;
        this.fechaPrestamo = LocalDate.now();
        this.vigencia = true;
    }
    public Prestamo(int isbn, int dni, int i, int j, int k) {
        //TODO Auto-generated constructor stub
    }
    //Getters y Setters
    public void setFechaPrestamo(LocalDate fechaPrestamo) {this.fechaPrestamo = fechaPrestamo; }
    public void setPrestatario(Usuario prestatario) { this.prestatario = prestatario; }
    public void setLibro(Libro libro) { this.libro = libro; }
    public Usuario getPrestatario() { return prestatario; }
    public Libro getLibro() { return libro; }
    public LocalDate getFechaPrestamo() { return fechaPrestamo; }
    public boolean estaVigente() { return vigencia; }

    public void cancelado() {
        getLibro().cantidad++;
        vigencia = false;
        fechaDevolucion = LocalDate.now();
    }
    @Override
    public String toString() {
        return "Prestamo{" +
                "Prestatario='" + prestatario.getNombres() + '\'' +
                "ISBN del libro='" + libro.getISBN() + '\'' +
                ", estado=" + (vigencia ? "Vigente" : "Devuelto el " + fechaDevolucion) + 
                '}';
    }
}
