CREATE TABLE IF NOT EXISTS public.student
(
    id numeric NOT NULL,
    name character varying(255) COLLATE pg_catalog."default",
    semester integer,
    branch character varying(3) COLLATE pg_catalog."default",
    age integer,
    phone integer,
    rollno integer,
    CONSTRAINT student_pkey PRIMARY KEY (id)
)

INSERT INTO public.student(
	id, name, semester, branch, age, phone, rollno)
	VALUES (1, 'Ranjit', 2, 'ISE', 20, 98765223, 1);
