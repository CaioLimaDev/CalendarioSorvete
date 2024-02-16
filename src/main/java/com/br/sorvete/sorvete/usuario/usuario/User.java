package com.br.sorvete.sorvete.usuario.usuario;


import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "FG_USUARIOS", schema = "dbp", catalog = "SORVETE")
public class User extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Integer id;
    @Column(name = "USER_NOME")
    private String nome;
    @Column(name = "USER_NASCIMENTO")
    private Date dtNascimento;
    @Column(name = "USER_STATUS", length = 1)
    private String status;
    @Column(name = "USER_CPF")
    private String cpf;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
