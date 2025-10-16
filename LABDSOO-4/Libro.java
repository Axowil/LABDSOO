public class Libro {
    private String titulo;
    private String autor;
    private int ISBN;
    private boolean disponibilidad;
    public int cantidad = 0;
    
    //getters y setters
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getISBN() { return ISBN; }
    public boolean estaDisponible() { return disponibilidad; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setAutor(String autor) { this.autor = autor; }
    public void setISBN(int ISBN) { this.ISBN = ISBN; }
    public void setDisponibilidad(boolean disponibilidad) { this.disponibilidad = disponibilidad; }

    //disponibilidad
    public void mostrarDisponibilidad(){
        if (disponibilidad) {
            System.out.println("El libro está disponible.");
        } else {
            System.out.println("El libro no está disponible.");
        }
    }

    //constructor
    public Libro(String titulo, String autor, int ISBN, boolean disponibilidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.disponibilidad = disponibilidad;
    }

    //sobrecarga de constructor
    public Libro(String titulo, String autor, int ISBN, int cantidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.cantidad = cantidad;
        this.disponibilidad = true; // Por defecto, el libro está disponible
    }

    //toString
    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ISBN=" + ISBN +
                ", disponibilidad=" + (disponibilidad ? "Disponible" : "No Disponible") +
                '}';
    }
}