package br.edu.unidep.ApiES.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "permissaousuario")
@Getter @Setter
public class UsuarioPermissao {

    @Id
    @Column(name = "permissaousuarioid")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_permissaousuario")
    @SequenceGenerator(name = "seq_permissaousuario", sequenceName = "seq_permissaousuario", allocationSize = 1)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuarioid", insertable = false, updatable = false)
    @JsonIgnore
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "usuarioid", insertable = false, updatable = false)
    private Permissao permissao;
}
