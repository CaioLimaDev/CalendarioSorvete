package com.br.sorvete.sorvete.usuario;

import com.br.sorvete.sorvete.usuario.usuario.User;
import com.br.sorvete.sorvete.usuario.usuario.UserDTO;

import java.util.Date;
import java.util.List;

public interface UserService {

    public List<UserDTO> buscarAniversariantes (Date mesAtual);
}
