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
public class Boleto {
    private String noTicket;//A primario
    private String estado;
    private String rutaImagen;
    private String clase;
    private double precio;

    public Boleto() {// C vacio
    }

    public Boleto(String noTicket, String estado, String rutaImagen, String clase, double precio) {
        this.noTicket = noTicket;
        this.estado = estado;
        this.rutaImagen = rutaImagen;
        this.clase = clase;
        this.precio = precio;
    }

    public String getNoTicket() {
        return noTicket;
    }

    public void setNoTicket(String noTicket) {
        if (noTicket == null || noTicket.trim().isEmpty()) {
            throw new IllegalArgumentException("El número de ticket es obligatorio.");
        }
        this.noTicket = noTicket;
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

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        if (clase == null || clase.trim().isEmpty()) {
            throw new IllegalArgumentException("La clase del boleto es obligatoria.");
        }
        this.clase = clase;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio <= 0) {
            throw new IllegalArgumentException("El precio del boleto debe ser mayor a $0.0.");
        }
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.noTicket);
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
        final Boleto other = (Boleto) obj;
        return Objects.equals(this.noTicket, other.noTicket);
    }

    @Override
    public String toString() {
        return "==========================================\n" +
           "          DETALLES DEL BOLETO             \n" +
           "==========================================\n" +
           "• Número de Ticket  : " + noTicket + "\n" +
           "• Clase             : " + clase + "\n" +
           "• Precio            : $" + String.format("%.2f", precio) + "\n" +
           "• Estado            : " + estado + "\n" +
           "• Ruta de Imagen    : " + rutaImagen + "\n" +
           "==========================================";
    }
    public void borrarDatos() {
        this.noTicket = "";
        this.clase = "";
        this.precio = 0.0;
        this.estado = "";
        this.rutaImagen = "";
    }
}//Final
