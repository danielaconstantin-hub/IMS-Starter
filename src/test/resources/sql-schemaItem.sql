DROP TABLE IF EXISTS `items`;
create table items(
id int auto_increment,
cost float not null,
name varchar(45) not null,
primary key(id));