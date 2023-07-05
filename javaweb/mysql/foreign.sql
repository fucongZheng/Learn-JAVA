create table constraints
(
    id int primary key auto_increment comment 'ID可以自增主键',
    name varchar(20) not null unique comment '名字不能为空，且唯一',
    age int comment '年龄校验大于18',
    status char(1) default '1' comment '状态默认1',
    gender char(1),
    CONSTRAINT CHK_Age CHECK (age >= 18)
)comment '增加了约束';


#外键约束
create table dept(
    id int auto_increment primary key ,
    name varchar(20) not null
);
insert into dept values (1,'市场部'),(2,'财务部'),(3,'总裁办');
create table emp(
                    id int auto_increment primary key ,
                    name varchar(20) not null,
                    age int ,
                    job varchar(20),
                    salary int,
                    entrydate date,
                    managerid int,
                    dept_id int,
                    FOREIGN KEY (dept_id) REFERENCES dept(id) on update cascade on delete cascade
);
insert into emp values (1,'zola',14,'开发',3000,'1998-10-01',5,1);