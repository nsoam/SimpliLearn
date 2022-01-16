CREATE TABLE subjects
(
    subject_id varchar(30) PRIMARY KEY,
    subject_name varchar(30) NOT NULL
);

CREATE TABLE stud_classes
(
    class_id varchar(30) NOT NULL,
	class_name varchar(30) NOT NULL,
	student_id  varchar(50) NOT NULL ,
	teacher_id  varchar(30) NOT NULL,
	subject_id  varchar(30) NOT NULL
	--CONSTRAINT FK_SUBJECT_ID foreign key(subject_id) references subject_id;
);

