/**
 * 
 */
package model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author chris
 * @date 8/08/2019 - 5:50:59 p. m.
 */
@XmlRootElement
public class Persona {
	
	private String nombre;
	private String apellido;
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
}
