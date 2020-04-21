create table funcionario(
    id_funcionario bigint auto_incriment,
    nome varchar(100) not null,
    salario double not null,
    rg int not null,
    primary key(id_funcionario));