create table success_kill(
seckill_id bigint NOT NULL,
id int NOT NULL ,
state int NOT NULL DEFAULT -1,
create_time timestamp NOT NULL ,
primary key(seckill_id,id),
key idx_create_time(create_time)
)ENGINE = InnoDB DEFAULT CHARSET = utf8