package com.br.sorvete.sorvete.usuario;

import com.br.sorvete.sorvete.usuario.usuario.User;
import com.br.sorvete.sorvete.usuario.usuario.UserDTO;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.Date;
import java.util.List;

@ApplicationScoped
public class UserServiceImpl implements UserService{

    @Inject
    UserRepository userRepository;
    @Override
    public List<UserDTO> buscarAniversariantes(Date mesAtual) {
        return userRepository.findByData(mesAtual);
    }
}
