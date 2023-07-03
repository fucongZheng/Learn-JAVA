#example
/*
    1.查询年龄为20,21,22,23岁的员工信息。
    2.查询性别为 男，并且年龄在 20-40 岁(含)以内的姓名为三个字的员工。
    3.统计员工表中,年龄小于60岁的，男性员工和女性员工的人数。
    4，查询所有年龄小于等于35岁员工的姓名和年龄，并对查询结果按年龄升序排序，如果年龄相同按入职时间降序排序。
    5，查询性别为男，且年龄在20-40 岁(含)以内的前5个员工信息，对查询的结果按年龄升序排序，年龄相同按入职时间升序排序。
 */

select * from tb_zheng where age in (17,18);

select * from tb_zheng where gender = '女' and age between 28 and 33 and name like '_____';

select  gender,count(age) from tb_zheng  where age  > 17 group by gender ;

select name,age,entrydate from tb_zheng where age>=17 order by age ,entrydate desc ;

select * from tb_zheng where age between 17 and 25 order by age ,entrydate desc limit 5;