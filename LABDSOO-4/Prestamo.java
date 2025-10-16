import java.time.LocalDate;
public class Prestamo {
    //Atributos
    private int dniPrestamista;
    private int isbnLibro;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private boolean vigencia;
    //Constructor
    public Prestamo(int isbnLibro, int dniPrestamista, LocalDate fechaPrestamo) {
        this.dniPrestamista = dniPrestamista;
        this.fechaPrestamo = fechaPrestamo;
        this.isbnLibro = isbnLibro;
        this.vigencia = true;
    }
    public Prestamo(int isbn, int dni, int i, int j, int k) {
        //TODO Auto-generated constructor stub
    }
    //Getters y Setters
    public void setDniPrestamista(int dniPrestamista) {this.dniPrestamista = dniPrestamista; }
    public void setIsbnLibro(int isbnLibro) {this.isbnLibro = isbnLibro; }
    public void setFechaPrestamo(LocalDate fechaPrestamo) {this.fechaPrestamo = fechaPrestamo; }
    public int getDniPrestamista() { return dniPrestamista; }
    public int getIsbnLibro() { return isbnLibro; }
    public LocalDate getFechaPrestamo() { return fechaPrestamo; }
    public boolean isVigencia() { return vigencia; }
    
    public void cancelado() {
        vigencia = false;
        fechaDevolucion = LocalDate.now();
    }
    @Override
    public String toString() {
        return "Prestamo{" +
                "Dni del prestamista='" + dniPrestamista + '\'' +
                "ISBN del libro='" + isbnLibro + '\'' +
                ", estado=" + (vigencia ? "Vigente" : "Devuelto el " + fechaDevolucion) + 
                '}';
    }
}
