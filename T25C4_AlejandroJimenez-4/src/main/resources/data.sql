DROP TABLE IF EXISTS peliculas;
DROP table IF EXISTS salas;


CREATE TABLE peliculas (
  id int NOT NULL AUTO_INCREMENT,
  nombre nvarchar(100) DEFAULT NULL,
  calificacionedad int DEFAULT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE salas (
  id int NOT NULL AUTO_INCREMENT,
  nombre nvarchar(100) DEFAULT NULL,
  pelicula int DEFAULT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (pelicula) REFERENCES peliculas (id)
);


insert into peliculas (nombre, calificacionedad) values ('La guerra de los botones', 3);
insert into peliculas (nombre, calificacionedad) values ('El club de la lucha', 18);
insert into peliculas (nombre, calificacionedad) values ('Super8', 8);

insert into salas (nombre, pelicula) values ('5A', 1);
insert into salas (nombre, pelicula) values ('3C', 2);
insert into salas (nombre, pelicula) values ('1Q', 3);
