
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema(); 
        Scanner sc = new Scanner(System.in);

        int numero ;
        
        do { 
            System.out.println("Bienvenido al sistema de Registros del Hospital X");
            System.out.println("Elija una opcion para comenzar");
            System.out.println("opcion 1 : Registrar Doctores");
            System.out.println("opcion 2 : Registrar Pacientes");
            System.out.println("opcion 3 : Salir");
            numero=sc.nextInt();
            sc.nextLine();

        switch (numero) {
            case 1 :
                System.out.println("Introducir el nombre del Doctor : ");
                String nombreDoctor=sc.nextLine();
                System.out.println("Introducir el codigo del Doctor : ");
                int codigoDoctor = sc.nextInt();
                sc.nextLine();
                System.out.println("Introducir la especialidad del Doctor : ");
                String especialidadDoctor = sc.nextLine();
                System.out.println("Introducir el horario de atencion del Doctor : ");
                String atencionDoctor = sc.nextLine();

                Doctores doctor = new Doctores(nombreDoctor, codigoDoctor, especialidadDoctor, atencionDoctor);
                sistema.registrarDoctor(doctor);
                break;
            case 2 :
                System.out.println("Introducir el nombre del Paciente :");
                String nombrePaciente = sc.nextLine();
                System.out.println("Introducir el codigo del Paciente :");
                int codigoPaciente = sc.nextInt();
                System.out.println("Introducir la edad del Paciente : ");
                int edadPaciente =sc.nextInt();
                System.out.println("Introducir el dni del Paciente : ");
                int dniPacciente = sc.nextInt();

                Pacientes paciente = new Pacientes(codigoPaciente, dniPacciente, edadPaciente, nombrePaciente);
                sistema.registrarPaciente(paciente);
                break;
            case 3 :
                System.out.println("Saliendo del sistema");
                break;
            default:
                System.out.println("Opcion no valida , intente denuevo");
        }
        } while (numero!=3);

    }
}
