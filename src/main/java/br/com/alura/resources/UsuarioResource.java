package br.com.alura.resources;

import br.com.alura.model.Usuario;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/usuarios")
public class UsuarioResource {

    @POST
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    public void inserir(Usuario usuario) {
        Usuario.persist(usuario);
    }
}
