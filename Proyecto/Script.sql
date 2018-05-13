DROP schema IF EXISTS telefonia;
create schema telefonia;
use telefonia;


Create table users (
username varchar(20) primary key,
password varchar(20));

Create table roles(
rolename varchar(20) primary key);

Create table users_roles (
username varchar(20),
rolename varchar(20),
Constraint users_roles_pk primary key (username,rolename),
Constraint users_roles_users foreign key (username) references users(username),
Constraint users_roles_roles foreign key (rolename)  references roles(rolename));


CREATE TABLE departamentosAyto (
  idDepAyto int(11) NOT NULL AUTO_INCREMENT,
  nomDep varchar (70) NOT NULL ,
  edificio varchar (70) ,
  planta varchar (70) ,
  PRIMARY KEY (idDepAyto)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE usuarios (
  idUsuario int(11) NOT NULL AUTO_INCREMENT,
  nombreUsuario varchar (70) unique,
  nombre varchar (70) NOT NULL,
  primerApellido varchar (70) NOT NULL,
  segundoApellido varchar (70) ,
  puesto varchar (70),
  dni varchar (70) NOT NULL unique  ,
  correo varchar (70) unique ,
  terminalPropio boolean default false,
  activo  boolean default true,
  generico boolean default false,
  idEmpleado varchar (70) NOT NULL unique,
  idDepAyto int(11),
  fecha_alta date,
  fecha_baja date,
  motivo_baja varchar (250),
  observaciones varchar (250),
  PRIMARY KEY (idUsuario),
  foreign key (idDepAyto) references departamentosAyto(idDepAyto)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE tiposTarifas (
  idTipoTarifa int(11) NOT NULL AUTO_INCREMENT,
  tipoTarifa varchar (70) NOT NULL,
  observaciones varchar (250),
  activo boolean default true,
  PRIMARY KEY (idTipoTarifa)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE tiposTarjetas(
  idTipoTarjeta int(11) NOT NULL AUTO_INCREMENT,
  tipoTarjeta varchar (70) NOT NULL,
  observaciones varchar (250),
  activo boolean default true,
  PRIMARY KEY (idTipoTarjeta)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE tiposContratos(
  idTipoContrato int(11) NOT NULL AUTO_INCREMENT,
  tipoContrato varchar (70) NOT NULL,
  observaciones varchar (250),
  activo boolean default true,
  PRIMARY KEY (idTipoContrato)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE estadosTarjetas(
  idEstadoTarjeta int(11) NOT NULL AUTO_INCREMENT,
  estadoTarjeta varchar(70) NOT NULL,
  observaciones varchar (250),
  activo boolean default true,
  PRIMARY KEY (idEstadoTarjeta)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



CREATE TABLE tarjetas(
  idTarjeta int(11) NOT NULL AUTO_INCREMENT,
  pin int (10) NOT NULL,
  puk int (10) NOT NULL,
  icc varchar (40) unique NOT NULL,
  numCorto varchar (70) unique NOT NULL,
  numLargo varchar (70) unique NOT NULL,
  disponible boolean default true,
  historialAveria varchar (250),
  observaciones varchar (250),
  cambioNumero varchar (90),
  fecha_alta date,
  fecha_baja date,
  motivo_baja varchar (250),
  idTipoTarifa int(11),
  idTipoTarjeta int(11),
  idTipoContrato int(11),
  idEstadoTarjeta int (11),
  PRIMARY KEY (idTarjeta),
  foreign key (idTipoTarifa) references tiposTarifas(idTipoTarifa),
  foreign key (idEstadoTarjeta) references estadosTarjetas(idEstadoTarjeta),
  foreign key (idTipoTarjeta) references tiposTarjetas(idTipoTarjeta),
  foreign key (idTipoContrato) references tiposContratos (idTipoContrato)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



CREATE TABLE marcas(
  idMarca int(11) NOT NULL AUTO_INCREMENT,
  marca varchar (70) NOT NULL,
  PRIMARY KEY (idMarca)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE lotesTerminales(
  idLoteTerminal int(11) NOT NULL AUTO_INCREMENT,
  lote varchar (70) NOT NULL,
  PRIMARY KEY (idloteTerminal)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE tiposTerminales (
  idTipoTerminal int(11) NOT NULL AUTO_INCREMENT,
  tipoTerminal varchar (70) NOT NULL,
  PRIMARY KEY (idTipoTerminal)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE companiasTerminales(
  idCompaniaTerminal int(11) NOT NULL AUTO_INCREMENT,
  companiasTerminal varchar (70) NOT NULL,
  PRIMARY KEY (idCompaniaTerminal)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE modelosTerminales(
  idModeloTerminal int(11) NOT NULL AUTO_INCREMENT,
  modelos varchar (70) NOT NULL,
  idMarca int (11),
  PRIMARY KEY (idModeloTerminal),
  foreign key (idMarca) references marcas(idMarca)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE modelosDispositivos(
  idModeloDispositivo int(11) NOT NULL AUTO_INCREMENT,
  modelo_Dispositivo varchar  (70) NOT NULL,
  idMarca int (11),
  PRIMARY KEY (idModeloDispositivo),
  foreign key (idMarca) references marcas(idMarca)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE dispositivos(
  idDispositivo int(11) NOT NULL AUTO_INCREMENT,
  numeroserie_Dispositivo varchar (70) NOT NULL,
  tipo_Dispositivo varchar (70) NOT NULL,
  activo boolean default true,
  observaciones varchar (250),
  idModeloDispositivo int(11),
  PRIMARY KEY (idDispositivo),
  foreign key (idModeloDispositivo) references modelosDispositivos (idModeloDispositivo)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

 

CREATE TABLE estadosTerminales(
  idEstadoTerminal int(11) NOT NULL AUTO_INCREMENT,
  estado varchar (70) NOT NULL,
  PRIMARY KEY (idEstadoTerminal)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE terminales(
  idTerminal int(11) NOT NULL AUTO_INCREMENT,
  numSerie varchar (90) unique NOT NULL,
  imei varchar (90) unique NOT NULL,
  cambioImei varchar (90),
  disponible boolean default true,
  baja boolean default false,
  fecha_alta date,
  fecha_baja date,
  motivo_baja varchar (250),
  observaciones varchar (250),
  historialAveria varchar (250),
  idLoteTerminal int (11),
  idTipoTerminal int (11),
  idCompaniaTerminal int(11),
  idModeloTerminal int (11),
  idEstadoTerminal int(11),
  PRIMARY KEY (idTerminal),
  foreign key (idTipoTerminal) references tiposTerminales(idTipoTerminal),
  foreign key (idLoteTerminal) references lotesTerminales(idLoteTerminal),
  foreign key (idCompaniaTerminal) references companiasTerminales(idCompaniaTerminal),
  foreign key (idModeloTerminal) references modelosTerminales (idModeloTerminal),
  foreign key (idEstadoTerminal) references estadosTerminales(idEstadoTerminal)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE operadores(
  idOperador int(11) NOT NULL AUTO_INCREMENT,
  usuarioOperador varchar (70) NOT NULL,
  PRIMARY KEY (idOperador)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE averiasTerminales(
  idaveriasTerminal int(11) NOT NULL AUTO_INCREMENT,
  fecha_averia date,
  fecha_entrega date,
  fecha_baja date,
  motivo_baja varchar (250),
  imeiAntiguo varchar (90) NOT NULL,
  imeiNuevo varchar (90) NOT NULL,
  enviadoReparar boolean default false,
  historialAveria varchar (250),
  observaciones varchar (250),
  idOperador int(11),
  PRIMARY KEY (idAveriasTerminal),
  foreign key (idOperador)  references operadores(idOperador),
  foreign key (imeiAntiguo) references terminales(imei),
  foreign key (imeiNuevo) references terminales(imei)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE averiasTarjetas(
  idaveriaTarjeta int(11) NOT NULL AUTO_INCREMENT,
  fechaAveriaTarjeta date,
  fechaEntregaTarjeta date,
  fechabaja date,
  motivobaja varchar (250),
  tarjetaAntigua int (11) NOT NULL,
  tarjetaNueva int (11) NOT NULL,
  historialAveria varchar (250),
  observaciones varchar (250),
  idOperador int(11),
  PRIMARY KEY (idaveriaTarjeta),
  foreign key (idOperador) references operadores(idOperador),
  foreign key (tarjetaAntigua) references tarjetas(idTarjeta),
  foreign key (tarjetaNueva) references tarjetas(idTarjeta)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE entregas(
  idEntrega int(11) NOT NULL AUTO_INCREMENT,
  fechaEntrega date NOT NULL,
  observaciones varchar (250),
  idTerminal int(11),
  idTarjeta int(11),
  idUsuario int(11),
  idOperador int(11),
  historialEntrega varchar (250),
  PRIMARY KEY (idEntrega),
  foreign key (idTerminal) references terminales(idTerminal),
  foreign key (idTarjeta) references tarjetas(idTarjeta),
  foreign key (idUsuario) references usuarios(idUsuario),
  foreign key (idOperador) references operadores(idOperador)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE histEstados(
   idHistEstado int(11) NOT NULL AUTO_INCREMENT,
   fechaHistEstado date,
   descripcionHistestado varchar (250),
   observaciones varchar (250),
  idTerminal int(11),
  idEstadoTerminal int(11),
  PRIMARY KEY (idHistEstado),
  foreign key (idTerminal) references terminales(idTerminal),
  foreign key (idEstadoTerminal) references estadosTerminales(idEstadoTerminal)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;