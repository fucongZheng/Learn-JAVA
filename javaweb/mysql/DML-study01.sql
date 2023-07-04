# 向表插入数据 需要注意字段对应
insert into tb_zheng(id, name, age, gender, entrydate) VALUES (1,'zola',18,'m','2000-10-10');

# 向表插入数据 不按字段来
insert into tb_zheng values (1,'apple',20,'w','2001-01-01');

# 向表插入数据 批量插入
insert into tb_zheng values (2,'banana',12,'w','2001-01-01'),(3,'cherry',17,'w','2003-01-01');


#修改表数据
update tb_zheng set id=4 where name='apple';

update tb_zheng set workno = lpad(workno,5,'0');

create table score
(
    id int comment 'ID',
    name    varchar(20) comment '姓名',
    math int,
    english int,
    chinese int
)comment '成绩表';
insert into score values(1,'apple',77,58,19),
                        (2,'banana',20,0,29),
                        (3,'pear',30,38,39),
                        (4,'orange',47,68,49),
                        (5,'grape',57,78,79),
                        (6,'mango',77,88,89),
                        (7,'peach',87,98,69),
                        (8,'peanut',97,87,39),
                        (9,'tom',100,82,100),
                        (10,'zola',55,18,92);