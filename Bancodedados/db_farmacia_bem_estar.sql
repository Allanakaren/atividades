create database db_farmacia_bem_estar;
use db_farmacia_bem_estar;


create table tb_categorias(
id bigint auto_increment,
marca varchar(255) not null,
bula varchar(1000) not null,
primary key (id)
);

create table tb_produtos(
id bigint auto_increment,
tipo varchar(255) not null,
validade varchar(255) not null,
embalagem varchar(255) not null,
valor double not null,
id_categoria bigint,
primary key(id),
foreign key(id_categoria) references tb_categorias(id)
);

#dados da tabela classe


insert into tb_categorias(marca,bula) 
values("DIPIRONA","Metamizol ou dipirona é um medicamento ainda utilizado principalmente como analgésico e antipirético");
 
 insert into tb_categorias(marca,bula) 
values("DORFLEX","A orfenadrina é um fármaco anticolinérgico relaxante muscular, com baixa atividade anti-histamínica.");
 
 insert into tb_categorias(marca,bula) 
values("IBUPROFENO","Ibuprofeno, nome que deriva das iniciais do ácido isobutilpropanoicofenólico, 
é um fármaco do grupo dos anti-inflamatórios não esteróides utilizado para o tratamento da dor, febre e inflamação.");
 
 insert into tb_categorias(marca,bula) 
values("BUSCOPAN","Buscopan® relaxa os espasmos musculares dos órgãos abdominais 
agindo somente onde ocorrem dores e cólicas - no abdômen.");
 
 insert into tb_categorias(marca,bula) 
values("POSTAN","O ácido mefenâmico é um fármaco do grupo dos anti-inflamatórios
 não esteroides usado para tratar a dor, inclusive a dor menstrual. ");
 
 select * from tb_categorias;
 select * from tb_produtos;
 
insert into tb_produtos(tipo,validade,embalagem,valor,id_categoria) values('comprimido','23/04/22','ampola',10.00,1);
insert into tb_produtos(tipo,validade,embalagem,valor,id_categoria) values('liquido','22/04/22','fasco',5.00,2);
insert into tb_produtos(tipo,validade,embalagem,valor,id_categoria) values('comprimido','25/04/22','blister',15.00,3);
insert into tb_produtos(tipo,validade,embalagem,valor,id_categoria) values('liquido','26/04/22','bisnaga',20.00,4);
insert into tb_produtos(tipo,validade,embalagem,valor,id_categoria) values('comprimido','27/04/22','seringa',25.00,5);
insert into tb_produtos(tipo,validade,embalagem,valor,id_categoria) values('liquido','28/04/22','fasco',9.00,1);
insert into tb_produtos(tipo,validade,embalagem,valor,id_categoria) values('comprimido','29/04/22','ampola',12.00,2);
insert into tb_produtos(tipo,validade,embalagem,valor,id_categoria) values('liquido','30/04/22','blister',50.00,3);


#buscar na tabele personargens
select * from tb_produtos where valor > 35.00;
select * from tb_produtos where valor > 5.00 and valor < 50.00;
select * from tb_produtos where tipo like '%P%';

select * from tb_produtos inner join
tb_categorias on tb_categorias.id = tb_produtos.id_categoria;

select * from tb_produtos right join
tb_categorias on tb_categorias.id = tb_produtos.id_categoria;

select tb_produtos.tipo, tb_categorias.categoria, tb_categorias.bula from tb_produtos inner join 
tb_categorias on tb_categorias.id = tb_produtos.id_categoria;

select tb_produtos.embalagem, tb_categorias.categoria, tb_categorias.bula from tb_produtos inner join 
tb_categorias on tb_categorias.id = tb_produtos.id_categoria where marca = 'DIPIRONA';

