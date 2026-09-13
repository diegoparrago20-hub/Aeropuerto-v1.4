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
public final class Piloto extends Empleado {
    private String noLicencia; // A primario 
    private int horasVuelo;

    public Piloto() {// constructor vacio
    }

    public Piloto(String noLicencia, int horasVuelo,String codigo, String areaTrabajo, double sueldo, String turno,String CURP, String nombres, String apellidos, Date nacimiento, int peso, String genero, String estado, String rutaImagen) {
        super(codigo, areaTrabajo, sueldo, turno, CURP, nombres, apellidos, nacimiento, peso, genero, estado, rutaImagen);
        this.noLicencia = noLicencia;
        this.horasVuelo = horasVuelo;
    }

    public String getNoLicencia() {
        return noLicencia;
    }

    public void setNoLicencia(String noLicencia) {
        if (noLicencia == null || noLicencia.trim().isEmpty()) {
            throw new IllegalArgumentException("La licencia de piloto es obligatoria.");
        }
        this.noLicencia = noLicencia;
    }

    public int getHorasVuelo() {
        return horasVuelo;
    }

    public void setHorasVuelo(int horasVuelo) {
        if (horasVuelo < 0) {
            throw new IllegalArgumentException("Las horas de vuelo no pueden ser negativas.");
        }
        this.horasVuelo = horasVuelo;
    }
// IMPLEMENTACIÓN DE LOS 4 MÉTODOS POLIMÓRFICOS (@Override)
    @Override
    public String toString() { // 1. Mostrar información
        return "==========================================\n" +
               "           DETALLES DEL PILOTO            \n" +
               "==========================================\n" +
               "• Núm. Licencia     : " + noLicencia + "\n" +
               "• Horas de Vuelo    : " + horasVuelo + " hrs\n" +
               "------------------------------------------\n" +
               "          DATOS DE EMPLEADO               \n" +
               "------------------------------------------\n" +
               "• Código Empleado   : " + getCodigo() + "\n" +
               "• Área de Trabajo   : " + getAreaTrabajo() + "\n" +
               "• Sueldo Base       : $" + String.format("%.2f", getSueldo()) + "\n" +
               "• Turno             : " + getTurno() + "\n" +
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
        return "El piloto " + getNombres() + " " + getApellidos() + 
               " (Licencia: " + noLicencia + ") está realizando el checklist pre-vuelo en la cabina de mando.";
    }
   
    @Override // 3. Calcular un resultado (Sueldo base + bono de $45.00 por hora de vuelo)
    public double calcularCostoTotal() {
        double bonoHoras = horasVuelo * 45.0;
        return super.calcularCostoTotal() + bonoHoras;
    }
    
    @Override
    public String determinarCategoria() {// 4. Determinar una característica
        if (horasVuelo >= 1500) {
            return "Capitán Comandante (Senior)";
        } else if (horasVuelo >= 500) {
            return "Primer Oficial (Intermedio)";
        }
        return "Piloto Copiloto en Formación";
    }
    
    @Override
    public void borrarDatos() {
        super.borrarDatos(); // Limpia los 8 campos de Persona
        this.noLicencia = ""; // Limpia lo propio de Pasajero
        this.horasVuelo = 0;
    }
}//Final
