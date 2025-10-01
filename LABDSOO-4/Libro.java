public class Libro {
    private String titulo;
    private String autor;
    private int ISBN;
    private boolean disponibilidad;
    
    //getters y setters
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getISBN() { return ISBN; }
    public boolean isDisponibilidad() { return disponibilidad; }

    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setAutor(String autor) { this.autor = autor; }
    public void setISBN(int ISBN) { this.ISBN = ISBN; }
    public void setDisponibilidad(boolean disponibilidad) { this.disponibilidad = disponibilidad; }
}