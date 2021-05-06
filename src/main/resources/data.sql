insert into user(name)
VALUES('admin');
insert into user(name)
VALUES('test');


insert into customer(id,name,surname,email)
VALUES(1,'Fatih','Uçar','fatih.ucar@me');
insert into customer(id,name,surname,email)
VALUES(2,'Methmet','Uçar','mehmet.ucar@me');
insert into customer(id,name,surname,email)
VALUES(3,'Ahmet','Uygur','ahmet.uygur@me');


insert into folder(id, path, customer_id)
VALUES (1, 'path1', 1);
insert into folder(id, path, customer_id)
VALUES (2, 'path2', 1);
insert into folder(id, path, customer_id)
VALUES (3, 'path3', 1);
insert into folder(id, path, customer_id)
VALUES (4, 'path4', 2);
insert into folder(id, path, customer_id)
VALUES (5, 'path5', 2);
insert into folder(id, path, customer_id)
VALUES (6, 'path6', 3);