create sequence seq_usuario;

create table usuario (
    usuarioid BIGINT,
    nome VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL,
    senha VARCHAR(150) NOT NULL,
    constraint pk_usuario primary key(usuarioid)
);

create sequence seq_permissao;

create table permissao(
    permissaoid bigint,
    descricao VARCHAR(50) NOT NULL,
    constraint pkpermissao PRIMARY KEY (permissaoid)
);

create sequence seqpermissaousuario;

create table permissaousuario(
    permissaousuarioid BIGINT,
    permissaoid BIGINT,
    usuarioid BIGINT,
    constraint pkpermissaousuario PRIMARY KEY (permissaousuarioid),
    constraint fkpermissaousuario_usuario FOREIGN KEY (usuarioid) REFERENCES usuario(usuarioid),
    constraint fkpermissaousuario_permissao FOREIGN KEY (permissaoid) REFERENCES permissao(permissaoid)
);
