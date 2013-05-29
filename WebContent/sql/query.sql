delete from audio where author = 'Linda';

select keyWords from audio where author = 'Arabika';

select keyWords from audio where match (author, keyWords) against ('psih');

create fulltext index findtext on audio ( author, keyWords);

create database audioplayer;
create table test(id int unsigned auto_increment primary key, name varchar(200), body text,
fulltext (name, body)) auto_increment = 1;

insert into test (name, body) values ('Alex', 'capitan, has very dificult cheracter. Likes women and spend time with friends');

insert into test (name, body) values ('Oleg', 'leutenenant, has very dificult cheracter. Drinks a lot of.');

insert into test (name, body) values ('Misha', 'capral, chearful. Likes women and smoke drugs');

select * from test where match (name, body) against ("oleg");
select * from test where body like '%drugs%';


SELECT * FROM audio WHERE keyWords REGEXP 'new age|psih';
select * from audio where keyWords like '%new age%';