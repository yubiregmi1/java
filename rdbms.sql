show databases;
create database if not exists SQLAssignment;
show databases;
use sqlassignment;
show tables;
create table if not exists EMP (
		EMPNO 	INT UNSIGNED,
        ENAME 	VARCHAR(30)		NOT NULL DEFAULT '',
        JOB		VARCHAR(15),
        MGR		INT UNSIGNED,
        HIREDATE	DATE,
        SAL		INT UNSIGNED,
        COMM	INT UNSIGNED,
        DEPTNO	INT UNSIGNED,
        PRIMARY KEY (EMPNO)       
        );
show tables;
create table if not exists dept(
		DEPTNO		INT UNSIGNED,
        DNAME		varchar(15),
        LOC			varchar(30)
);
show tables;
alter table emp add foreign key (DEPTNO) references dept (DEPTNO);
describe emp;
alter table dept add primary key (DEPTNO);
describe dept;

insert into dept values
		(10,'Accounting','New York'),
        (20,'Research','Dallas'),
        (30,'Sales','Chicago'),
        (40,'Operations','Boston');

describe dept;
select count(*) from dept;
insert into emp values
		(7369,'Smith','Clerk',7902,'80-12-17',800,NULL,20),
        (7499,'Allen','Salseman',7698,'81-2-20',1600,300,30),
        (7521,'Ward','Salseman',7698,'81-2-22',1250,500,30),
        (7566,'Jones','Manager',7839,'81-4-2',2975,NULL,20);
select * from emp;
insert into emp values
		(7788,'Scott','Analyst',7566,'82-12-09',3000,NULL,20),
        (7839,'King','President',NULL,'81-11-17',5000,NULL,10),
        (7876,'Adams','Clerk',7788,'83-12-01',1100,NULL,20);
select ENAME from emp where JOB in ('Salseman','Analyst');
select * from emp where HIREDATE < 19810930;
select * from emp where JOB not in ('Manager');
select ENAME from emp where EMPNO=7369 or EMPNO=7521 or EMPNO=7839;
select * from emp where DEPTNO not in (30,40,10);
select ENAME from emp where HIREDATE< 19811231 and HIREDATE>19810630;
select distinct JOB from emp;
select ENAME from emp where JOB not in ('Salseman');
select ENAME, JOB from emp where JOB=('President');
select * from emp;
select * from emp where JOB=(null);
select * from emp where ENAME like 's%' or ENAME like '%s' ;
select ENAME from emp where ENAME like '_i%';
select count(*) from emp;
select count(distinct JOB) from emp;
select sum(SAL) from emp;
select max(SAL) from emp where JOB in ('Salseman');
select max(sal) from emp where DEPTNO in (20);
select * from emp where DEPTNO in (20) group by JOB having avg(sal)>1000 order by JOB;
select count(*) as 'Emps. in dept 20', avg(SAL) as 'Average salary' from emp where DEPTNO in (20);
select ENAME, SAL, 0.1*SAL as 'PF Amt' from emp;
select * from emp order by SAL desc;
select ENAME,HIREDATE from emp order by HIREDATE desc;
select ENAME as 'Name', SAL as 'Salary', 0.1*SAL as 'PF', 0.3*SAL as 'DA',
0.5*SAL as 'HRA', SAL+ifnull(COMM,0) as 'Gross' from emp order by Gross;
select * from emp where datediff(sysdate(),HIREDATE)/365>36;
select DEPTNO as 'Departments', count(*) as 'No. of Employees' from emp group by DEPTNO;
select DEPTNO as 'Departments', sum(SAL) as 'Total Salary' from emp group by DEPTNO;
select JOB, count(*) as 'Employees' from emp group by JOB order by Employees desc;
select JOB as 'Job', max(SAL) as 'Maximum salary',min(SAL) as 'Minimum salary',avg(SAL) as 'Average salary' from emp group by JOB;
select max(SAL) as 'Maximum salary',min(SAL) as 'Minimum salary',avg(SAL) as 'Average salary' from emp where DEPTNO in (20); 
select JOB, avg(SAL) as 'Average Salary' from emp where DEPTNO in (20) group by JOB having avg(SAL)>1000;