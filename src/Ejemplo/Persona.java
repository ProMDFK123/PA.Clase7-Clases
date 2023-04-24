/**
 * Clase persona
 */
package Ejemplo;

public class Persona {
    /**
     * Atributos de un objeto
     */
    private String nombre;
    private String rut;
    private String email;

    /**
     * Constructor de objetos
     * @param nombre
     * @param rut
     * @param email
     */
    public Persona(String nombre, String rut, String email) {
        this.nombre = nombre;
        this.rut = rut;
        this.email = email;
    }

    /**
     * Get's y set's de cada atributo
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
