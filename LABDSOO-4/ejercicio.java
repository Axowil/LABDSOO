
import java.time.LocalDate;
import java.util.Scanner;
public class ejercicio {
    public static void main(String[] args) {
        
        Sistema sistema= new Sistema();
        Scanner sc = new Scanner(System.in);

        int numero ;

        do {
            System.out.println("---Bienvenido al sistema de gestión de biblioteca---");
            System.out.println("Elija una opción para comenzar:");
            System.out.println("opción 1: Registrar libros");
            System.out.println("opción 2: Registrar Usuario");
            System.out.println("opción 3: salir");
            numero = sc.nextInt();
            sc.nextLine();

        switch (numero) {
            case 1: 
                System.out.println("Introducir el titulo del libro :");
                String nombreLibro = sc.nextLine();
                System.out.println("Introducir el autor del libro ");
                String autorLibro = sc.nextLine();
                System.out.println("Introducir el ISBN del libro ");
                int isbnLibro = sc.nextInt();
                Libro libro = new Libro(nombreLibro, autorLibro, isbnLibro) ;
                sistema.registrarLibro(libro);
                break;
            case 2 : 
                System.out.println("Introducir el nombre del Usuario : ");
                String nombreUsuario = sc.nextLine();
                System.out.println("Introducir el apellido del Usuario : ");
                String apellidoUsuario= sc.nextLine();
                System.out.println("Introducir el dni del Usuario : ");
                int dniUsuario = sc.nextInt();
                Usuario usuario = new Usuario(nombreUsuario, apellidoUsuario, dniUsuario);
                sistema.registrarUsuario(usuario);
                break;
            case 3 :
                System.out.println("Saliendo del sistema");
                break;
            default:
                System.out.println("Opcion no valida , intente denuevo");
        }
    } while (numero !=3);

    sistema.mostrarUsuarios();
    sistema.mostrarLibros();

    do { 
    System.out.println("Bienvenido al sistema de prestamos");
    System.out.println("Elija una opción para continuar:");
    System.out.println("opción 1: Tomar prestado un libro");
    System.out.println("opción 2: Devolver un libro");
    System.out.println("opción 3: verificar disponibilidad de un libro");
    System.out.println("opción 4: salir");
    numero = sc.nextInt();
    sc.nextLine();

    switch (numero){
        case 1: 
            System.out.println("Ingrese su ISBN del libro");
            int isbnUsuario = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el dni del usuario que desea tomar prestado");
            int dniUsuario = sc.nextInt();
            sc.nextLine();
            Prestamo prestamo = new Prestamo(isbnUsuario, dniUsuario, LocalDate.now());
            sistema.registrarPrestamo(prestamo);
            break;

        case 2: 
            System.out.println("Ingrese su DNI");
            int dniPrestamista = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el ISBN del libro que desea devolver");
            int isbnLibroPrestamo = sc.nextInt();
            sc.nextLine();
            sistema.registrarDevolucion(dniPrestamista, isbnLibroPrestamo);
            break; 

        case 3:
            System.out.println("Ingrese el ISBN del libro que desea verificar");
            int isbnVerificar = sc.nextInt();
            sc.nextLine();
            sistema.verificarDisponibilidad(isbnVerificar);
            break;

        case 4:
            System.out.println("Saliendo del sistema de prestamos");
            break;

        default: 
            System.out.println("Opción no válida, intente de nuevo");
            break;
    }
} while (numero != 4); 

sistema.mostrarPrestamos();
sistema.mostrarLibros();
sistema.mostrarUsuarios();
sc.close();

    }
}
