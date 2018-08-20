CREATE TABLE Skill
(
    s_id number NOT NULL,
    name varchar2(200)
);

CREATE TABLE Batch
(
    b_id number,
    b_name varchar2(200)
);

CREATE TABLE Focus
(
    f_id number(10) NOT NULL,
    f_name varchar2(200)
);

CREATE TABLE Trainer
(
    t_id number NOT NULL,
    first varchar2(200),
    last varchar2(200),
    email varchar2(200)
);

CREATE TABLE Building
(
    b_id number NOT NULL,
    name varchar2(200)
);
drop table location;
CREATE TABLE Location
(
    l_id number NOT NULL, 
    name varchar2(200),
    city varchar2(200),
    state varchar2(200)
);

INSERT INTO Skill VALUES(1, 'database');
INSERT INTO Skill VALUES(2, 'python');
INSERT INTO Skill VALUES(3, 'math');
INSERT INTO Skill VALUES(4, 'java');
INSERT INTO Skill VALUES(5, 'servlets');
INSERT INTO Skill VALUES(6, 'git');

INSERT INTO Focus VALUES(1, 'focus1');
INSERT INTO Focus VALUES(2, 'focus2');
INSERT INTO Focus VALUES(3, 'ERS');
INSERT INTO Focus VALUES(4, 'development');

INSERT INTO Trainer VALUES(1, 'joe', 'smith', 'jsmith@example.com');
INSERT INTO Trainer VALUES(2, 'josh', 'perry', 'perryja@example.com');
INSERT INTO Trainer VALUES(3, 'dave', 'matthews', 'dmatt@test.com');
INSERT INTO Trainer VALUES(4, 'greg', 'oden', 'greg@revature.com');
INSERT INTO Trainer VALUES(5, 'elvis', 'presley', 'elvis@revature.com');

INSERT INTO Building VALUES(1, 'Headquaters');
INSERT INTO Building VALUES(2, '11300 City Street');
INSERT INTO Building VALUES(3, 'Building');

INSERT INTO Location VALUES(1, 'Location1', 'columbus', 'ohio');
INSERT INTO Location VALUES(2, 'Location2', 'bloomington', 'indiana');
INSERT INTO Location VALUES(3, 'Location3', 'reston', 'virginia');
INSERT INTO Location VALUES(4, 'Location4', 'dallas', 'texas');

INSERT INTO Batch VALUES(1, 'Batch1');
INSERT INTO Batch VALUES(2, 'Batch2');
INSERT INTO Batch VALUES(3, 'Batch3');
INSERT INTO Batch VALUES(4, 'Batch4');