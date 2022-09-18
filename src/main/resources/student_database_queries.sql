-- Create a database called `school`.
create DATABASE IF NOT EXISTS `school`;

--use the database.
USE `school`;

--create a table if not exists called `student`.
create TABLE IF NOT EXISTS `school`.`student`
(
   roll_number int not null primary key auto_increment,
   name varchar(25) not null,
   grades in not null
);

--Insert values into the table of student1:
insert into `school`.`student`(`roll_number`,`name`) VALUES
(
   '1',
   'John',
   '85'
);

--Insert values into the table of student2:
insert into `school`.`student`(`roll_number`,`name`) VALUES
(
   '2',
   'Harry',
   '89'
);

--Insert values into the table of student3:
NSERT INTO `school`.`student`(`roll_number`,`name`) VALUES
(
   '3',
   'Lydia',
   '92'
);