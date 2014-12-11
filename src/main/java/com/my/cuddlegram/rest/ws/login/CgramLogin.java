/**
 * 
 */
package com.my.cuddlegram.rest.ws.login;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

/**
 * @author c0naivi
 *
 */
@Path("/login")
public class CgramLogin {

	@POST
	@Produces(MediaType.TEXT_HTML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String newTodo(@FormParam("username") String username,
			@FormParam("password") String password,
			@Context HttpServletResponse servletResponse) throws IOException {
			return "Success";
	}

}
