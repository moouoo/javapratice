show tables;

create table test(
	idx int not null auto_increment primary key,
	name varchar(20) not null,
	age int default 20,
	gender char(2) default '남자',
	address varchar(20),
	job	varchar(10));
	
	desc test;
	
	insert into test values (default, '홍길동', 25, default, '서울', '학생');
	insert into test values (default, '김말숙', 25, '여자', '청주', '회사원');
	insert into test values (default, '김바보', 29, default, '청주', '학생');
	
	select * from test;
	
	drop table test;