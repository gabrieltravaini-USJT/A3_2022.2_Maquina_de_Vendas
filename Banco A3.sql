CREATE database a3;
Create table admins(
id_admins int primary key auto_increment,
usuario Varchar(60)not null,
senha Varchar(16)NOT null);
INSERT INTO a3.admins values(id_admins,"Gabriel","12345678");

Create table produtos(
id_produto int primary key auto_increment,
nome_produto varchar(60),
qtd_estoque int,
qtd_vendida int,
preco_compra double,
preco_venda double);

INSERT INTO a3.admins values(id_produto,"Mascara Branca P",10,0,0.3,1.0);
INSERT INTO a3.admins values(id_produto,"Mascara Branca M",10,0,0.3,1.0);
INSERT INTO a3.admins values(id_produto,"Mascara Branca G",10,0,0.3,1.0);
INSERT INTO a3.admins values(id_produto,"Mascara Preta P",10,0,0.3,1.0);
INSERT INTO a3.admins values(id_produto,"Mascara Preta M",10,0,0.3,1.0);
INSERT INTO a3.admins values(id_produto,"Mascara Preta G",10,0,0.3,1.0);
INSERT INTO a3.admins values(id_produto,"Alcool em gel 50ml",10,0,1.00,2.50);
INSERT INTO a3.admins values(id_produto,"Alcool em gel 150ml",10,0,3.00,5.00);
INSERT INTO a3.admins values(id_produto,"Alcool em gel 300ml",10,0,5.00,7.50);

