#函数
#拼接字符串
select concat('hello','mysql');

select lower('hello');

select upper('hello');

select lpad('01', 5, '-');

select rpad('01', 5, '-');

#去除头尾空格
select trim(' hello mysql ');

#字符串截取
select substring('hello myqsl', 1, 5);

select length('hello');

select lpad(workno,5,'0')  from tb_zheng

/*
     ABS（绝对值）
    CEILING（向上取整）
    FLOOR（向下取整）
    MOD(X,Y)
    RAND()
    ROUND(X,Y)
    CEIL
 */
#数值函数
select ceil(1.1);

select floor(1.9);

select mod(3, 4);

select rand();

select round(2.528,2);

select abs(-9);

select lpad( round(rand()*1000000,0),6,0);

/*
 日期函数
    NOW（当前日期和时间）
    DATE（从日期时间中提取日期部分）
    YEAR（从日期中提取年份）
    DAY()
    MONTH()
    DATEDIFF()
    CURDATE()
    CURTIME()
 */

SELECT CURRENT_DATE();#2023-07-04
SELECT CURRENT_TIME();#09:47:33
SELECT NOW(); #2023-07-04 09:47:54
SELECT YEAR(CURRENT_DATE());#2023
SELECT MONTH(CURRENT_DATE());#7
SELECT DAY(CURRENT_DATE());#4
SELECT DATE('2003-12-31 01:02:03'); #2003-12-31
SELECT DATEDIFF('1997-12-31 23:59:59', '1997-11-30');
SELECT DATE_ADD('1999-01-01', INTERVAL 1 DAY);
SELECT DATE_ADD('1999-01-01', INTERVAL 1 HOUR);
SELECT DATE_ADD('1998-01-30', INTERVAL 1 MONTH);
SELECT DATE_ADD('1998-01-30', INTERVAL 1 YEAR );
SELECT DATE_ADD('1998-01-30', INTERVAL 1 MONTH);


select *,DATEDIFF(CURRENT_DATE(),entrydate) as day from tb_zheng order by day;


/*
 流程函数
    IF（条件判断）
    CASE（多重条件判断）
    COALESCE（返回第一个非空值）
    SELECT column1, column2,
        CASE
            WHEN condition1 THEN result1
            WHEN condition2 THEN result2
            ELSE result3
        END AS new_column
    FROM table_name;
    ifnull()
 */
select if(true, 'hello', 'erro');

select ifnull(null, 'pleasure');

select coalesce(null,'1', '', '999');

select name,
       address,
       case
           when address in ('西安', '新江') then '一线城市'
           else '其他城市'
           end as new_city
from tb_zheng;

select *,
    case when math >=85 and english>=85 and chinese>=85 then '优秀'
    when math >= 60 and english>=60 and chinese>=60 then '及格'
    else '不及格'
    end as grade
from score;

select id,name,
       (case when math >=85 then '优秀' when math >= 60  then '及格' else '不及格'end) as math,
       (case when english >=85 then '优秀' when english >= 60  then '及格' else '不及格'end) as english,
       (case when chinese >=85 then '优秀' when chinese >= 60  then '及格' else '不及格'end) as chinese
from score;



