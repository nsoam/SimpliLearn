create TABLE teachers
(
    teacher_id varchar(30) PRIMARY KEY,
    teacher_name varchar(30) NOT NULL
);

create TABLE subjects
(
    subject_id varchar(30) PRIMARY KEY,
    subject_name varchar(30) NOT NULL
);

create TABLE students
(
    student_id varchar(30) PRIMARY KEY,
    student_name varchar(30) NOT NULL
);

create TABLE stud_classes
(
    rid varchar(30) NOT NULL,
    class_id varchar(30) NOT NULL,
	class_name varchar(30) NOT NULL,
	student_id  varchar(50) NOT NULL ,
	student_name  varchar(50) NOT NULL ,
	teacher_id  varchar(30) NOT NULL,
	teacher_name  varchar(30) NOT NULL,
	subject_id  varchar(30) NOT NULL,
	subject_name  varchar(30) NOT NULL
	--CONSTRAINT FK_SUBJECT_ID foreign key(subject_id) references subject_id;
);

