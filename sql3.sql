show databases;
use sqlassignment;
show tables;
create table if not exists trainer(
		TID			INT UNSIGNED,
        TNAME		VARCHAR(30)			NOT NULL DEFAULT '',
        EMAILID		VARCHAR(15),
        PHONE		VARCHAR(15),
        primary key (TID)
);

create table if not exists coursedetails(
		CID			INT UNSIGNED,
        CNAME		VARCHAR(50)
);

create table if not exists batchschedule(
		BATCHNAME	VARCHAR(10),
        CID			VARCHAR(50),
        SDATE		DATE,
        EDATE		DATE
);

create table if not exists feedback(
		TID			INT UNSIGNED,
        CID			VARCHAR(50),
        BATCHNAME	VARCHAR(10),
        FBRATE		FLOAT
);
show tables;
insert into trainer values
		(1,'Abraham','t1@i.com','9844400000'),
        (2,'Boyce','t2@i.com','9844400001'),
        (3,'Camilla','t3@i.com','9844400002'),
        (4,'Davis','t4@i.com','9844400003'),
        (5,'Elsa','t5@i.com','9844400004'),
        (6,'Ferguson','t6@i.com','9844400005'),
        (7,'Abraham','t7@i.com','9844400006'),
        (8,'Gordon','t8@i.com','9844400007'),
        (9,'Hilton','t9@i.com','9844400008'),
        (10,'Zenith','t10@i.com','9844400009');

alter table coursedetails modify CID varchar(5);
describe coursedetails;
insert into coursedetails values
		('GPF','Programming Fundamentals'),
        ('GDB','RDBMS'),
        ('ODB','Oracle 8i'),
        ('OVB','Visual Basic'),
        ('JJA','JAVA'),
        ('JAJ','Advanced Java'),
        ('DNT','Introduction to .NET'),
        ('DCS','Programming in C#'),
        ('DDB','SQL Server 2000'),
        ('MDB','DB2'),
        ('MCS','CICS');
select * from coursedetails;
describe batchschedule;
alter table batchschedule modify BATCHNAME varchar(10);
insert into batchschedule values
			('Batch1','GPF','07-01-10','07-01-20'),
            ('Batch1','GDB','07-01-21','07-01-31'),
            ('Batch2','GPF','07-01-10','07-01-20'),
            ('Batch2','GDB','07-01-21','07-01-31'),
            ('Batch3','GDB','07-01-25','07-02-02'),
            ('Batch3','JJA','07-02-03','07-02-20'),
            ('Batch4','GPF','07-02-01','07-02-10'),
            ('Batch4','GDB','07-02-12','07-02-22');
select * from batchschedule;
describe feedback;
insert into feedback values
			('12','GPF','Batch1','4.18'),
            ('11','GDB','Batch1','4.65'),
            ('2','GPF','Batch2','4.28'),
            ('1','GPF','Batch2','4.08'),
            ('12','ODB','Batch4','4.12'),
            ('1','MCS','Batch3','4.67'),
            ('2','JAJ','Batch4','4.61'),
            ('12','DNT','Batch2','4.52');
select * from feedback;
insert into feedback values('3','JAJ','Batch2','4.12');

select *
	from trainer,coursedetails,feedback where feedback.TID=trainer.TID ;

select distinct trainer.TID as 'TrainerID',trainer.TNAME as 'Trainer', (select CNAME from coursedetails where CID=feedback.CID) as 'Course Name'
	from trainer,coursedetails,feedback where feedback.TID=trainer.TID;

select trainer.TID as 'TrainerID',trainer.TNAME as 'Trainer', coursedetails.CNAME as 'CourseName'
from trainer,coursedetails,feedback where feedback.TID=trainer.TID and feedback.CID=coursedetails.CID ;

select trainer.TID as 'TrainerID',trainer.TNAME as 'Trainer',count(*) as 'TrainerCourseCount' from trainer,coursedetails,feedback
where feedback.TID=trainer.TID and feedback.CID=coursedetails.CID group by TrainerID having TrainerCourseCount>1;

select trainer.TID as 'TrainerID',trainer.TNAME as 'Trainer',count(*) as 'TrainerCourseCount' 
from trainer,coursedetails,feedback where feedback.TID=trainer.TID and feedback.CID=coursedetails.CID group by TrainerID;

select trainer.TID as 'TrainerID',trainer.TNAME as 'Trainer' 
from trainer,coursedetails,feedback where feedback.TID=trainer.TID and feedback.CID=coursedetails.CID;

use sqlassignment;
select feedback.TID as 'TrainerName', coursedetails.CNAME as 'CourseName' 
from trainer, coursedetails, batchschedule, feedback where batchschedule.EDATE=20070220 and  batchschedule.BATCHNAME=feedback.BATCHNAME and batchschedule.CID=coursedetails.CID;

