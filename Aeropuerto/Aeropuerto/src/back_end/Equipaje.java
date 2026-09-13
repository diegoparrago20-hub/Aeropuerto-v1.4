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
public class Equipaje {
    private String codEtiqueta;// primario
    private String estado;
    private String rutaImagen;
    private double peso;
    private boolean fragil;

    public Equipaje() {//C vacio
    }

    public Equipaje(String codEtiqueta, String estado, String rutaImagen, double peso, boolean fragil) {
        this.codEtiqueta = codEtiqueta;
        this.estado = estado;
        this.rutaImagen = rutaImagen;
        this.peso = peso;
        this.fragil = fragil;
    }

    public String getCodEtiqueta() {
        return codEtiqueta;
    }

    public void setCodEtiqueta(String codEtiqueta) {
        if (codEtiqueta == null || codEtiqueta.trim().isEmpty()) {
            throw new IllegalArgumentException("El código de etiqueta del equipaje es obligatorio.");
        }
        this.codEtiqueta = codEtiqueta;
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("El peso del equipaje debe ser mayor a 0.0 kg.");
        }
        this.peso = peso;
    }

    public boolean isFragil() {
        return fragil;
    }

    public void setFragil(boolean fragil) {
        this.fragil = fragil;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.codEtiqueta);
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
        final Equipaje other = (Equipaje) obj;
        return Objects.equals(this.codEtiqueta, other.codEtiqueta);
    }

    @Override
    public String toString() {
        return "==========================================\n" +
           "         DETALLES DEL EQUIPAJE            \n" +
           "==========================================\n" +
           "• Código de Etiqueta : " + codEtiqueta + "\n" +
           "• Peso              : " + peso + " kg\n" +
           "• ¿Es Frágil?       : " + (fragil ? "Sí" : "No") + "\n" +
           "• Estado            : " + estado + "\n" +
           "• Ruta de Imagen    : " + rutaImagen + "\n" +
           "==========================================";
    }
    public void borrarDatos() {
        this.codEtiqueta = "";
        this.peso = 0.0;
        this.fragil = false;
        this.estado = "";
        this.rutaImagen = "";
    }
}//final
