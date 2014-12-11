package com.my.cuddlegram.rest.ws.jaxb;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.my.cuddlegram.rest.ws.jaxb.todo.model.Todo;

@Path("/todo")
public class TodoResource {
	// This method is called if XMLis request
	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Todo getXML() {
		Todo todo = new Todo();
		todo.setSummary("This is my first todo client xml");
		todo.setDescription("This is my first todo xml");
		return todo;
	}

	// This can be used to test the integration with the browser
	@GET
	@Produces({ MediaType.TEXT_XML })
	public Todo getHTML() {
		Todo todo = new Todo();
		todo.setSummary("This is my first todo html");
		todo.setDescription("This is my first todo html");
		return todo;
	}

}