CREATE TABLE livro(
l_id int not null auto_increment,
l_titulo varchar(50) not null,
l_assunto varchar(100) not null,
l_autor varchar(50) not null,
l_valor float not null,
PRIMARY KEY (l_id)
);