#criando banco de dados 
create database db_ministerio_ads;
use db_ministerio_ads;

create table tb_membro(
id bigint auto_increment,
nome char(255) not null,
idade int not null,
congregacao varchar(255) not null,
registrio double not null,
cargo varchar(255) not null,
primary key (id)
);

select * from tb_membro;

insert into tb_membro(nome,idade,congregacao,registrio,cargo) 
value("Henrique",68,"Boston - MA",0123,"Pastor Presidente");

insert into tb_membro(nome,idade,congregacao,registrio,cargo) 
value("Maria Eliege",60,"Boston - MA",0234,"Vice Pastora Presidente");

insert into tb_membro(nome,idade,congregacao,registrio,cargo) 
value("Allan Danilo",40,"São Vicente - PB",0345,"Vice Pastor Presidente - BR");

insert into tb_membro(nome,idade,congregacao,registrio,cargo) 
value("Débora Eliege",38,"São Vicente - PB",0456,"Pastora");

insert into tb_membro(nome,idade,congregacao,registrio,cargo) 
value("Leandro Medeiros",38,"São vicente - PB",0567,"Evangelista");

select * from tb_membro where registrio > 300;
select * from tb_membro where registrio <300;

update tb_membro set nome = "Elizama" where id = 3;

