CREATE DATABASE POCPROJECT character set UTF8MB3 collate utf8_unicode_ci;
USE POCPROJECT;

-- CREATE USER TABLE
CREATE TABLE USERTAB(
USERUSERNAME VARCHAR(100) NOT NULL, 
USERPASSWORD VARCHAR(100) NOT NULL, 
FULLNAME VARCHAR(100)NOT NULL,
ADDRESS VARCHAR(1000) NOT NULL, 
SIGNUPDATE DATETIME NOT NULL, 
JOB VARCHAR(100) NOT NULL,
BIRTHDAY DATE NOT NULL,
 PHONENUMBER VARCHAR(11) NOT NULL, 
CONSTRAINT PK_USER PRIMARY KEY(USERUSERNAME));

-- CREAT TABLE ROOM
CREATE TABLE ROOM(ROOMNAME VARCHAR(100) NOT NULL,
FLOOR INT NOT NULL,
ROOMUSAGE VARCHAR(1000) NOT NULL,
CONSTRAINT PK_ROOM PRIMARY KEY(ROOMNAME));

-- CRATE REQUEST TABLE

CREATE TABLE REQUEST(REQUESTID INT NOT NULL,
STARTTIMEREQUEST DATETIME NOT NULL,
FINISHTIMEREQUEST DATETIME NOT NULL,
REQUESTDESCRIPTIONS VARCHAR(1000),
USERUSERNAME VARCHAR(100) NOT NULL,
REQUESTROOM VARCHAR(100),
CONSTRAINT PK_REQUEST PRIMARY KEY(REQUESTID),
CONSTRAINT FK_USER_REQUEST FOREIGN KEY(USERUSERNAME) REFERENCES USERTAB(USERUSERNAME));
ALTER TABLE REQUEST ADD CONSTRAINT FK_REQUEST_ROOM FOREIGN KEY(REQUESTROOM) REFERENCES ROOM(ROOMNAME);


-- CREATE TABLE REQUESTWANTROOM

CREATE TABLE REQUESTWANTROOM(REQUESTID INT NOT NULL,
ROOMNAME VARCHAR(100) NOT NULL,
CONSTRAINT PK_REQUESTWANTROOM PRIMARY KEY(REQUESTID, ROOMNAME),
CONSTRAINT FK_REQUESTWANTROOM_REQUEST FOREIGN KEY(REQUESTID) REFERENCES REQUEST(REQUESTID),
CONSTRAINT FK_REQUESTWANTROOM_ROOM FOREIGN KEY(ROOMNAME) REFERENCES ROOM(ROOMNAME));

-- -- CREATE INFRASTRUCTURE TABLE
CREATE TABLE INFRASTRUCTURE(ITEMID INT NOT NULL,
ITEMNAME VARCHAR(200) NOT NULL,
AMOUNT INT NOT NULL,
COLOR VARCHAR(20) NOT NULL,
LASTTIMEUPDATE DATE NOT NULL,
ITEMDESCRIPTION VARCHAR(1000) NOT NULL,
ROOMNAME VARCHAR(100) NOT NULL,
CONSTRAINT PK_INFRASTRUCTURE PRIMARY KEY(ITEMID),
CONSTRAINT FK_INFRASTRUCTURE_ROOM FOREIGN KEY(ROOMNAME) REFERENCES ROOM(ROOMNAME));

-- CREATE MANAGER TABLE
CREATE TABLE MANAGER(MNGUSERNAME VARCHAR(100) NOT NULL,
MNGPASSWORD VARCHAR(100) NOT NULL,
FULLNAME VARCHAR(200) NOT NULL,
ADDRESS VARCHAR(1000) NOT NULL,
BIRTHDAY DATE NOT NULL,
SIGNUPDAY DATETIME NOT NULL,
PHONENUMBER VARCHAR(100) NOT NULL,
CONSTRAINT PK_MANAGER PRIMARY KEY(MNGUSERNAME));

-- CREATE APPROVE TABLE
CREATE TABLE APPROVE(MNGUSERNAME VARCHAR(100) NOT NULL,
REQUESTID INT NOT NULL,
STATE VARCHAR(10) NOT NULL,
NOTE VARCHAR(10),
FEE INT NOT NULL,
CONSTRAINT PK_APPROVE PRIMARY KEY(MNGUSERNAME, REQUESTID),
CONSTRAINT FK_APPROVE_MANAGER FOREIGN KEY(MNGUSERNAME) REFERENCES MANAGER(MNGUSERNAME),
CONSTRAINT FK_APPROVE_REQUEST FOREIGN KEY(REQUESTID) REFERENCES REQUEST(REQUESTID));
ALTER TABLE APPROVE MODIFY COLUMN NOTE VARCHAR(1000);

-- CREATE EVENT TABLE
CREATE TABLE EVENTTABLE(EVENTID INT NOT NULL,
EVENTNAME VARCHAR(200) NOT NULL,
STARTTIME DATETIME NOT NULL,
FINISHTIME DATETIME NOT NULL,
ROOMNAME VARCHAR(100) NOT NULL,
EVENTDESCRIPTION VARCHAR(1000) NOT NULL,
FEE INT NOT NULL,
NOTE INT NOT NULL,
CONSTRAINT PK_EVENT PRIMARY KEY(EVENTID),
CONSTRAINT FK_EVENT_ROOM FOREIGN KEY(ROOMNAME) REFERENCES ROOM(ROOMNAME));

-- INSERT INTO USERTABLE
INSERT INTO USERTAB VALUES ('nguyenvana','root','Lưu Đình Hoàng','Khương Trung-Hà Nội','2020-11-29 14:30:20','Bác sĩ','970-09-30','123456789');

-- INSERT INTO MANAGER

INSERT INTO MANAGER VALUES('admin', 'admin', 'Mai Xuân Thứ', 'Khương Trung-Hà Nội', '1970-11-11', '2020-11-11 11:11:11', '029388234');

-- INSERT INTO ROOM
INSERT INTO ROOM VALUES('Hội trường', 1, 'Họp');
INSERT INTO ROOM VALUES ('Phòng chức năng 1', 2, 'Tổ chức văn nghệ');

-- INSERT INTO ROOM
INSERT INTO INFRASTRUCTURE VALUES (1, 'LOA', 1, 'Vàng', '2020-11-11', 'Mới nguyên', 'Hội trường');

-- INSERT INTO EVENTTABLE
INSERT INTO EVENTTABLE VALUES (1, 'Họp mặt cựu chiến binh', '2020-11-11 22:22:23', '2020-11-11 23:00:00', 'Hội trường', 'NULL', 0, 2);
INSERT INTO EVENTTABLE VALUES (2, 'Học sinh mượn phòng tập văn nghệ', '2020-11-23 22:22:23', '2020-11-23 23:00:00', 'Phòng chức năng 1', 'Có giáo viên đi kèm', 0, 2);
INSERT INTO EVENTTABLE VALUES (3, 'Tổ dân phố họp', '2020-11-11 22:22:23', '2020-11-11 23:00:00', 'Hội trường', 'NULL', 0, 1);