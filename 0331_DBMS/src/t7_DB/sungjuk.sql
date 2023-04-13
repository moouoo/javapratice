show tables;

create table sungjuk (
  idx   int not null auto_increment primary key,	/* 고유번호 */
  name  varchar(20) not null,			/* 학생 성명 */
  kor		int not null,							/* 국어점수 */
  eng		int not null,							/* 영어점수 */
  mat		int not null,							/* 수학점수 */
  tot   int not null,							/* 총점 */
  avg   double not null,					/* 평균 */
  grade varchar(5) not null					/* 학점 */
);
