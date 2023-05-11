

CREATE database recursoshumanos;
USE recursoshumanos;

/*Estructura de la tabla `estados`*/

CREATE TABLE estados(
id INT NOT NULL AUTO_INCREMENT,
nombre VARCHAR(50) NOT NULL,
descripcion VARCHAR(100),
PRIMARY KEY(id));

/*Estructura de la tabla `estados_civiles`*/

CREATE TABLE estados_civiles(
id INT NOT NULL AUTO_INCREMENT,
nombre VARCHAR(50) NOT NULL,
descripcion VARCHAR(100),
PRIMARY KEY (id));

/*Estructura de la tabla `formaciones_academicas`*/

CREATE TABLE formaciones_academicas(
id INT NOT NULL AUTO_INCREMENT,
nombre VARCHAR(150) NOT NULL,
niveles_educativos_id INT NOT NULL,
universidades_id INT NOT NULL,
estados_id INT NOT NULL,
funcionarios_id INT NOT NULL,
PRIMARY KEY (id),
FOREIGN KEY (funcionarios_id) REFERENCES funcionarios(id),
FOREIGN KEY (estados_id) REFERENCES estados(id),
FOREIGN KEY (universidades_id) REFERENCES universidades(id),
FOREIGN KEY (niveles_educativos_id) REFERENCES niveles_educativos(id));

/*Estructura de la tabla `tipos_identificaciones`*/

CREATE TABLE tipos_identificaciones(
id INT NOT NULL AUTO_INCREMENT,
nombre VARCHAR(50) NOT NULL,
descripcion VARCHAR(100),
PRIMARY KEY (id));


/*Estructura de la tabla `funcionarios`*/

CREATE TABLE funcionarios(
id INT NOT NULL AUTO_INCREMENT,
numero_identificacion VARCHAR(50) NOT NULL UNIQUE,
nombres VARCHAR(100) NOT NULL,
apellidos VARCHAR(100) NOT NULL,
sexo VARCHAR(45),
direccion VARCHAR(100) NOT NULL,
telefono VARCHAR(100),
fecha_nacimiento DATE,
fecha_creacion DATETIME DEFAULT NOW(),
fecha_actualizacion DATETIME DEFAULT NOW(),
estados_civiles_id INT NOT NULL,
tipos_identificaciones_id INT NOT NULL,
PRIMARY KEY(id),
FOREIGN KEY (estados_civiles_id) REFERENCES estados_civiles(id),
FOREIGN KEY (tipos_identificaciones_id) REFERENCES tipos_identificaciones(id));

/*Estructura de la tabla `niveles_educativos`*/

CREATE TABLE niveles_educativos(
id INT NOT NULL AUTO_INCREMENT,
nombre VARCHAR(100) NOT NULL,
PRIMARY KEY(id));

/*Estructura de la tabla `universidades`*/

CREATE TABLE universidades(
id INT NOT NULL AUTO_INCREMENT,
nombre VARCHAR(150) NOT NULL,
PRIMARY KEY (id));


/*Estructura de la tabla `parentescos`*/

CREATE TABLE parentescos(
id INT NOT NULL AUTO_INCREMENT,
nombre VARCHAR(50) NOT NULL,
PRIMARY KEY (id));

/*Estructura de la tabla `grupos_familiares`*/

CREATE TABLE grupos_familiares(
id INT NOT NULL AUTO_INCREMENT,
nombre VARCHAR(100) NOT NULL,
funcionarios_id INT NOT NULL,
parentescos_id INT NOT NULL,
PRIMARY KEY(id),
FOREIGN KEY (funcionarios_id) REFERENCES funcionarios(id),
FOREIGN KEY (parentescos_id) REFERENCES parentescos(id));

/*INSERCIÓN DE DATOS TABLA TIPOS DE IDENTIFICACIÓN*/


INSERT INTO tipos_identificaciones(nombre, descripcion)
VALUES('CC', 'Cédula De Ciudadanía');
INSERT INTO tipos_identificaciones(nombre, descripcion)
VALUES('RC', 'Registro Civil');
INSERT INTO tipos_identificaciones(nombre, descripcion)
VALUES('TI', 'Tarjeta De Identidad');
INSERT INTO tipos_identificaciones(nombre, descripcion)
VALUES('CE', 'Cédula De Extranjería');
INSERT INTO tipos_identificaciones(nombre, descripcion)
VALUES('PP', 'Pasaporte');

/*INSERCIÓN DE DATOS TABLA ESTADOS CIVILES*/
INSERT INTO estados_civiles(nombre)
VALUES('Casado');
INSERT INTO estados_civiles(nombre)
VALUES('Soltero');
INSERT INTO estados_civiles(nombre)
VALUES('Comprometido');
INSERT INTO estados_civiles(nombre)
VALUES('Viudo');

/*TABLA ESTADOS*/
INSERT INTO estados(nombre)
VALUES('En Proceso');
INSERT INTO estados(nombre)
VALUES('Finalizado');
INSERT INTO estados(nombre)
VALUES('Suspendido');

/*TABLA PARENTESCOS*/
INSERT INTO parentescos(nombre)
VALUES('Primo/a');
INSERT INTO parentescos(nombre)
VALUES('Hermano/a');
INSERT INTO parentescos(nombre)
VALUES('Madre');
INSERT INTO parentescos(nombre)
VALUES('Padre');
INSERT INTO parentescos(nombre)
VALUES('Tio/a');
INSERT INTO parentescos(nombre)
VALUES('Sobrino/a');
INSERT INTO parentescos(nombre)
VALUES('Abuelo/a');

/*TABLA NIVELES ACADÉMICOS*/
INSERT INTO niveles_educativos(nombre)
VALUES('Bachillerato');
INSERT INTO niveles_educativos(nombre)
VALUES('Técnica');
INSERT INTO niveles_educativos(nombre)
VALUES('Tecnología');
INSERT INTO niveles_educativos(nombre)
VALUES('Pregrado');
INSERT INTO niveles_educativos(nombre)
VALUES('Posgradro');
INSERT INTO niveles_educativos(nombre)
VALUES('Maestría');
INSERT INTO niveles_educativos(nombre)
VALUES('Doctorado');

/*TABLA FUNCIONARIOS*/
INSERT INTO funcionarios(numero_identificacion,nombres,apellidos,sexo,direccion,telefono,fecha_nacimiento,
estados_civiles_id,tipos_identificaciones_id)
VALUES('1002003','Donald','Trump','MASCULINO','Calle unica #1010','5006001020','1950',3,1);