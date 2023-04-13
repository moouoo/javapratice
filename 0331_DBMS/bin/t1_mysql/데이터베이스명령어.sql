

/* 주석..... */
-- 주석......
-- command mode에서의 mysql 접근하기
-- 먼저 mysql이 저장되어 있는 위치로 이동한다.
-- > mysql -u 계정명 -p
-- password: _______

-- 접속모드에서 빠져나갈때는 : exit, 또는 quit

-- 작업모드에서 종료시는 Ctrl + C,  완전 종료는 Ctrl + Z


-- 현재 만들어져있는(사용자가 사용할수 있는) Database 목록 확인
-- > show databases;

-- 데이터베이스 활성화(사용)하기
-- > use 데이터베이스명;
-- > use mysql;

-- 활성화된 데이터베이스의 테이블 목록 보여주기
show tables;

-- 테이블중 'user'테이블의 내용 보여주기(모든 필드의 내용을 확인한다.)
-- > select * from user;

-- user테이블의 필드명중, 'host' 와 'user' 필드명의 내용만을 보여달라?
-- > select host, user from user;

-- user테이블의 구조 보여주기
-- > desc 테이블명;
-- > desc user;

-- 사용자 생성(접근범위 ==>>  local접속:localhost, 웹(네트워크)접속: %)
-- > create user '유저명'@'접근범위' identified by '비밀번호';
-- > create user 'atom'@'localhost' identified by '1234';

-- 사용자 지우기(delete , drop)
-- > delete from user where user='사용자계정명';
delete from user where user='atom';
flush privileges;

-- drop user 유저명;
drop user atom;

-- 데이터베이스 생성하기
-- > create database 데이터베이스명;
create database seoul;

-- 생성된 데이터베이스를 사용하고자 할때는 해당 DB로 이동해서 사용해야 한다.
use seoul;

-- 데이터베이스 삭제하기
-- > drop database 데이터베이스명;
drop database seoul;

-- 현재 로그인한 사용자의 권한을 보기
show grants;

-- 사용자의 권한 보기
show grants for 사용자명;

-- 사용자에게 생성된 데이터베이스를 사용할 수 있는 권한 부여하기
-- > grant all privileges on 데이터베이스명.권한 to '사용자명'@'접근범위' identified by '비밀번호';
grant all privileges on seoul.* to 'atom'@'%' identified by '1234';

-- 사용자 권한 보기
-- > show grants for 사용자명;
show grants for atom;

-- 사용자에게 주어진 DB권한 걷어들이기
-- > revoke all on 데이터베이스명.권한 from '사용자명'@'접근범위';
revoke all on seoul.* from 'atom'@'%';

-----------------------------------------------------------------

-- 사용자가 DB안에서 사용하는 명령들(SQL)
-- > 테이블 생성하기
/*
create table 테이블명 (
  필드명1  필드타입 옵션,
  필드명2  필드타입 옵션,
  ......
);
*/

create table test (
  name    varchar(20) not null,
  age     int  default 20,
  gender  char(2) default '여자',
  address varchar(50)
);

-- 테이블의 구조를 삭제하기
drop table test;

-- > 생성된 테이블의 구조보기
-- desc 테이블명;
desc test;

-- > 테이블안의 모든 내용(레코드) 보기
select * from 테이블명;
select * from test;

-- >  생성된 테이블의 레코드 삽입하기(insert)
-- insert into 테이블명 (필드명1,필드명2,....) values (내용1,내용2,....);
insert into test (name, age, gender, address) values ('홍길동', 25, '남자', '서울');

-- > 레코드 삽입시 모든 필드의 내용을 삽입하고자 할때는 필드리스트를 생략할 수 있다.
insert into test values ('김말숙', 33, '여자','');

-- =================================================================

use seoul;

show tables;	-- 전체 테이블 리스트 확인하기

select * from test;

select name, gender from test;

desc test;

insert into test values ('홍길동',25,'남자','서울');
insert into test values ('홍길길동',25,'남자','서울');
insert into test values ('홍길자',25,'남자','서울');
insert into test values ('김길동',25,'남자','서울');
insert into test values ('김말숙',33,'여자','청주');
insert into test values ('이기자',18,'남자','인천');
insert into test values ('나다',19,'여자','인천');
insert into test values ('다',31,'여자','청주');
insert into test values ('나다가',32,'남자','울릉도');
insert into test values ('나가다',29,'여자','서울');
insert into test values ('다다다',51,'남자','제주');
insert into test values ('라라라',21,'여자','');
insert into test values ('고인돌',45,'여자','서울특별시');
insert into test values ('마마마',default,default,'');

delete from test;

-- test테이블의 모든 레코드와 필드 보여주기
select * from test;

-- test테이블의 name, age필드만 보여주기
select name, age from test;

-- 검색시 조건을 지정하여 검색?   where 절~~~~
-- 30살 미만의 자료를 보여주시오.
select * from test where age < 30;

-- 20~30 살 자료를 보여주시오.
select * from test where age>=20 and age<=30;
select * from test where age between 20 and 30;

-- 성별이 남자만 보여주시오.
select * from test where gender = '남자';

-- 성별이 남자가 아닌자료를 보여주시오.
select * from test where gender != '남자';

-- 서울에 사는 사람을 보여주시오.
select * from test where address = '서울';

-- 서울 또는 청주에 사는 사람을 보여주시오?
select * from test where address='서울' or address='청주';
select * from test where address in ('서울','청주');

-- 서울에 사는 '남자'를 보여주시오?
select * from test where address='서울' and gender='남자';

-- 20세 이상의 여자만 출력하시오?
select * from test where age >= 20 and gender='여자';

-- '서울'에 살거나 아니면 '남자'인 자료를 출력하세요?
select * from test where address = '서울' or gender = '남자';

-- '청주'에 사는 25세 이상인 자료의 성명/나이/주소?
select name,age,address from test where address='청주' and age>=25;

-- 수정(update 테이블 set 필드='수정할내용' where 필드명='검색필드')

-- 모든자료의 나이를 한살 더해주세요...
update test set age = age + 1;

-- 남자자료의 나이를 한살 더해주세요...
update test set age = age + 1 where gender = '남자';

delete from test where gender = '여자';

select * from test;

-- like 연산자: 부분포함... 연산자: %(복수개), _(단수개)

-- '서울'로 시작하는 주소를 모두 출력하시오?
select * from test where address like '서울%';

-- 성명이 '홍'씨인 자료를 출력?
select * from test where name like '홍%';

-- 이름이 '~길동'으로 끝나는 자료를 출력?
select * from test where name like '%길동';

-- 이름중에서 '길' 자가 들어있는 모든 자료를 출력?
select * from test where name like '%길%';

-- 이름중 세번째 글자가 '길' 인 자료를 출력?
select * from test where name like '__길%';

select name as 성명, age as 나이, gender, address  from test;

show tables;

desc test2;
drop table test2;
