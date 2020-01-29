create database vitrinevirtual;
use vitrinevirtual;

insert into tbldepartamento (nome, localizacao) values ('Cama/Mesa/Banho','secao 1');
insert into tbldepartamento (nome, localizacao) values ('Informatica','secao 2');
insert into tbldepartamento (nome, localizacao) values ('Alimentacao','secao 3');
insert into tbldepartamento (nome, localizacao) values ('Limpeza','secao 3');
insert into tbldepartamento (nome, localizacao) values ('Pets','secao 4'); 

insert into tblproduto (nome, detalhes, preco, linkfoto, departamento_id)
		values ('Almofada','Almofada',10,'./foto11.jpg',1);
insert into tblproduto (nome, detalhes, preco, linkfoto, departamento_id)
		values ('Colcha','Colcha',20,'./foto12.jpg',1);
insert into tblproduto (nome, detalhes, preco, linkfoto, departamento_id)
		values ('Lencol','Lencol',15,'./foto13.jpg',1);
        
insert into tblproduto (nome, detalhes, preco, linkfoto, departamento_id)
		values ('Computador','Computador',1000,'./foto21.jpg',2);
insert into tblproduto (nome, detalhes, preco, linkfoto, departamento_id)
		values ('Mouse','Mouse',20,'./foto22.jpg',2);
insert into tblproduto (nome, detalhes, preco, linkfoto, departamento_id)
		values ('Teclado','Teclado',45,'./foto23.jpg',2);
        
insert into tblproduto (nome, detalhes, preco, linkfoto, departamento_id)
		values ('Arroz','Arroz',10,'./foto31.jpg',3);
insert into tblproduto (nome, detalhes, preco, linkfoto, departamento_id)
		values ('Feijao','Feijao',8,'./foto32.jpg',3);
insert into tblproduto (nome, detalhes, preco, linkfoto, departamento_id)
		values ('Carne','Carne',15,'./foto33.jpg',3);
        
insert into tblproduto (nome, detalhes, preco, linkfoto, departamento_id)
		values ('Detergente','Detergente',2,'./foto41.jpg',4);
insert into tblproduto (nome, detalhes, preco, linkfoto, departamento_id)
		values ('Alvejante','Alvejante',5,'./foto42.jpg',4);
insert into tblproduto (nome, detalhes, preco, linkfoto, departamento_id)
		values ('Rodo','Rodo',8,'./foto43.jpg',4);
        
insert into tblproduto (nome, detalhes, preco, linkfoto, departamento_id)
		values ('Racao','Racao',20,'./foto51.jpg',5);
insert into tblproduto (nome, detalhes, preco, linkfoto, departamento_id)
		values ('Coleira','Coleira',10,'./foto52.jpg',5);
insert into tblproduto (nome, detalhes, preco, linkfoto, departamento_id)
		values ('Shampoo','Shampoo',15,'./foto53.jpg',5);        
        
