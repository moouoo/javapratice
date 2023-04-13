show tables;

creat table bank(
	idx int not auto_increment primary key,		/*금전출납부 고유번호*/
	wDate datetime dafault now(),				/*입금/출금이 발생한 날짜*/
	suip int default 0,							/*수입금액*/
	jicuul int default 0,						/*지출금액*/
	bigo varchar(50)							/*적요(내역)*/
	);
	
	creat table bank(
	idx int not auto_increment primary key,		/*금전출납부 고유번호*/
	wDate datetime dafault now(),				/*입금/출금이 발생한 날짜*/
	sw char(1) not null,						/*수입(s), 지출(j)*/
	price int dafault 0,						/*수입이든, 지출이든 사용된 금액*/
	bigo varchar(50)							/*적요(내역)*/
	);