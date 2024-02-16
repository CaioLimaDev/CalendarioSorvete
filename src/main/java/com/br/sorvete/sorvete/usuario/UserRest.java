package com.br.sorvete.sorvete.usuario;

import com.br.sorvete.sorvete.usuario.usuario.User;
import com.br.sorvete.sorvete.usuario.usuario.UserDTO;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Date;
import java.util.List;

@Path("/aniversario")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserRest {
    @Inject
    UserService userService;

    @GET
    @Path("/")
    public Response buscarAniversariantes(@BeanParam Date mesAtual){
        List<UserDTO> userDTO = userService.buscarAniversariantes(mesAtual);
        return Response.ok(userDTO).build();
    }


}
