INSERT INTO teachers (teacher_id,teacher_name)
VALUES('teacher1','Thomas') ,
('teacher2','Sally') ,
('teacher11','Sarah') ,
('teacher12','Samara') ,
('teacher111','Robert') ;

---------------------------------------------------------------------------------

INSERT INTO subjects (subject_id,subject_name)
VALUES('sub100','Chemistry'),
('sub200','Physics'),
('sub300','Geography') ,
('sub400','Civics') ,
('sub500','Economics'),
('sub600','Mathematics'),
('sub700','Philosophy');

---------------------------------------------------------------------------------

INSERT INTO students (student_id,student_name)
VALUES('stud10','Riley') ,
('stud11','Samantha') ,
('stud12','Joseph') ,
('stud101','Debbie') ,
('stud102','Jacob') ,
('stud1000','June') ;

---------------------------------------------------------------------------------

INSERT INTO stud_classes (rid, class_id,class_name,student_id,student_name,teacher_id,teacher_name,subject_id,subject_name)
VALUES('1', '101','8th Standard','stud10','Riley','teacher1','Thomas','sub100','Chemistry') ,
('2', '103','9th Standard','stud101','Debbie','teacher11','Sarah','sub200','Physics'),
('3', '103','9th Standard','stud102','Jacob','teacher12','Samara','sub600','Mathematics') ,
('4', '101','8th Standard','stud11','Samantha','teacher2','Sally','sub300','Geography'),
('5', '105','10th Standard','stud12','Joseph','teacher2','Sally','sub400','Civics'),
('6', '105','10th Standard','stud1000','June','teacher11','Sarah','sub200','Physics') ;