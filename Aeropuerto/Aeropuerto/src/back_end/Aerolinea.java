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
public class Aerolinea {
   private String codigoIATA;// primario
    private String estado;
    private String rutaImagen;
    private String nombreComercial;
    private String paisOrigen;

    public Aerolinea() {//c vacio
    }

    public Aerolinea(String codigoIATA, String estado, String rutaImagen, String nombreComercial, String paisOrigen) {
        this.codigoIATA = codigoIATA;
        this.estado = estado;
        this.rutaImagen = rutaImagen;
        this.nombreComercial = nombreComercial;
        this.paisOrigen = paisOrigen;
    }

    public String getCodigoIATA() {
        return codigoIATA;
    }

    public void setCodigoIATA(String codigoIATA) {
        if (codigoIATA == null || codigoIATA.trim().isEmpty()) {
            throw new IllegalArgumentException("El código IATA no puede estar vacío.");
        }
        String limpio = codigoIATA.trim().toUpperCase();
        if (limpio.length() < 2 || limpio.length() > 3) {
            throw new IllegalArgumentException("El código IATA debe tener 2 o 3 letras.");
        }
        this.codigoIATA = limpio;
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
            throw new IllegalArgumentException("La ruta de imagen no puede estar vacía.");
        }
        this.rutaImagen = rutaImagen;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        if (nombreComercial == null || nombreComercial.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre comercial es obligatorio.");
        }
        this.nombreComercial = nombreComercial;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        if (paisOrigen == null || paisOrigen.trim().isEmpty()) {
            throw new IllegalArgumentException("El país de origen es obligatorio.");
        }
        this.paisOrigen = paisOrigen;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.codigoIATA);
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
        final Aerolinea other = (Aerolinea) obj;
        return Objects.equals(this.codigoIATA, other.codigoIATA);
    }

    @Override
    public String toString() {
        return "==========================================\n" +
           "         DETALLES DE LA AEROLÍNEA         \n" +
           "==========================================\n" +
           "• Código IATA       : " + codigoIATA + "\n" +
           "• Nombre Comercial  : " + nombreComercial + "\n" +
           "• País de Origen    : " + paisOrigen + "\n" +
           "• Estado            : " + estado + "\n" +
           "• Ruta de Imagen    : " + rutaImagen + "\n" +
           "==========================================";
    }
    public void borrarDatos() {
        this.codigoIATA = "";
        this.nombreComercial = "";
        this.paisOrigen = "";
        this.estado = "";
        this.rutaImagen = "";
    }
}//final
