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
public class Vuelo {
    private String codigoVuelo;// primario
    private String origen;
    private String destino;
    private String horaSalida;
    private String estado;
    private String rutaImagen;

    public Vuelo() {//c vacio
    }

    public Vuelo(String codigoVuelo, String origen, String destino, String horaSalida, String estado, String rutaImagen) {
        this.codigoVuelo = codigoVuelo;
        this.origen = origen;
        this.destino = destino;
        this.horaSalida = horaSalida;
        setEstado(estado);
        setRutaImagen(rutaImagen);
    }

    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public void setCodigoVuelo(String codigoVuelo) {
        if (codigoVuelo == null || codigoVuelo.trim().isEmpty()) {
            throw new IllegalArgumentException("El código de vuelo es obligatorio.");
        }
        this.codigoVuelo = codigoVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        if (origen == null || origen.trim().isEmpty()) {
            throw new IllegalArgumentException("El origen es obligatorio.");
        }
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        if (destino == null || destino.trim().isEmpty()) {
            throw new IllegalArgumentException("El destino es obligatorio.");
        }
        this.destino = destino;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        if (horaSalida == null || horaSalida.trim().isEmpty()) {
            throw new IllegalArgumentException("La hora de salida es obligatoria.");
        }
        this.horaSalida = horaSalida;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if (estado == null || estado.trim().isEmpty()) {
            throw new IllegalArgumentException("El estado del vuelo es obligatorio.");
        }
        this.estado = estado.trim();
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = (rutaImagen != null) ? rutaImagen.trim() : "";
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.codigoVuelo);
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
        final Vuelo other = (Vuelo) obj;
        return Objects.equals(this.codigoVuelo, other.codigoVuelo);
    }

    @Override
    public String toString() {
        return "==========================================\n" +
           "            DETALLES DEL VUELO            \n" +
           "==========================================\n" +
           "• Número de Vuelo   : " + codigoVuelo + "\n" +
           "• Origen            : " + origen + "\n" +
           "• Destino           : " + destino + "\n" +
           "• Hora de Salida     : " + horaSalida + "\n" +     
           "• Estado            : " + estado + "\n" +
           "• Ruta de Imagen    : " + rutaImagen + "\n" +
           "==========================================";
    }
 
    public void borrarDatos() {
        this.codigoVuelo = "";
        this.origen = "";
        this.destino = "";
        this.horaSalida = null;
        this.estado = "";
        this.rutaImagen = "";
    }
}//Final
