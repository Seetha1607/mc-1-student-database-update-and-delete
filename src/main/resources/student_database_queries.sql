-- Create a database called `school`.
create database if not exists school;

--use the database.
use `school`;

--create a table if not exists called `student`.
create table if not exists `school`.`student`
(
   roll_number int not null primary key auto_increment,
   name varchar(25) not null,
   grades int not null,
   total_marks double not null
);

--Insert values into the table of student1:
insert into `school`.`student`(`roll_number`,`name`,`grades`,`total_marks`) values
(
   '1',
   'John',
   '85',
   '654'
);

--Insert values into the table of student2:
insert into `school`.`student`(`roll_number`,`name`,`grades`,`total_marks`) values
(
   '2',
   'Harry',
   '89',
   '667'
);

--Insert values into the table of student3:
insert into `school`.`student`(`roll_number`,`name`,`grades`,`total_marks`) values
(
   '3',
   'Lydia',
   '92',
   '645'
);
--Insert values into the table of student4:
insert into `school`.`student`(`roll_number`,`name`,`grades`,`total_marks`) values
(
   '14',
   'Mary',
   '90',
   '665'
);

--Insert values into the table of student5:
insert into `school`.`student` (`roll_number`, `name`, `grades`, `total_marks`) values
(
   '16',
   'Johnny',
   '91',
   '678'
);

--deleted student details by roll number:
delete from `school`.`student` where (`roll_number` = ?);

--update roll_number by total_marks:
update `school`.`student` set `roll_number` = '15' where (`roll_number` = '16');

