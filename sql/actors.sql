SELECT * FROM movies_db.actors;

-- Mostrar o nome, sobrenome e classificação de todos os atores;
select first_name, last_name, rating from actors;

-- Mostrar o nome e sobrenome dos atores cuja classificação é superior a 7,5;
select first_name, last_name, rating from actors
where rating > 7.5;

select first_name, last_name from actors limit 10;

-- Mostrar atores cujos nomes começam com Sam
select first_name, last_name from actors where first_name like '%Sam%';

-- insert into actors values(null, null, null, 'Emma', 'Watson', 8.9, 6);

update actors set first_name = 'Ema' where id = 50;

delete from actors
where id = 52;