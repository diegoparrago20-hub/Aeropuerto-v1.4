/*
 Equipo #2
 CONTRERAS RODRIGUEZ JANIS ISABEL
 LIRA DOMINGUEZ BRYANT 
 PARRA GONZALEZ DIEGO ALBERTO
 */
package back_end;
import java.util.Date;
import java.util.Objects;
/**
 *
 * @author coter
 */
public abstract class Persona {
    protected String CURP; //Atributo Primario
    protected String nombres;
    protected String apellidos;
    protected Date nacimiento;
    protected int peso;
    protected String genero;
    protected String estado;  
    protected String rutaImagen;

    public Persona() { //Constructor vacio
    }

    public Persona(String CURP, String nombres, String apellidos, Date nacimiento, int peso, String genero, String estado, String rutaImagen) {
        this.CURP = CURP;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.nacimiento = nacimiento;
        this.peso = peso;
        this.genero = genero;
        this.estado = estado;
        this.rutaImagen = rutaImagen;
    }

    public String getCURP() {
        return CURP;
    }

    public void setCURP(String CURP) {
        if (CURP == null || CURP.trim().isEmpty()) {
            throw new IllegalArgumentException("La CURP es obligatoria.");
        }
        String limpia = CURP.trim().toUpperCase();
        if (limpia.length() != 18) {
            throw new IllegalArgumentException("La CURP debe contener exactamente 18 caracteres.");
        }
        this.CURP = limpia;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        if (nombres == null || nombres.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre es obligatorio.");
        }
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        if (apellidos == null || apellidos.trim().isEmpty()) {
            throw new IllegalArgumentException("Los apellidos son obligatorios.");
        }
        this.apellidos = apellidos;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        if (nacimiento == null) {
            throw new IllegalArgumentException("La fecha de nacimiento no puede ser nula.");
        }
        this.nacimiento = nacimiento;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("El peso debe ser mayor a 0 kg.");
        }
        this.peso = peso;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        if (genero == null || genero.trim().isEmpty()) {
            throw new IllegalArgumentException("El género es obligatorio.");
        }
        this.genero = genero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if (estado == null || estado.trim().isEmpty()) {
            throw new IllegalArgumentException("El estado es obligatorio.");
        }
        this.estado = estado;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.CURP);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        return Objects.equals(this.CURP, other.CURP);
    }
// MÉTODOS POLIMÓRFICOS
    @Override
    public String toString() { // 1. Mostrar Información
    return "==========================================\n" +
           "          DETALLES DE LA PERSONA          \n" +
           "==========================================\n" +
           "• CURP              : " + CURP + "\n" +
           "• Nombre Completo   : " + nombres + " " + apellidos + "\n" +
           "• Fecha Nacimiento  : " + nacimiento + "\n" +
           "• Peso              : " + peso + " kg\n" +
           "• Género            : " + genero + "\n" +
           "• Estado            : " + estado + "\n" +
           "• Ruta de Imagen    : " + rutaImagen + "\n" +
           "==========================================";
    }
    public abstract String ejecutarAccion(); // 2. Realizar Acción

    public abstract double calcularCostoTotal();// 3. Calcular Resultado

    public abstract String determinarCategoria();// 4. Determinar Característica
    
    public void borrarDatos() {
        this.CURP = "";
        this.nombres = "";
        this.apellidos = "";
        this.nacimiento = new Date();
        this.peso = 0;
        this.genero = "";
        this.estado = "";
        this.rutaImagen = "";
    }
}//Final
