
import java.util.ArrayList;

public class Sistema {
    private ArrayList<Doctores> doctores;
    private ArrayList<Pacientes> pacientes;
    private ArrayList<Citas> citas;
    public Sistema() {
        this.doctores = new ArrayList<>();
        this.pacientes = new ArrayList<>();
        this.citas = new ArrayList<>();
    }
    public void registrarDoctor(Doctores doctor) {
        doctores.add(doctor);
    }

    public void registrarPaciente(Pacientes paciente) {
        pacientes.add(paciente);
    }

    public void registrarCita(Citas cita) {
        citas.add(cita);
    }
    public void mostrarDoctores() {
        for (Doctores doctor : doctores) {
            doctor.mostrarInformacion();
        }
    }
    public void mostrarPacientes() {
        for (Pacientes paciente : pacientes) {
            paciente.mostrarInformacion();
        }
    }
    public void mostrarCitas(){
        for(Citas cita : citas) {
            cita.mostrarInformacion();
        }
    }
}