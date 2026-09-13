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
public final class Pasajero extends Persona{
    private String noPasaporte;//primario
    private String asiento;
    private String nacionalidad;
    
    public Pasajero() {//Constrcutor vacio 
    }

    public Pasajero(String noPasaporte,String asiento,String nacionalidad, String CURP, String nombres, String apellidos, Date nacimiento, int peso, String genero, String estado, String rutaImagen) {
        super(CURP, nombres, apellidos, nacimiento, peso, genero, estado, rutaImagen);
        this.noPasaporte = noPasaporte;
        this.asiento = asiento;
        this.nacionalidad = nacionalidad;
    }

    public String getNoPasaporte() {
        return noPasaporte;
    }

    public void setNoPasaporte(String noPasaporte) {
        if (noPasaporte == null || noPasaporte.trim().isEmpty()) {
            throw new IllegalArgumentException("El número de pasaporte es obligatorio.");
        }
        this.noPasaporte = noPasaporte;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        if (asiento == null || asiento.trim().isEmpty()) {
            throw new IllegalArgumentException("El número de asiento es obligatorio.");
        }
        this.asiento = asiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        if (nacionalidad == null || nacionalidad.trim().isEmpty()) {
            throw new IllegalArgumentException("La nacionalidad es obligatoria.");
        }
        this.nacionalidad = nacionalidad;
    }
// IMPLEMENTACIÓN DE LOS 4 MÉTODOS POLIMÓRFICOS (@Override)
    @Override
    public String toString() {// 1. Mostrar información
        return "==========================================\n" +
               "          DETALLES DEL PASAJERO           \n" +
               "==========================================\n" +
               "• Núm. Pasaporte    : " + noPasaporte + "\n" +
               "• Nacionalidad      : " + nacionalidad + "\n" +
               "• Asiento Asignado  : " + asiento + "\n" +
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
        return "El pasajero " + getNombres() + " " + getApellidos() + 
               " (Pasaporte: " + noPasaporte + ") está cruzando la revisión de seguridad hacia el asiento " + asiento + ".";
    }
   
    @Override
    public double calcularCostoTotal() { // 3. Calcular un resultado
        double tarifaBase = 1500.0;
        double tua = 450.0; // Tarifa de Uso Aeroportuario
        // Recargo si es de nacionalidad extranjera (ejemplo de lógica de negocio)
        double recargoInternacional = (!"MEXICANA".equalsIgnoreCase(nacionalidad)) ? 600.0 : 0.0;
        return tarifaBase + tua + recargoInternacional;
    }

    @Override
    public String determinarCategoria() {// 4. Determinar una característica
        if (asiento == null || asiento.isEmpty()) {
            return "Sin Asiento Asignado";
        }
        // Asientos de fila 1 a 5 se consideran VIP / Primera Clase
        if (asiento.startsWith("1") || asiento.startsWith("2") || asiento.startsWith("3")) {
            return "Pasajero VIP / Primera Clase";
        } else if (asiento.startsWith("4") || asiento.startsWith("5")) {
            return "Pasajero Preferente";
        }
        return "Pasajero Clase Turista";
    }
    
    @Override
    public void borrarDatos() {
        super.borrarDatos(); // Limpia los 8 campos de Persona
        this.noPasaporte = ""; // Limpia de Pasajero
        this.asiento = "";
        this.nacionalidad = "";
    }
    
}//Final
