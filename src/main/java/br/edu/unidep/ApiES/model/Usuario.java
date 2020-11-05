package br.edu.unidep.ApiES.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Table
@Entity
@Getter
@Setter
public class Usuario {

    @Id
    @Column(name = "usuarioid")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_usuario")
    @SequenceGenerator(name = "seq_usuario", sequenceName = "seq_usuario", allocationSize = 1)
    private Long id;

    private String nome;

    private String email;

    private String senha;

    @ManyToMany
    @JoinTable(
            name = "permissaousuario",
            joinColumns = @JoinColumn(name = "usuarioid"),
            inverseJoinColumns = @JoinColumn(name = "permissaoid")
    )
    private List<Permissao> permissoes;

}
