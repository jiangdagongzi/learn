create table seckill(
seckill_id bigint NOT NULL AUTO_INCREMENT ,
name varchar(120) NOT NULL ,
number int NOT NULL,
start_time timestamp NOT NULL,
end_time timestamp NOT NULL,
create_time timestamp NOT NULL DEFAULT current_timestamp
primary key(seckill_id),
key idx_start_time(start_time),
key idx_end_time(end_time),
key idx_create_time(create_time)
)ENGINE = InnoDB AUTO_INCREMENT = 1000 DEFAULT CHARSET = utf8 COMMENT = '秒杀库存表'

insert into seckill(name,number,start_time,end_time)
values('1000元秒杀iphone',100,'2018-10-13 00:00:00','2018-10-14 00:00:00'),
	('500元秒杀小米',200,'2018-10-13 00:00:00','2018-10-14 00:00:00'),
    ('800元秒杀华为',300,'2018-10-13 00:00:00','2018-10-14 00:00:00')