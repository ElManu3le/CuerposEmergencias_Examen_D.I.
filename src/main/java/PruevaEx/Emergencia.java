package PruevaEx;

public class Emergencia {

    private String idUnidad;

    private String idTrabajador;

    private String tipo_Ud;

    private String nombreTrabajador;

    private String provincia;

    public Emergencia(String idUnidad2, String idTrabajador2, String tipo_Ud, String nombreTrabajador, String provincia) {
        this.idUnidad = idUnidad2;
        this.idTrabajador = idTrabajador2;
        this.tipo_Ud = tipo_Ud;
        this.nombreTrabajador = nombreTrabajador;
        this.provincia = provincia;
    }

    public String getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(String idUnidad) {
        this.idUnidad = idUnidad;
    }

    public String getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(String idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public String getTipo_Ud() {
        return tipo_Ud;
    }

    public void setTipo_Ud(String tipo_Ud) {
        this.tipo_Ud = tipo_Ud;
    }

    public String getNombreTrabajador() {
        return nombreTrabajador;
    }

    public void setNombreTrabajador(String nombreTrabajador) {
        this.nombreTrabajador = nombreTrabajador;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Emergencia other = (Emergencia) obj;
        if (idTrabajador != other.idTrabajador)
            return false;
        if (idUnidad != other.idUnidad)
            return false;
        if (nombreTrabajador == null) {
            if (other.nombreTrabajador != null)
                return false;
        } else if (!nombreTrabajador.equals(other.nombreTrabajador))
            return false;
        if (provincia == null) {
            if (other.provincia != null)
                return false;
        } else if (!provincia.equals(other.provincia))
            return false;
        if (tipo_Ud == null) {
            if (other.tipo_Ud != null)
                return false;
        } else if (!tipo_Ud.equals(other.tipo_Ud))
            return false;
        return true;
    }

    // private ArrayList tipoUnidad;

}