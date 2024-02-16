package com.br.sorvete.sorvete.usuario;

import com.br.sorvete.sorvete.usuario.usuario.User;
import javax.persistence.EntityManager;

import com.br.sorvete.sorvete.usuario.usuario.UserDTO;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.PersistenceContext;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@ApplicationScoped
public class UserRepository implements PanacheRepositoryBase<UserDTO,Integer> {
    @PersistenceContext
    private EntityManager entityManager;
    public List<UserDTO> findByData(Date mesAtual) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(mesAtual);
        int mes = calendar.get(Calendar.MONTH) + 1; // JPA considera os meses de 1 a 12

        return entityManager.createNativeQuery("SELECT * FROM User WHERE MONTH(dtNascimento) = :mes", User.class)
                .setParameter("mes", mes)
                .getResultList();
    }
}
