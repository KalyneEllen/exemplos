CREATE DATABASE empresa;

CREATE TABLE carro(
placa INT (10) PRIMARY KEY,
codcarro INT (8) NOT NULL,
tipo VARCHAR (50) NOT NULL,
modelo VARCHAR (20),
ano_de_fabricacao DATE,
combustivel FLOAT (10),
chassi CHAR (20));

ALTER TABLE carro
MODIFY chassi INT (20) NOT NULL;

CREATE TABLE cargo(
codigo INT (8) PRIMARY KEY, 
nome VARCHAR (20) NOT NULL,
salario_base FLOAT (10));

CREATE TABLE departamento(
codigoD INT (8) PRIMARY KEY,
nome VARCHAR (50) NOT  NULL);

CREATE TABLE dependente(
codigoDe INT (8) PRIMARY KEY,
nome VARCHAR (50) NOT NULL, 
dta_nasc DATE,
sexo CHAR (1),
cod_fun INT (8) NOT NULL);

CREATE TABLE funcionarios(
codigoF INT (8) NOT NULL,
nome VARCHAR (50) NOT NULL,
cpf INT (11) NOT NULL,
endereco VARCHAR (50),
cidade VARCHAR (20),
telefone INT (8),
telefone2 INT (8),
codcarro INT (8),
codigoD INT (8));

ALTER TABLE funcionarios 
ADD COLUMN carrousado VARCHAR (256) UNIQUE;

ALTER TABLE funcionarios 
ADD CONSTRAINT PRIMARY KEY (codigo);
