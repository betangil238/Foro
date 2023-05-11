create table usuarios (
id bigint not null auto_increment,
usuario varchar(255) not null unique,
clave varchar(255) not null,

primary key(id)

);


