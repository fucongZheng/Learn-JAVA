# 向表插入数据 需要注意字段对应
insert into tb_zheng(id, name, age, gender, entrydate) VALUES (1,'zola',18,'m','2000-10-10');

# 向表插入数据 不按字段来
insert into tb_zheng values (1,'apple',20,'w','2001-01-01');

# 向表插入数据 批量插入
insert into tb_zheng values (2,'banana',12,'w','2001-01-01'),(3,'cherry',17,'w','2003-01-01');


#修改表数据
update tb_zheng set id=4 where name='apple';