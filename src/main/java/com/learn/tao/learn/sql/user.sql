create table user(
id bigint NOT NULL auto_increment,
user_name varchar(200) not null,
auth int not null,
password varchar(200) not null,
create_time timestamp default current_timestamp ,
last_login timestamp,
primary key (id)
);


insert into user(id,user_name,auth,password)
values (0,'admin',15,'admin111')