public class Sistema {
    private ArrayList<Libro> libros;
    private ArrayList<Usuario> usuarios;
    public Sistema() {
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
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
}
