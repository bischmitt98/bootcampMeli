-- group by
select count(*) from series;

-- quantas temporadas estão cadastradas
select count(*) from seasons;

-- quantas temporadas existem para cada série
select series.title, count(*) as temporadas
from seasons inner join series
on series.id = seasons.serie_id
group by series.id;

-- quantas temporadas existem para a série "The Walking Dead"
select series.title, count(*) as temporadas
from seasons inner join series
on series.id = seasons.serie_id
where series.title = 'The Walking Dead'
group by series.id;

-- quais séries têm mais temporadas
select series.title, count(*) as temporadas
from seasons inner join series
on series.id = seasons.serie_id
group by series.id
having temporadas > 5;

-- quais as três séries com maior número de temporadas
select series.title, count(*) as temporadas
from seasons inner join series
on series.id = seasons.serie_id
group by series.id
order by temporadas desc limit 3;

-- subconsultas
-- quais os nomes dos atores que trabalham em filmes com avaliação maior que 9,1

-- etapa 1. consulta interna: selecionar os id1s dos atores que trabalham em filmes com avaliação maior que 9.1;
-- etapa 2. a partir da resposta anterior, lista os atores cujo id está na lista gerada no passo 1; 
select * from actors where id in

(select actor_movie.actor_id
from movies inner join actor_movie on movies.id = actor_movie.movie_id
where rating > 9.1)

order by first_name;

-- outra forma de resolver usando join
select first_name, last_name, actors.rating from movies inner join actor_movie on movies.id = actor_movie.movie_id
			inner join actors on actors.id = actor_movie.actor_id
where movies.rating > 9.1
order by actors.rating desc;

-- outra forma de resolver usando join
select first_name, last_name, actors.rating as 'Nota do ator'
 from movies inner join actor_movie on movies.id = actor_movie.movie_id
			inner join actors on actors.id = actor_movie.actor_id
where movies.rating > 9.1
order by actors.rating desc;


