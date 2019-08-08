/**
 * 
 */
package org.jboss.jaxrs.rest;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import model.Persona;

/**
 * @author chris
 * @date 8/08/2019 - 5:47:07 p. m.
 */
@RequestScoped
@Path("/hello")
@Produces({ "application/xml", "application/json" })
@Consumes({ "application/xml", "application/json" })
public class HelloWorldResource {
	
	@GET
	@Produces("text/xml")
	@Path("/personaX")
	public Persona getPersonaX() {
		Persona persona=new Persona();
		persona.setNombre("Christian");
		persona.setApellido("Chacon");
		return persona;
	}
	
	@GET
	@Produces("text/json")
	@Path("/personaJ")
	public Persona getPersonaJ() {
		Persona persona=new Persona();
		persona.setNombre("Christian");
		persona.setApellido("Chacon");
		return persona;
	}
	
}
