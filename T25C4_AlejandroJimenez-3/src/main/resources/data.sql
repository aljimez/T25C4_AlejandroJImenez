DROP TABLE IF EXISTS almacenes;
DROP table IF EXISTS cajas;


CREATE TABLE almacenes (
  id int NOT NULL AUTO_INCREMENT,
  localizacion nvarchar(100) DEFAULT NULL,
  capacidad int DEFAULT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE cajas (
  box_id varchar(20) NOT NULL,
  contenido nvarchar(100) DEFAULT NULL,
  valor int DEFAULT NULL,
  almacen int DEFAULT NULL,
  PRIMARY KEY (box_id),
 FOREIGN KEY (almacen) REFERENCES almacenes (id)
);


insert into almacenes (localizacion, capacidad) values ('Granada', 7);
insert into almacenes (localizacion, capacidad) values ('Reus', 20);
insert into almacenes (localizacion, capacidad) values ('Barcelona', 45);


insert into cajas (box_id, contenido, valor, almacen) values ('66A72', 'Chips', 50, 1);
insert into cajas (box_id, contenido, valor, almacen) values ('995AJ', 'Amianto', 100, 2);
insert into cajas (box_id, contenido, valor, almacen) values ('6820GG', 'Arsenico', 3000, 1);
