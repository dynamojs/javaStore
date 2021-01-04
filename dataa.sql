
create database companyy;
use companyy;

create table cars( num int primary key, Model varchar(30), Year int, GVWR int);
create table employee( ename varchar(20), E_id int primary key, birthdate varchar(20), since varchar(20)); 

alter table salesrepresentative add constraint foreign key(E_id) references employee (E_id);
alter table  delivery modify E_id int primary key; 


create table salesRepresentative (E_id int primary key); 
create table exportingcompany (EC_id int primary key, address varchar(30), EC_name varchar(30), phone varchar(10));


create table product ( name varchar(20) , mount int, 
priceofpiece int, EC_id int, pid int primary key,
 constraint foreign key (EC_id) references exportingcompany(EC_id));
show tables;

create table delivery (E_id int, carnum int , constraint foreign key (E_id) references employee(E_id),
constraint foreign key (carnum) references cars(num));

create table suppliedcenters (SC_name varchar(20), SR_id int , SC_id int primary key, address varchar(20),
SC_phone varchar(10), constraint foreign key (SR_id) references salesRepresentative(E_id));

create table orders (o_id int primary key, totalprice int , pid int, date varchar (20), SC_id int, D_id int,
 constraint foreign key (SC_id) references  suppliedcenters(SC_id),
 constraint foreign key (pid) references  product(pid),
 constraint foreign key (D_id) references  delivery(E_id));

create table moderator(E_id int ,
 foreign key(E_id) references employee(E_id)); 
 
 create table dealswith (E_id int, EC_id int,
 primary key(E_id, EC_id),
 foreign key(E_id) references moderator(E_id), 
 foreign key(EC_id) references exportingcompany(EC_id));

