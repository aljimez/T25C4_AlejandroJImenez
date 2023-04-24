DROP TABLE IF EXISTS departamentos;
DROP table IF EXISTS empleados;


CREATE TABLE departamentos (
  id int NOT NULL AUTO_INCREMENT,
  nombre nvarchar(100) DEFAULT NULL,
  presupuesto int DEFAULT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE empleados (
  dni varchar(20) NOT NULL,
  nombre nvarchar(100) DEFAULT NULL,
  apellidos nvarchar(255) DEFAULT NULL,
  departamento int DEFAULT NULL,
  PRIMARY KEY (dni),
   FOREIGN KEY (departamento) REFERENCES departamentos (id)
);


insert into departamentos (nombre, presupuesto) values ('IT', 30);
insert into departamentos (nombre, presupuesto) values ('QA', 5000);
insert into departamentos (nombre, presupuesto) values ('RRHH', 8000);


insert into empleados (dni, nombre, apellidos, departamento) values ('477529211', 'Pedro', 'Calderon de La Barca', 1);
insert into empleados (dni, nombre, apellidos, departamento) values ('5551234561', 'Antonio', 'Machado', 2);
insert into empleados (dni, nombre, apellidos, departamento) values ('16728384952', 'Edgar', 'Allan Poe', 1);
