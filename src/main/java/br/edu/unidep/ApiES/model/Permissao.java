package br.edu.unidep.ApiES.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table
@Entity
@Getter @Setter
public class Permissao {

    @Id
    @Column(name = "permissaoid")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_permissao")
    @SequenceGenerator(name = "seq_permissao", sequenceName = "seq_permissao", allocationSize = 1)
    private Long id;

    private String descricao;
}
