package contactos;

/**
 * Clase que modela los datos de un contacto
 *
 * @author agonzalez
 */
public class Contactos {

    /** Nombre del contacto. */
    private String nombre;
    /** Telefono del contacto. */
    private String telefono;
    /** Dirección del contacto. */
    private String direccion;
    /** Identificación del contacto. */
    private String identificacion;

    /**
     * Obtiene el nombre
     * 
     * @return nombre Nombre del contacto.
     */
    public String getNombre() {
        return (this.nombre);
    }

    /**
     * Establece el Nombre del contacto.
     * 
     * @param nombre Nombre del contacto.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el Telefono del contacto.
     * 
     * @return telefono Telefono del contacto.
     */
    public String getTelefono() {
        return (this.telefono);
    }

    /**
     * Establece el Telefono del contacto.
     * 
     * @param telefono Telefono del contacto.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene la Dirección del contacto.
     * 
     * @return direccion Dirección del contacto.
     */
    public String getDireccion() {
        return (this.direccion);
    }

    /**
     * Establece la Dirección del contacto.
     * 
     * @param direccion Dirección del contacto.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Obtiene la Identificación del contacto.
     * 
     * @return identificacion Identificación del contacto.
     */
    public String getIdentificacion() {
        return (this.identificacion);
    }

    /**
     * Establece la Identificación del contacto.
     * 
     * @param identificacion Identificación del contacto.
     */
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
}
