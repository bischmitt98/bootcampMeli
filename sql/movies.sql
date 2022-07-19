-- Mostrar todos os registros da tabela de filmes
SELECT * FROM movies_db.movies;

-- Mostrar o título dos filmes, a classificação daqueles que tem nota
-- superior a 7.5 e mais de 2 prêmios
SELECT title, rating, awards from movies where rating > 7.5 and awards > 2;

-- Mostrar o título dos filmes, a classificação daqueles que tem nota
-- superior a 7.5 e mais de 2 prêmios
SELECT title, rating from movies order by rating desc;

-- Mostrar somente os três primeiros títulos
select title from movies limit 3;

-- Mostrar os 5 filmes com maiores notas
select title, rating from movies order by rating desc limit 5;

select title from movies where title = '%Toy Story%';

-- Mostrar o título dos filmes que saíram entre 2004 e 2008
select title, year(release_date) from movies
-- where year(release_date) >= 2004 and year(release_date) <= 2008;
where year(release_date) between 2004 and 2008;

-- Mostrar o título dos filmes que tenham avaliação maior que 3,
-- saíram entre 1988 e 2009 e estejam ordenados por avaliação
SELECT title, rating, awards from movies where rating > 3 
and awards > 1 and year(release_date) between 1988 and 2009 order by rating;