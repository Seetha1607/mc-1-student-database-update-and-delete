-- Create a database called `school`.
create database if not exists school;

--use the database.
use `school`;

--create a table if not exists called `student`.
create table if not exists `school`.`student`
(
   roll_number int not null primary key auto_increment,
   name varchar(25) not null,
   grades int not null
);

--Insert values into the table of student1:
insert into `school`.`student`(`roll_number`,`name`,`grades`) VALUES
(
   '1',
   'John',
   '85'
);

--Insert values into the table of student2:
insert into `school`.`student`(`roll_number`,`name`,`grades`) VALUES
(
   '2',
   'Harry',
   '89'
);

--Insert values into the table of student3:
NSERT INTO `school`.`student`(`roll_number`,`name`,`grades`) VALUES
(
   '3',
   'Lydia',
   '92'
);