/*
 Equipo #2
 CONTRERAS RODRIGUEZ JANIS ISABEL
 LIRA DOMINGUEZ BRYANT 
 PARRA GONZALEZ DIEGO ALBERTO
 */
package back_end;
import java.util.Objects;
/**
 *
 * @author coter
 */
public class Avion {
    private String noMatricula; //primario
    private String estado;
    private String rutaImagen;
    private String modelo;
    private int capacidad;

    public Avion() {//C vacio
    }

    public Avion(String noMatricula, String estado, String rutaImagen, String modelo, int capacidad) {
        this.noMatricula = noMatricula;
        this.estado = estado;
        this.rutaImagen = rutaImagen;
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public String getNoMatricula() {
        return noMatricula;
    }

    public void setNoMatricula(String noMatricula) {
        if (noMatricula == null || noMatricula.trim().isEmpty()) {
            throw new IllegalArgumentException("La matrícula del avión es obligatoria.");
        }
        this.noMatricula = noMatricula;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if (estado == null || estado.trim().isEmpty()) {
            throw new IllegalArgumentException("El estado no puede estar vacío.");
        }
        this.estado = estado;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        if (rutaImagen == null || rutaImagen.trim().isEmpty()) {
            throw new IllegalArgumentException("La ruta de la imagen no puede estar vacía.");
        }
        this.rutaImagen = rutaImagen;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty()) {
            throw new IllegalArgumentException("El modelo del avión es obligatorio.");
        }
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        if (capacidad <= 0) {
            throw new IllegalArgumentException("La capacidad debe ser mayor a 0 pasajeros.");
        }
        this.capacidad = capacidad;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.noMatricula);
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
        final Avion other = (Avion) obj;
        return Objects.equals(this.noMatricula, other.noMatricula);
    }

    @Override
    public String toString() {
        return "==========================================\n" +
           "           DETALLES DEL AVIÓN             \n" +
           "==========================================\n" +
           "• Matrícula         : " + noMatricula + "\n" +
           "• Modelo            : " + modelo + "\n" +
           "• Capacidad         : " + capacidad + " pasajeros\n" +
           "• Estado            : " + estado + "\n" +
           "• Ruta de Imagen    : " + rutaImagen + "\n" +
           "==========================================";
    }
    public void borrarDatos() {
        this.noMatricula = "";
        this.modelo = "";
        this.capacidad = 0;
        this.estado = "";
        this.rutaImagen = "";
    }
}//Fial
