drop table if exists message;
create table message(
id int not null auto_increment,
brand varchar(32) not null,
price integer (32) default null,
num integer (32) default null,
primary key (id)
)engine=InnoDB auto_increment=1 default charset=utf8