-- PUT YOUR SQL TO GENERATE THE DATABASE HERE. MAKE SURE TO SAVE FREQUENTLY!

BEGIN TRANSACTION;

DROP TABLE IF EXISTS events;
DROP TABLE IF EXISTS member_event;
DROP TABLE IF EXISTS group_members;
DROP TABLE IF EXISTS interest_group;
DROP TABLE IF EXISTS members;

CREATE TABLE members (
	member_id serial PRIMARY KEY,
	first_Name varchar(100) NOT NULL,
	last_name varchar(100) NOT NULL,
	email varchar(100),
	phone_number varchar(20),
	date_of_birth date,
	reminder_email boolean
);

CREATE TABLE interest_group (
	group_number serial PRIMARY KEY,
	group_Name varchar (100) NOT NULL,
	number_of_members int NOT NULL
);

CREATE TABLE group_members (
	group_number int,
	member_id int,
	
	CONSTRAINT fk_group_members_members FOREIGN KEY (member_id) REFERENCES members (member_id),
	CONSTRAINT fk_group_members_interest_group FOREIGN KEY (group_number) REFERENCES interest_group (group_number)
);

CREATE TABLE member_event (
	member_id int,
	event_number int
);

CREATE table events (
	event_number serial PRIMARY KEY,
	event_name varchar(100),
	description varchar(500),
	start_date_time TIMESTAMP,
	duration_in_minutes int,
	group_number int,
	
	CONSTRAINT fk_events_interest_group FOREIGN KEY (group_number) REFERENCES interest_group (group_number)
);

INSERT INTO events (event_name, description, start_date_time, duration_in_minutes)
VALUES ('A Night in Paris', 'Tech Ready Graduation and New Beginnings Celebration', '05/01/2023 17:00:00', 240),
       ('SpanTech', 'Hispanic and Latino Professionals in Tech Networking Event', '06/01/2023 18:00:00', 180),
	   ('Key Tech Ready Arrivals', 'Tech Ready Trainees Starting New Roles', '07/01/2023 18:00:00', 120),
	   ('Key Tech Ready Christmas', 'First Christmas with Tech Ready Grads', '12/20/2023 18:00:00', 180);

INSERT INTO members (first_name, last_name, email, phone_number, date_of_birth, reminder_email)
VALUES ('Raul', 'Conde', 'r.conde2017@gmail.com', '615-920-9501', '06/05/1986', True),
	   ('Chyna', 'Broyles', 'chynabroyles@gmail.com', '330-330-3300', '07/27/1988', True),
	   ('Victoria', 'Johnson', 'victoriajohnson@gmail.com', '213-467-8469', '10/10/1978', True),
	   ('Romance', 'Cox', 'romancecox@gmail.com', '213-654-8596', '02/27/1982', True),
	   ('Raoul', 'Palafox', null, null, null, null),
	   ('Ralph', 'Kreutzberger-Blumenfeld', 'rkb@gmail.com', null, null, null),
	   ('Paul', 'Rodriguez', 'paulrodriguez@gmail.com', '562-720-4534', null, null),
	   ('Rahul', 'Lemus', 'rahullemus@gmail.com', '310-599-3047', '06/05/1986', null);

INSERT INTO interest_group (group_name, number_of_members)
VALUES ('Tech Ready', 18),
       ('Lockbox', 15),
	   ('Virtual Item Processing', 12);

INSERT INTO member_event (member_id, event_number)
VALUES (1,1), (2,1), (3,1);

INSERT INTO member_event (member_id, event_number)
VALUES (1,2), (2,2), (3,2);

INSERT INTO member_event (member_id, event_number)
VALUES (1,3), (2,3), (3,3);

INSERT INTO member_event (member_id, event_number)
VALUES (1,4), (2,4), (3,4);

INSERT INTO group_members(group_number, member_id)
VALUES (1,1), (1,5), (1,6), (1,7);

INSERT INTO group_members(group_number, member_id)
VALUES (2,1), (2,5), (2,6), (2,7);

INSERT INTO group_members(group_number, member_id)
VALUES (2,1), (2,5), (2,6), (2,7);

INSERT INTO group_members(group_number, member_id)
VALUES (3,1), (3,5), (3,6), (3,7);

COMMIT;

--ROLLBACK;