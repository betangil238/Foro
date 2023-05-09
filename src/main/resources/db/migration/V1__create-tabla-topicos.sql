create table topicos (
id bigint not null auto_increment,
titulo varchar(255) not null unique,
mensaje varchar(1000) not null unique,
fecha_creacion date,
status varchar(150) ,
nombre varchar(150) not null,
email varchar(150) not null,
contrasena varchar(150) ,
nombrecurso varchar(150) not null,
categoria varchar(150) not null,

primary key(id)

);


