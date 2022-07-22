
-- Mostrar todos os registros da tabela de filmes
SELECT * FROM movies_db.movies;

-- Mostrar o nome, sobrenome e classificação de todos os atores;
select first_name, last_name, rating from actors;

-- Mostrar o nome e sobrenome dos atores cuja classificação é superior a 7,5;
select first_name, last_name, rating from actors
where rating > 7.5;

-- Listar os 10 primeiros atores.
select first_name, last_name from actors limit 10;

-- Mostrar atores cujos nomes começam com Sam
select first_name, last_name from actors where first_name like '%Sam%';

-- Mostrar o título dos filmes, a classificação daqueles que tem nota superior a 7.5 e mais de 2 prêmios
SELECT title, rating, awards from movies where rating > 7.5 and awards > 2;

/* Mostrar o título de todas as séries e use para que tanto o nome da tabela quanto o
 campo estejam em portugês */
select séries.title as Título
from series as séries;

-- Mostrar somente os três primeiros títulos
select title from movies limit 3;

-- Mostrar os 5 filmes com maiores notas
select title, rating from movies order by rating desc limit 5;

-- Mostrar o título e a classificação de todos os filmes cujo título é Toy Story.
select title from movies where title = '%Toy Story%';

-- Mostrar o título dos filmes que saíram entre 2004 e 2008
select title, year(release_date) from movies

-- where year(release_date) >= 2004 and year(release_date) <= 2008;
where year(release_date) between 2004 and 2008;

/* Mostrar o título dos filmes que tenham avaliação maior que 3, saíram entre 1988 e 2009
 e estejam ordenados por avaliação */
SELECT title, rating, awards from movies where rating > 3 
and awards > 1 and year(release_date) between 1988 and 2009 order by rating;

-- Mostrar o título dos filmes e a classificação ordenados por classificação em ordem crescente.
SELECT title, rating FROM movies
ORDER BY rating;
