create database SaveCoin;

use SaveCoin;

Create table usuario(
idCadastro			int primary key not null auto_increment,
nomeCadastro		varchar(50) not null,
telefoneCadastro	varchar(15) not null,
loginCadastro		varchar(15) not null,
senhaCadastro		varchar(15) not null
);

Create table ganhos (
idGanho		int primary key not null auto_increment,
valorGanho	DECIMAL
);

Create table gastoEssencial (
idGastoEssencial 	int primary key not null auto_increment,
valorGastoEssencial	DECIMAL
);

Create table gastoDesejo (
idGastoDesejo 		int primary key not null auto_increment,
valorGastoDesejo	DECIMAL
);

Create table gastoDivida (
idGastoDivida 		int primary key not null auto_increment,
valorGastoDivida	DECIMAL
);



