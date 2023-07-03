DROP TABLE  tb_zheng;

create table tb_zheng(
    id int comment '员工',
    workno  varchar(10) comment '工号',
    name  varchar(10) comment '姓名',
    gender char(1) comment '性别',
    age TINYINT UNSIGNED COMMENT '年龄',
    idcard char(18) comment '身份证',
    address varchar(50) comment '工作地址',
    entrydate date comment '入职日期'
                     )comment '员工表';

insert into tb_zheng values (1,'01','zola','男',18,'450121117502030658','西安','2010-10-10'),
                            (2,'02','apple','男',18,'450121111542030658','西安','2010-10-10'),
                            (3,'03','banana','男',18,'450121111582030658','百济','2010-10-11'),
                            (4,'04','cherry','男',18,'450121111509030658','新江','2010-10-11'),
                            (5,'05','orange','女',18,'450121111507030858','上海','2020-10-11'),
                            (6,'06','grape','女',18,'450121111502030658','上海','2020-10-11'),
                            (7,'07','vegetable','女',18,null,'上海','2020-10-11');

insert into tb_zheng values(8,'08','mango','女',28,null,'北京','2023-10-11'),
                           (9,'09','pear','女',25,'450147155802050321','北京','2021-10-11'),
                           (10,'10','peach','女',25,'450121188502030365','南宁','2011-10-11'),
                           (11,'11','peanut','女',33,'401251144578545454','南宁','2012-10-11');

# DQL 基本查询
select name,age from tb_zheng;

select * from  tb_zheng;

select address from tb_zheng;

select address as '工作地址' from tb_zheng;

select distinct address from tb_zheng;

# 条件查询
select * from tb_zheng where age = 17;

select * from tb_zheng where  age<18;

select * from tb_zheng where age<=17;

select * from tb_zheng where idcard is null ;

select * from tb_zheng where idcard is not null ;

select * from tb_zheng where age!=18;

select * from tb_zheng where age between 17 and 18;

select * from tb_zheng where gender ='男' && age=17;
select * from tb_zheng where gender ='男' and age=17;

select * from tb_zheng where age =17 or age=18;

select * from tb_zheng where age in(17,18);

select * from tb_zheng where name like '____';

select * from tb_zheng where idcard like '%Z';

#聚合函数
select COUNT(*) from tb_zheng;
select COUNT(idcard) from tb_zheng;

select avg(age) from tb_zheng;

select max(age) from tb_zheng;

select min(age) from tb_zheng;

select sum(age) from tb_zheng where address = '西安';

#分组查询
select gender,count(*) from tb_zheng group by gender;

select gender,avg(age) from tb_zheng group by gender;

select address,count(*) as address_count from tb_zheng where age>=18 group by address having address_count =3;
select address,count(*) from tb_zheng where age>=18 group by address having address !='上海';

#排序查询
select age from tb_zheng order by age asc;

select age from tb_zheng order by age desc;


select * from tb_zheng order by age, entrydate desc ;

#分页查询
select * from tb_zheng limit 10;

select * from tb_zheng limit 10,10;