-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: 11-Nov-2019 às 23:41
-- Versão do servidor: 5.7.23
-- versão do PHP: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `projeto_industria`
--


DROP DATABASE IF EXISTS projeto_industria;
CREATE DATABASE projeto_industria;
USE projeto_industria;
-- --------------------------------------------------------

--
-- Estrutura da tabela `clientes`
--

DROP TABLE IF EXISTS `clientes`;
CREATE TABLE IF NOT EXISTS `clientes` (
  `Idcliente` int NOT NULL AUTO_INCREMENT,
  `Nome` varchar(50) DEFAULT NULL,
  `Endereco` varchar(30) DEFAULT NULL,
  `Email` varchar(30) DEFAULT NULL,
  `Telefone` varchar(16) DEFAULT NULL,
  `Cpf` varchar(14) DEFAULT NULL,
  PRIMARY KEY (`Idcliente`)
)  ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `clientes`
--

INSERT INTO `clientes` (`Idcliente`, `Nome`, `Endereco`, `Email`, `Telefone`, `Cpf`) VALUES
(1, 'Marcos', 'José Mendes, 112', 'mpadilhat@gmail.com', '(51) 9 9792-3083', '023.118.234-77'),
(2, 'Marcos Padilha', 'José Mendes, 112', 'mpadilhat@gmail.com', '(51) 9 9792-3083', '023.118.234-77');

-- --------------------------------------------------------

--
-- Estrutura da tabela `estoque_materia`
--

DROP TABLE IF EXISTS `estoque_materia`;
CREATE TABLE IF NOT EXISTS `estoque_materia` (
  `Idmateria` int NOT NULL AUTO_INCREMENT,
  `Descricao` varchar(45) DEFAULT NULL,
  `Qtd` int(11) DEFAULT NULL,
  `Unid_medida` varchar(10) DEFAULT NULL,
  `Fornecedor` varchar(45) DEFAULT NULL,
  `Preco_compra` double DEFAULT NULL,
  PRIMARY KEY (`Idmateria`)
)  ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `estoque_materia`
--

INSERT INTO `estoque_materia` (`Idmateria`, `Descricao`, `Qtd`, `Unid_medida`, `Fornecedor`, `Preco_compra`) VALUES
(1, 'Madeira', 100, 'm', 'Madereira Joarez', 4),
(2, 'Prego', 400, 'unidades', 'Madereira Barbieri', 0.05);


-- --------------------------------------------------------

--
-- Estrutura da tabela `fornecedor`
--

