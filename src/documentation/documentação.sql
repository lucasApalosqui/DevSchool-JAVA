CREATE TABLE public.cad_cliente (
	id serial(6) NOT NULL PRIMARY KEY,
	nome varchar(50) NOT NULL,
	telefone numeric(11) NOT NULL,
	email varchar(40) NOT NULL,
	cpf varchar(14) NOT NULL,
	id_endereco serial NOT NULL,
	CONSTRAINT cad_cliente_pk PRIMARY KEY (id),
	CONSTRAINT cad_cliente_un UNIQUE (email),
	CONSTRAINT cad_cliente_fk FOREIGN KEY (id_endereco) REFERENCES public.cad_endereco(id_endereco)
);

CREATE TABLE public.cad_endereco (
	id_endereco serial(6) NOT NULL,
	logradouro varchar(50) NOT NULL,
	numero int4 NULL,
	bairro varchar(40) NOT NULL,
	cidade varchar(40) NOT NULL,
	estado varchar(2) NOT NULL,
	id_complemento serial NOT NULL,
	CONSTRAINT cad_endereco_pk PRIMARY KEY (id_endereco),
	CONSTRAINT cad_endereco_fk FOREIGN KEY (id_complemento) REFERENCES public.endereco_complemento(id_complemento)
);

CREATE TABLE public.endereco_complemento (
	id_complemento serial(4) NOT NULL,
	apartamento numeric(10) NOT NULL,
	bloco varchar(10) NULL,
	CONSTRAINT endereco_complemento_pk PRIMARY KEY (id_complemento)
);


