drop schema if exists employee;
create schema employee;
use employee;

create table employee (
	id bigint auto_increment not null,
	name varchar(255),
	phone_number varchar(255),
	office_number varchar(255),
	position varchar(255),
	manager varchar(255),
	primary key (id)
);

insert into employee (name, phone_number, office_number, position, manager) values 
("Pedro", "789456126", "31B", "Gerency", "Paco"),
("Juana", "456789123", "18A", "Secretary", "Paco"),
("Pepi", "123789456", "15C", "CEO", "Manolo"),
("Conchi", "789456126", "31B", "Gerency", "Paco"),
("Pita", "456789123", "18A", "Secretary", "Paco"),
("Perico", "123789456", "15C", "CEO", "Manolo");