DROP TABLE IF EXISTS `fornecedor`;
CREATE TABLE IF NOT EXISTS `fornecedor` (
  `Idfornecedor` int NOT NULL AUTO_INCREMENT,
  `Nome` varchar(50) DEFAULT NULL,
  `Endereco` varchar(30) DEFAULT NULL,
  `Email` varchar(30) DEFAULT NULL,
  `Telefone` varchar(16) DEFAULT NULL,
  `Cnpj` varchar(18) DEFAULT NULL,
  PRIMARY KEY (`Idfornecedor`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `fornecedor`
--

INSERT INTO `fornecedor` (`Idfornecedor`, `Nome`, `Endereco`, `Email`, `Telefone`, `Cnpj`) VALUES
(1, 'Madereira Joarez', 'Rua das Palmas, 112', 'made@reira.com', '(51) 9 9792-3083', '61.146.974/0001-72'),
(2, 'Madereira Barbieri', 'Rua das Palmas, 223', 'madereira@gmail.com', '(51) 9 9792-3083', '61.146.974/0001-72');
COMMIT;


DROP TABLE IF EXISTS `contas_pagar`;
CREATE TABLE `contas_pagar` ( 
`IdDivida` INT NOT NULL AUTO_INCREMENT , 
`Fornecedor` VARCHAR(40)  DEFAULT NULL , 
`Produto` VARCHAR(30) DEFAULT NULL ,
`Preco_compra` double DEFAULT NULL ,
`QtdProd` INT(10) DEFAULT NULL ,  
`Total_pagar` DOUBLE DEFAULT NULL , 
`Vencimento` VARCHAR(10) DEFAULT NULL ,
PRIMARY KEY (`IdDivida`))  ENGINE=MyISAM DEFAULT CHARSET=latin1;


INSERT INTO `contas_pagar` (`IdDivida`, `Fornecedor`, `Produto`, `Preco_compra`, `QtdProd`, `Total_pagar`, `Vencimento`) VALUES
(1, 'Madereira Joarez', 'Madeira', 4.00, 100, 400, '22/01/2020'),
(2, 'Madereira Barbieri', 'Prego', 0.05, 400, 20, '10/01/2020');


DROP TABLE IF EXISTS `historico_contasPagas`;
CREATE TABLE `historico_contasPagas` ( 
`IdPagamento` INT NOT NULL AUTO_INCREMENT , 
`Fornecedor` VARCHAR(40)  DEFAULT NULL , 
`Produto` VARCHAR(30) DEFAULT NULL ,
`Preco_compra` double DEFAULT NULL ,
`QtdProd` INT(10) DEFAULT NULL ,  
`Total_pago` DOUBLE DEFAULT NULL , 
`Vencimento` VARCHAR(10) DEFAULT NULL,
`Data_pagamento` VARCHAR(10) DEFAULT NULL,
`Status` VARCHAR(10) DEFAULT NULL,
PRIMARY KEY (`IdPagamento`))  ENGINE=MyISAM DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS `historico_contasRecebidas`;
CREATE TABLE `historico_contasRecebidas` ( 
`IdPagamento` INT NOT NULL AUTO_INCREMENT , 
`Cliente` VARCHAR(30) DEFAULT NULL ,
`Produto` VARCHAR(30) DEFAULT NULL ,
`Preco_venda` double DEFAULT NULL ,
`Qtd` INT(10) DEFAULT NULL ,  
`Total` DOUBLE DEFAULT NULL , 
`Vencimento` VARCHAR(10) DEFAULT NULL,
`Data_pagamento` VARCHAR(10) DEFAULT NULL,
`Status` VARCHAR(10) DEFAULT NULL,
PRIMARY KEY (`IdPagamento`))  ENGINE=MyISAM DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS `estoque_prod_final`;
CREATE TABLE IF NOT EXISTS `estoque_prod_final` (
  `Idproduto` int NOT NULL AUTO_INCREMENT,
  `Produto` varchar(45) DEFAULT NULL,
  `Medidas` varchar(15) DEFAULT NULL,
  `Qtd` INT(10) DEFAULT NULL ,
  `Preco_unit` double DEFAULT NULL,
  PRIMARY KEY (`Idproduto`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

INSERT INTO `estoque_prod_final` (`Idproduto`, `Produto`, `Medidas`, `Qtd`, `Preco_unit`) VALUES
(1, 'Armário', '1,7mx2m', 3,  200.00);

--
-- Extraindo dados da tabela `estoque_materia`
--

DROP TABLE IF EXISTS `composicao_produto`;
CREATE TABLE IF NOT EXISTS `composicao_produto` (
  `Idproduto` int NOT NULL,
  `Material` varchar(45) DEFAULT NULL,
  `Qtd` INT(10) DEFAULT NULL 
) ENGINE=MyISAM DEFAULT CHARSET=latin1;


INSERT INTO `composicao_produto` (`Idproduto`, `Material`, `Qtd`) VALUES
(1, 'Madeira', 15),
(1, 'Prego', 40);

DROP TABLE IF EXISTS `encomendas`;
CREATE TABLE `encomendas` ( 
`IdEncomenda` INT NOT NULL AUTO_INCREMENT , 
`Fornecedor` VARCHAR(40)  DEFAULT NULL , 
`Produto` VARCHAR(30) DEFAULT NULL ,
`Preco_compra` double DEFAULT NULL ,
`QtdProd` INT(10) DEFAULT NULL ,  
`Total_pagar` DOUBLE DEFAULT NULL , 
`Chegada` VARCHAR(10) DEFAULT NULL ,
PRIMARY KEY (`IdEncomenda`))  ENGINE=MyISAM DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS `ordem_producao`;
CREATE TABLE `ordem_producao` ( 
`IdProducao` INT NOT NULL AUTO_INCREMENT , 
`Produto` VARCHAR(30) DEFAULT NULL ,
`Medidas` VARCHAR(15) DEFAULT NULL ,
`QtdProd` INT(10) DEFAULT NULL ,  
`Entrega` VARCHAR(10) DEFAULT NULL ,
PRIMARY KEY (`IdProducao`))  ENGINE=MyISAM DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS `contas_receber`;
CREATE TABLE `contas_receber` ( 
`IdRec` INT NOT NULL AUTO_INCREMENT , 
`Cliente` VARCHAR(40)  DEFAULT NULL , 
`Produto` VARCHAR(30) DEFAULT NULL ,
`Preco_venda` double DEFAULT NULL ,
`QtdProd` INT(10) DEFAULT NULL ,  
`Total` DOUBLE DEFAULT NULL , 
`Vencimento` VARCHAR(10) DEFAULT NULL ,
PRIMARY KEY (`IdRec`))  ENGINE=MyISAM DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `compras_cliente`;
CREATE TABLE `compras_cliente` ( 
`Idcompra` INT NOT NULL AUTO_INCREMENT , 
`Idcliente` INT DEFAULT NULL, 
`Produto` VARCHAR(30) DEFAULT NULL ,
`Medidas` VARCHAR(15) DEFAULT NULL ,
`Qtd` INT(10) DEFAULT NULL ,  
`Total` DOUBLE DEFAULT NULL , 
`Data` VARCHAR(10) DEFAULT NULL ,
PRIMARY KEY (`Idcompra`))  ENGINE=MyISAM DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS `usuario`;
CREATE TABLE `usuario` ( 
`usuario` VARCHAR (20) DEFAULT NULL, 
`senha` VARCHAR(20) DEFAULT NULL)
 ENGINE=MyISAM DEFAULT CHARSET=latin1;

INSERT INTO `usuario` (`usuario`, `senha`) VALUES
('admin','admin');


/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;