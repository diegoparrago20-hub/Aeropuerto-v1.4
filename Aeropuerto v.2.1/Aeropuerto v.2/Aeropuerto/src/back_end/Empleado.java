/*
 Equipo #2
 CONTRERAS RODRIGUEZ JANIS ISABEL
 LIRA DOMINGUEZ BRYANT 
 PARRA GONZALEZ DIEGO ALBERTO
 */
package back_end;
import java.util.Date;
/**
 *
 * @author coter
 */
public class Empleado extends Persona{
    protected String codigo;
    protected String areaTrabajo;
    protected double sueldo;
    protected String turno;

    public Empleado() {
    }

    public Empleado(String codigo, String areaTrabajo, double sueldo, String turno, String CURP, String nombres, String apellidos, Date nacimiento, int peso, String genero, String estado, String rutaImagen) {
        super(CURP, nombres, apellidos, nacimiento, peso, genero, estado, rutaImagen);
        this.codigo = codigo;
        this.areaTrabajo = areaTrabajo;
        this.sueldo = sueldo;
        this.turno = turno;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("El código de empleado es obligatorio.");
        }
        this.codigo = codigo;
    }

    public String getAreaTrabajo() {
        return areaTrabajo;
    }

    public void setAreaTrabajo(String areaTrabajo) {
        if (areaTrabajo == null || areaTrabajo.trim().isEmpty()) {
            throw new IllegalArgumentException("El área de trabajo es obligatoria.");
        }
        this.areaTrabajo = areaTrabajo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        if (sueldo <= 0) {
            throw new IllegalArgumentException("El sueldo debe ser mayor a $0.0.");
        }
        this.sueldo = sueldo;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        if (turno == null || turno.trim().isEmpty()) {
            throw new IllegalArgumentException("El turno es obligatorio.");
        }
        this.turno = turno;
    }
// IMPLEMENTACIÓN BASE DE LOS 4 MÉTODOS POLIMÓRFICOS (@Override)
    @Override
    public String toString() {// 1. Mostrar información
        return "==========================================\n" +
               "          DETALLES DEL EMPLEADO           \n" +
               "==========================================\n" +
               "• Código Empleado   : " + codigo + "\n" +
               "• Área de Trabajo   : " + areaTrabajo + "\n" +
               "• Sueldo            : $" + String.format("%.2f", sueldo) + "\n" +
               "• Turno             : " + turno + "\n" +
               "------------------------------------------\n" +
               "          DATOS PERSONALES                \n" +
               "------------------------------------------\n" +
               "• CURP              : " + getCURP() + "\n" +
               "• Nombre Completo   : " + getNombres() + " " + getApellidos() + "\n" +
               "• Fecha Nacimiento  : " + getNacimiento() + "\n" +
               "• Peso              : " + getPeso() + " kg\n" +
               "• Género            : " + getGenero() + "\n" +
               "• Estado            : " + getEstado() + "\n" +
               "• Ruta de Imagen    : " + getRutaImagen() + "\n" +
               "==========================================";
    }
    
    @Override
    public String ejecutarAccion() {// 2. Realizar una acción
        return "El empleado " + getNombres() + " " + getApellidos() + 
               " está registrando su asistencia en el área de " + areaTrabajo + ".";
    }

    @Override // 3. Calcular un resultado (Calcula sueldo con bono por turno nocturno)
    public double calcularCostoTotal() {
        double bonoTurno = "NOCTURNO".equalsIgnoreCase(turno) ? sueldo * 0.15 : 0.0;
        return sueldo + bonoTurno;
    }

    @Override
    public String determinarCategoria() { // 4. Determinar una característica
        if (sueldo >= 25000) {
            return "Personal Operativo Senior";
        }
        return "Personal Operativo Junior";
    }
    
    @Override
    public void borrarDatos() {
        super.borrarDatos(); // Limpia los 8 campos de Persona
        this.codigo = ""; // Limpia lo propio
        this.areaTrabajo = "";
        this.sueldo = 0;
        this.turno = "";
    }
}//Final
